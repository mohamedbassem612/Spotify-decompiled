package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum yzg1 implements v190 {
    IMAGE(0),
    VIDEO(1),
    VIDEO_LOOPING(2),
    VIDEO_LOOPING_RANDOM(3),
    UNRECOGNIZED(-1);

    public final int a;

    yzg1(int i) {
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
