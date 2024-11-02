package OOP_practic.Yakjo

class Register(var users:MutableList<List<String>>) {
    fun join(login:String,password:String):Boolean{
        for (i in users){
            if (i[1]==login && i[2]==password){
                return true
            }
        }
        return false
    }
    fun regist(login:String,password: String,status:String,):List<String>{
        return listOf((users[users.size-1][0].toInt()+1).toString(),login,password,status)
    }
    fun status(id:String):String{
        for (i in users){
            if (i[0]==id) return i[3]
        }
        return ""
    }
    fun loginContains(login:String):Boolean{
        for (i in users){
            if (i[1]==login){
                return false
            }
        }
        return true
    }
    fun getIdWhithLogin(login:String):String{
        for (i in users){
            if (i[1]==login){
                return i[0]
            }
        }
        return ""
    }
}