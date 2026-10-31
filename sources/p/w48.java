package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum w48 implements v190 {
    SIXTEEN_BITS_PER_SAMPLE(0),
    /* JADX INFO: Fake field, exist only in values array */
    IEEE_FLOAT(1),
    UNRECOGNIZED(-1);

    public final int a;

    w48(int i) {
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
