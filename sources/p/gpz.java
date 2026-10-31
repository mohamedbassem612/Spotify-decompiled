package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum gpz implements v190 {
    RESOURCE_TYPE_VIDEO(0),
    RESOURCE_TYPE_AUDIO(1),
    UNRECOGNIZED(-1);

    public final int a;

    gpz(int i) {
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
