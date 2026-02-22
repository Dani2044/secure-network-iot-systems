# Networks & Telecommunications Portfolio

A collection of advanced engineering projects focused on network infrastructure design and IoT (Internet of Things) integration. Developed for the **Networks & Telecoms** course at Pontificia Universidad Javeriana.

## Table of Contents

* [Project Overview](https://www.google.com/search?q=%23project-overview)
* [Project #1: Enterprise Network Design](https://www.google.com/search?q=%23project-1-enterprise-network-design)
* [Project #2: Remote LPG Monitoring & Control System](https://www.google.com/search?q=%23project-2-remote-lpg-monitoring--control-system)
* [Tech Stack](https://www.google.com/search?q=%23tech-stack)
* [Project Structure](https://www.google.com/search?q=%23project-structure)
* [Setup and Installation](https://www.google.com/search?q=%23setup-and-installation)
* [Development Team](https://www.google.com/search?q=%23development-team)

---

## Project Overview

This repository demonstrates the practical application of networking protocols, infrastructure optimization, and IoT communication. It covers the transition from designing high-availability enterprise networks (IPv4/IPv6) to implementing real-time monitoring systems using MQTT and Telegram integration.

---

## Project #1: Enterprise Network Design

**Purpose:** To design and prototype a robust network infrastructure for "Company XYZ," focusing on software development and IT consulting needs.

### Key Features

* **Scalable Architecture:** Multi-building design with dedicated subnets for Management, Development, Systems, and Research departments.
* **Protocol Implementation:**
* **Dual-Stack:** Full IPv4 and IPv6 compatibility for research environments.
* **Redundancy:** Implementation of Spanning Tree Protocol (STP) to prevent loops and ensure network availability.


* **Simulation:** Prototyped using the **GNS3** platform to validate internet connectivity and inter-VLAN routing across buildings.

---

## Project #2: Remote LPG Monitoring & Control System

**Purpose:** An IoT-based safety solution designed to detect Liquefied Petroleum Gas (LPG) leaks and take autonomous preventive actions.

### Architecture

The system utilizes a distributed architecture with hardware sensing and cloud-based notifications:

1. **Sensing Layer:** ESP8266 (NodeMCU) and MQ-2 sensors detect gas concentrations.
2. **Control Layer:** Automated valve closure mechanism via servomotors when leaks are detected.
3. **Communication Layer:** **MQTT Protocol** handles real-time messaging between hardware and the Java-based central controller.
4. **Notification Layer:** Integration with **Telegram Bot API** to alert homeowners instantly.

### Software Components

* **Java Client:** Orchestrates the logic, managing the connection to the EMQX broker and processing sensor data.
* **Arduino/C++:** Firmware for ESP8266 devices handling Wi-Fi connectivity and sensor reading.

---

## Tech Stack

| Category | Technologies |
| --- | --- |
| **Networking Tools** | GNS3, Cisco Packet Tracer, Wireshark |
| **IoT & Hardware** | ESP8266 (NodeMCU), Arduino IDE, MQ-2 Gas Sensor, Servomotors |
| **Communication** | MQTT (EMQX Broker), TCP/IP, IPv4/IPv6, Telegram API |
| **Software** | Java (Maven), Eclipse IDE, TelegramBots Library |

---

## Project Structure

```text
C:.
│   README.md
│   
├───Project #1
│       Project1.pdf           # Comprehensive Network Design Report
│       
└───Project #2
    │   Arquitectura.jpg       # IoT System Architecture Diagram
    │   Project2.pdf           # IoT Implementation Documentation
    │
    ├───ARDUINOESP1            # Firmware for Gas Detection Node
    │       ARDUINOESP1.ino
    │
    ├───ARDUINOESP2            # Firmware for Control/Valve Node
    │       ARDUINOESP2.ino
    │
    └───JavaApp                # Central Controller & Telegram Bot
        └───1
            │   pom.xml        # Maven Dependencies (MQTT, Telegram)
            ├───src/main/java
            │       Main.java          # Entry point
            │       Redes.java         # MQTT Client Logic
            │       TelegramBot.java   # Notification handler
            └───target/...

```

---

## Setup and Installation

### Project 1 (Design)

* Review the `Project1.pdf` for the full network topology and IP addressing schemes. The design is intended for implementation in **GNS3**.

### Project 2 (IoT)

1. **Hardware:**
* Flash the `.ino` files to your ESP8266 devices using the Arduino IDE.
* Ensure the MQ-2 and Servomotor are wired according to the `Project2.pdf` schematics.


2. **Backend:**
* Import the `JavaApp/1` folder as a Maven project in your IDE.
* Configure your `MQTT Broker` credentials and `Telegram Bot Token` in `TelegramBot.java`.
* Run `Main.java`.



---

## Development Team

| Member | GitHub | Role |
| --- | --- | --- |
| **Daniel Castro** | [@Dani2044](https://github.com/Dani2044) | Network Design & Java Dev |
| Maria Paula Rodriguez | [@MapaRuiz](https://github.com/MapaRuiz) | IoT Implementation |
| Juan Enrique Rozo | [@JuanR771](https://github.com/JuanR771) | Network Architecture |
| Julian Ramos | [@juliancramos](https://github.com/juliancramos) | Firmware Development |