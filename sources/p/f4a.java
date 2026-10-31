package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum f4a implements v190 {
    BAN_STATUS_UNSPECIFIED(0),
    BAN_STATUS_DEFAULT(1),
    BAN_STATUS_BANNED(2),
    BAN_STATUS_ALLOWED(3),
    UNRECOGNIZED(-1);

    public final int a;

    f4a(int i) {
        this.a = i;
    }

    public static f4a a(int i) {
        if (i == 0) {
            return BAN_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return BAN_STATUS_DEFAULT;
        }
        if (i == 2) {
            return BAN_STATUS_BANNED;
        }
        if (i != 3) {
            return null;
        }
        return BAN_STATUS_ALLOWED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
