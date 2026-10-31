package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum qvg1 implements v190 {
    TRIGGER_TYPE_UNKNOWN(0),
    URI(1),
    CLIENT_EVENT(2),
    PLAYBACK_STARTED(3),
    UNRECOGNIZED(-1);

    public final int a;

    qvg1(int i) {
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
