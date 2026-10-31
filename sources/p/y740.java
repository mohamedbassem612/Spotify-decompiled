package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum y740 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    CAPPED(1),
    ENTITLEMENT_MISSING(2),
    UNRECOGNIZED(-1);

    public final int a;

    y740(int i) {
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
