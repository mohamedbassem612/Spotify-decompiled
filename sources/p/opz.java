package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum opz implements v190 {
    OTHER(0),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO(1),
    /* JADX INFO: Fake field, exist only in values array */
    DRM(2),
    /* JADX INFO: Fake field, exist only in values array */
    IMAGE(3),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO(4),
    UNRECOGNIZED(-1);

    public final int a;

    opz(int i) {
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
