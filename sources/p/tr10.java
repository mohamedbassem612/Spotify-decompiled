package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum tr10 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    CATEGORY_UNSPECIFIED(0),
    CATEGORY_SONG_CREDITS(1),
    CATEGORY_SAMPLES_OR_COVERS(2),
    CATEGORY_SOMETHING_ELSE(3),
    UNRECOGNIZED(-1);

    public final int a;

    tr10(int i) {
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
