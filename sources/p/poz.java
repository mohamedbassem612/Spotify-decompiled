package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum poz implements v190 {
    NOT_DOWNLOADED(0),
    ERROR(1),
    REQUESTED(2),
    DOWNLOADED(3),
    DOWNLOADING(4),
    WAITING(5),
    UNRECOGNIZED(-1);

    public final int a;

    poz(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
