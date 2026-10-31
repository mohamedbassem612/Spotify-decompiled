package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum l1y0 implements v190 {
    NEVER(0),
    DAILY(1),
    WEEKLY(2),
    UNRECOGNIZED(-1);

    public final int a;

    l1y0(int i) {
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
