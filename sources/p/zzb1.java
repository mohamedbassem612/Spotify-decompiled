package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum zzb1 implements v190 {
    STOP_MANAGING_ACTION_STATE_UNSPECIFIED(0),
    STOP_MANAGING_ACTION_STATE_ENABLED(1),
    STOP_MANAGING_ACTION_STATE_DISABLED_ON_FAMILY_PLAN(2),
    UNRECOGNIZED(-1);

    public final int a;

    zzb1(int i) {
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
