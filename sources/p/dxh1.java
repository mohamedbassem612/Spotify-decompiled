package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum dxh1 implements v190 {
    UPLOAD_DATE_FILTER_TYPE_UNKNOWN(0),
    UPLOAD_DATE_FILTER_TYPE_MOST_RECENT(3),
    UNRECOGNIZED(-1);

    public final int a;

    dxh1(int i) {
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
