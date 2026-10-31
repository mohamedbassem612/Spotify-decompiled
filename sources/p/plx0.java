package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum plx0 implements v190 {
    PROMINENCE_UNSPECIFIED(0),
    PROMINENCE_DEFAULT(1),
    PROMINENCE_HIGHLIGHTED(2),
    PROMINENCE_SUBDUED(3),
    UNRECOGNIZED(-1);

    public final int a;

    plx0(int i) {
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
