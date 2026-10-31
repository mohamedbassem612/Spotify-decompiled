package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum osm1 implements v190 {
    EXCLUDE(0),
    INCLUDE_IF_NOT_EMPTY(1),
    INCLUDE_ALWAYS(2),
    UNRECOGNIZED(-1);

    public final int a;

    osm1(int i) {
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
