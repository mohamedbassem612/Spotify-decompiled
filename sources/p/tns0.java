package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum tns0 implements v190 {
    REASON_UNSPECIFIED(0),
    REASON_CLIENT_REQUEST(1),
    REASON_NON_MUSIC_CHOSEN(2),
    UNRECOGNIZED(-1);

    public final int a;

    tns0(int i) {
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
