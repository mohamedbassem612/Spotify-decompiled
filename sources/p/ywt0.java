package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ywt0 implements rqw {
    public final /* synthetic */ byte a;
    public final hab0 b;

    public /* synthetic */ ywt0(hab0 hab0Var, byte b) {
        this.a = b;
        this.b = hab0Var;
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        r6h1 r6h1Var;
        iu30 iu30Var;
        r6h1 r6h1Var2;
        iu30 iu30Var2;
        byte b = this.a;
        j4f1 j4f1Var = this.b;
        switch (b) {
            case 0:
                vwt0 vwt0Var = (vwt0) obj;
                Integer numN = l0o1.n(op80Var);
                int iIntValue = numN != null ? numN.intValue() : 0;
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(iIntValue))) == null) {
                    r6h1Var = r6h1.c;
                }
                Integer numValueOf = Integer.valueOf(iIntValue);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                htl0 htl0Var = new htl0(new ntl0(new qtl0(numValueOf, yon1.D4().c, vwt0Var.a, r6h1Var), ((xwt0) ((kks0) j4f1Var).b).f), (byte) 0);
                g3h1 g3h1Var = new g3h1(htl0Var);
                h3h1 h3h1Var = new h3h1(new fgs0(htl0Var, (byte) 23));
                op80 wchVar = q6x.b;
                if (!g3h1Var.equals(wchVar) || !h3h1Var.equals(wchVar)) {
                    if (g3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    if (h3h1Var.equals(wchVar)) {
                        return g3h1Var;
                    }
                    wchVar = new wch(g3h1Var, h3h1Var);
                }
                return wchVar;
            default:
                vcg1 vcg1Var = (vcg1) obj;
                Integer numN2 = l0o1.n(op80Var);
                int iIntValue2 = numN2 != null ? numN2.intValue() : 0;
                h3h1 h3h1VarC2 = j0o1.C(op80Var);
                if (h3h1VarC2 == null || (iu30Var2 = h3h1VarC2.b) == null || (r6h1Var2 = (r6h1) iu30Var2.invoke(Integer.valueOf(iIntValue2))) == null) {
                    r6h1Var2 = r6h1.c;
                }
                Integer numValueOf2 = Integer.valueOf(iIntValue2);
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                ntl0 ntl0Var = new ntl0(new qtl0(numValueOf2, yon1.D4().c, vcg1Var.a, r6h1Var2), ((j7h1) j4f1Var.b).a);
                g3h1 g3h1Var2 = new g3h1(ntl0Var);
                h3h1 h3h1Var2 = new h3h1(new fbz0(ntl0Var, (byte) 25));
                op80 wchVar2 = q6x.b;
                if (!g3h1Var2.equals(wchVar2) || !h3h1Var2.equals(wchVar2)) {
                    if (g3h1Var2.equals(wchVar2)) {
                        return h3h1Var2;
                    }
                    if (h3h1Var2.equals(wchVar2)) {
                        return g3h1Var2;
                    }
                    wchVar2 = new wch(g3h1Var2, h3h1Var2);
                }
                return wchVar2;
        }
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, op80 op80Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return null;
    }
}
