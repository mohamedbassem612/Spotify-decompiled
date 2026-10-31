package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum wld implements v190 {
    CAPABILITY_UNKNOWN(0),
    CAPABILITY_WEB_INTERACTION_V1(1),
    UNRECOGNIZED(-1);

    public final int a;

    wld(int i) {
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
