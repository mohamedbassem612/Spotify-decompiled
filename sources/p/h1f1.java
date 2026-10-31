package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum h1f1 implements v190 {
    TONE_UNSPECIFIED(0),
    TONE_NEUTRAL(1),
    TONE_ON_SALE(2),
    TONE_WARNING(3),
    TONE_CRITICAL(4),
    UNRECOGNIZED(-1);

    public final int a;

    h1f1(int i) {
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
