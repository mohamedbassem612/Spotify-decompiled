package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum j57 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    UNSPECIFIED(0),
    WAV(1),
    /* JADX INFO: Fake field, exist only in values array */
    PCM(2),
    /* JADX INFO: Fake field, exist only in values array */
    OPUS(3),
    /* JADX INFO: Fake field, exist only in values array */
    VORBIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    MP3(5),
    /* JADX INFO: Fake field, exist only in values array */
    WEBM(6),
    UNRECOGNIZED(-1);

    public final int a;

    j57(int i) {
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
