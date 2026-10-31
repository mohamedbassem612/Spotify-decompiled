package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum iup0 implements v190 {
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    TEMPORARY_ERROR(1),
    PERMANENT_ERROR(2),
    DISK_FULL(3),
    UNRECOGNIZED(-1);

    public final int a;

    iup0(int i) {
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
