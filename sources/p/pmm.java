package p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pmm implements h0r0 {
    public final qyj a;
    public final hs3 b;
    public final dc31 c;
    public final grk0 d;
    public final List e;
    public final cbr0 f;

    public pmm(qyj qyjVar, hs3 hs3Var, dc31 dc31Var, grk0 grk0Var) {
        List listD1;
        int i;
        this.a = qyjVar;
        this.b = hs3Var;
        this.c = dc31Var;
        this.d = grk0Var;
        zo41 zo41Var = ((ls3) ((ks3) hs3Var).e.a.getValue()).b.c;
        so41 so41Var = zo41Var instanceof so41 ? (so41) zo41Var : null;
        if (so41Var != null) {
            List list = so41Var.b;
            ArrayList<qpl> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((qpl) obj).h.length() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (qpl qplVar : arrayList) {
                String str = qplVar.h;
                int iC = l1d.C(qplVar.X);
                if (iC == 0) {
                    i = 2;
                } else {
                    if (iC != 1) {
                        eg.o();
                        throw null;
                    }
                    i = 1;
                }
                arrayList2.add(new p6m(str, i));
            }
            listD1 = o7h.d1(k4p1.C(arrayList2), 5);
        } else {
            listD1 = null;
        }
        this.e = listD1 == null ? z6x.a : listD1;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.f = new cbr0(new dbr0[]{new bn70(yon1.G1("ALLBOARDING_CONTEXTUALAUDIO", "allboarding/contextualaudio", 145, qm3.b), new lik1("spotify:internal:allboarding:origin:default"), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    public final cbr0 a() {
        return this.f;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1410202996, new nmm(this), true));
    }

    public final void c(b0k b0kVar, int i) {
        h311 h311VarV;
        nmm nmmVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1123292614);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = lmm.c;
                x340Var.s0(objT);
            }
            q3p1.b(48, 1, (Function0) objT, x340Var, false);
            zo41 zo41Var = ((ls3) rwq.h(((ks3) this.b).e, x340Var, 0).getValue()).b.c;
            so41 so41Var = zo41Var instanceof so41 ? (so41) zo41Var : null;
            if (so41Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    nmmVar = new nmm(this, i, (byte) 1);
                }
            } else {
                boolean z = so41Var.a != null;
                grk0 grk0Var = this.d;
                boolean zG = x340Var.g(grk0Var);
                Object objT2 = x340Var.T();
                if (zG || objT2 == obj) {
                    objT2 = new wet0(grk0Var, new omm(so41Var, this, (byte) 1));
                    x340Var.s0(objT2);
                }
                wet0 wet0Var = (wet0) objT2;
                boolean zG2 = x340Var.g(grk0Var);
                Object objT3 = x340Var.T();
                if (zG2 || objT3 == obj) {
                    objT3 = new odh0(grk0Var, new omm(so41Var, this, (byte) 0));
                    x340Var.s0(objT3);
                }
                a6o1.b(this.e, z, wet0Var, (odh0) objT3, (qim0) null, x340Var, 4608);
            }
            h311VarV.d = nmmVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            nmmVar = new nmm(this, i, (byte) 0);
            h311VarV.d = nmmVar;
        }
    }
}
