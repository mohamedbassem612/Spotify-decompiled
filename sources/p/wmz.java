package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum wmz implements v190 {
    VIDEO(0),
    AUDIO(1),
    /* JADX INFO: Fake field, exist only in values array */
    SUBTITLE(2),
    UNRECOGNIZED(-1);

    public final int a;

    wmz(int i) {
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
