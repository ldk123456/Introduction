package function

import java.util.concurrent.locks.Lock

//高阶函数
fun <T> lock(lock: Lock, body: () -> T): T{
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}
