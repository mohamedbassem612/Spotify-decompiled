package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zgg1 {
    public final tzg1 a;
    public final hrr0 b = v8r.q((Object) null);
    public final /* synthetic */ mhg1 c;

    public zgg1(mhg1 mhg1Var, tzg1 tzg1Var, String str) {
        this.c = mhg1Var;
        this.a = tzg1Var;
    }

    public final ygg1 a(iu30 iu30Var, Object obj, oe5 oe5Var, iu30 iu30Var2) {
        ygg1 ygg1VarC = c();
        mhg1 mhg1Var = this.c;
        if (ygg1VarC == null) {
            Object objInvoke = iu30Var2.invoke(mhg1Var.a.P0());
            Object objInvoke2 = iu30Var2.invoke(mhg1Var.a.P0());
            tzg1 tzg1Var = this.a;
            fhg1 fhg1Var = new fhg1(mhg1Var, objInvoke, prn1.n(tzg1Var, objInvoke2), tzg1Var);
            ygg1VarC = new ygg1(this, fhg1Var, iu30Var, iu30Var2);
            this.b.setValue(ygg1VarC);
            mhg1Var.j.add(fhg1Var);
        }
        ygg1VarC.c = iu30Var2;
        ygg1VarC.b = iu30Var;
        ygg1VarC.c(mhg1Var.f(), obj, oe5Var);
        return ygg1VarC;
    }

    public final ygg1 b(iu30 iu30Var, iu30 iu30Var2) {
        return a(iu30Var, null, null, iu30Var2);
    }

    public final ygg1 c() {
        return (ygg1) this.b.getValue();
    }
}
