# motor-controller-test-suite

A simulated industrial motor controller in Java (TCP text protocol), tested with JUnit 5 and AssertJ.

> 🚧 Work in progress. The protocol specification is complete; the simulator and tests are being built.

## What this project shows

- **Requirements-based testing:** the device behaviour is defined first in [docs/protocol.md](docs/protocol.md), and every test traces back to it.
- **Hardware simulation:** a simulator replaces the real device, so tests run anywhere, including CI.
- **Test design techniques:** state transition testing and boundary value analysis.

## Protocol in short

- Commands: `START`, `STOP`, `SET SPEED <n>`, `STATUS`, `FAULT`, `RESET`
- States: `IDLE`, `RUNNING`, `ERROR`
- Error codes: `ERR 1 INVALID_COMMAND`, `ERR 2 OUT_OF_RANGE`, `ERR 3 NOT_ALLOWED`, `ERR 4 BUSY`

See [docs/protocol.md](docs/protocol.md) for the full specification.

## Planned test scope

| Area | What is tested |
|---|---|
| Connection | connect, disconnect, second client gets `ERR 4 BUSY` |
| Basic commands | the normal case of every command |
| Invalid input | format errors and boundary values, data-driven with `@ParameterizedTest` |
| State transitions | every cell of the state transition table |
| Timeouts | the test client fails cleanly when the device does not reply |

## Tech stack

Java 25 · Maven (Maven Wrapper) · JUnit 5 · AssertJ · GitHub Actions · Allure
