package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum etm1 implements v190 {
    UNSPECIFIED(0),
    RESERVED(1),
    FCFS(2),
    WAITLISTED(3),
    PURCHASED(4),
    INELIGIBLE(5),
    SOLD_OUT(6),
    CANCELLED(7),
    SALE_ENDED(8),
    UNRECOGNIZED(-1);

    public final int a;

    etm1(int i) {
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
