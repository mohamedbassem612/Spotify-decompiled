package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class zsh1 {
    public static final o3r a;

    static {
        jd11 jd11Var = rc11.a;
        a = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, osh1.h, new j4r(qmh1.e1), osh1.i), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, osh1.d, new j4r(osh1.b), osh1.e), new l4r(pwc0.b, 2, osh1.f, new j4r(osh1.c), osh1.g), rre1.Z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(umu0 umu0Var, String str, onm onmVar) {
        nsh1 nsh1Var;
        Object objA;
        if (onmVar instanceof nsh1) {
            nsh1Var = (nsh1) onmVar;
            int i = nsh1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsh1Var.b = i - Integer.MIN_VALUE;
            } else {
                nsh1Var = new nsh1(onmVar);
            }
        } else {
            nsh1Var = new nsh1(onmVar);
        }
        Object obj = nsh1Var.a;
        int i2 = nsh1Var.b;
        if (i2 == 0) {
            hm5.M(obj);
            nsh1Var.b = 1;
            objA = umu0Var.a(str, nsh1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        if (objA instanceof m231) {
            return objA;
        }
        sj60 sj60Var = (sj60) o7h.s0(((vj60) objA).a);
        if (sj60Var != null) {
            if (!sj60Var.g) {
                sj60Var = null;
            }
            if (sj60Var != null) {
                return sj60Var.e;
            }
        }
        return null;
    }
}
