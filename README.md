# Commitment System

A backend-first accountability app that enforces **one active commitment at a time**, automatically detects missed deadlines, and requires users to acknowledge failure before creating a new commitment.

## Why this exists
Most “todo” apps let you create infinite tasks with zero consequences. This project is different: it’s a **rule-enforced commitment engine** built to demonstrate real backend skills:
- state machines
- time-based transitions
- business rule enforcement
- clean API design
- persistence + auditing

## Core Concept
A **Commitment** is a promise with a deadline.  
You can only have **one ACTIVE commitment** at any moment.

If the deadline passes and it’s not completed, it becomes **BROKEN** automatically.

## Features (MVP)
- Create a commitment (only if you have none ACTIVE)
- Mark commitment as completed
- Automatic break when `dueAt` passes
- Failure acknowledgement required after a break
- Permanent history of commitments

## Rules (Non-Negotiable)
1. **Only one ACTIVE commitment per user**
2. If `now > dueAt` and status is ACTIVE → status becomes **BROKEN**
3. If a commitment is BROKEN → user must **acknowledge** before creating another
4. All commitments are persisted (no deleting history)

## Commitment States
- **ACTIVE**: currently in progress
- **COMPLETED**: finished before deadline
- **BROKEN**: deadline passed without completion

## Data Model (V1)
**Commitment**
- `id` (uuid / long)
- `userId` (string)
- `title` (string)
- `description` (string)
- `status` (ACTIVE | COMPLETED | BROKEN)
- `createdAt` (datetime)
- `dueAt` (datetime)
- `completedAt` (datetime, nullable)
- `brokenAt` (datetime, nullable)
- `failureNote` (string, nullable)

**Acknowledgement**
- `id`
- `commitmentId`
- `userId`
- `note` (string)
- `acknowledgedAt` (datetime)

## API Endpoints (Planned)
- `POST /api/commitments` → create commitment
- `GET /api/commitments/active` → get current active
- `POST /api/commitments/{id}/complete` → complete
- `POST /api/commitments/{id}/acknowledge` → acknowledge failure
- `GET /api/commitments/history?days=7` → last 7 days

## Tech Stack
**Backend**
- Java
- Spring Boot
- Spring Data JPA
- H2 (local dev) → PostgreSQL (later)

**Frontend (later)**
- React (minimal UI, focus is backend rules first)

## Roadmap
### Week 1
- Spring Boot project setup
- Entities + DB schema
- Core business rules in service layer
- Basic CRUD endpoints

### Week 2
- Automatic break logic (scheduled job)
- Failure acknowledgement flow
- Tests for all core rules

### Week 3
- Simple React UI
- Deployment (Render/Fly.io) + Postgres
- Clean README + screenshots

## Getting Started (Local)
> Coming soon once the backend skeleton is in place.

## Testing
> Unit + integration tests will be added early to prove rule enforcement.

## Notes
This project is intentionally designed to be **backend-heavy**
