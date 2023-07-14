## ACID

* Atomicity: 트랜잭션에 따라 모두 반영되거나 모두 반영되지 않아야 한다. 이를\
보장해주는것이 Rollback,commit.

* Consistency: 트랜잭션 수행 전과 수행 후는 같아야한다. 가끔 Concurrency와 헷갈린다.

* Isolation: 여러 트랜잭션은 서로 영향을 주지 않는다.

* Durability: 시스템 장애, 전원 손실등에서 데이터의 영속성을 보장해주는 특징
