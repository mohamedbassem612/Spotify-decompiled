package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum foc implements v190 {
    CTA_TARGET_TYPE_UNSPECIFIED(0),
    EXTERNAL_URL(1),
    SPOTIFY_URI(2),
    UNRECOGNIZED(-1);

    public final int a;

    foc(int i) {
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
