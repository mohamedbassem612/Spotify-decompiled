package p;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(float f, s650 s650Var, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 9;
        this.b = f;
        this.c = s650Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w0h1.a((hux) obj4, new jsl((String) obj3), k1u.u(nim0Var, f), 0L, 0L, false, x340Var2, 8, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                r4p1.b((uoa) obj4, f, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    cbx.a.getClass();
                    qim0 qim0VarF = hno1.f(nim0Var, uwr.c());
                    String str = (String) obj3;
                    j2i j2iVar = (j2i) obj4;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarF);
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
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    eso1.e(Uri.parse(str), isl.a, i1p1.q(u291.d(nim0Var, 1.0f), er31.b(f)), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, true, false, x340Var4, 199728, 6, 2960);
                    ywx0.l(6, j2iVar, h2c.a, x340Var4, true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                long j = ((Offset) obj2).a;
                ven0 ven0Var = (ven0) obj3;
                ((hav0) obj).a();
                ven0 ven0Var2 = (ven0) obj4;
                ven0Var2.setValue(new Offset(Offset.g(((Offset) ven0Var2.getValue()).a, j)));
                if (Math.abs(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a >> 32))) > f && Math.abs(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a >> 32))) > Math.abs(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a & 4294967295L)))) {
                    ((iu30) ven0Var.getValue()).invoke(new ocn(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a >> 32)) > 0.0f ? t5u.d : t5u.c));
                    ven0Var2.setValue(new Offset(0L));
                } else if (Math.abs(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a & 4294967295L))) > f && Math.abs(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a & 4294967295L))) > Math.abs(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a >> 32)))) {
                    ((iu30) ven0Var.getValue()).invoke(new ocn(Float.intBitsToFloat((int) (((Offset) ven0Var2.getValue()).a & 4294967295L)) > 0.0f ? t5u.b : t5u.a));
                    ven0Var2.setValue(new Offset(0L));
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                vyo1.d((l9a0) obj4, (qim0) obj3, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    hux huxVar = (hux) obj4;
                    jsl jslVar = (jsl) obj3;
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    uwr uwrVar = cbx.a;
                    w0h1.a(huxVar, jslVar, u291.m(nim0Var, f), cbx.a(x340Var6).b.a, 0L, false, x340Var6, 8, 48);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ven0 ven0Var3 = (ven0) obj4;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zI = x340Var8.i(ven0Var3);
                    Object objT = x340Var8.T();
                    if (zI || objT == fkj0.X) {
                        objT = new d7v(ven0Var3, (byte) 10);
                        x340Var8.s0(objT);
                    }
                    qim0 qim0VarK = d9y0.k(lrn1.u(nim0Var, (iu30) objT), yr80.b(((yr80) ven0Var3.getValue()).a, 0L) ? 0.0f : 1.0f);
                    j2i j2iVar2 = (j2i) obj3;
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM3 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarK);
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
                    nko1.H(gfh0VarC3, x340Var8, y580.O0);
                    nko1.H(xos0VarM3, x340Var8, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var8, y580.R0);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE3, x340Var8, y580.Y);
                    j2iVar2.invoke(Float.valueOf(f), x340Var8, 0);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ro30 ro30Var = (ro30) obj4;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qgo1.g(((rbt) ro30Var.b).g, uyn1.w(nim0Var, l6o1.s(x340Var10)), x340Var10);
                    qgo1.g(((rbt) ro30Var.b).n, uyn1.w(nim0Var, l6o1.s(x340Var10)), x340Var10);
                    String str2 = ((qcb1) obj3).b;
                    cjc0 cjc0Var = new cjc0(3);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var10).a;
                    qim0 qim0VarJ = u291.j(0.0f, 100.0f, 1, uyn1.B(uyn1.w(nim0Var, l6o1.s(x340Var10)), 0.0f, 0.0f, this.b, 0.0f, 11));
                    Object objT2 = x340Var10.T();
                    if (objT2 == fkj0.X) {
                        objT2 = gq30.P0;
                        x340Var10.s0(objT2);
                    }
                    uwo1.e(str2, anm1.N("standard_header_title", s161.b(qim0VarJ, false, (iu30) objT2)), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, new px8(fc11.G(24), fc11.G(56), fc11.G(1), (mx8) null, 8), x340Var10, 0, 8, 696);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    et40 et40Var = et40.a;
                    nmo nmoVar = (nmo) obj4;
                    f5p1.h(nmoVar.c, nmoVar.d, (q10) obj3, eqr0.H(et40Var, 0.0f, 0.0f, 48.0f, 0.0f, 11), (kee1) null, (kee1) null, "TEST_TAG_HERO_TITLE", "TEST_TAG_HERO_SUBTITLE", 0, x340Var12, 14155776, 304);
                    j2h1.b(dm5.Q(dm5.J(et40Var), f), ql3.e, asi.b, x340Var12, 384, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                l6o1.g(f, (s650) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                wwo1.h((String) obj3, (znb0) obj4, f, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                c2p1.f((c380) obj4, f, (iu30) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                rrn1.g((Drawable) obj4, f, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    vnr0 vnr0VarA = ((iv21) obj4).c;
                    u7h u7hVar = (u7h) obj3;
                    pxg1 pxg1Var = zaf1.c;
                    if (u7hVar != null) {
                        vnr0VarA = vnr0.a(vnr0VarA, (String) null, (lee1) null, (kor0) null, u7hVar.a, 23);
                    }
                    vnr0 vnr0Var = vnr0VarA;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    boolean zD = x340Var14.d(f);
                    Object objT3 = x340Var14.T();
                    if (zD || objT3 == fkj0.X) {
                        objT3 = new waf1((byte) 1, f);
                        x340Var14.s0(objT3);
                    }
                    qgo1.f(vnr0Var, i541.C(qim0VarF2, (iu30) objT3), (a0e1) null, 0, false, (iu30) null, x340Var14, 8, 60);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                h7w.a((yj41) obj4, f, (tcf1) obj3, (b0k) obj, czo1.p(71));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                odf1.f((c380) obj4, (jkr0) obj3, f, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(float f, String str, j2i j2iVar) {
        super(2);
        this.a = (byte) 2;
        this.b = f;
        this.d = str;
        this.c = j2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf(float f, Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf(Object obj, float f, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = f;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf(Object obj, Object obj2, float f, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf(Object obj, Object obj2, float f, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf(String str, znb0 znb0Var, float f, int i) {
        super(2);
        this.a = (byte) 10;
        this.d = str;
        this.c = znb0Var;
        this.b = f;
    }
}
