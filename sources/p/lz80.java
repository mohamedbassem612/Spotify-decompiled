package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lz80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz80(cce cceVar, fbp fbpVar, jkr0 jkr0Var, boolean z, akr0 akr0Var, jjr0 jjr0Var, float f, q9l1 q9l1Var) {
        super(2);
        this.e = cceVar;
        this.f = fbpVar;
        this.g = jkr0Var;
        this.d = z;
        this.h = akr0Var;
        this.b = jjr0Var;
        this.c = f;
        this.i = q9l1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        float f;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        boolean z = this.d;
        qim0 qim0Var = nim0.a;
        float f2 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.b;
        Object obj8 = this.i;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("InteractiveEntrypoint.Scaffold", u291.b(0.0f, f2, 1, u291.f((qim0) obj6, 1.0f)));
                    boolean zI = x340Var2.i(tob1Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new pak(tob1Var, (byte) 13);
                        x340Var2.s0(objT);
                    }
                    hax haxVar = (max) obj4;
                    qim0 qim0VarThen = i541.C(qim0VarN, (iu30) objT).then(haxVar instanceof hax ? y9g1.t(f8d1.b(s161.a(qim0Var, new os((String) obj3, haxVar.a, (byte) 16)), rih1Var, mia.n), td80.U0) : qim0Var);
                    Function0 function0 = (Function0) obj7;
                    j2i j2iVar = (j2i) obj8;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    if (z) {
                        x340Var2.i0(218900501);
                        String strO0 = cwl1.o0(x340Var2, 2131956725);
                        uwr uwrVar = cbx.a;
                        zsc zscVar = zex.a;
                        nz80.a(strO0, ((xex) ((gmt) zscVar.c).b).s, smx.c, ((vex) zscVar.b).n, function0, eqr0.D(-4.0f, 0.0f, 2, qim0Var), false, 0.0f, 0.0f, x340Var2, smx.d << 6);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(219431934);
                        x340Var2.r(false);
                    }
                    j2iVar.invoke(pw31.a, x340Var2, 6);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                yy51.c((id01) obj6, (iu30) obj5, (Function0) obj7, (Function0) obj4, (Function0) obj3, (Function0) obj8, this.c, this.d, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str = (String) obj3;
                    String str2 = (String) obj5;
                    djc0 djc0Var = (djc0) obj4;
                    iu30 iu30Var = (iu30) obj7;
                    lee1 lee1Var = (lee1) obj8;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, (qim0) obj6);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(mbhVarA, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    int length = str.length();
                    nim0 nim0Var = nim0.a;
                    if (length > 0) {
                        x340Var4.i0(-488326778);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar = cbx.b(x340Var4).b;
                        uwo1.e(str, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var4).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var4, 0, 0, 1720);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-488056489);
                        x340Var4.r(false);
                    }
                    if (str.length() == 0) {
                        x340Var4.i0(815543021);
                        x340Var4.r(false);
                        f = 0.0f;
                    } else {
                        x340Var4.i0(815544147);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar2 = cbx.b(x340Var4).b;
                        x340Var4.r(false);
                        f = 2.0f;
                    }
                    qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, f, 0.0f, 0.0f, 13);
                    uwr uwrVar4 = cbx.a;
                    zsc zscVar2 = zex.a;
                    qim0 qim0VarI = odf1.i(qim0VarB, f2, ((vex) zscVar2.e).l);
                    if (ltg0.a.a.matcher(str2).find() || ltg0.b.a.matcher(str2).find()) {
                        x340Var4.i0(-487793826);
                        mp10.h(str2, djc0Var, qim0VarI, iu30Var, lee1Var, x340Var4, 0);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-487530078);
                        uwo1.e(str2, qim0VarI, lee1Var, ((vex) zscVar2.e).m, (a0e1) null, (iu30) null, 2, false, djc0Var, 0, (qx8) null, x340Var4, 0, 0, 1712);
                        x340Var4.r(false);
                    }
                    if (z) {
                        x340Var4.i0(-486875017);
                        String strO1 = cwl1.o0(x340Var4, 2131963307);
                        lee1 lee1Var2 = cbx.d(x340Var4).m;
                        long j = cbx.a(x340Var4).b.b;
                        cvx cvxVar3 = cbx.b(x340Var4).b;
                        cvx cvxVar4 = cbx.b(x340Var4).b;
                        uwo1.e(strO1, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 8.0f, 5), lee1Var2, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var4, 0, 0, 2032);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-486498057);
                        x340Var4.r(false);
                    }
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                q9l1 q9l1Var = (q9l1) obj8;
                jjr0 jjr0Var = (jjr0) obj7;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    cce cceVar = (cce) obj6;
                    fbp fbpVar = (fbp) obj5;
                    jkr0 jkr0Var = (jkr0) obj4;
                    akr0 akr0Var = (akr0) obj3;
                    dt71 dt71Var = akr0Var.a;
                    dt71 dt71Var2 = akr0Var.b;
                    c380 c380Var = jjr0Var.a;
                    float f3 = jjr0Var.d ? 0.0f : f2;
                    boolean z2 = jjr0Var.c;
                    boolean zI2 = x340Var6.i(q9l1Var);
                    Object objT2 = x340Var6.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new x3t0(q9l1Var, (byte) 2);
                        x340Var6.s0(objT2);
                    }
                    pqo.g(cceVar, fbpVar, jkr0Var, this.d, dt71Var, dt71Var2, c380Var, f3, z2, (iu30) objT2, u291.d(qim0Var, 1.0f), jjr0Var.i, x340Var6, 100663296);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz80(qim0 qim0Var, float f, tob1 tob1Var, max maxVar, String str, boolean z, Function0 function0, j2i j2iVar) {
        super(2);
        this.e = qim0Var;
        this.c = f;
        this.f = tob1Var;
        this.g = maxVar;
        this.h = str;
        this.d = z;
        this.b = function0;
        this.i = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz80(qim0 qim0Var, String str, float f, String str2, djc0 djc0Var, iu30 iu30Var, lee1 lee1Var, boolean z) {
        super(2);
        this.e = qim0Var;
        this.h = str;
        this.c = f;
        this.f = str2;
        this.g = djc0Var;
        this.b = iu30Var;
        this.i = lee1Var;
        this.d = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz80(id01 id01Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, float f, boolean z, int i) {
        super(2);
        this.e = id01Var;
        this.f = iu30Var;
        this.b = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.c = f;
        this.d = z;
    }
}
