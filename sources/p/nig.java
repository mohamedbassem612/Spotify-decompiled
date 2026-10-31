package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum nig implements v190 {
    CLIENT_CAPABILITY_UNSPECIFIED(0),
    EDITORIAL_SHELF_CTA_V1(1),
    LEF_MIXED_CAROUSEL_CONTENT_V1(2),
    UNRECOGNIZED(-1);

    public final int a;

    nig(int i) {
        this.a = i;
    }

    public static nig a(int i) {
        if (i == 0) {
            return CLIENT_CAPABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return EDITORIAL_SHELF_CTA_V1;
        }
        if (i != 2) {
            return null;
        }
        return LEF_MIXED_CAROUSEL_CONTENT_V1;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
