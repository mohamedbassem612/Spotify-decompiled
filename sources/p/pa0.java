package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pa0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(sy41 sy41Var, boolean z, s951 s951Var, boolean z2, int i) {
        super(2);
        this.a = (byte) 12;
        this.d = sy41Var;
        this.b = z;
        this.e = s951Var;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        hax haxVar = jax.a;
        boolean z2 = this.c;
        boolean z3 = this.b;
        qim0 qim0VarF = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                o0p1.a(this.b, this.c, (c380) obj3, (oa0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                l3p1.d(this.b, this.c, (iu30) obj3, (j2i) obj4, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((yu3) obj3).d(czo1.p(1), (String) obj4, (b0k) obj, this.b, this.c);
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarW = uyn1.w(qim0VarF, poo1.x(new bgc0(lhc.g(x340Var2).g, 32), x340Var2));
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarW, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    smf smfVar = (smf) obj3;
                    List list = (List) obj4;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    smfVar.d(x340Var2, 0);
                    String str = smfVar.c.a;
                    rqo1.g(0, 1, x340Var2, null);
                    if (z3 && z2) {
                        x340Var2.i0(1936497222);
                        boolean zG = x340Var2.g(str);
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            lzn0 lzn0Var = (lzn0) ((tmf) ((em0) smfVar.j.a.c).b).b.get();
                            c8o.l(lzn0Var);
                            objT = new nn50(str, lzn0Var);
                            x340Var2.s0(objT);
                        }
                        otw.c((nn50) objT, rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1936743238);
                        x340Var2.r(false);
                    }
                    x340Var2.i0(-214618241);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        otw.c((inf) it.next(), rih1Var2, (qim0) null, (ipb1) null, x340Var2, 48, 12);
                    }
                    x340Var2.r(false);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 4:
                ((Number) obj2).intValue();
                hxo1.i((String) obj3, (String) obj4, this.b, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarF2 = u291.f(qim0VarF, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var4).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    xxq xxqVar = (xxq) obj3;
                    iu30 iu30Var = (iu30) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB2);
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
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM2, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    qim0 qim0VarA = h2c.a.a(qim0VarF, een.h);
                    if (z3) {
                        x340Var4.i0(1836729629);
                        z = false;
                    } else {
                        z = false;
                        x340Var4.i0(1836784623);
                        haxVar = new hax(cwl1.o0(x340Var4, 2131954822));
                    }
                    x340Var4.r(z);
                    hax haxVar2 = haxVar;
                    String strO0 = cwl1.o0(x340Var4, 2131954821);
                    boolean zI = x340Var4.i(xxqVar) | x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new gyq(xxqVar, iu30Var, (byte) 6);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50(strO0), function0), qim0VarA, haxVar2, null, null, null, null, apo.r(-840467311, new dr0((byte) 17, z2), x340Var4), x340Var4, 12582912, 120);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                e9k.l((r140) obj3, (String) obj4, this.b, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                j0p1.d(this.b, this.c, (xhd0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                j0p1.e(this.b, this.c, (xhd0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                j0p1.f(this.b, this.c, (xhd0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarL = bmq0.L(i1p1.q(z3 ? u291.z(u291.f(qim0VarF, 1.0f), (fra) null, 3) : u291.d(u291.i(qim0VarF, 390.0f, 664.0f), 1.0f), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12)), k1o1.q(x340Var6), (g6o0) null);
                    uwr uwrVar3 = cbx.a;
                    w3d1.a(dug.f(qim0VarL, cbx.a(x340Var6).a.a.a(), d4o1.a), (hw61) null, 0L, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-305471576, new r7e0(obj3, z2, obj4, (byte) 18), x340Var6), x340Var6, 12582912, 126);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                b9p1.k(this.b, this.c, (iu30) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                p2o1.g((sy41) obj3, this.b, (s951) obj4, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((suh1) obj3).e(this.b, this.c, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                jb20 jb20Var = (jb20) obj3;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z4 = jb20Var.c;
                    qex qexVarA = w2g.a(false, x340Var8, 6);
                    lex lexVarZ = yoo1.z(x340Var8);
                    String str2 = jb20Var.b;
                    if (z3) {
                        x340Var8.i0(592150387);
                        uwr uwrVar4 = cbx.a;
                        avw0 avw0Var = cbx.b(x340Var8).c;
                        xex xexVar = (xex) ((gmt) zex.a.c).b;
                        qim0VarF = d1u.F(qim0VarF, 2.0f, v9c.h(p7h.M(new u7h[]{new u7h(xexVar.B), new u7h(xexVar.M), new u7h(z4p1.g(4294415499L)), new u7h(xexVar.L)}), 0.0f, 0.0f, 14), er31.a);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(592156892);
                        x340Var8.r(false);
                    }
                    vu30 vu30Var = z3 ? msj.a : null;
                    if (z2) {
                        x340Var8.i0(592165909);
                        haxVar = new hax(cwl1.o0(x340Var8, 2131963936));
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(592168520);
                        x340Var8.r(false);
                    }
                    hax haxVar3 = haxVar;
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var8).b;
                    cvx cvxVar4 = cbx.b(x340Var8).b;
                    zzq0 zzq0Var = new zzq0(8.0f, 4.0f, 8.0f, 4.0f);
                    boolean zG2 = x340Var8.g(iu30Var2) | x340Var8.i(jb20Var);
                    Object objT3 = x340Var8.T();
                    if (zG2 || objT3 == fkj0.X) {
                        objT3 = new f2m1(iu30Var2, jb20Var, (byte) 8);
                        x340Var8.s0(objT3);
                    }
                    poo1.g(z4, (iu30) objT3, qexVarA, lexVarZ, qim0VarF, 0, null, str2, haxVar3, vu30Var, null, null, null, false, zzq0Var, apo.r(-419723337, new p7m1(jb20Var, (byte) 1), x340Var8), x340Var8, 0, 196608, 15456);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa0(Object obj, String str, boolean z, boolean z2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = str;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(suh1 suh1Var, boolean z, boolean z2, Function0 function0, int i) {
        super(2);
        this.a = (byte) 13;
        this.d = suh1Var;
        this.b = z;
        this.c = z2;
        this.e = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa0(boolean z, Object obj, boolean z2, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(boolean z, xxq xxqVar, iu30 iu30Var, boolean z2) {
        super(2);
        this.a = (byte) 5;
        this.b = z;
        this.d = xxqVar;
        this.e = iu30Var;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa0(boolean z, o501 o501Var, boolean z2, e601 e601Var) {
        super(2);
        this.a = (byte) 10;
        this.b = z;
        this.d = o501Var;
        this.c = z2;
        this.e = e601Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa0(boolean z, boolean z2, Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = obj;
        this.e = obj2;
    }
}
