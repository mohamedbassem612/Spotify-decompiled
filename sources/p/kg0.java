package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kg0 {
    public static final ifl1 d = new ifl1(new ejb((byte) 17), (byte) 25);
    public final gg11 a;
    public final dg30 b;
    public final ohv0 c;

    public kg0(gg11 gg11Var, dg30 dg30Var, ohv0 ohv0Var) {
        this.a = gg11Var;
        this.b = dg30Var;
        this.c = ohv0Var;
    }

    public final boolean a(boolean z) {
        dg30 dg30Var = this.b;
        t2u t2uVarG = dg30Var.e0().G("zero_dialog_fragment");
        zf30 zf30VarG = dg30Var.e0().G("flow_fragment");
        if (t2uVarG != null && zf30VarG != null) {
            t2uVarG.dismiss();
            return true;
        }
        if (t2uVarG != null && zf30VarG == null && !z) {
            t2uVarG.dismiss();
            return true;
        }
        if (t2uVarG != null && zf30VarG == null && z) {
            dg30Var.finish();
            return true;
        }
        if (dg30Var.e0().L() == 0 && z) {
            dg30Var.finish();
            return true;
        }
        if (dg30Var.e0().L() == 0 && !z) {
            return false;
        }
        th30 th30VarE0 = dg30Var.e0();
        th30VarE0.getClass();
        th30VarE0.y(new qh30(th30VarE0, (String) null, -1, 0), false);
        return true;
    }

    public void b(dkt dktVar) {
        c(dktVar, null, false);
    }

    public final void c(dkt dktVar, ifl1 ifl1Var, boolean z) {
        this.b.runOnUiThread(new jg0(ifl1Var, z, this, dktVar));
    }

    public void d(dkt dktVar, boolean z) {
        c(dktVar, null, z);
    }

    public final void f(ig0 ig0Var, ifl1 ifl1Var, boolean z) {
        dg30 dg30Var = this.b;
        th30 th30VarE0 = dg30Var.e0();
        th30VarE0.getClass();
        nu9 nu9Var = new nu9(th30VarE0);
        if (((ejb) ifl1Var.b) != null) {
            nu9Var.o(2130772036, 2130772037, 2130772035, 2130772038);
        }
        if (ig0Var instanceof gg0) {
            nu9Var.n(2131431738, ((gg0) ig0Var).a, "flow_fragment");
        } else if (!(ig0Var instanceof hg0)) {
            eg.o();
            return;
        } else {
            hg0 hg0Var = (hg0) ig0Var;
            nu9Var.n(2131431738, nu9Var.j(hg0Var.b, hg0Var.a), "flow_fragment");
        }
        if (dg30Var.e0().G("flow_fragment") == null || z) {
            nu9Var.i();
        } else {
            nu9Var.c((String) null);
            nu9Var.g(true, true);
        }
    }
}
