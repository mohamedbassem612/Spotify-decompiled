package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum l471 implements v190 {
    COPY_LINK(0),
    WHATSAPP(2),
    SMS(3),
    INSTAGRAM_STORIES(4),
    INSTAGRAM_DM(5),
    SNAPCHAT(6),
    TWITTER(8),
    FACEBOOK_STORIES(9),
    FACEBOOK_MESSENGER(10),
    LINE(12),
    MORE(13),
    DOWNLOAD(14),
    UNRECOGNIZED(-1);

    public final int a;

    l471(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
