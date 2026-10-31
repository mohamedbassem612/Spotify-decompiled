package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum s351 implements v190 {
    GENRE_TYPE_UNKNOWN(0),
    GENRE_TYPE_DEFAULT(1),
    GENRE_TYPE_CONTENT(2),
    UNRECOGNIZED(-1);

    public final int a;

    s351(int i) {
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
