package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum l79 implements v190 {
    AUTOMATION_VALUE_MODE_UNSPECIFIED(0),
    AUTOMATION_VALUE_MODE_LOW_PASS(1),
    AUTOMATION_VALUE_MODE_HIGH_PASS(2),
    UNRECOGNIZED(-1);

    public final int a;

    l79(int i) {
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
