package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum u80 implements v190 {
    UNSPECIFIED(0),
    NAVIGATE(1),
    DOWNLOAD(2),
    EXPAND_NPV(3),
    QUEUE(4),
    UNRECOGNIZED(-1);

    public final int a;

    u80(int i) {
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
