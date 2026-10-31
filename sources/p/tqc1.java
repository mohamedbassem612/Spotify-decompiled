package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum tqc1 implements v190 {
    SUBTITLE_SOURCE_UNKNOWN(0),
    SUBTITLE_SOURCE_GENERATED_METADATA(1),
    SUBTITLE_SOURCE_OPERATOR_AUTHORED(2),
    UNRECOGNIZED(-1);

    public final int a;

    tqc1(int i) {
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
