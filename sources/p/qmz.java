package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum qmz implements v190 {
    UNKNOWN_FILE_ORIGIN(0),
    INTERNAL(1),
    EXTERNAL(2),
    LOCAL(3),
    GENERATED(4),
    UNRECOGNIZED(-1);

    public final int a;

    qmz(int i) {
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
