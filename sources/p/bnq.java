package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bnq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ bnq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final e601 a(sxz0 sxz0Var, frd1 frd1Var, iu30 iu30Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                f0a f0aVar = (f0a) ykqVar.c;
                cnq cnqVar = (cnq) ((jly0) f0aVar.O0).get();
                i8h1 i8h1Var = (i8h1) ((e401) f0aVar.b).i.get();
                c8o.l(i8h1Var);
                pux0 pux0Var = new pux0(i8h1Var);
                qxz0 qxz0Var = (qxz0) ((e401) f0aVar.b).g.get();
                c8o.l(qxz0Var);
                e101 e101Var = (e101) f0aVar.c;
                m201 m201Var = (m201) e101Var.f.get();
                c8o.l(m201Var);
                g4q g4qVar = (g4q) e101Var.b.get();
                c8o.l(g4qVar);
                return new e601(cnqVar, pux0Var, qxz0Var, m201Var, g4qVar, sxz0Var, frd1Var, iu30Var);
            default:
                uw0 uw0Var = (uw0) ykqVar.c;
                cnq cnqVar2 = (cnq) ((jly0) uw0Var.b).get();
                pux0 pux0VarH = uw0Var.H();
                v001 v001Var = (v001) uw0Var.d;
                qxz0 qxz0Var2 = (qxz0) v001Var.l.get();
                c8o.l(qxz0Var2);
                m201 m201Var2 = (m201) v001Var.m.get();
                c8o.l(m201Var2);
                g4q g4qVar2 = (g4q) v001Var.b.get();
                c8o.l(g4qVar2);
                return new e601(cnqVar2, pux0VarH, qxz0Var2, m201Var2, g4qVar2, sxz0Var, frd1Var, iu30Var);
        }
    }
}
