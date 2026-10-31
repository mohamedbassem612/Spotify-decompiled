package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum u68 implements v190 {
    UNKNOWN(0),
    PRERELEASE(1),
    LIVE(2),
    UNRECOGNIZED(-1);

    public final int a;

    u68(int i) {
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
