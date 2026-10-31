package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum cki1 implements v190 {
    BIO_AUDIENCE_UNSPECIFIED(0),
    BIO_AUDIENCE_SELF_ONLY(1),
    BIO_AUDIENCE_CONNECTIONS_ONLY(2),
    BIO_AUDIENCE_PUBLIC(3),
    UNRECOGNIZED(-1);

    public final int a;

    cki1(int i) {
        this.a = i;
    }

    public static cki1 a(int i) {
        if (i == 0) {
            return BIO_AUDIENCE_UNSPECIFIED;
        }
        if (i == 1) {
            return BIO_AUDIENCE_SELF_ONLY;
        }
        if (i == 2) {
            return BIO_AUDIENCE_CONNECTIONS_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return BIO_AUDIENCE_PUBLIC;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
