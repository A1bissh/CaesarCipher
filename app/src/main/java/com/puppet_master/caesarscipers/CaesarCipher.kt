package com.puppet_master.caesarscipers

class CaesarCipher {

    val engAlph = "abcdefghijklmnopqrstuvwxyz"; val rusAlph = "абвгдеёжзийклмнопрстуфкцчшщъыьэюя"






    fun encodeEng(startString:String, step:Int) : String{
        var encodedString = ""
        for (i in startString.indices){
            encodedString += engAlph[ (engAlph.indexOf(startString.toLowerCase()[i])+step)% engAlph.length ]
        }

        return encodedString
    }



    fun encodeRu(startString:String, step:Int) : String{
        var encodedString = ""
        for (i in startString.indices){
            encodedString += rusAlph[ (rusAlph.indexOf(startString.toLowerCase()[i])+step)% rusAlph.length ]
        }
        return encodedString
    }



    fun decodeEng(startString: String, step:Int) : String{
        var decodedString = ""

        for (i in startString.indices){
            decodedString += engAlph[ (engAlph.indexOf(startString.toLowerCase()[i])+(engAlph.length-step))% engAlph.length ]
        }
        return decodedString;
    }



    fun decodeRu(startString: String, step:Int) : String{
        var decodedString = ""

        for (i in startString.indices){
            decodedString += rusAlph[ (rusAlph.indexOf(startString.toLowerCase()[i])+(engAlph.length-step))% rusAlph.length ]
        }

        return decodedString;
    }


}