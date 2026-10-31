package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum itm1 implements v190 {
    YES(0),
    NO_IN_FOLDER(1),
    NOT_VALID_TYPE(2),
    UNRECOGNIZED(-1);

    public final int a;

    itm1(int i) {
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
