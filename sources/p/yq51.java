package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum yq51 implements v190 {
    SEGMENT_TYPE_UNSPECIFIED(0),
    SEGMENT_TYPE_TALK(1),
    SEGMENT_TYPE_MUSIC(2),
    UNRECOGNIZED(-1);

    public final int a;

    yq51(int i) {
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
