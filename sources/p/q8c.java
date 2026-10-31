package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum q8c implements v190 {
    PAGE_TYPE_DEFAULT(0),
    PAGE_TYPE_ALL_CATEGORIES(1),
    UNRECOGNIZED(-1);

    public final int a;

    q8c(int i) {
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
