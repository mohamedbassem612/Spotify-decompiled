package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ot7 implements ign0 {
    public final iac0 a;
    public final g1i b;
    public final bpb1 c = gio1.b(Boolean.TRUE);
    public boolean d;

    public ot7(iac0 iac0Var, g1i g1iVar) {
        this.a = iac0Var;
        this.b = g1iVar;
        c921.y(cto1.q(iac0Var), (o8n) null, 0, new mx(this, (lnm) null, (byte) 5), 3);
    }

    @Override // p.ign0
    public final void d() {
        Boolean bool = Boolean.TRUE;
        bpb1 bpb1Var = this.c;
        bpb1Var.getClass();
        bpb1Var.m(null, bool);
        if (this.d) {
            this.d = false;
            this.b.q();
        }
    }

    @Override // p.ign0
    public final bpb1 e() {
        return this.c;
    }

    @Override // p.ign0
    public final boolean f() {
        bpb1 bpb1Var = this.c;
        if (!((Boolean) bpb1Var.getValue()).booleanValue()) {
            return false;
        }
        Boolean bool = Boolean.FALSE;
        bpb1Var.getClass();
        bpb1Var.m(null, bool);
        g1i g1iVar = this.b;
        if (((Boolean) g1iVar.o().getValue()).booleanValue()) {
            g1iVar.p();
            this.d = true;
        }
        return true;
    }
}
