# Integrated Systems Portfolio: Network Infrastructure & IoT Safety

A comprehensive engineering portfolio showcasing the convergence of secure network architecture and automated IoT safety systems.

## 📑 Table of Contents

* [Portfolio Overview](https://www.google.com/search?q=%23portfolio-overview)
* [Project 1: TrustCheck API (Network Architecture)](https://www.google.com/search?q=%23project-1-trustcheck-api-network-architecture)
* [Project 2: ActiveMitigate IoT (Gas Safety System)](https://www.google.com/search?q=%23project-2-activemitigate-iot-gas-safety-system)
* [Technical Stack](https://www.google.com/search?q=%23technical-stack)
* [Project Structure](https://www.google.com/search?q=%23project-structure)
* [Development Team](https://www.google.com/search?q=%23development-team)
* [License](https://www.google.com/search?q=%23license)

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

## Project Structure

```text
C:.
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