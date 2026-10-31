package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum iba implements v190 {
    BASE_LAYER_TYPE_UNSPECIFIED(0),
    BASE_LAYER_TYPE_TALK(1),
    BASE_LAYER_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);

    public final int a;

    iba(int i) {
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
