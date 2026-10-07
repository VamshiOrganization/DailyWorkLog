
# Agile Fundamentals & Day-to-Day Process Overview

## 1. Introduction: From Waterfall to Agile

Traditional software development followed a strictly sequential **Waterfall approach**:

-   **Sequential Phases:** Requirements $\rightarrow$ Design $\rightarrow$ Development $\rightarrow$ Testing $\rightarrow$ Maintenance. Each phase had to be fully completed before moving to the next.
    
-   **Key Challenges:**
    
    -   Difficulty accommodating late requirements or changes once development started.
        
    -   Customers only saw the product at the end of the entire development cycle, creating feedback delays.
        

**The Agile Solution:**

Agile breaks work into small, manageable iterations called **sprints**. Teams deliver features continuously, gather early feedback, and adapt quickly to changing requirements.

-   **Waterfall Philosophy:** Plan everything upfront, then execute.
    
-   **Agile Philosophy:** Build iteratively in small steps, gather feedback, and continuously adapt.
    
-   **Core Agile Principles:** Flexibility, Collaboration, Frequent Delivery, and Continuous Improvement.
    

## 2. Day-to-Day Agile Process

Instead of spending months building everything at once, Agile focuses on incremental delivery:

-   **Backlog Management:** Work items, user stories, and requirements are continuously captured and prioritized in the backlog.
    
-   **Sprint Planning:** At the start of a sprint, the team selects work items from the backlog to commit to for the upcoming iteration.
    
-   **Execution & Daily Stand-up:** Team members work on selected user stories, staying aligned and clearing blockers via brief daily syncs.
    
-   **Sprint Review:** At the end of the sprint, the team demonstrates completed features to stakeholders to gather feedback and confirm business alignment.
    
-   **Sprint Retrospective:** The team reflects on the sprint to evaluate what went well, what didn't, and identify improvements for subsequent sprints.
    

## 3. Agile Ceremonies & Structure
| **Ceremony**                        | **Duration / Frequency** | **Purpose & Key Activities**                                                                                                              |
| ----------------------------------- | ------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------- |
| **Daily Scrum (Stand-up)**          | ~15 mins / Daily         | Team members (and PO/Onshore leads) sync on: 1) What was completed yesterday, 2) What is planned for today, 3) Any blockers/dependencies. |
| **Sprint Planning**                 | Start of Sprint          | Select stories from backlog, estimate effort (story points), and define the overarching Sprint Goal.                                      |
| **Sprint Review**                   | End of Sprint            | Showcase completed work to stakeholders, validate functionality against business expectations, and collect feedback.                      |
| **Sprint Retrospective**            | End of Sprint            | Reflect on team performance, discuss continuous improvement items, and identify risks/action items for upcoming sprints.                  |
| **Big Room Planning (PI Planning)** | Quarterly                | Multi-team alignment session to plan work for the upcoming quarter, identify cross-team dependencies, and align priorities.             |

## 4. Retrospective Framework Examples

Common retrospective exercises to engage the team and gather feedback:

-   **Wins in Our Sails:** Successes, positive practices, and momentum drivers.
    
-   **Beacons on the Horizon:** Upcoming opportunities and positive future developments.
    
-   **Anchors Holding Us Back:** Challenges, inefficiencies, or blockers that slowed down progress.
    
-   **Barriers Ahead:** Potential risks, dependencies, or impediments anticipated in future sprints.
    
-   **Kudos:** Expressions of peer recognition and appreciation for team member contributions.
    

## 5. Roles within the Scrum Team

```
               ┌────────────────────────┐
               │     Product Owner      │
               │  (Business & Backlog)  │
               └───────────┬────────────┘
                           │
               ┌───────────┴────────────┐
               │      Scrum Master      │
               │ (Process Facilitator)  │
               └───────────┬────────────┘
                           │
     ┌─────────────────────┴─────────────────────┐
     │            Development Team               │
     │   (Developers, Testers, Technical Staff)  │
     └───────────────────────────────────────────┘

```

1.  **Product Owner (PO):** Represents business stakeholders, owns product direction, and prioritizes the product backlog.
    
2.  **Scrum Master (SM):** Facilitates Agile practices, ensures ceremonies run efficiently, and helps remove blockers.
    
