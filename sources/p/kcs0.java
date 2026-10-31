package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum kcs0 implements v190 {
    TRIAL(0),
    PREPAID(1),
    RECURRING(2),
    UNRECOGNIZED(-1);

    public final int a;

    kcs0(int i) {
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
