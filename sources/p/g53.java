package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum g53 implements v190 {
    UNDEFINED(0),
    ALBUM(1),
    SINGLE(2),
    COMPILATION(3),
    EP(4),
    AUDIOBOOK(5),
    PODCAST(6),
    UNRECOGNIZED(-1);

    public final int a;

    g53(int i) {
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
