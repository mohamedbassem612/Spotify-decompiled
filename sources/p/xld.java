package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum xld implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    RESERVED(0),
    AUDIO_ONLY(1),
    DISTRACTED_DRIVER(2),
    UNRECOGNIZED(-1);

    public final int a;

    xld(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
