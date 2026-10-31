package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum kx0 implements v190 {
    AVAILABLE(0),
    PLAY(1),
    DISCARD(2),
    UNRECOGNIZED(-1);

    public final int a;

    kx0(int i) {
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
