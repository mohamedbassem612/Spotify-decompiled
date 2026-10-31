package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ygg1 implements tob1 {
    public final fhg1 a;
    public iu30 b;
    public iu30 c;
    public final /* synthetic */ zgg1 d;

    public ygg1(zgg1 zgg1Var, fhg1 fhg1Var, iu30 iu30Var, iu30 iu30Var2) {
        this.d = zgg1Var;
        this.a = fhg1Var;
        this.b = iu30Var;
        this.c = iu30Var2;
    }

    public final void c(dhg1 dhg1Var, Object obj, oe5 oe5Var) {
        Object objInvoke = this.c.invoke(dhg1Var.b());
        boolean zG = this.d.c.g();
        fhg1 fhg1Var = this.a;
        if (zG) {
            fhg1Var.i(this.c.invoke(dhg1Var.e()), objInvoke, (ni20) this.b.invoke(dhg1Var));
        } else {
            fhg1Var.j(objInvoke, (ni20) this.b.invoke(dhg1Var), obj, oe5Var);
        }
    }

    public final Object getValue() {
        c(this.d.c.f(), null, null);
        return this.a.t.getValue();
    }
}
