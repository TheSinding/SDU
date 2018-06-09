### Ai definition 3
---
#### Logic: 
Patterns of arguemtn that always yield correct conclusions when supplied with the correct premises.

*"Socrates is a man; all men are mortals; therefore Socrates is a mortal."*

#### Logicist apporch to AI:
Describe problem in formal notation and apply general deduction procedures to solve it.
##### Problems:
- Computational complexity of finding the solution
- Describing the real-world problems and knowlegde in logical notation.
- Dealing with uncertainty
- A lot of "rational" behavior has nothing to do with logic

### Ai Definition 4
---
- A rational agent acts to optimally archieve its goals
- Goals are application-dependent and are expressed in terms of utility of outcomes
- Being rational means maximizing your (expected) utility.
---
---
# Agents

An agent is anything that can be viewed as perceiving its env through sensors and acting upon that env through actuators.
Software agents sensors:
- keystrokes, file contents & network packages.
actuators:
- Displaying on a screen, writing to a file, sending networking packages.

### Rational agents
A rational agent selects it actions based on maximizing it's performence measure.
Do the right thing.

### Autonomous agent
It behaves based on it's own experience.
it has an ability to learn and adapt, it can always say no.
It needs enough build-in knowledge to "survive" 

### Table driven Agent
- A Table contains all the possible percepts that can occur
- Each step appends current percept to list of percepts.
- LOOKUP current percepts in table.

It's Not an autonomous agent when it's guided by its designer.

### Simple Reflex driven agent
- Only responds to current percept only 
- uses condition-action rules rather than table
    - if condition then return action
    - eg if status == dirty then return Suck.
- Sensors sense the current location and status of the env. ie location and status 
- Actuators can be many things, vacuumes have sucking, moving and so on.

### Model Based Reflex agents
Internal state, aspects of the env that cannot be currently obeserved.
For partially observable environments.

### Goal based agents
Goal information to select between possible actions in the current state.
Goal is a desirable situation.

### Utility based agents.
Utility based agents evaluates disirable state results from each possible action.
Certain gols can be reached in different ways:
- Better ways have higher utilities.
- Utility function: maps (sequence of) state(s) onto a real number. 


### Keywords:
PEAS - Performence measure, Environment,  Actuators, Sensors.

---
---
