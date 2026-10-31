package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xp41 implements o5s {
    public final q7r0 a;
    public final tp41 b;
    public final q8n c;
    public final bpb1 d = gio1.b(Boolean.TRUE);

    public xp41(q7r0 q7r0Var, tp41 tp41Var, q8n q8nVar) {
        this.a = q7r0Var;
        this.b = tp41Var;
        this.c = q8nVar;
        q7r0Var.d.c.getLifecycle().a(this);
    }

    public final void onDestroy(iac0 iac0Var) {
        this.a.d.c.getLifecycle().d(this);
    }

    public final void onPause(iac0 iac0Var) {
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1Var = this.d;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }

    public final void onResume(iac0 iac0Var) {
        Boolean bool = Boolean.TRUE;
        bpb1 bpb1Var = this.d;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, bool);
    }
}
