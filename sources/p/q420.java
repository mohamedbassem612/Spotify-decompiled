package p;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q420 {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public q420(hmb0 hmb0Var) {
        this.a = (byte) 1;
        this.d = hmb0Var;
        this.e = new l6s();
        this.f = new rok0((byte) 25);
        this.g = new bfn0(0, new hmb0[16]);
        this.h = new bfn0(0, new bfh0[16]);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean c(hmb0 hmb0Var, hjl hjlVar) {
        boolean zZ0;
        hmb0 hmb0Var2 = hmb0Var.i;
        lmb0 lmb0Var = hmb0Var.f1;
        if (hmb0Var2 == null) {
            return false;
        }
        if (hjlVar == null) {
            c6f0 c6f0Var = lmb0Var.q;
            hjl hjlVar2 = c6f0Var != null ? c6f0Var.N0 : null;
            if (hjlVar2 == null || hmb0Var2 == null) {
                zZ0 = false;
            } else {
                c6f0Var.getClass();
                zZ0 = c6f0Var.z0(hjlVar2.a);
            }
        } else if (hmb0Var2 != null) {
            c6f0 c6f0Var2 = lmb0Var.q;
            c6f0Var2.getClass();
            zZ0 = c6f0Var2.z0(hjlVar.a);
        } else {
            zZ0 = false;
        }
        hmb0 hmb0VarV = hmb0Var.v();
        if (zZ0 && hmb0VarV != null) {
            if (hmb0VarV.i == null) {
                hmb0.W(hmb0VarV, false, 3);
                return zZ0;
            }
            if (hmb0Var.t() == 1) {
                hmb0.U(hmb0VarV, false, 3);
                return zZ0;
            }
            if (hmb0Var.t() == 2) {
                hmb0VarV.T(false);
            }
        }
        return zZ0;
    }

    public static boolean d(hmb0 hmb0Var, hjl hjlVar) {
        boolean zZ0;
        if (hjlVar != null) {
            if (hmb0Var.q1 == 3) {
                hmb0Var.f();
            }
            zZ0 = hmb0Var.f1.p.z0(hjlVar.a);
        } else {
            ffh0 ffh0Var = hmb0Var.f1.p;
            hjl hjlVar2 = ffh0Var.t ? new hjl(((q5t0) ffh0Var).d) : null;
            if (hjlVar2 != null) {
                if (hmb0Var.q1 == 3) {
                    hmb0Var.f();
                }
                zZ0 = hmb0Var.f1.p.z0(hjlVar2.a);
            } else {
                zZ0 = false;
            }
        }
        hmb0 hmb0VarV = hmb0Var.v();
        if (zZ0 && hmb0VarV != null) {
            if (hmb0Var.s() == 1) {
                hmb0.W(hmb0VarV, false, 3);
                return zZ0;
            }
            if (hmb0Var.s() == 2) {
                hmb0VarV.V(false);
            }
        }
        return zZ0;
    }

    public static boolean i(hmb0 hmb0Var) {
        c6f0 c6f0Var;
        t5f0 t5f0Var;
        if (hmb0Var.f1.e) {
            return (hmb0Var.t() == 3 && ((c6f0Var = hmb0Var.f1.q) == null || (t5f0Var = c6f0Var.S0) == null || !t5f0Var.h())) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    /* JADX WARN: Code duplicated, block: B:21:0x0037 A[SYNTHETIC] */
    public static boolean j(hmb0 hmb0Var) {
        if (hmb0Var.r()) {
            do {
                if (hmb0Var.s() != 3 || hmb0Var.f1.p.X0.h()) {
                    hmb0Var = hmb0Var.v();
                    if (hmb0Var == null) {
                    }
                } else {
                    hmb0 hmb0VarV = hmb0Var.v();
                    if ((hmb0VarV != null ? hmb0VarV.f1.d : 0) == 1) {
                        hmb0Var = hmb0Var.v();
                        if (hmb0Var == null) {
                        }
                    }
                }
            } while (!hmb0Var.J());
            return true;
        }
        return false;
    }

    public static boolean k(hmb0 hmb0Var) {
        c6f0 c6f0Var;
        t5f0 t5f0Var;
        lmb0 lmb0Var = hmb0Var.f1;
        return hmb0Var.J() || lmb0Var.p.T0 || j(hmb0Var) || u890.j(hmb0Var.K(), Boolean.TRUE) || i(hmb0Var) || lmb0Var.p.X0.h() || !((c6f0Var = lmb0Var.q) == null || (t5f0Var = c6f0Var.S0) == null || !t5f0Var.h());
    }

    public void a() {
        bfn0 bfn0Var = (bfn0) this.g;
        Object[] objArr = bfn0Var.a;
        int i = bfn0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            jdo0 jdo0Var = ((hmb0) objArr[i2]).e1;
            sh80 sh80Var = (sh80) jdo0Var.d;
            boolean zG = odo0.g(4194304);
            pim0 pim0Var = sh80Var.E1;
            if (zG || (pim0Var = pim0Var.e) != null) {
                ia4 ia4Var = ndo0.x1;
                for (pim0 pim0VarM1 = sh80Var.m1(zG); pim0VarM1 != null && (pim0VarM1.d & 4194304) != 0; pim0VarM1 = pim0VarM1.f) {
                    if ((pim0VarM1.c & 4194304) != 0) {
                        pim0 pim0VarE = pim0VarM1;
                        bfn0 bfn0Var2 = null;
                        while (pim0VarE != null) {
                            if (pim0VarE instanceof zkb0) {
                                ((zkb0) pim0VarE).d1((sh80) jdo0Var.d);
                            } else if ((pim0VarE.c & 4194304) != 0 && (pim0VarE instanceof l5t)) {
                                int i3 = 0;
                                for (pim0 pim0Var2 = ((l5t) pim0VarE).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                    if ((pim0Var2.c & 4194304) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            pim0VarE = pim0Var2;
                                        } else {
                                            if (bfn0Var2 == null) {
                                                bfn0Var2 = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarE != null) {
                                                bfn0Var2.b(pim0VarE);
                                                pim0VarE = null;
                                            }
                                            bfn0Var2.b(pim0Var2);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            pim0VarE = oap1.e(bfn0Var2);
                        }
                    }
                    if (pim0VarM1 == pim0Var) {
                        break;
                    }
                }
            }
        }
        bfn0Var.g();
    }

    public void b(boolean z) {
        rok0 rok0Var = (rok0) this.f;
        if (z) {
            rok0Var.r((hmb0) this.d);
        }
        if (rok0Var.k()) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                rok0Var.f();
            } finally {
                Trace.endSection();
            }
        }
    }

    public void e() {
        bfn0 bfn0Var = (bfn0) this.h;
        int i = bfn0Var.c;
        if (i != 0) {
            Object[] objArr = bfn0Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                bfh0 bfh0Var = (bfh0) objArr[i2];
                if (bfh0Var.a.I()) {
                    boolean z = bfh0Var.b;
                    hmb0 hmb0Var = bfh0Var.a;
                    boolean z2 = bfh0Var.c;
                    if (z) {
                        hmb0.U(hmb0Var, z2, 2);
                    } else {
                        hmb0.W(hmb0Var, z2, 2);
                    }
                }
            }
            bfn0Var.g();
        }
    }

    public void f(hmb0 hmb0Var) {
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (u890.j(hmb0Var2.K(), Boolean.TRUE) && !hmb0Var2.p1) {
                if (((l6s) this.e).i(hmb0Var2)) {
                    hmb0Var2.L();
                }
                f(hmb0Var2);
            }
        }
    }

    public void g(hmb0 hmb0Var, boolean z) {
        if (!this.b) {
            qf80.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? hmb0Var.f1.e : hmb0Var.r()) {
            qf80.a("node not yet measured");
        }
        h(hmb0Var, z);
    }

    public void h(hmb0 hmb0Var, boolean z) {
        c6f0 c6f0Var;
        t5f0 t5f0Var;
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if ((!z && (hmb0Var2.s() == 1 || hmb0Var2.f1.p.X0.h())) || (z && (hmb0Var2.t() == 1 || ((c6f0Var = hmb0Var2.f1.q) != null && (t5f0Var = c6f0Var.S0) != null && t5f0Var.h())))) {
                boolean zY = gio1.y(hmb0Var2);
                lmb0 lmb0Var = hmb0Var2.f1;
                if (zY && !z) {
                    if (lmb0Var.e && ((l6s) this.e).i(hmb0Var2)) {
                        p(hmb0Var2, true);
                    } else {
                        g(hmb0Var2, true);
                    }
                }
                if (z ? lmb0Var.e : hmb0Var2.r()) {
                    p(hmb0Var2, z);
                }
                if (!(z ? lmb0Var.e : hmb0Var2.r())) {
                    h(hmb0Var2, z);
                }
            }
        }
        if (z ? hmb0Var.f1.e : hmb0Var.r()) {
            p(hmb0Var, z);
        }
    }

    public boolean l(Function0 function0) {
        boolean z;
        hmb0 hmb0VarD;
        boolean z2;
        boolean z3;
        boolean zP;
        l6s l6sVar = (l6s) this.e;
        hmb0 hmb0Var = (hmb0) this.d;
        if (!hmb0Var.I()) {
            qf80.a("performMeasureAndLayout called with unattached root");
        }
        if (!hmb0Var.J()) {
            qf80.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            qf80.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (((hjl) this.i) != null) {
            this.b = true;
            this.c = true;
            try {
                if (l6sVar.n()) {
                    z = false;
                    while (true) {
                        if (!l6s.e(l6sVar).c()) {
                            hmb0VarD = l6s.e(l6sVar).d();
                            z3 = hmb0VarD.i != null;
                            z2 = false;
                        } else if (!l6s.f(l6sVar).c()) {
                            hmb0VarD = l6s.f(l6sVar).d();
                            z3 = hmb0VarD.i != null;
                            z2 = true;
                        } else {
                            if (l6s.d(l6sVar).c()) {
                                break;
                            }
                            hmb0VarD = l6s.d(l6sVar).d();
                            z2 = true;
                            z3 = false;
                        }
                        if (z2) {
                            zP = o(hmb0VarD, z3);
                        } else {
                            zP = p(hmb0VarD, z3);
                            if (hmb0VarD.f1.f) {
                                l6sVar.h(2, hmb0VarD);
                            }
                            if (hmb0VarD.q()) {
                                l6sVar.h(4, hmb0VarD);
                            }
                        }
                        if (hmb0VarD == hmb0Var && zP) {
                            z = true;
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        a();
        return z4;
    }

    public void m(hmb0 hmb0Var, long j) {
        hmb0 hmb0Var2 = (hmb0) this.d;
        if (hmb0Var.p1) {
            return;
        }
        if (hmb0Var == hmb0Var2) {
            qf80.a("measureAndLayout called on root");
        }
        if (!hmb0Var2.I()) {
            qf80.a("performMeasureAndLayout called with unattached root");
        }
        if (!hmb0Var2.J()) {
            qf80.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            qf80.a("performMeasureAndLayout called during measure layout");
        }
        if (((hjl) this.i) != null) {
            this.b = true;
            this.c = false;
            try {
                ((l6s) this.e).t(hmb0Var);
                if ((c(hmb0Var, new hjl(j)) || hmb0Var.f1.f) && u890.j(hmb0Var.K(), Boolean.TRUE)) {
                    hmb0Var.L();
                }
                f(hmb0Var);
                d(hmb0Var, new hjl(j));
                if (hmb0Var.q() && hmb0Var.J()) {
                    hmb0Var.S();
                    ((rok0) this.f).q(hmb0Var);
                }
                e();
                this.b = false;
                this.c = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        a();
    }

    public void n() {
        hmb0 hmb0Var = (hmb0) this.d;
        l6s l6sVar = (l6s) this.e;
        if (l6sVar.n()) {
            if (!hmb0Var.I()) {
                qf80.a("performMeasureAndLayout called with unattached root");
            }
            if (!hmb0Var.J()) {
                qf80.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.b) {
                qf80.a("performMeasureAndLayout called during measure layout");
            }
            if (((hjl) this.i) != null) {
                this.b = true;
                this.c = false;
                try {
                    if (l6sVar.k()) {
                        if (hmb0Var.i != null) {
                            r(hmb0Var, true);
                        } else {
                            q(hmb0Var);
                        }
                    }
                    r(hmb0Var, false);
                    this.b = false;
                    this.c = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.b = false;
                        this.c = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public boolean o(hmb0 hmb0Var, boolean z) {
        hjl hjlVar;
        hmb0 hmb0VarV;
        hmb0 hmb0Var2 = (hmb0) this.d;
        boolean z2 = hmb0Var.p1;
        lmb0 lmb0Var = hmb0Var.f1;
        boolean zC = false;
        if (!z2 && k(hmb0Var)) {
            if (hmb0Var == hmb0Var2) {
                hjlVar = (hjl) this.i;
                hjlVar.getClass();
            } else {
                hjlVar = null;
            }
            if (z) {
                zC = lmb0Var.e ? c(hmb0Var, hjlVar) : false;
                if ((zC || lmb0Var.f) && u890.j(hmb0Var.K(), Boolean.TRUE)) {
                    hmb0Var.L();
                }
            } else {
                boolean zD = hmb0Var.r() ? d(hmb0Var, hjlVar) : false;
                if (hmb0Var.q() && (hmb0Var == hmb0Var2 || ((hmb0VarV = hmb0Var.v()) != null && hmb0VarV.J() && lmb0Var.p.T0))) {
                    if (hmb0Var == hmb0Var2) {
                        if (hmb0Var.q1 == 3) {
                            hmb0Var.g();
                        }
                        hmb0 hmb0VarV2 = hmb0Var.v();
                        p5t0.l(0, 0, hmb0VarV2 != null ? ((x5f0) ((sh80) hmb0VarV2.e1.d)).P0 : kmb0.a(hmb0Var).getPlacementScope(), lmb0Var.p);
                    } else {
                        hmb0Var.S();
                    }
                    ((rok0) this.f).q(hmb0Var);
                }
                zC = zD;
            }
            e();
        }
        return zC;
    }

    public boolean p(hmb0 hmb0Var, boolean z) {
        hjl hjlVar;
        boolean zD = false;
        if (!hmb0Var.p1 && k(hmb0Var)) {
            if (hmb0Var == ((hmb0) this.d)) {
                hjlVar = (hjl) this.i;
                hjlVar.getClass();
            } else {
                hjlVar = null;
            }
            if (z) {
                if (hmb0Var.f1.e) {
                    zD = c(hmb0Var, hjlVar);
                }
            } else if (hmb0Var.r()) {
                zD = d(hmb0Var, hjlVar);
            }
            e();
        }
        return zD;
    }

    public void q(hmb0 hmb0Var) {
        bfn0 bfn0VarA = hmb0Var.A();
        Object[] objArr = bfn0VarA.a;
        int i = bfn0VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (hmb0Var2.s() == 1 || hmb0Var2.f1.p.X0.h()) {
                if (gio1.y(hmb0Var2)) {
                    r(hmb0Var2, true);
                } else {
                    q(hmb0Var2);
                }
            }
        }
    }

    public void r(hmb0 hmb0Var, boolean z) {
        hjl hjlVar;
        if (hmb0Var.p1) {
            return;
        }
        if (hmb0Var == ((hmb0) this.d)) {
            hjlVar = (hjl) this.i;
            hjlVar.getClass();
        } else {
            hjlVar = null;
        }
        if (z) {
            c(hmb0Var, hjlVar);
        } else {
            d(hmb0Var, hjlVar);
        }
    }

    public boolean s(hmb0 hmb0Var, boolean z) {
        int iC = l1d.C(hmb0Var.f1.d);
        if (iC != 0 && iC != 1) {
            if (iC == 2 || iC == 3) {
                ((bfn0) this.h).b(new bfh0(hmb0Var, false, z));
            } else {
                if (iC != 4) {
                    eg.o();
                    return false;
                }
                if (!hmb0Var.r() || z) {
                    hmb0Var.f1.p.U0 = true;
                    if (!hmb0Var.p1 && (hmb0Var.J() || j(hmb0Var))) {
                        hmb0 hmb0VarV = hmb0Var.v();
                        if (hmb0VarV == null || !hmb0VarV.r()) {
                            ((l6s) this.e).h(3, hmb0Var);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void t(long j) {
        hmb0 hmb0Var = (hmb0) this.d;
        hjl hjlVar = (hjl) this.i;
        if (hjlVar == null ? false : hjl.c(hjlVar.a, j)) {
            return;
        }
        if (this.b) {
            qf80.a("updateRootConstraints called while measuring");
        }
        this.i = new hjl(j);
        boolean zI = hmb0Var.I();
        lmb0 lmb0Var = hmb0Var.f1;
        if (zI) {
            hmb0 hmb0Var2 = hmb0Var.i;
            if (hmb0Var2 != null) {
                lmb0Var.e = true;
            }
            lmb0Var.p.U0 = true;
            ((l6s) this.e).h(hmb0Var2 == null ? 3 : 1, hmb0Var);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return o7h.y0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public q420(boolean z, boolean z2, s8s0 s8s0Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = (byte) 0;
        this.b = z;
        this.c = z2;
        this.d = s8s0Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = sqg0.U(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q420(boolean z, boolean z2, s8s0 s8s0Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, s8s0Var, l, l2, l3, l4, b7x.a);
        this.a = (byte) 0;
    }
}
