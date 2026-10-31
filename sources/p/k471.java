package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum k471 implements v190 {
    copy_link(0),
    screenshot_download(1),
    whatsapp(2),
    sms(3),
    instagram_stories(4),
    instagram_dm(5),
    snapchat(6),
    twitter(7),
    facebook_stories(8),
    facebook_messenger(9),
    facebook_newsfeed(10),
    line(11),
    more(12),
    tiktok_feed(13),
    tiktok_messages(14),
    snapchat_lens(15),
    signal(16),
    whatsapp_status(17),
    threads(18),
    linkedin(19),
    UNRECOGNIZED(-1);

    public final int a;

    k471(int i) {
        this.a = i;
    }

    public static k471 a(int i) {
        switch (i) {
            case 0:
                return copy_link;
            case 1:
                return screenshot_download;
            case 2:
                return whatsapp;
            case 3:
                return sms;
            case 4:
                return instagram_stories;
            case 5:
                return instagram_dm;
            case 6:
                return snapchat;
            case 7:
                return twitter;
            case 8:
                return facebook_stories;
            case 9:
                return facebook_messenger;
            case 10:
                return facebook_newsfeed;
            case 11:
                return line;
            case 12:
                return more;
            case 13:
                return tiktok_feed;
            case 14:
                return tiktok_messages;
            case 15:
                return snapchat_lens;
            case 16:
                return signal;
            case 17:
                return whatsapp_status;
            case 18:
                return threads;
            case 19:
                return linkedin;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
