package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nkq0 extends klq0 {
    public static final nkq0 c = new nkq0(0, 3, 1);

    @Override // p.klq0
    public final void a(a9a a9aVar, j06 j06Var, hf91 hf91Var, h72 h72Var, llq0 llq0Var) {
        llq0 llq0VarQ;
        ze91 ze91Var = (ze91) a9aVar.m(1);
        s340 s340Var = (s340) a9aVar.m(0);
        sn20 sn20Var = (sn20) a9aVar.m(2);
        hf91 hf91VarI = ze91Var.i();
        if (llq0Var != null) {
            try {
                llq0VarQ = rqt0.q(llq0Var, hf91Var);
            } catch (Throwable th) {
                hf91VarI.e(false);
                throw th;
            }
        } else {
            llq0VarQ = null;
        }
        if (!sn20Var.c.A()) {
            g0k.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        sn20Var.b.z(j06Var, hf91VarI, h72Var, llq0VarQ);
        hf91VarI.e(true);
        hf91Var.d();
        s340Var.getClass();
        hf91Var.z(ze91Var, ze91Var.b(s340Var));
        hf91Var.j();
    }
}
