package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum zn01 implements v190 {
    RECENT_TYPE_UNSPECIFIED(0),
    RECENT_TYPE_SAVED(1),
    RECENT_TYPE_PLAYED(2),
    RECENT_TYPE_SHARED(3),
    RECENT_TYPE_AUTO_GENERATED(4),
    UNRECOGNIZED(-1);

    public final int a;

    zn01(int i) {
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
