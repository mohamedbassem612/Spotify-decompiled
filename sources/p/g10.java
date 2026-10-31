package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum g10 implements v190 {
    ACTION_UNSPECIFIED(0),
    ACTION_QUEUED(1),
    ACTION_PROCESSING(2),
    ACTION_TIMEOUT(3),
    ACTION_SUCCESS(4),
    ACTION_ERROR(5),
    UNRECOGNIZED(-1);

    public final int a;

    g10(int i2) {
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
