package OOP_practic.Bank

class BankAccount(balance: Double) {
    var balans = balance

    fun deposit(n: Double) {
        balans += n;
    }

    fun withdraw(n: Double) {
        if (balans < n) {
            println("Не достаточно средств на баленсе")
        } else balans -= n
    }

    fun get_balance() {
        println(balans)
    }

    fun transfer(otherAccount: BankAccount, n: Double) {
        if (n>balans){
            println("Не достаточно средств на баленсе")
        }else{
            withdraw(n)
            otherAccount.deposit(n)
        }
    }
}

/*
Создайте класс BankAccount, представляющий банковский счёт. Этот класс должен иметь:

Конструктор , который принимает начальный баланс.
Методdeposit для пополнения счётчика с определённой достоверностью.
Методwithdraw снятия денег со счёта. Если запрашиваемая длина больше, чем текущий баланс, операция не должна выполняться, и следует вывести сообщение об ошибке.
Методget_balance , возвращающий текущий баланс.
Методtransfer , который принимает другой объект BankAccountи сумму, и пересчитывает указанную величину с текущего счетчика на другой счетчик. Если включить баланс, перевод не осуществляется, и выводится сообщение об деньгам.
 */