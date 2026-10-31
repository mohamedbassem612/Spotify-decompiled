package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class nfa0 {
    public static final mfa0 d;
    public final vfa0 a;
    public final kl1 b;
    public final l7m0 c = new l7m0((byte) 18);

    static {
        vfa0 vfa0Var = new vfa0(false, false, false, false, false, true, "    ", false, "type", false, true, 3, true);
        zmo1.d();
        d = new mfa0(vfa0Var, j761.a);
    }

    public nfa0(vfa0 vfa0Var, kl1 kl1Var) {
        this.a = vfa0Var;
        this.b = kl1Var;
    }

    public final Object a(String str, nma0 nma0Var) {
        vgc1 vgc1VarF = omo1.f(str, this);
        Object objY = new vfc1(this, rjm1.OBJ, vgc1VarF, nma0Var.getDescriptor(), null).Y(nma0Var);
        vgc1VarF.t();
        return objY;
    }

    public final String b(nma0 nma0Var, Object obj) {
        sw9 sw9Var = new sw9((byte) 17);
        try {
            kln1.t(this, sw9Var, nma0Var, obj);
            return sw9Var.toString();
        } finally {
            sw9Var.E();
        }
    }

    public final ega0 c(String str) {
        return (ega0) a(str, hga0.a);
    }
}
