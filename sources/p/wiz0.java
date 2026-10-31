package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wiz0 extends w3x {
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wiz0(iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        super(true);
        this.d = iu30Var;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    public final void c() {
        if (((Boolean) this.e.getValue()).booleanValue()) {
            this.f.setValue(Boolean.TRUE);
        } else {
            this.d.invoke(piz0.a);
        }
    }
}
