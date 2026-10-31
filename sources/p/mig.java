package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum mig implements v190 {
    CLIENT_CAPABILITY_UNSPECIFIED(0),
    CLIENT_CAPABILITY_EVENT_PAGE_HERO_V1(1),
    CLIENT_CAPABILITY_EVENT_PAGE_TICKETING_TIMELINE_V1(2),
    CLIENT_CAPABILITY_EVENT_PAGE_RESERVED_SHARE_V1(3),
    UNRECOGNIZED(-1);

    public final int a;

    mig(int i) {
        this.a = i;
    }

    public static mig a(int i) {
        if (i == 0) {
            return CLIENT_CAPABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return CLIENT_CAPABILITY_EVENT_PAGE_HERO_V1;
        }
        if (i == 2) {
            return CLIENT_CAPABILITY_EVENT_PAGE_TICKETING_TIMELINE_V1;
        }
        if (i != 3) {
            return null;
        }
        return CLIENT_CAPABILITY_EVENT_PAGE_RESERVED_SHARE_V1;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
