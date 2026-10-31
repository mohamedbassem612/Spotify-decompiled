package p;

import android.util.LruCache;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m8m extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(Function0 function0, o6j1 o6j1Var, Function0 function1, Function0 function2, j2i j2iVar, boolean z, boolean z2, qim0 qim0Var, int i) {
        super(2);
        this.b = function0;
        this.f = o6j1Var;
        this.c = function1;
        this.g = function2;
        this.h = j2iVar;
        this.d = z;
        this.e = z2;
        this.i = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        float f;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.b;
        Object obj7 = this.f;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    if (this.d) {
                        x340Var2.i0(486325925);
                        x340Var2.r(false);
                        f = 0.0f;
                    } else {
                        x340Var2.i0(486325543);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                        f = 16.0f;
                    }
                    qim0 qim0VarN = anm1.N("ContentStoryElement.ContentStoryTextContainer", uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, f, 7));
                    n8m n8mVar = (n8m) obj7;
                    idd1 idd1Var = n8mVar.i;
                    String str = (String) obj8;
                    j8m j8mVar = (j8m) obj4;
                    ven0 ven0Var = (ven0) obj3;
                    Function0 function0 = (Function0) obj6;
                    String str2 = (String) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (this.e) {
                        x340Var2.i0(-1484314148);
                        g9m g9mVar = (g9m) idd1Var.getValue();
                        boolean z = j8mVar.d;
                        boolean zI = x340Var2.i(j8mVar) | x340Var2.i(ven0Var);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new l8m(j8mVar, ven0Var, (byte) 0);
                            x340Var2.s0(objT);
                        }
                        otw.c(g9mVar, new f9m(str, (String) null, (String) null, (Integer) null, false, z, false, (iu30) objT, (Function0) null, function0, str2, (otf0) null, 4830), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else if (n8mVar.f.c()) {
                        x340Var2.i0(-1483626661);
                        g9m g9mVar2 = (g9m) idd1Var.getValue();
                        boolean z2 = j8mVar.d;
                        boolean zI2 = x340Var2.i(j8mVar) | x340Var2.i(ven0Var);
                        Object objT2 = x340Var2.T();
                        if (zI2 || objT2 == m4cVar) {
                            objT2 = new l8m(j8mVar, ven0Var, (byte) 1);
                            x340Var2.s0(objT2);
                        }
                        otw.c(g9mVar2, new f9m(str, (String) null, (String) null, (Integer) null, z2, false, false, (iu30) objT2, (Function0) null, function0, str2, (otf0) null, 4846), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1482987038);
                        pz71 pz71Var = (pz71) n8mVar.h.getValue();
                        boolean z3 = j8mVar.c;
                        boolean z4 = j8mVar.d;
                        boolean zI3 = x340Var2.i(j8mVar);
                        Object objT3 = x340Var2.T();
                        if (zI3 || objT3 == m4cVar) {
                            objT3 = new v7l(j8mVar, (byte) 11);
                            x340Var2.s0(objT3);
                        }
                        otw.c(pz71Var, new oz71(str, z3, z4, (iu30) objT3, j8mVar.f, function0, str2), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                z5p1.b((lsm0) obj7, (Function0) obj6, (String) obj8, this.d, this.e, (k6j1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                pxd0.o((c380) obj7, (String) obj8, this.d, this.e, (iu30) obj5, (zeu) obj4, (ngs0) obj3, (qim0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                jch0.e((xoh0) obj7, (LruCache) obj8, (q8n) obj5, (qim0) obj4, this.d, (Integer) obj3, this.e, (Function0) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ouo1.s(czo1.p(1572865), (Function0) obj6, (Function0) obj8, (Function0) obj5, (b0k) obj, (pgx) obj3, (rwi0) obj7, (qim0) obj4, this.d, this.e);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                ((hyy0) obj7).d((agc0) obj5, (String) obj8, this.d, this.e, (c380) obj4, (m87) obj3, (iu30) obj6, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                String str3 = (String) obj8;
                jmb1 jmb1Var = (jmb1) obj7;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    n4m n4mVar = jmb1Var.h;
                    bv11 bv11Var = jmb1Var.b;
                    q1v q1vVarA = jmb1Var.g.a(1);
                    iix0 iix0Var = jmb1Var.e;
                    boolean z5 = !u890.j(jmb1Var.i, j6u.a);
                    boolean z6 = jmb1Var.n;
                    qim0 qim0VarU = qxy0.u(nim0Var, (idn0) null, 3);
                    boolean zG = x340Var4.g(str3);
                    Object objT4 = x340Var4.T();
                    if (zG || objT4 == fkj0.X) {
                        objT4 = new q4z0(str3, (byte) 21);
                        x340Var4.s0(objT4);
                    }
                    u4p1.x((vu30) obj5, apo.r(251932552, new j2r0((j2i) obj6, (byte) 8), x340Var4), (String) obj8, n4mVar, bv11Var, q1vVarA, (c380) obj4, this.d, iix0Var, z5, z6, s161.b(qim0VarU, true, (iu30) objT4), this.e, (vu30) obj3, x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                cvd1.k((c380) obj7, (xsq) obj5, (d0r) obj4, (kly0) obj3, (i8h1) obj6, this.d, this.e, (String) obj8, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                k1p1.h((Function0) obj6, (o6j1) obj7, (Function0) obj8, (Function0) obj5, (j2i) obj4, this.d, this.e, (qim0) obj3, (b0k) obj, czo1.p(24577));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                t5p1.f((y0k1) obj7, this.d, (Function0) obj6, (Function0) obj8, (Function0) obj5, (Function0) obj4, (qim0) obj3, this.e, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(int i, Function0 function0, Function0 function1, Function0 function2, pgx pgxVar, rwi0 rwi0Var, qim0 qim0Var, boolean z, boolean z2) {
        super(2);
        this.f = rwi0Var;
        this.b = function0;
        this.c = function1;
        this.g = function2;
        this.h = qim0Var;
        this.i = pgxVar;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(c380 c380Var, String str, boolean z, boolean z2, iu30 iu30Var, zeu zeuVar, ngs0 ngs0Var, qim0 qim0Var, int i) {
        super(2);
        this.f = c380Var;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.g = iu30Var;
        this.h = zeuVar;
        this.i = ngs0Var;
        this.b = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(c380 c380Var, xsq xsqVar, d0r d0rVar, kly0 kly0Var, i8h1 i8h1Var, boolean z, boolean z2, String str, int i) {
        super(2);
        this.f = c380Var;
        this.g = xsqVar;
        this.h = d0rVar;
        this.i = kly0Var;
        this.b = i8h1Var;
        this.d = z;
        this.e = z2;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(xoh0 xoh0Var, LruCache lruCache, q8n q8nVar, qim0 qim0Var, boolean z, Integer num, boolean z2, Function0 function0, int i) {
        super(2);
        this.f = xoh0Var;
        this.c = lruCache;
        this.g = q8nVar;
        this.h = qim0Var;
        this.d = z;
        this.i = num;
        this.e = z2;
        this.b = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(lsm0 lsm0Var, Function0 function0, String str, boolean z, boolean z2, k6j1 k6j1Var, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.f = lsm0Var;
        this.b = function0;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.g = k6j1Var;
        this.h = iu30Var;
        this.i = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(hyy0 hyy0Var, agc0 agc0Var, String str, boolean z, boolean z2, c380 c380Var, m87 m87Var, iu30 iu30Var, int i) {
        super(2);
        this.f = hyy0Var;
        this.g = agc0Var;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.h = c380Var;
        this.i = m87Var;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(jmb1 jmb1Var, String str, vu30 vu30Var, c380 c380Var, boolean z, boolean z2, vu30 vu30Var2, j2i j2iVar) {
        super(2);
        this.f = jmb1Var;
        this.c = str;
        this.g = vu30Var;
        this.h = c380Var;
        this.d = z;
        this.e = z2;
        this.i = vu30Var2;
        this.b = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(y0k1 y0k1Var, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, boolean z2, int i) {
        super(2);
        this.f = y0k1Var;
        this.d = z;
        this.b = function0;
        this.c = function1;
        this.g = function2;
        this.h = function3;
        this.i = qim0Var;
        this.e = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8m(boolean z, boolean z2, n8m n8mVar, String str, j8m j8mVar, ven0 ven0Var, Function0 function0, String str2) {
        super(2);
        this.d = z;
        this.e = z2;
        this.f = n8mVar;
        this.c = str;
        this.h = j8mVar;
        this.i = ven0Var;
        this.b = function0;
        this.g = str2;
    }
}
