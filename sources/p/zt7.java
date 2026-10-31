package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum zt7 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_ENCODING_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_ENCODING_F32LE(1),
    AUDIO_ENCODING_S16LE(2),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO_ENCODING_S32LE(3),
    UNRECOGNIZED(-1);

    public final int a;

    zt7(int i) {
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
