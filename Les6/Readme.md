Принципы SOLID, применяемые в данной работе:
1. Принцип SRP:
Интерфейс UserView описывает демонстрацию User;
Класс User имеет только необходимые поля для формирования объекта.
Созданы пакеты controller, model, service, sort и view, в которые перенесены соответствующие классы
2. Принцип ISP:
Реализация классами StudentView и TeacherView интерфейса UserView.
3. Принцип OCP:
В класс Student внесено новое поле со средним баллом - averageMark. При этом класс User затронут не был.