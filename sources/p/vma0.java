package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vma0 {
    public static final vma0 b = new vma0(b7x.a);
    public final Map a;

    public vma0(Map map) {
        this.a = map;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    public final tma0 a(int i, oma0 oma0Var) {
        tma0 tma0VarX;
        b7 b7Var;
        b7 b7VarB;
        b7 b7VarY;
        Map map = this.a;
        if (map.isEmpty()) {
            return new tma0(i, oma0Var);
        }
        boolean z = oma0Var instanceof b7;
        b7 b7Var2 = z ? (b7) oma0Var : null;
        b7 b7VarY2 = b7Var2 != null ? b7Var2.y() : null;
        b7 b7Var3 = z ? (b7) oma0Var : null;
        b7 b7VarB2 = b7Var3 != null ? b7Var3.B() : null;
        if (b7VarY2 != null && b7VarB2 != null) {
            tma0 tma0VarA = a(i, b7VarY2);
            b7 b7VarC = tma0VarA.c();
            b7 b7Var4 = b7VarC instanceof b7 ? b7VarC : null;
            if (b7Var4 != null && (b7VarY = b7Var4.y()) != null) {
                tma0VarA = new tma0(tma0VarA.d(), b7VarY);
            }
            tma0 tma0VarA2 = a(i, b7VarB2);
            oma0 oma0VarC = tma0VarA2.c();
            b7Var = oma0VarC instanceof b7 ? (b7) oma0VarC : null;
            if (b7Var != null && (b7VarB = b7Var.B()) != null) {
                tma0VarA2 = new tma0(tma0VarA2.d(), b7VarB);
            }
            oma0 oma0VarC2 = tma0VarA2.c();
            oma0 oma0VarC3 = tma0VarA.c();
            if (oma0VarC2 != null && oma0VarC3 != null) {
                return new tma0(tma0VarA.d(), uyn1.p(oma0VarC3, oma0VarC2));
            }
            tma0 tma0Var = tma0.c;
            return bqn1.x();
        }
        jla0 jla0VarK = oma0Var.k();
        if (jla0VarK == null) {
            return new tma0(i, oma0Var);
        }
        tma0 tma0Var2 = (tma0) map.get(jla0VarK);
        if (tma0Var2 != null) {
            b7 b7VarC2 = tma0Var2.c();
            int iD = tma0Var2.d();
            if (b7VarC2 != null && iD != 0) {
                int iK = hqn1.k(iD, i);
                b7 b7Var5 = (qh31) b7VarC2;
                boolean z2 = false;
                b7 b7VarU = e4x0.f.U(b7Var5, oma0Var.i() || b7VarC2.i());
                b7 b7Var6 = z ? (b7) oma0Var : null;
                if (b7Var6 == null || !b7Var6.s()) {
                    b7Var = b7Var5 instanceof b7 ? b7Var5 : null;
                    if (b7Var != null && b7Var.s() && !oma0Var.i()) {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                tma0Var2 = new tma0(iK, b7VarU.z(z2));
            }
            return tma0Var2;
        }
        if (!oma0Var.v().isEmpty()) {
            List<tma0> listV = oma0Var.v();
            ArrayList arrayList = new ArrayList(q7h.U(listV, 10));
            for (tma0 tma0Var3 : listV) {
                int iD2 = tma0Var3.d();
                oma0 oma0VarC4 = tma0Var3.c();
                if (oma0VarC4 == null || iD2 == 0) {
                    tma0 tma0Var4 = tma0.c;
                    tma0VarX = bqn1.x();
                } else {
                    tma0VarX = a(iD2, oma0VarC4);
                }
                arrayList.add(tma0VarX);
            }
            boolean zI = oma0Var.i();
            List annotations = oma0Var.getAnnotations();
            b7 b7Var7 = z ? (b7) oma0Var : null;
            oma0Var = anm1.v(jla0VarK, arrayList, zI, annotations, b7Var7 != null ? b7Var7.n() : null);
        }
        return new tma0(i, oma0Var);
    }
}