3.  **Development Team:** Cross-functional technical team (developers, QA/testers, architects) responsible for estimating, building, testing, and delivering completed user stories.
    

## 6. Work Item Lifecycle (Kanban Workflow)

Work progresses through standard pipeline states on the Kanban board:

```
[ Backlog ] ➔ [ Ready to Work ] ➔ [ In Development ] ➔ [ Code Review ] ➔ [ Testing ] ➔ [ Approved / Ready for Release ] ➔ [ Done ]

```

1.  **Backlog:** Initial repository for raw user stories and requirements.
    
2.  **Ready to Work:** Prioritized tickets pulled from the backlog into the active sprint.
    
3.  **In Development:** Active development underway by an assigned team member.
    
4.  **Code Review:** Peer review process ensuring code quality, testing standards, and architectural alignment.
    
5.  **Testing:** QA/Verification to ensure feature correctness and business logic validation.
    
6.  **Approved / Deployment:** Verified work awaiting release.
    
7.  **Done:** Successfully deployed and fully completed ticket.
    

## 7. Key Agile Concepts & Execution Strategies

-   **Sprint Execution:** Sprints typically run on **2 to 4-week cycles**. Requirements are captured as user stories, estimated in **story points** (complexity/effort), and tracked against a committed Sprint Goal.
    
-   **Common Clock:** Alignment of sprint cycles, planning sessions, and release schedules across multiple interdependent teams to simplify coordination and dependency tracking.
    
-   **No-Regret Work:** High-value foundational tasks—such as API design, documentation, technical research, or knowledge sharing—that remain valuable even if business priorities shift later.
    
-   **Gap Week (Quarterly Innovation/Planning Week):** Held once every quarter between delivery cycles. Allows teams to:
    
    -   Step back from regular sprint delivery to focus on upcoming quarterly planning.
        
    -   Conduct technical research, proof-of-concepts, and API exploratory work.
        
    -   Complete professional training, certifications, and documentation update efforts.

## 3. Agile Alignment, Gap Weeks & Big Room Planning (BRP)

```
  ┌─────────────────────────────────────────────────────────────┐
  │                        Big Room Planning                    │
  │        (PO, Arch, Leads define quarterly deliverables)      │
  └──────────────────────────────┬──────────────────────────────┘
                                 │
  ┌──────────────────────────────▼──────────────────────────────┐
  │                         Gap Week                            │
  │     (Quarterly break from user stories; focus on learning,  │
  │     tech research, training, and refactoring/docs)          │
  └──────────────────────────────┬──────────────────────────────┘
                                 │
  ┌──────────────────────────────▼──────────────────────────────┐
  │                     Sprint Execution                        │
  │        (2-Week Sprints governed by Common Clock rhythm)     │
  └─────────────────────────────────────────────────────────────┘

```

-   **Gap Week:**
    
    -   Occurs **once per quarter (every 3 months)** following the Common Clock calendar.
        
    -   **No active user stories** are assigned during this week.
        
    -   Dedicated to technical research, professional development/training, architectural documentation, or exploring new technologies relevant to the project.
        
-   **Big Room Planning (BRP / PI Planning):**
    
    -   **Frequency:** Quarterly alignment session across cash management / service line teams.
        
    -   **Process:** Begins with BRP kick-off/discussion week, followed by the **BRP Readout** (scheduled for next Monday) where teams present their upcoming Q4 commitments.
        
    -   **Common Clock:** Shared calendar schedule shared via team chat to align all teams on quarterly start/end dates and sprint boundaries.

## 4. Key Organizational Points of Contact

| **Role**               | **Contact Name** | **Collaboration & Engagement**                                                                               |
| ---------------------- | ---------------- | ------------------------------------------------------------------------------------------------------------ |
| **Product Owner (PO)** | **Shweta**       | Attends daily Scrum calls; manages product backlog and business requirements.                                |
| **Technical Lead**     | **Abhishek**     | Day-to-day technical lead, code reviewer, and primary liaison with architecture.                             |
| **Lead Developer**     | **Jared**        | Assists with technical leadership and code reviews.                                                          |
| **Architect**          | **Sudheer**      | Drives system architecture; collaborates directly with Abhishek and Shweta for quarterly technical planning. |