package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class efp0 {
    public static final bma1 b;
    public static final bma1 c;
    public final dma1 a;

    static {
        nbc nbcVar = bma1.b;
        b = nbcVar.q("notification_permission_has_unknown_prompt_history");
        c = nbcVar.q("notification_permission_explicit_decision_count");
        nbcVar.q("notification_permission_os_prompt_is_migrated");
        nbcVar.k("notification_permission_rationale_requested");
        nbcVar.k("notification_permission_os_system_prompt_requested_count");
    }

    public efp0(dma1 dma1Var) {
        this.a = dma1Var;
    }
}
