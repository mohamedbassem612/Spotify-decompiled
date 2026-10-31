package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum k6m1 implements v190 {
    BLACK_TEXT_ON_WHITE_BACKGROUND(0),
    WHITE_TEXT_ON_BLACK_BACKGROUND(1),
    VIOLET_TEXT(2),
    RED_TEXT(3),
    GREEN_TEXT(4),
    UNRECOGNIZED(-1);

    public final int a;

    k6m1(int i) {
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
