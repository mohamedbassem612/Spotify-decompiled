package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum dki1 implements v190 {
    BIO_VIOLATION_UNSPECIFIED(0),
    BIO_VIOLATION_TOO_LONG(1),
    BIO_VIOLATION_CONTAINS_EMAIL(2),
    BIO_VIOLATION_CONTAINS_PHONE(3),
    BIO_VIOLATION_MODERATION_BLOCKED(4),
    UNRECOGNIZED(-1);

    public final int a;

    dki1(int i) {
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
