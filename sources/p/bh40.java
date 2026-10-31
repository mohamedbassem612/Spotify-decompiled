package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum bh40 implements v190 {
    GENERATION_STATUS_UNSPECIFIED(0),
    GENERATION_STATUS_GENERATING(1),
    GENERATION_STATUS_GENERATED(2),
    GENERATION_STATUS_READY(3),
    GENERATION_STATUS_FAILED(4),
    GENERATION_STATUS_NO_CREDITS(5),
    UNRECOGNIZED(-1);

    public final int a;

    bh40(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
