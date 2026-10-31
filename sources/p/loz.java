package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum loz implements v190 {
    VIDEO_CODEC_FAMILY_UNKNOWN(0),
    VIDEO_CODEC_FAMILY_H264(1),
    VIDEO_CODEC_FAMILY_HEVC(2),
    VIDEO_CODEC_FAMILY_AV1(3),
    UNRECOGNIZED(-1);

    public final int a;

    loz(int i) {
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
