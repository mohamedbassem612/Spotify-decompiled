package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum hub1 implements v190 {
    INVALID_STATUS_CODE(0),
    SUCCESS(1),
    ERROR(2),
    UNRECOGNIZED(-1);

    public final int a;

    hub1(int i) {
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
