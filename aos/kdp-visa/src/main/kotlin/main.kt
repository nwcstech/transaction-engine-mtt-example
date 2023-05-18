fun main() {
    val publicKey =
        RSAEncryptionHelper.getPublicKeyFromString("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA6E+SxPeDxpOMiG6HRfQ2Bglk2cFnd+EIHP6oQIU7aN2wUfSg0ZfpmthxUJrn01lk/rAQCzesZOe0uU3UdHTJPPMmxoMG5vx5MvWyF0fylQwNpr+WUo4YFqxoS7YmQqqVhvz24b1HcMgo59R8I8f2YDK70GaGiI7lXh9hX9d96aovly0WpKhJ0cIuxJ8rp5EX3fqnT5IezmECR0jhaCOMH6Mxs4prfg8EfLLijEIOyLZO8+H8PiReMbN85jH03AbMPh9ywQuhYTYLE2zo+rgyIcuNhfTsdv3dn4H5UnCT8rCI08NeB34kXMCuON2U8tyl+lAYI5+vFNI05AOSxkXyQwIDAQAB")
    val encryptText = RSAEncryptionHelper.encryptText("4073289027318669", publicKey!!)
//    println(publicKey)
    println(encryptText)
}