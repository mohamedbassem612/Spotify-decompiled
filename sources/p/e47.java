package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum e47 implements v190 {
    DEFAULT(0),
    ARTIST(1),
    SHOW(2),
    USER(3),
    UNRECOGNIZED(-1);

    public final int a;

    e47(int i) {
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
