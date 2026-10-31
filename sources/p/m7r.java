package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public enum m7r implements v190 {
    DAY_OF_WEEK_UNSPECIFIED(0),
    DAY_OF_WEEK_SUNDAY(1),
    DAY_OF_WEEK_MONDAY(2),
    DAY_OF_WEEK_TUESDAY(3),
    DAY_OF_WEEK_WEDNESDAY(4),
    DAY_OF_WEEK_THURSDAY(5),
    DAY_OF_WEEK_FRIDAY(6),
    DAY_OF_WEEK_SATURDAY(7),
    UNRECOGNIZED(-1);

    public final int a;

    m7r(int i) {
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
