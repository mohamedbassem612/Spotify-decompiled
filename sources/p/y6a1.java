package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum y6a1 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    SONG_CREDITS_ISSUE_UNSPECIFIED(0),
    SONG_CREDITS_ISSUE_MISSING_CREDIT(1),
    SONG_CREDITS_ISSUE_EXTRA_OR_DUPLICATE(2),
    SONG_CREDITS_ISSUE_INCORRECT_ROLE(3),
    SONG_CREDITS_ISSUE_MISSPELT(4),
    SONG_CREDITS_ISSUE_OTHER(5),
    UNRECOGNIZED(-1);

    public final int a;

    y6a1(int i) {
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
