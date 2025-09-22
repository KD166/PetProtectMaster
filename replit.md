# Animal Rescue Management System

## Overview

This repository contains a comprehensive animal rescue management system built in Java with PostgreSQL database integration. The system was converted from a JavaFX GUI application to a console-based application to run in the headless Replit environment. The system manages six core modules: animals, users, adoptions, rescues, veterinarians, and reports (complaints) through a fully functional console interface.

## User Preferences

Preferred communication style: Simple, everyday language.

## System Architecture

### MVC Design Pattern
The system follows a Model-View-Controller (MVC) architecture with clear separation of concerns:

- **Models** - Animal, Usuario, Veterinario, Adocao, Resgate, Denuncia classes representing database entities
- **Views** - Console output classes for displaying data in formatted tables
- **Controllers** - Business logic classes handling database operations and data processing

### Database Layer
PostgreSQL integration through JDBC driver with connection pooling and proper resource management. The Database class handles all connections using environment variables (PGHOST, PGPORT, PGDATABASE, PGUSER, PGPASSWORD).

### Console Interface
Interactive menu-driven console application with hierarchical navigation between different management modules. Each module provides listing, adding, and searching capabilities.

### Module Structure
The system is organized into six functional modules:
- **Animal Management** - Register and manage rescued animals
- **User Management** - Handle adopter and volunteer information  
- **Adoption Management** - Track adoption processes and status
- **Rescue Management** - Document rescue operations and locations
- **Veterinarian Management** - Manage veterinary staff and specializations
- **Report Management** - Handle complaints and incident reports

## Database Schema

The system uses six interconnected tables:

### Core Tables
- **animal** - Animal registration with ID, location, name, status, image, breed, species
- **usuario** - User information with ID, name, birth date, email, CPF
- **veterinario** - Veterinary staff with ID, user reference, CRMV license, specialty, salary
- **adocao** - Adoption records with user, animal, veterinarian references, date, status, observations
- **resgate** - Rescue operations with location, date, status, involved parties
- **denuncia** - Complaint reports with user, animal references, address, description

### Sample Data
The system includes realistic sample data for testing:
- 3 animals (Bobby, Mia, Rex) with different species and status
- 3 users (João Silva, Maria Santos, Pedro Oliveira) with complete profiles
- 2 veterinarians with specializations and CRMV licenses
- 2 adoptions (1 completed, 1 in process) with full tracking
- 3 rescue operations with various statuses and locations
- 3 complaint reports covering different incident types

## Recent Changes (September 19, 2025)
- **Database Connection Fixed** - Corrected JDBC URL construction to use local PostgreSQL instead of external Neon database
- **All Modules Operational** - Successfully implemented and tested all six management modules
- **Complete Data Integration** - All tables populated with sample data and displaying correctly
- **Console Navigation** - Full menu system with proper navigation between all modules
- **Real-time Data Display** - All listing operations now show live database content