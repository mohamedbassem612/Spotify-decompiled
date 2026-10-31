package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class dqc implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ dqc(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                iu30Var.invoke(lslVar);
                lslVar.s1();
                return rih1.a;
            case 1:
                return new n8v((o8v) obj, iu30Var);
            case 2:
                return Long.valueOf(hap1.u(((jfv) iu30Var.invoke(obj)).a));
            case 3:
                dgd dgdVar = (dgd) obj;
                lz20 lz20Var = (lz20) iu30Var.invoke(new yx20(dgdVar.a));
                if (lz20Var == lz20.c) {
                    dgdVar.b = true;
                } else if (lz20Var != lz20.b) {
                    lz20.b(lz20Var);
                }
                return rih1.a;
            case 4:
                rj40 rj40Var = (dpg1) obj;
                if (rj40Var instanceof rj40) {
                    return Boolean.valueOf(((Boolean) iu30Var.invoke(rj40Var.O0)).booleanValue());
                }
                eg.m("Node is not a GestureNode instance");
                return null;
            case 5:
                jv91 jv91Var = (jv91) iu30Var.invoke((nv91) obj);
                synchronized (pv91.c) {
                    pv91.d = pv91.d.f(jv91Var.g());
                }
                return jv91Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return iu30Var.invoke(l);
        }
    }
}
