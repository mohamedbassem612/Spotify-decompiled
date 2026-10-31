package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class umq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ umq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final o401 a(frd1 frd1Var, f601 f601Var, sxz0 sxz0Var) {
        byte b = this.a;
        ykq ykqVar = this.b;
        switch (b) {
            case 0:
                f0a f0aVar = (f0a) ykqVar.c;
                vmq vmqVar = (vmq) ((jly0) f0aVar.d).get();
                wmq wmqVar = (wmq) ((jly0) f0aVar.e).get();
                e401 e401Var = (e401) f0aVar.b;
                jjz jjzVar = (jjz) e401Var.c.get();
                c8o.l(jjzVar);
                return new o401(vmqVar, wmqVar, new x981(jjzVar, ((Boolean) e401Var.f.get()).booleanValue(), (byte) 1), (xmq) ((jly0) f0aVar.f).get(), (ymq) ((jly0) f0aVar.g).get(), f601Var, frd1Var, sxz0Var);
            default:
                uw0 uw0Var = (uw0) ykqVar.c;
                vmq vmqVar2 = (vmq) ((jly0) uw0Var.e).get();
                wmq wmqVar2 = (wmq) ((jly0) uw0Var.f).get();
                v001 v001Var = (v001) uw0Var.d;
                jjz jjzVar2 = (jjz) v001Var.g.get();
                c8o.l(jjzVar2);
                return new o401(vmqVar2, wmqVar2, new x981(jjzVar2, ((Boolean) v001Var.i.get()).booleanValue(), (byte) 1), (xmq) ((jly0) uw0Var.g).get(), (ymq) ((jly0) uw0Var.h).get(), f601Var, frd1Var, sxz0Var);
        }
    }
}
