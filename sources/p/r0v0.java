package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r0v0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j1v0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0v0(v9q v9qVar, j1v0 j1v0Var) {
        super(0);
        this.a = (byte) 2;
        this.b = j1v0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 28;
        byte b3 = 3;
        byte b4 = 0;
        byte b5 = 2;
        j1v0 j1v0Var = this.b;
        byte b6 = 1;
        switch (b) {
            case 0:
                return rqt0.u(new dwv(j1v0Var.g, (byte) 13));
            case 1:
                return rqt0.u(new dwv(j1v0Var.g, (byte) 14));
            case 2:
                aek1 aek1Var = new aek1(j1v0Var.l, j1v0Var.k);
                mr20 mr20Var = (mr20) j1v0Var.u.getValue();
                ht20 ht20Var = new ht20(new any(j1v0Var.b, (byte) 18), new pk50(2, (lnm) null, (byte) 28));
                mr20 mr20VarU = rqt0.u(h5p1.q(j1v0Var.e, rqt0.u(new x010((at71) j1v0Var.x.getValue(), ht20Var, new qno(j1v0Var, (lnm) null, (byte) 1), (byte) 1)), rqt0.u(new x010((at71) j1v0Var.y.getValue(), (at71) j1v0Var.A.getValue(), new hpp0(3, null, (byte) 2), (byte) 1)), rqt0.u(h5p1.s((at71) j1v0Var.B.getValue(), ht20Var, new php0(mr20Var, (byte) 28), new a1v0(j1v0Var, null))), rqt0.u(new php0((at71) j1v0Var.C.getValue(), (byte) 29)), new ytr(j1v0Var, (lnm) null, (byte) 2)));
                mr20 mr20VarU2 = rqt0.u(new x010(ht20Var, mr20Var, new gop0(aek1Var, j1v0Var, (lnm) null, (byte) 1), (byte) 1));
                return rqt0.u(h5p1.s(mr20VarU, rqt0.u(new y0v0(mr20VarU2, j1v0Var, b4)), j1v0Var.d ? rqt0.u(new y0v0(mr20VarU2, j1v0Var, b6)) : new huz(w7x.a, (byte) 10), new v2k(4, null, (byte) 1)));
            case 3:
                ArrayList<s1v0> arrayListN0 = o7h.N0(j1v0Var.i, j1v0Var.h);
                ArrayList arrayList = new ArrayList();
                for (s1v0 s1v0Var : arrayListN0) {
                    tf51 tf51Var = (tf51) s1v0Var.b;
                    mmr0 mmr0Var = tf51Var instanceof hsw ? new mmr0(s1v0Var.a, ((hsw) tf51Var).j()) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                return sqg0.T(arrayList);
            case 4:
                ArrayList<s1v0> arrayList2 = j1v0Var.j;
                ArrayList arrayList3 = new ArrayList();
                for (s1v0 s1v0Var2 : arrayList2) {
                    Object obj = s1v0Var2.b;
                    prj0 prj0Var = obj instanceof prj0 ? (prj0) obj : null;
                    x010 x010Var = prj0Var == null ? null : new x010(j1v0Var.e(s1v0Var2.a, prj0Var), prj0Var.x(), new lag0(s1v0Var2, (lnm) null, (byte) 5), (byte) 1);
                    if (x010Var != null) {
                        arrayList3.add(x010Var);
                    }
                }
                return d5p1.r(rqt0.u(!arrayList3.isEmpty() ? new z4t0((mr20[]) o7h.l1(arrayList3).toArray(new mr20[0]), (byte) 2) : new huz(z6x.a, (byte) 10)), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
            case 5:
                return d5p1.r(new m9r0(rqt0.u(new c1v0((at71) j1v0Var.w.getValue(), b4)), j1v0Var.h, (byte) 18), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
            case 6:
                return d5p1.r(new m9r0(rqt0.u(new c1v0((at71) j1v0Var.z.getValue(), b6)), j1v0Var.i, (byte) 18), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
            case 7:
                ArrayList<s1v0> arrayList4 = j1v0Var.h;
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                for (s1v0 s1v0Var3 : arrayList4) {
                    LinkedHashMap linkedHashMap = j1v0Var.o;
                    if (linkedHashMap == null) {
                        u890.C("sectionAboveElementsAndCompanions");
                        throw null;
                    }
                    Object obj2 = linkedHashMap.get(s1v0Var3.a);
                    obj2.getClass();
                    arrayList5.add(new x010(j1v0Var.e(s1v0Var3.a, (tf51) s1v0Var3.b), ((wtw) obj2).b, new e1v0(s1v0Var3, null, (byte) 0), (byte) 1));
                }
                return d5p1.r(rqt0.u(!arrayList5.isEmpty() ? new z4t0((mr20[]) o7h.l1(arrayList5).toArray(new mr20[0]), (byte) 3) : new huz(o0v0.c, (byte) 10)), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
            case 8:
                ArrayList<s1v0> arrayList6 = j1v0Var.i;
                ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                for (s1v0 s1v0Var4 : arrayList6) {
                    LinkedHashMap linkedHashMap2 = j1v0Var.f17p;
                    if (linkedHashMap2 == null) {
                        u890.C("sectionBelowElementsAndCompanions");
                        throw null;
                    }
                    arrayList7.add(new x010(j1v0Var.e(s1v0Var4.a, (tf51) s1v0Var4.b), ((wtw) sqg0.G(s1v0Var4.a, linkedHashMap2)).b, new e1v0(s1v0Var4, null, (byte) 1), (byte) 1));
                }
                int i = hu20.a;
                return d5p1.r(rqt0.u(new ipr(o0v0.c, new kge(arrayList7), f1v0.h, (byte) 16)), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
            case 9:
                return d5p1.r(rqt0.u(new k6e0(new m9r0(rqt0.u(new c1v0((at71) j1v0Var.z.getValue(), b5)), j1v0Var.i, (byte) 18), b2)), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
            default:
                return d5p1.r(new m9r0(rqt0.u(new c1v0((at71) j1v0Var.w.getValue(), b3)), j1v0Var.h, (byte) 18), smo1.e(j1v0Var.a), new alb1(0L, Long.MAX_VALUE), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0v0(j1v0 j1v0Var, byte b) {
        super(0);
        this.a = b;
        this.b = j1v0Var;
    }
}
