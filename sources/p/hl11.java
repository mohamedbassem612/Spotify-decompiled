package p;

import com.spotify.scrollsita.v1.Section;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hl11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl11(String str, ff ffVar, Function0 function0, int i) {
        super(2);
        this.a = (byte) 12;
        this.c = str;
        this.b = ffVar;
        this.d = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                x2p1.e((c380) obj5, (String) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i1o1.e((hho) obj5, new uho(((fob1) obj4).b, null, null, null, null, null, 254), ((qlb) obj3).b, (qim0) null, (ipb1) null, scj.a, scj.b, 0, (xu30) null, x340Var2, 1769480, 204);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                qlb qlbVar = (qlb) obj5;
                d0r d0rVar = qlbVar.b;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG = x340Var4.g(d0rVar);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new hho(d0rVar);
                        x340Var4.s0(objT);
                    }
                    fob1 fob1Var = (fob1) obj4;
                    g3p1.i(fob1Var, (iu30) obj3, (qim0) null, apo.r(-2001427167, new hl11(objT, (Object) fob1Var, (Object) qlbVar, (byte) 1), x340Var4), x340Var4, 3072);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                g3p1.i((fob1) obj5, (iu30) obj4, nim0.a, (j2i) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    an11 an11Var = (an11) obj5;
                    n3p1.e(an11Var, apo.r(2004463512, new tc11((en11) obj3, an11Var, (byte) 4), x340Var6), (iu30) obj4, x340Var6, 3120);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                n3p1.e((an11) obj5, (j2i) obj3, (iu30) obj4, (b0k) obj, czo1.p(3121));
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    era eraVar = een.Q0;
                    ooh0 ooh0Var = (ooh0) ((ji6) obj5).b;
                    tob1 tob1Var = (tob1) obj4;
                    tob1 tob1Var2 = (tob1) obj3;
                    mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var8, 48);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE = zr7.E(x340Var8, nim0Var);
                    hzj.A.getClass();
                    if (x340Var8.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA, x340Var8, y580.O0);
                    nko1.H(xos0VarM, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE, x340Var8, y580.Y);
                    vnr0 vnr0Var = (vnr0) ooh0Var.d.invoke(x340Var8, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG2 = x340Var8.g(tob1Var);
                    Object objT2 = x340Var8.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new lws0(tob1Var, (byte) 14);
                        x340Var8.s0(objT2);
                    }
                    qgo1.f(vnr0Var, i541.C(qim0VarF, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var8, 8, 56);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    op71.g(x340Var8, u291.h(nim0Var, 8.0f));
                    vnr0 vnr0Var2 = (vnr0) ((ao11) ooh0Var.e).invoke(x340Var8, 0);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    boolean zG3 = x340Var8.g(tob1Var2);
                    Object objT3 = x340Var8.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new lws0(tob1Var2, (byte) 15);
                        x340Var8.s0(objT3);
                    }
                    qgo1.f(vnr0Var2, i541.C(qim0VarF2, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var8, 8, 56);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((ys11) obj5).i((jmb1) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z = ((zf21) obj5).e;
                    boolean z2 = ((xf21) obj4).a;
                    boolean zG4 = x340Var10.g(iu30Var);
                    Object objT4 = x340Var10.T();
                    if (zG4 || objT4 == m4cVar2) {
                        objT4 = new n601(iu30Var, (byte) 10);
                        x340Var10.s0(objT4);
                    }
                    iu30 iu30Var2 = (iu30) objT4;
                    boolean zG5 = x340Var10.g(iu30Var);
                    Object objT5 = x340Var10.T();
                    if (zG5 || objT5 == m4cVar2) {
                        objT5 = new dv11(iu30Var, (byte) 17);
                        x340Var10.s0(objT5);
                    }
                    b9p1.k(z, z2, iu30Var2, (Function0) objT5, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 9:
                c9n c9nVar = (c9n) obj4;
                h6f h6fVar = (r6f) obj;
                s1m s1mVar = (s1m) obj3;
                iu30 iu30Var3 = (iu30) obj5;
                if (h6fVar instanceof h6f) {
                    iu30Var3.invoke(new fh21(h6fVar.a));
                } else if (h6fVar instanceof y5f) {
                    fn31.T(c9nVar, (o8n) null, 0, new rh21(s1mVar, null, (byte) 0), 3);
                } else if (h6fVar instanceof i6f) {
                    iu30Var3.invoke(new hh21(((i6f) h6fVar).a));
                } else if (h6fVar instanceof g6f) {
                    g6f g6fVar = (g6f) h6fVar;
                    iu30Var3.invoke(new gh21(g6fVar.a, g6fVar.b));
                } else if (h6fVar.equals(c6f.a)) {
                    fn31.T(c9nVar, (o8n) null, 0, new rh21(s1mVar, null, (byte) 1), 3);
                } else if (h6fVar.equals(a6f.a)) {
                    fn31.T(c9nVar, (o8n) null, 0, new rh21(s1mVar, null, (byte) 2), 3);
                } else if (h6fVar.equals(z5f.a)) {
                    fn31.T(c9nVar, (o8n) null, 0, new rh21(s1mVar, null, (byte) 3), 3);
                } else if (h6fVar.equals(e6f.a)) {
                    iu30Var3.invoke(jh21.a);
                } else if (!h6fVar.equals(t5f.a) && !h6fVar.equals(u5f.a) && !(h6fVar instanceof v5f) && !h6fVar.equals(w5f.a) && !(h6fVar instanceof x5f) && !(h6fVar instanceof b6f) && !(h6fVar instanceof d6f) && !(h6fVar instanceof f6f) && !(h6fVar instanceof k6f) && !(h6fVar instanceof l6f) && !(h6fVar instanceof m6f) && !(h6fVar instanceof j6f) && !(h6fVar instanceof n6f) && !(h6fVar instanceof o6f) && !h6fVar.equals(p6f.a) && !(h6fVar instanceof q6f)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                t9p1.d((lqs0) obj5, (qim0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                or21 or21Var = (or21) obj5;
                q7r0 q7r0Var = or21Var.c;
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else if (((Boolean) ((ven0) obj3).getValue()).booleanValue()) {
                    x340Var12.i0(-1454323368);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(-1454682782);
                    Object objT6 = x340Var12.T();
                    if (objT6 == fkj0.X) {
                        objT6 = new nr21(cwl1.H(q7r0Var));
                        x340Var12.s0(objT6);
                    }
                    fbp1.i(or21Var.b, cwl1.C(q7r0Var), or21Var.d, or21Var.e, or21Var.f, (nr21) objT6, (iu30) obj4, x340Var12, 0);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                d7e.h((String) obj4, (ff) obj5, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((ru31) obj5).f((ftv) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((ru31) obj5).m((hu31) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mod.b(t4k.h.a((xat) obj5), apo.r(-665596033, new tc11((n041) obj4, (j2i) obj3, (byte) 25), x340Var14), x340Var14, 56);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj3;
                t541 t541Var = (t541) obj5;
                x340 x340Var16 = x340Var15;
                if (!x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var16.b0();
                } else if (t541Var instanceof r541) {
                    x340Var16.i0(-410911382);
                    r541 r541Var = (r541) t541Var;
                    n0o n0oVar = (n0o) obj4;
                    jd6 jd6Var = (jd6) n0oVar.h;
                    idm idmVar = (idm) n0oVar.i;
                    jyo jyoVar = (jyo) n0oVar.e;
                    b9u0 b9u0Var = r541Var.o;
                    xoq xoqVar = (xoq) n0oVar.f;
                    boolean zG6 = x340Var16.g(iu30Var4);
                    Object objT7 = x340Var16.T();
                    if (zG6 || objT7 == fkj0.X) {
                        objT7 = new wg31(iu30Var4, (byte) 11);
                        x340Var16.s0(objT7);
                    }
                    nb51.c(r541Var, jd6Var, idmVar, jyoVar, xoqVar, b9u0Var, null, (Function0) objT7, x340Var16, 64);
                    x340Var16.r(false);
                } else {
                    if (!(t541Var instanceof s541)) {
                        throw p3d1.k(x340Var16, 2064953213, false);
                    }
                    x340Var16.i0(2064968488);
                    nb51.d(x340Var16, 0);
                    x340Var16.r(false);
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                oqn1.g((xtb0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                irn1.z((nue1) obj5, (sm51) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (!x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x340Var18.b0();
                } else if (((y7e1) obj5).d().d.length() > 0) {
                    x340Var18.i0(1601525501);
                    jzn1.a(0, (String) obj4, (Function0) obj3, x340Var18, (qim0) null);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(1601628328);
                    x340Var18.r(false);
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ggo1.p((ql71) obj5, (wl71) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                ((yp51) obj5).g((String) obj4, (hy50) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                fn31.T(cto1.q((iac0) obj4), (o8n) null, 0, new p651((ujq0) obj3, (gyj) obj, (sw31) obj2, ((nt21) obj5).g(), null, (byte) 2), 3);
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((y441) obj5).b((gu61) obj4, (iu30) obj3, (b0k) obj, czo1.p(513));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((vt61) obj5).a(czo1.p(1), (Function0) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 25:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                cir0 cir0Var = (cir0) obj4;
                vt61 vt61Var = (vt61) obj5;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    j2i j2iVarR = apo.r(783294066, new jt41(vt61Var, (ven0) obj3, (byte) 13), x340Var20);
                    boolean zI = x340Var20.i(vt61Var) | x340Var20.g(cir0Var);
                    Object objT8 = x340Var20.T();
                    if (zI || objT8 == fkj0.X) {
                        objT8 = new rt61(vt61Var, cir0Var, (byte) 0);
                        x340Var20.s0(objT8);
                    }
                    bzn1.e((qim0) null, j2iVarR, false, (vu30) null, (sgr0) null, (ngr0) null, (ygr0) null, (Function0) objT8, x340Var20, 432, 121);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((pu61) obj5).a(czo1.p(1), (String) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                ywo1.f((ez61) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                nyo1.i((q571) obj5, (qim0) obj4, (lee1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    b0kVar2.b0();
                    return rih1Var;
                }
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                aa71 aa71Var = (aa71) obj5;
                iu30 iu30Var5 = (iu30) obj4;
                ka71 ka71Var = (ka71) obj3;
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarD);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM2, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, y580.Y);
                y971 y971Var = aa71Var.c;
                if (y971Var.equals(w971.a)) {
                    b0kVar2.i0(246075251);
                    int i = aa71Var.b;
                    boolean zG7 = b0kVar2.g(iu30Var5);
                    Object objT9 = b0kVar2.T();
                    if (zG7 || objT9 == m4cVar3) {
                        objT9 = new m861(iu30Var5, (byte) 8);
                        b0kVar2.s0(objT9);
                    }
                    c0p1.a(i, 0, (Function0) objT9, b0kVar2);
                    b0kVar2.r(false);
                } else {
                    if (!y971Var.equals(x971.a)) {
                        throw p3d1.k(b0kVar2, 246073763, false);
                    }
                    b0kVar2.i0(-961429511);
                    u9 u9Var = aa71Var.a;
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zG8 = b0kVar2.g(iu30Var5);
                    Object objT10 = b0kVar2.T();
                    if (zG8 || objT10 == m4cVar3) {
                        objT10 = new m861(iu30Var5, (byte) 9);
                        b0kVar2.s0(objT10);
                    }
                    ka71Var.e(u9Var, (Function0) objT10, qim0VarD2, b0kVar2, 0);
                    b0kVar2.r(false);
                }
                b0kVar2.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl11(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl11(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl11(an11 an11Var, j2i j2iVar, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.b = an11Var;
        this.d = j2iVar;
        this.c = iu30Var;
    }
}
