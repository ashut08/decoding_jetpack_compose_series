package com.example.myapplication.model

data class InstaUserData
    (
    val id: String,
    val username: String,
    val name: String,
    val isFollow: Boolean,
    val bio: String,
    val profilePic: String,
    val post: Int,
    val noOfFollowers: Int,
    val noOfFollowing: Int,
    val imagePost: List<String>,

    )

fun getUsers(): List<InstaUserData> {
    return listOf(
        InstaUserData(
            id = "1",
            username = "ashu8", name = "Ashutosh",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Unapologetically Me.\\n\" +\n" +
                    "                    \"An introvert soul stuck into an extrovert body. ✨",
            profilePic = "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY"
        ),
        InstaUserData(
            id = "2",
            username = "sahil09", name = "Shahil Sarma",
            isFollow = true,
            post = 12,
            noOfFollowers = 230,
            noOfFollowing = 330,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Unapologetically Me.\n" +
                    "An introvert soul stuck into an extrovert body. ✨",
            profilePic = "https://media.istockphoto.com/photos/positive-woman-video-calling-using-laptop-at-home-picture-id1333405308?s=612x612"
        ),
        InstaUserData(
            id = "3",
            username = "mni", name = "missun8",
            isFollow = false,
            post = 332,
            noOfFollowers = 500,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "“Only A Life Lived In The Service \"\n" +
                    "\"To Others Is Worth Living\" ",
            profilePic = "https://media.istockphoto.com/photos/african-mid-woman-using-smartphone-at-home-picture-id1319763415?b=1&k=20&m=1319763415&s=170667a&w=0&h=J9vN7w33elL-hY1CogyTB2BzzKpiEbmPqTdsQ6fBbuI="
        ),
        InstaUserData(
            id = "4",
            username = "urstrulydishayadav", name = "sakshi Baniwal",
            isFollow = true,
            post = 12,
            noOfFollowers = 340,
            noOfFollowing = 130,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://media.istockphoto.com/photos/happy-business-woman-working-from-home-on-laptop-computer-picture-id1350926540?b=1&k=20&m=1350926540&s=170667a&w=0&h=7vUba9gEL9L0ntjEZWvCQ4EhOXB3cwtUfAfnHH1fUec="
        ),
        InstaUserData(
            id = "5",
            username = "inny016", name = "inny016",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "I am who I am, I am what I am I do what I do and I never gonna do it any different I don’t care who likes it and who doesn’t.\uD83D\uDE09",
            profilePic = "https://images.unsplash.com/photo-1552058544-f2b08422138a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8cGVyc29ufGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=600&q=60"
        ),
        InstaUserData(
            id = "6",
            username = "mispicoso", name = "picaso09",
            isFollow = true,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Blow candles on 2 Nov \uD83C\uDF82\uD83C\uDF82\uD83C\uDF8A\uD83C\uDF89\n" +
                    "Music \uD83D\uDC95\n" +
                    "Create the life you can't wait to wake up to.\uD83D\uDE0A\uD83D\uDE0A ",
            profilePic = "https://images.unsplash.com/photo-1491349174775-aaafddd81942?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8cGVyc29ufGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=600&q=60"
        ),
        InstaUserData(
            id = "7",
            username = "tania", name = "tania_sachdev",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Blow candles on 2 Nov \uD83C\uDF82\uD83C\uDF82\uD83C\uDF8A\uD83C\uDF89\n" +
                    "Music \uD83D\uDC95\n" +
                    "Create the life you can't wait to wake up to.\uD83D\uDE0A\uD83D\uDE0A",
            profilePic = "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY"
        ),
        InstaUserData(
            id = "8",
            username = "meredej", name = "rodurez miri",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Vivez votre journée comme la dernière✨❤️",
            profilePic = "https://images.unsplash.com/photo-1504593811423-6dd665756598?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80"
        ),
        InstaUserData(
            id = "9",
            username = "himishi", name = "himusi",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY"
        ),
        InstaUserData(
            id = "10",
            username = "sahil09", name = "Shahil Sarma",
            isFollow = true,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY"
        ),
        InstaUserData(
            id = "11",
            username = "ashu8", name = "Ashutosh",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://images.unsplash.com/photo-1593104547489-5cfb3839a3b5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjN8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=600&q=60"
        ),
        InstaUserData(
            id = "12",
            username = "sahil09", name = "Shahil Sharma",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://images.unsplash.com/photo-1573140247632-f8fd74997d5c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjZ8fHBlcnNvbnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=600&q=60"
        ),
        InstaUserData(
            id = "13",
            username = "ashu8", name = "Ashutosh",
            isFollow = true,
            post = 100,
            noOfFollowers = 230,
            noOfFollowing = 150,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY"
        ),
        InstaUserData(
            id = "14",
            username = "sahil09", name = "Shahil Sarma",
            isFollow = true,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://media.istockphoto.com/photos/positive-woman-video-calling-using-laptop-at-home-picture-id1333405308?s=612x612"
        ),
        InstaUserData(
            id = "15",
            username = "ashu8", name = "Ashutosh",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY"
        ),
        InstaUserData(
            id = "16",
            username = "sahil09", name = "Shahil Sarma",
            isFollow = false,
            post = 12,
            noOfFollowers = 30,
            noOfFollowing = 30,
            imagePost = listOf(
                "https://i.picsum.photos/id/1005/5760/3840.jpg?hmac=2acSJCOwz9q_dKtDZdSB-OIK1HUcwBeXco_RMMTUgfY",
                "https://i.picsum.photos/id/1024/1920/1280.jpg?hmac=-PIpG7j_fRwN8Qtfnsc3M8-kC3yb0XYOBfVzlPSuVII",
                "https://i.picsum.photos/id/1015/6000/4000.jpg?hmac=aHjb0fRa1t14DTIEBcoC12c5rAXOSwnVlaA5ujxPQ0I"
            ),
            bio = "Hi welcome to my world ",
            profilePic = "https://media.istockphoto.com/photos/positive-woman-video-calling-using-laptop-at-home-picture-id1333405308?s=612x612"
        ),


        );
}