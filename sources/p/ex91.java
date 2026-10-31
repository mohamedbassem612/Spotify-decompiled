package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ex91 implements v190 {
    SNOOZE_DURATION_30_DAYS(0),
    /* JADX INFO: Fake field, exist only in values array */
    SNOOZE_DURATION_10_SECS(99),
    UNRECOGNIZED(-1);

    public final int a;

    ex91(int i) {
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
