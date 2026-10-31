package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class atw implements sp80 {
    public final /* synthetic */ dtw a;

    public atw(dtw dtwVar) {
        this.a = dtwVar;
    }

    @Override // p.sp80
    public final boolean a() {
        dtw dtwVar = this.a;
        t8r0 t8r0Var = dtwVar.x;
        if (t8r0Var != null) {
            return (u890.j(dtwVar.o, dtwVar.f) && u890.j(dtwVar.f27p, ((rl1) t8r0Var.b).x())) ? false : true;
        }
        return false;
    }

    @Override // p.sp80
    public final op80 b(op80 op80Var) {
        dtw dtwVar = this.a;
        t8r0 t8r0Var = dtwVar.x;
        if (t8r0Var == null) {
            return null;
        }
        rl1 rl1Var = (rl1) t8r0Var.b;
        dtwVar.o = dtwVar.f;
        dtwVar.f27p = rl1Var.x();
        try {
            rqw rqwVarA = dtwVar.a.a();
            Object obj = dtwVar.f;
            obj.getClass();
            return rqwVarA.a(obj, rl1Var.x(), op80Var);
        } catch (Exception e) {
            dtw.a(dtwVar, e);
            throw null;
        }
    }
}
