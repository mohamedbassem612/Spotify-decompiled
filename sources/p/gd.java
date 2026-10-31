package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum gd implements v190 {
    NOTE_STATUS_UNSPECIFIED(0),
    ACCEPTED(1),
    PARTIALLY_ACCEPTED(2),
    UNRECOGNIZED(-1);

    public final int a;

    gd(int i) {
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
