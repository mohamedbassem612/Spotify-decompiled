package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum lpz implements v190 {
    OK(0),
    TEMPORARY_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    PERMANENT_ERROR(2),
    /* JADX INFO: Fake field, exist only in values array */
    DISK_FULL(3),
    UNRECOGNIZED(-1);

    public final int a;

    lpz(int i) {
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
