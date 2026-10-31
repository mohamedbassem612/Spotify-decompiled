package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum ofc implements v190 {
    UNKNOWN_BUTTON_TYPE(0),
    PRIMARY(1),
    TERTIARY(2),
    TEXT_LINK(3),
    UNRECOGNIZED(-1);

    public final int a;

    ofc(int i) {
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
