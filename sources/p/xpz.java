package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum xpz implements v190 {
    REPLACE(0),
    ENQUEUE(1),
    PUSH(2),
    UNRECOGNIZED(-1);

    public final int a;

    xpz(int i) {
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
