package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum v461 implements v190 {
    OPTION_UNSPECIFIED(0),
    OPTION_INCORRECT(1),
    OPTION_OFFENSIVE(2),
    OPTION_BORING(3),
    /* JADX INFO: Fake field, exist only in values array */
    OPTION_UNREADABLE(4),
    OPTION_OTHER(5),
    OPTION_OUTDATED(6),
    UNRECOGNIZED(-1);

    public final int a;

    v461(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
