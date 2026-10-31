package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum m4n implements v190 {
    COPYRIGHT_TYPE_UNSPECIFIED(0),
    COPYRIGHT_TYPE_P(1),
    COPYRIGHT_TYPE_C(2),
    UNRECOGNIZED(-1);

    public final int a;

    m4n(int i) {
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
