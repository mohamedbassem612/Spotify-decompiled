package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum wns0 implements v190 {
    RESTRICTION_REASON_UNSPECIFIED(0),
    RESTRICTION_REASON_AGE_ASSURANCE(1),
    RESTRICTION_REASON_EXPLICIT_CONTENT(2),
    RESTRICTION_REASON_AGE_ASSURANCE_19_PLUS(3),
    RESTRICTION_REASON_UNAVAILABLE_CONTENT(4),
    RESTRICTION_REASON_OFFLINE_UNAVAILABLE_CONTENT(5),
    UNRECOGNIZED(-1);

    public final int a;

    wns0(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
