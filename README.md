# Integrated Systems Portfolio: Network Infrastructure & IoT Safety

A comprehensive engineering portfolio showcasing the convergence of secure network architecture and automated IoT safety systems.

## 📑 Table of Contents

* [Portfolio Overview](#portfolio-overview)
* [Project 1: TrustCheck API (Network Architecture)](#project-1-trustcheck-api-network-architecture)
* [Project 2: ActiveMitigate IoT (Gas Safety System)](#project-2-activemitigate-iot-gas-safety-system)
* [Technical Stack](#technical-stack)
* [Configuration](#configuration)
* [Build & Verification](#build--verification)
* [Project Structure](#project-structure)
* [Development Team](#development-team)
* [License](#license)

---

## Portfolio Overview

This repository demonstrates technical proficiency in bridging the gap between hardware and software through:

1. **Network Engineering:** Scalable enterprise designs featuring IPv4/IPv6 Dual-Stack and L2 redundancy.
2. **Embedded Systems:** Real-time telemetry using event-driven architectures and industrial communication protocols (MQTT).

---

## Project 1: TrustCheck API (Network Architecture)

**Focus:** High Availability, Scalability, and Multi-protocol Routing for Corporate Environments.

### Engineering Highlights:

* **Hierarchical Design:** Implemented a core-distribution-access layer model for a multi-building corporate campus.
* **L2 Resilience:** Configured **STP (Spanning Tree Protocol)** to eliminate network loops and ensure uptime through redundant links.
* **IPv6 Readiness:** Deployed a **Dual-Stack** environment specifically for the Research department to ensure future-proof interoperability.
* **Validation:** Prototype fully simulated and stress-tested using **GNS3**, emulating real Cisco IOS behavior.

---

## Project 2: ActiveMitigate IoT (Gas Safety System)

**Focus:** Remote monitoring and autonomous hazard intervention.

### System Architecture:

Unlike passive monitoring tools, **ActiveMitigate** implements an **Active Control Loop** to prevent industrial and domestic accidents:

1. **Edge Sensing:** ESP8266 nodes process MQ-2 analog signals to detect LPG thresholds with high precision.
2. **Mission-Critical Messaging:** Utilizes **MQTT (EMQX Broker)** for lightweight, low-latency data transmission.
3. **Autonomous Actuation:** Instant mechanical valve closure via servomotors triggered by hardware interrupts.
4. **Real-Time Alerts:** Integrated with **Telegram Bot API** for cloud-based push notifications.

---

## Technical Stack

| Category | Tools & Protocols |
| --- | --- |
| **Networking** | GNS3, Wireshark, Cisco IOS, OSPF, STP, IPv4/IPv6 |
| **Embedded Systems** | ESP8266 (NodeMCU), Arduino C++, MQ-2 Sensors |
| **Backend & Cloud** | Java 17, Maven, Telegram API, MQTT (EMQX) |
| **Software Dev** | Eclipse IDE, Python (Scraping logic), Git |

---

## Configuration

The portable subsystems require credentials at runtime. Keep secrets out of the
repository:

* **Telegram bot:** provide the bot token via the `TELEGRAM_BOT_TOKEN`
  environment variable before launching the Java app. The `getBotToken()`
  method in `TelegramBot.java` reads it from the environment and fails fast if
  it is missing. Any token previously committed to history should be revoked
  and regenerated with `@BotFather`.
* **ESP8266 nodes:** the WiFi SSID/password and MQTT broker in the `.ino`
  sketches are placeholder values from the lab environment (`Corporativo` /
  `123456789`, broker `broker.emqx.io:1883`) — replace them with your own
  network credentials before flashing.

---

## Build & Verification

> **Verification status:** this repository was authored and demoed in the
> original course environment. Reproducing the builds here requires toolchains
> that are not included in this repo. What follows is the intended build path;
> items that could not be executed locally are marked explicitly.

### Java App (ActiveMitigate IoT) — *Not locally verified*

```bash
cd "ActiveMitigate IoT/JavaApp/1"
mvn package
```

**Not locally verified:** building requires a Java runtime plus network access
to fetch the Maven dependencies (Eclipse Paho MQTT client, Telegram Bots API)
from `repo.eclipse.org` / Maven Central, and Maven was not run from a machine
with those prerequisites during this pass. Running it also needs a live MQTT
broker (`broker.emqx.io:1883`) and the Telegram API.

### ESP8266 Firmware — *Not locally verified*

```bash
arduino-cli compile --fqbn esp8266:esp8266:nodemcuv2 "ActiveMitigate IoT/ARDUINOESP1"
arduino-cli compile --fqbn esp8266:esp8266:nodemcuv2 "ActiveMitigate IoT/ARDUINOESP2"
```

**Not locally verified:** the sketches require the Arduino CLI/IDE with the
ESP8266 board core (headers such as `ESP8266WiFi.h`, `PubSubClient.h`,
`Servo.h`) and target real hardware (MQ-2 gas sensor, servo, buzzer, network
connection). No Arduino toolchain or board was available during this pass.

### TrustCheck API (Network Architecture)

Documentation-only project (PDF design deliverable). There is no source code to
build; the design was validated in GNS3 in the original environment —
**not locally verified** here.

---

## Project Structure

```text
.
│   .gitignore
│   LICENSE
│   README.md
│
├───ActiveMitigate IoT
│   │   ActiveMitigate IoT.pdf     # IoT System Implementation Report
│   │   Arquitectura.jpg           # System Architecture Diagram
│   │
│   ├───ARDUINOESP1                # Firmware: Gas Detection Node
│   │       ARDUINOESP1.ino
│   │
│   ├───ARDUINOESP2                # Firmware: Valve Actuator Node
│   │       ARDUINOESP2.ino
│   │
│   └───JavaApp                    # Central Orchestrator
│       └───1
│           ├───src/main/java      # Logic: Main, MQTT Client, Telegram Bot
│           │       Main.java
│           │       Redes.java
│           │       TelegramBot.java
│           └───pom.xml            # Maven Dependencies
│
└───TrustCheck API
        TrustCheck API.pdf         # Enterprise Network Design Documentation

```

Maven/IDE build outputs under `JavaApp/1/target/`, `*.class` and Eclipse
project files are ignored via `.gitignore` and are not tracked.

---

## Development Team

| Member | Primary Role | GitHub |
| --- | --- | --- |
| Daniel Castro | Java Backend & Network Arch | [@Dani2044](https://github.com/Dani2044) |
| Maria Paula Rodriguez | IoT Hardware Implementation | [@MapaRuiz](https://github.com/MapaRuiz) |
| Juan Enrique Rozo | Network Topology Design | [@JuanR771](https://github.com/JuanR771) |
| Julian Ramos | C++ Firmware Development | [@juliancramos](https://github.com/juliancramos) |

---

## License

This project is licensed under the **MIT License**.