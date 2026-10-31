package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum na8 implements v190 {
    UNSPECIFIED(0),
    BOOK_PAGE_REDIRECT(1),
    UNRECOGNIZED(-1);

    public final int a;

    na8(int i) {
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
