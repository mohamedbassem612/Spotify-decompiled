package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum prh implements v190 {
    PICK_AND_SHUFFLE(0),
    AUDIOBOOKS(1),
    LYRICS(2),
    BLUEJAY(3),
    KALLAX(4),
    /* JADX INFO: Fake field, exist only in values array */
    SUPER_CONNECT(5),
    PROMPT_PLAYLIST(6),
    RUNNING_MODE(7),
    UNRECOGNIZED(-1);

    public final int a;

    prh(int i) {
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
