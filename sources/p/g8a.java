package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum g8a implements v190 {
    UNDEFINED_BANNER(0),
    ALL_CAUGHT_UP(1),
    NEW_MUSIC_FRIDAY_CAUGHT_UP_BANNER(2),
    UNRECOGNIZED(-1);

    public final int a;

    g8a(int i) {
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
