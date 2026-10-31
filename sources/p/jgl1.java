package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class jgl1 {
    public static final bma1 a;
    public static final bma1 b;
    public static final bma1 c;

    static {
        nbc nbcVar = bma1.b;
        a = nbcVar.u("wear.onboarding.status");
        b = nbcVar.u("wear.onboarding.watch_interaction_first_time_shown");
        c = nbcVar.u("wear.onboarding.experiment_reset_applied");
    }

    public static final bma1 a() {
        return c;
    }

    public static final bma1 b() {
        return b;
    }

    public static final bma1 c() {
        return a;
    }
}
