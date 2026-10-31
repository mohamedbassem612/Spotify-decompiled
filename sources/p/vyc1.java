package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vyc1 implements h0r0 {
    public final qyj a;
    public final xo41 b;
    public final List c;
    public final cbr0 d;

    public vyc1(qyj qyjVar, hs3 hs3Var) {
        List listC;
        this.a = qyjVar;
        zo41 zo41Var = ((ls3) ((ks3) hs3Var).e.a.getValue()).b.c;
        xo41 xo41Var = zo41Var instanceof xo41 ? (xo41) zo41Var : null;
        this.b = xo41Var;
        if (xo41Var != null) {
            List list = xo41Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                qpl qplVar = (qpl) obj;
                if (qplVar.h.length() > 0 && qplVar.X == 2) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new p6m(((qpl) it.next()).h, 1));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                qpl qplVar2 = (qpl) obj2;
                if (qplVar2.h.length() > 0 && qplVar2.X == 1) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new p6m(((qpl) it2.next()).h, 2));
            }
            int iMin = Math.min(arrayList2.size(), 5 - Math.min(arrayList4.size(), 2));
            listC = k4p1.C(o7h.N0(o7h.d1(arrayList4, 5 - iMin), o7h.d1(arrayList2, iMin)));
        } else {
            listC = null;
        }
        this.c = listC == null ? z6x.a : listC;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new cbr0(new dbr0[]{new bn70(yon1.G1("ALLBOARDING_PLACEHOLDER", "allboarding/placeholder", 147, qm3.b), new lik1("spotify:internal:allboarding:origin:default"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-941679788, new uyc1(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        h311 h311VarV;
        uyc1 uyc1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1489297947);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            xo41 xo41Var = this.b;
            if (xo41Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    uyc1Var = new uyc1(this, i, (byte) 1);
                }
            } else {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = orc1.f;
                    x340Var.s0(objT);
                }
                q3p1.b(48, 1, (Function0) objT, x340Var, false);
                sto1.d(0, xo41Var.a, this.c, x340Var);
            }
            h311VarV.d = uyc1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            uyc1Var = new uyc1(this, i, (byte) 0);
            h311VarV.d = uyc1Var;
        }
    }
}
