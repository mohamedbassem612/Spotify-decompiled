package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum oth1 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    AVAILABLE(0),
    DELETED(1),
    UNRECOGNIZED(-1);

    public final int a;

    oth1(int i) {
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
