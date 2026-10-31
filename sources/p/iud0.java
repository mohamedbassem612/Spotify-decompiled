package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum iud0 implements v190 {
    UNKNOWN(0),
    SCHEDULED(1),
    LIVE(2),
    ENDED(3),
    CANCELLED(4),
    UNRECOGNIZED(-1);

    public final int a;

    iud0(int i) {
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
