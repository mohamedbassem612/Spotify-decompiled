package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum a551 implements v190 {
    DEFAULT(0),
    ARTIST(1),
    SHOW(2),
    TRACK(3),
    UNRECOGNIZED(-1);

    public final int a;

    a551(int i) {
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
