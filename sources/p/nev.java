package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum nev implements v190 {
    TAG_UNSPECIFIED(0),
    TAG_MUSIC(1),
    TAG_SPEECH(2),
    TAG_NOISE(3),
    TAG_SILENCE(4),
    UNRECOGNIZED(-1);

    public final int a;

    nev(int i) {
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
