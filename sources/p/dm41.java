package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum dm41 implements v190 {
    SCHEDULE_TYPE_UNSPECIFIED(0),
    SCHEDULE_TYPE_NONE(1),
    SCHEDULE_TYPE_DAILY(2),
    SCHEDULE_TYPE_WEEKLY(3),
    SCHEDULE_TYPE_MONTHLY(4),
    UNRECOGNIZED(-1);

    public final int a;

    dm41(int i) {
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
