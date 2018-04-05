package com.puppet_master.caesarscipers

class CaesarCipher {

    val engAlph = "abcdefghijklmnopqrstuvwxyz"; val rusAlph = "абвгдеёжзийклмнопрстуфкцчшщъыьэюя"






    fun encodeEng(startString:String, step:Int) : String{
        var encodedString = ""

        for (i in startString.indices) when{
            (startString[i].equals(" ")) -> encodedString += " "
            (engAlph.indexOf(startString.toLowerCase()[i])==-1) -> encodedString += ""
            else -> encodedString += engAlph[ (engAlph.indexOf(startString.toLowerCase()[i])+step) % engAlph.length ]
        }

        return encodedString
    }



    fun encodeRu(startString:String, step:Int) : String{
        var encodedString = ""

        for (i in startString.indices) when{
            (startString[i].equals(" ")) -> encodedString += " "
            (rusAlph.indexOf(startString.toLowerCase()[i])==-1) -> encodedString += ""
            else -> encodedString += rusAlph[ (rusAlph.indexOf(startString.toLowerCase()[i])+step) % rusAlph.length ]
        }

        return encodedString
    }



    fun decodeEng(startString: String, step:Int) : String{
        var decodedString = ""

        for (i in startString.indices) when{
            (startString[i].equals(" ")) -> decodedString += " "
            (engAlph.indexOf(startString.toLowerCase()[i])==-1) -> decodedString += ""
            else -> decodedString += engAlph[ (engAlph.indexOf(startString.toLowerCase()[i])+(engAlph.length - step) ) % engAlph.length ]
        }

        return decodedString;
    }



    fun decodeRu(startString: String, step:Int) : String{
        var decodedString = ""

        for (i in startString.indices) when{
            (startString[i].equals(" ")) -> decodedString += " "
            (rusAlph.indexOf(startString.toLowerCase()[i])==-1) -> decodedString += ""
            else -> decodedString += rusAlph[ ( rusAlph.indexOf(startString.toLowerCase()[i])+(rusAlph.length - step) ) % rusAlph.length ]
        }

        return decodedString;
    }


}