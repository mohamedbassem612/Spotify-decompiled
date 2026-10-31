package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum in0 implements v190 {
    DETECT_STATUS_UNKNOWN(0),
    DETECT_STATUS_ERROR(1),
    DETECT_STATUS_IN_PROGRESS(2),
    DETECT_STATUS_FINISHED(3),
    DETECT_STATUS_AUDIO_UNAVAILABLE(4),
    DETECT_STATUS_FINISHED_BASED_ON_METADATA_ONLY(5),
    UNRECOGNIZED(-1);

    public final int a;

    in0(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
