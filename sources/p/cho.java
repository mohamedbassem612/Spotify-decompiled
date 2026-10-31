package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum cho implements v190 {
    NONE(0),
    /* JADX INFO: Fake field, exist only in values array */
    GROUP_BY(1),
    ONLY_CURATED(2),
    ONLY_NOT_CURATED(3),
    UNRECOGNIZED(-1);

    public final int a;

    cho(int i) {
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
