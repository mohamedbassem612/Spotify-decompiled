package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum ugv0 implements v190 {
    SUCCESS(0),
    FAIL(1),
    INVALID_SLOT(2),
    INVALID_DEMAND_STATUS(3),
    INVALID_ELIGIBILITY_STATUS(4),
    UNRECOGNIZED(-1);

    public final int a;

    ugv0(int i) {
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
