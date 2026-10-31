package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum eub1 implements v190 {
    UNSPECIFIED(0),
    QUEUED(1),
    PROCESSING(2),
    SUCCESS(3),
    TIMEOUT(4),
    ERROR(5),
    UNRECOGNIZED(-1);

    public final int a;

    eub1(int i2) {
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
