package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum m79 implements v190 {
    AUTOMATION_VALUE_UNIT_UNSPECIFIED(0),
    AUTOMATION_VALUE_UNIT_DECIBELS(1),
    AUTOMATION_VALUE_UNIT_HERTZ(2),
    AUTOMATION_VALUE_UNIT_PERCENT(3),
    UNRECOGNIZED(-1);

    public final int a;

    m79(int i) {
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
