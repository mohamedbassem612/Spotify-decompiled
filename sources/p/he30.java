package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum he30 implements v190 {
    FORMAT_UNSPECIFIED(0),
    FORMAT_AUDIO(1),
    FORMAT_VIDEO(2),
    FORMAT_PARROT(3),
    FORMAT_LOSSLESS(4),
    FORMAT_GENERATED(5),
    UNRECOGNIZED(-1);

    public final int a;

    he30(int i2) {
        this.a = i2;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
