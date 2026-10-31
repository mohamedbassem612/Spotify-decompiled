package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k5h extends hab0 implements bv30 {
    public static final k5h N0;
    public static final k5h O0;
    public static final k5h P0;
    public static final k5h Q0;
    public static final k5h R0;
    public static final k5h S0;
    public static final k5h T0;
    public static final k5h U0;
    public static final k5h V0;
    public static final k5h W0;
    public static final k5h X;
    public static final k5h X0;
    public static final k5h Y;
    public static final k5h Y0;
    public static final k5h Z;
    public static final k5h Z0;
    public static final k5h a1;
    public static final k5h b;
    public static final k5h b1;
    public static final k5h c;
    public static final k5h c1;
    public static final k5h d;
    public static final k5h d1;
    public static final k5h e;
    public static final k5h e1;
    public static final k5h f;
    public static final k5h g;
    public static final k5h h;
    public static final k5h i;
    public static final k5h t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 5;
        b = new k5h(i2, (byte) 0);
        c = new k5h(i2, (byte) 1);
        d = new k5h(i2, (byte) 2);
        e = new k5h(i2, (byte) 3);
        f = new k5h(i2, (byte) 4);
        g = new k5h(i2, (byte) 5);
        h = new k5h(i2, (byte) 6);
        i = new k5h(i2, (byte) 7);
        t = new k5h(i2, (byte) 8);
        X = new k5h(i2, (byte) 9);
        Y = new k5h(i2, (byte) 10);
        Z = new k5h(i2, (byte) 11);
        N0 = new k5h(i2, (byte) 12);
        O0 = new k5h(i2, (byte) 13);
        P0 = new k5h(i2, (byte) 14);
        Q0 = new k5h(i2, (byte) 15);
        R0 = new k5h(i2, (byte) 16);
        S0 = new k5h(i2, (byte) 17);
        T0 = new k5h(i2, (byte) 18);
        U0 = new k5h(i2, (byte) 19);
        V0 = new k5h(i2, (byte) 20);
        W0 = new k5h(i2, (byte) 21);
        X0 = new k5h(i2, (byte) 22);
        Y0 = new k5h(i2, (byte) 23);
        Z0 = new k5h(i2, (byte) 24);
        a1 = new k5h(i2, (byte) 25);
        b1 = new k5h(i2, (byte) 26);
        c1 = new k5h(i2, (byte) 27);
        d1 = new k5h(i2, (byte) 28);
        e1 = new k5h(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5h(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        int i2 = ((gd1) obj2).a ? 2131954763 : 2131954762;
        hrx hrxVar = hrx.c;
        qim0 qim0VarN = anm1.N("ADD_CURATION_ACTION_BUTTON", nim0.a);
        String strO0 = cwl1.o0(x340Var, i2);
        String strO1 = cwl1.o0(x340Var, 2131954761);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new yth(iu30Var, (byte) 20);
            x340Var2.s0(objT);
        }
        kyo1.c(strO0, hrxVar, (Function0) objT, qim0VarN, false, strO1, (v2g) null, (vu30) null, x340Var2, hrx.d << 3, 208);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i2;
        ld1 ld1Var = (ld1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i2 = (x340Var.g(ld1Var) ? 32 : 16) | iIntValue;
        } else {
            i2 = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i2 & 1, (i2 & 1169) != 1168)) {
            ldx ldxVar = ldx.c;
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new yth(iu30Var, (byte) 21);
                x340Var2.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1935821035, new qff(ld1Var, (byte) 29), x340Var2), x340Var2, 48, 6, 1020);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 384) == 0) {
            iIntValue |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 1153) != 1152)) {
            boolean z = (iIntValue & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new yth(iu30Var, (byte) 22);
                x340Var2.s0(objT);
            }
            k5p1.a((Function0) objT, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qim0 qim0VarN = anm1.N("standard_section_add_more_row", nim0.a);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        uvx uvxVar = new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new yth(iu30Var, (byte) 24);
            x340Var2.s0(objT);
        }
        jto1.b(qim0VarN, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50.c, (Function0) objT), (gbx) null, (xu30) null, i4i.a, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, i4i.b, x340Var2, 805306432, 196608, 32188);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:210:0x0695  */
    /* JADX WARN: Code duplicated, block: B:213:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:224:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:227:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:229:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:231:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:233:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:235:0x070b  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        byte b2;
        flb0 flb0Var;
        boolean z;
        int i2;
        boolean zBooleanValue;
        boolean z2;
        boolean zBooleanValue2;
        String strO0;
        int i3;
        boolean z3;
        x340 x340Var;
        Object objT;
        Function0 function0;
        boolean z4;
        Object objT2;
        int iC;
        kbd1 kbd1Var;
        lee1 lee1Var;
        boolean z5;
        byte b3 = this.a;
        hax haxVar = jax.a;
        nim0 nim0Var = nim0.a;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        switch (b3) {
            case 0:
                qxc0 qxc0Var = (qxc0) obj4;
                vnb1 vnb1Var = (vnb1) obj5;
                return new y060((jo70) obj, (xkk1) obj2, (dxc0) obj3, qxc0Var, qxc0Var != null && qxc0Var.h, vnb1Var != null ? Boolean.valueOf(vnb1Var.a) : null);
            case 1:
                m4 m4Var = (m4) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var2 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                xwa xwaVarF = fae1.F(x340Var2);
                und.a(xwaVarF, u291.d(nim0Var, 1.0f), 0.0f, apo.r(-1103519304, new qff(m4Var, (byte) 26), x340Var2), x340Var2, 3072, 4);
                wkt wktVar = m4Var.i;
                x340 x340Var3 = x340Var2;
                boolean zI = x340Var3.i(m4Var) | x340Var3.i(xwaVarF) | ((((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256);
                Object objT3 = x340Var3.T();
                if (zI || objT3 == fkj0.X) {
                    objT3 = new x4c(m4Var, xwaVarF, iu30Var, (lnm) null, (byte) 13);
                    x340Var3.s0(objT3);
                }
                qxd0.t(wktVar, x340Var3, (vu30) objT3);
                return rih1Var;
            case 2:
                ir irVar = (ir) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var4 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (!irVar.a.isEmpty()) {
                    kiv kivVar = t4k.n;
                    x340 x340Var5 = x340Var4;
                    int iOrdinal = ((flb0) x340Var5.k(kivVar)).ordinal();
                    if (iOrdinal != 0) {
                        b2 = 1;
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        flb0Var = flb0.a;
                    } else {
                        b2 = 1;
                        flb0Var = flb0.b;
                    }
                    mod.b(kivVar.a(flb0Var), apo.r(434821383, new l2i(irVar, iu30Var2, b2), x340Var5), x340Var5, 56);
                }
                return rih1Var;
            case 3:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                int i4 = ((ds) obj2).a;
                String strU = cwl1.U(2131820551, i4, new Object[]{Integer.valueOf(i4)}, b0kVar);
                uwr uwrVar = cbx.a;
                uwo1.e(strU, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1714);
                return rih1Var;
            case 4:
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                String strO1 = cwl1.o0(x340Var6, 2131951756);
                boolean z6 = ((hs) obj2).a;
                boolean z7 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var6.g(iu30Var3)) || (iIntValue2 & 384) == 256;
                x340 x340Var7 = x340Var6;
                Object objT4 = x340Var7.T();
                if (z7 || objT4 == fkj0.X) {
                    objT4 = new yth(iu30Var3, (byte) 8);
                    x340Var7.s0(objT4);
                }
                wu.b(strO1, (qim0) null, (qim0) null, false, new gbx(z50Var, (Function0) objT4), z6, t2i.a, x340Var7, 1572864, 14);
                return rih1Var;
            case 5:
                ms msVar = (ms) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var8 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                if (msVar.c) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(654013996);
                    haxVar = new hax(cwl1.o0(x340Var9, 2131951763));
                    z = false;
                    x340Var9.r(false);
                } else {
                    z = false;
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(654017874);
                    x340Var10.r(false);
                }
                hax haxVar2 = haxVar;
                boolean z8 = ((((iIntValue3 & 896) ^ 384) <= 256 || !x340Var8.g(iu30Var4)) && (iIntValue3 & 384) != 256) ? z : true;
                x340 x340Var11 = x340Var8;
                Object objT5 = x340Var11.T();
                if (z8 || objT5 == fkj0.X) {
                    objT5 = new yth(iu30Var4, (byte) 9);
                    x340Var11.s0(objT5);
                }
                jto1.b(qim0VarF, (uvx) null, haxVar2, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT5), (gbx) null, apo.r(434755240, new okg(msVar, (byte) 13), x340Var11), (xu30) null, (xu30) null, msVar.a ? u2i.a : null, (xu30) null, (xu30) null, (xu30) null, u2i.b, x340Var11, 100663296, 196608, 30394);
                return rih1Var;
            case 6:
                zt ztVar = (zt) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var12 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                boolean z9 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var12.g(iu30Var5)) || (iIntValue4 & 384) == 256;
                x340 x340Var13 = x340Var12;
                Object objT6 = x340Var13.T();
                if (z9 || objT6 == fkj0.X) {
                    objT6 = new yth(iu30Var5, (byte) 10);
                    x340Var13.s0(objT6);
                }
                jto1.b(qim0VarF2, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT6), (gbx) null, v2i.b, (xu30) null, (xu30) null, ztVar.a ? v2i.a : null, (xu30) null, (xu30) null, (xu30) null, v2i.c, x340Var13, 100663296, 196608, 30398);
                return rih1Var;
            case 7:
                ju juVar = (ju) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                ev evVar = juVar.a;
                String str = evVar.b;
                if (str == null) {
                    str = evVar.a;
                }
                String str2 = str;
                boolean z10 = juVar.b;
                boolean z11 = evVar.e;
                String strN0 = cwl1.n0(2131951762, new Object[]{str2}, x340Var14);
                boolean z12 = (((iIntValue5 & 896) ^ 384) > 256 && x340Var14.g(iu30Var6)) || (iIntValue5 & 384) == 256;
                x340 x340Var15 = x340Var14;
                Object objT7 = x340Var15.T();
                if (z12 || objT7 == fkj0.X) {
                    objT7 = new yth(iu30Var6, (byte) 11);
                    x340Var15.s0(objT7);
                }
                Function0 function1 = (Function0) objT7;
                if (ihc1.y0(strN0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wu.b(str2, (qim0) null, (qim0) null, z11, new gbx(new y50(strN0), function1), z10, apo.r(-1527205970, new qff(juVar, (byte) 27), x340Var15), x340Var15, 1572864, 6);
                return rih1Var;
            case 8:
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var16 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                String str3 = ((qrp0) obj2).b;
                boolean z13 = (((iIntValue6 & 896) ^ 384) > 256 && x340Var16.g(iu30Var7)) || (iIntValue6 & 384) == 256;
                x340 x340Var17 = x340Var16;
                Object objT8 = x340Var17.T();
                if (z13 || objT8 == fkj0.X) {
                    objT8 = new yth(iu30Var7, (byte) 12);
                    x340Var17.s0(objT8);
                }
                qyo1.a(0, str3, (Function0) objT8, x340Var17);
                return rih1Var;
            case 9:
                n40 n40Var = (n40) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                List list = n40Var.a;
                boolean z14 = (((iIntValue7 & 896) ^ 384) > 256 && x340Var18.g(iu30Var8)) || (iIntValue7 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT9 = x340Var19.T();
                if (z14 || objT9 == fkj0.X) {
                    objT9 = new wqf(iu30Var8, (byte) 13);
                    x340Var19.s0(objT9);
                }
                wyo1.a(list, (iu30) objT9, (qim0) null, n40Var.b, x340Var19, 0);
                return rih1Var;
            case 10:
                trp0 trp0Var = (trp0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                yap1 yap1Var = trp0Var.b;
                String str4 = trp0Var.c;
                String str5 = trp0Var.d;
                boolean z15 = (((iIntValue8 & 896) ^ 384) > 256 && x340Var20.g(iu30Var9)) || (iIntValue8 & 384) == 256;
                x340 x340Var21 = x340Var20;
                Object objT10 = x340Var21.T();
                if (z15 || objT10 == fkj0.X) {
                    objT10 = new yth(iu30Var9, (byte) 13);
                    x340Var21.s0(objT10);
                }
                d0p1.a(yap1Var, str4, str5, (Function0) objT10, x340Var21, 0);
                return rih1Var;
            case 11:
                ab0 ab0Var = (ab0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    i2 = iIntValue9 | (x340Var22.g(ab0Var) ? 32 : 16);
                } else {
                    i2 = iIntValue9;
                }
                if ((iIntValue9 & 384) == 0) {
                    i2 |= x340Var22.i(iu30Var10) ? 256 : 128;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    int i5 = ab0Var.c;
                    boolean z16 = ab0Var.d;
                    boolean z17 = (i2 & 896) == 256;
                    Object objT11 = x340Var23.T();
                    if (z17 || objT11 == fkj0.X) {
                        objT11 = new yth(iu30Var10, (byte) 14);
                        x340Var23.s0(objT11);
                    }
                    vbe.i(i5, 0, (Function0) objT11, x340Var23, (qim0) null, z16);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 12:
                rf0.a((lf0) obj2, (qim0) null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 13:
                ul0 ul0Var = (ul0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                Boolean bool = ul0Var.d;
                Boolean bool2 = ul0Var.e;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = bool != null ? bool.booleanValue() : false;
                }
                int i6 = zBooleanValue ? 2131951815 : 2131951816;
                String str6 = ul0Var.c;
                if (bool2 == null) {
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                    } else {
                        z2 = false;
                    }
                    strO0 = cwl1.o0(x340Var24, i6);
                    i3 = (iIntValue10 & 896) ^ 384;
                    z3 = ((i3 <= 256 && x340Var24.g(iu30Var11)) || (iIntValue10 & 384) == 256) | ((((iIntValue10 & 112) ^ 48) <= 32 && x340Var24.i(ul0Var)) || (iIntValue10 & 48) == 32);
                    x340Var = x340Var24;
                    objT = x340Var.T();
                    if (z3 || objT == m4cVar) {
                        objT = new ame(iu30Var11, ul0Var, (byte) 26);
                        x340Var.s0(objT);
                    }
                    function0 = (Function0) objT;
                    if (!ihc1.y0(strO0)) {
                        gbx gbxVar = new gbx(new y50(strO0), function0);
                        z4 = (i3 <= 256 && x340Var.g(iu30Var11)) || (iIntValue10 & 384) == 256;
                        objT2 = x340Var.T();
                        if (z4 || objT2 == m4cVar) {
                            objT2 = new wqf(iu30Var11, (byte) 14);
                            x340Var.s0(objT2);
                        }
                        iu30 iu30Var12 = (iu30) objT2;
                        lax laxVar = ul0Var.f;
                        iC = l1d.C(ul0Var.a);
                        if (iC != 0) {
                            kbd1Var = jbd1.a;
                        } else if (iC == 1) {
                            kbd1Var = kbd1.a;
                        } else {
                            eg.o();
                        }
                        vxo1.h(str6, (if5) null, z2, gbxVar, iu30Var12, (qim0) null, (if5) null, laxVar, kbd1Var, x340Var, 48, 352);
                        return rih1Var;
                    }
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                zBooleanValue2 = bool2.booleanValue();
                z2 = zBooleanValue2;
                strO0 = cwl1.o0(x340Var24, i6);
                i3 = (iIntValue10 & 896) ^ 384;
                z3 = ((i3 <= 256 && x340Var24.g(iu30Var11)) || (iIntValue10 & 384) == 256) | ((((iIntValue10 & 112) ^ 48) <= 32 && x340Var24.i(ul0Var)) || (iIntValue10 & 48) == 32);
                x340Var = x340Var24;
                objT = x340Var.T();
                if (z3) {
                    objT = new ame(iu30Var11, ul0Var, (byte) 26);
                    x340Var.s0(objT);
                } else {
                    objT = new ame(iu30Var11, ul0Var, (byte) 26);
                    x340Var.s0(objT);
                }
                function0 = (Function0) objT;
                if (!ihc1.y0(strO0)) {
                    gbx gbxVar2 = new gbx(new y50(strO0), function0);
                    if (i3 <= 256) {
                    }
                    objT2 = x340Var.T();
                    if (z4) {
                        objT2 = new wqf(iu30Var11, (byte) 14);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new wqf(iu30Var11, (byte) 14);
                        x340Var.s0(objT2);
                    }
                    iu30 iu30Var13 = (iu30) objT2;
                    lax laxVar2 = ul0Var.f;
                    iC = l1d.C(ul0Var.a);
                    if (iC != 0) {
                        kbd1Var = jbd1.a;
                    } else if (iC == 1) {
                        kbd1Var = kbd1.a;
                    } else {
                        eg.o();
                    }
                    vxo1.h(str6, (if5) null, z2, gbxVar2, iu30Var13, (qim0) null, (if5) null, laxVar2, kbd1Var, x340Var, 48, 352);
                    return rih1Var;
                }
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            case 14:
                nm0 nm0Var = (nm0) obj2;
                x340 x340Var25 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (nm0Var instanceof mm0) {
                    x340 x340Var26 = x340Var25;
                    x340Var26.i0(-974070022);
                    x340Var26.r(false);
                } else {
                    if (!(nm0Var instanceof lm0)) {
                        throw p3d1.k(x340Var25, 1769692338, false);
                    }
                    x340 x340Var27 = x340Var25;
                    x340Var27.i0(1769695277);
                    lm0 lm0Var = (lm0) nm0Var;
                    otw.c(lm0Var.b, lm0Var.a, (qim0) null, (ipb1) null, x340Var27, 0, 12);
                    x340Var27.r(false);
                }
                return rih1Var;
            case 15:
                eq0 eq0Var = (eq0) obj2;
                x340 x340Var28 = (b0k) obj4;
                ((Number) obj5).intValue();
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var28).n;
                if (eq0Var.b) {
                    x340 x340Var29 = x340Var28;
                    x340Var29.i0(-1873964198);
                    wat watVar = (wat) x340Var29.k(t4k.h);
                    lee1 lee1VarA = lee1.a(lee1Var2, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, new Shadow(watVar.X0(7.0f), ((vex) zex.a.e).d, (((long) Float.floatToRawIntBits(watVar.X0(3.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(watVar.X0(0.0f))) << 32)), (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16769023);
                    x340Var29.r(false);
                    lee1Var = lee1VarA;
                } else {
                    x340 x340Var30 = x340Var28;
                    x340Var30.i0(-1873963098);
                    x340Var30.r(false);
                    lee1Var = lee1Var2;
                }
                uwo1.e(eq0Var.a, u291.f(nim0Var, 1.0f), lee1Var, u7h.f, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var28, 0, 0, 1696);
                return rih1Var;
            case 16:
                iu30 iu30Var14 = (iu30) obj3;
                x340 x340Var31 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                boolean z18 = ((ept0) obj2).b;
                bpt0 bpt0Var = z18 ? bpt0.b : bpt0.a;
                spx spxVar = z18 ? spx.c : xpx.c;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                x340 x340Var32 = x340Var31;
                int iHashCode = Long.hashCode(x340Var32.T);
                xos0 xos0VarM = x340Var32.m();
                qim0 qim0VarE = zr7.E(x340Var31, qim0VarD);
                hzj.A.getClass();
                x340 x340Var33 = x340Var31;
                if (x340Var33.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var33.m0();
                if (x340Var33.S) {
                    x340Var33.l(hmb0.t1);
                } else {
                    x340Var33.v0();
                }
                nko1.H(gfh0VarC, x340Var31, y580.O0);
                nko1.H(xos0VarM, x340Var31, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var31, y580.R0);
                nko1.F(x340Var31);
                nko1.H(qim0VarE, x340Var31, y580.Y);
                boolean zE = x340Var33.e(bpt0Var.ordinal()) | ((((iIntValue11 & 896) ^ 384) > 256 && x340Var33.g(iu30Var14)) || (iIntValue11 & 384) == 256);
                Object objT12 = x340Var33.T();
                if (zE || objT12 == fkj0.X) {
                    objT12 = new ame(iu30Var14, bpt0Var, (byte) 27);
                    x340Var33.s0(objT12);
                }
                wro1.h(new gbx(z50Var, (Function0) objT12), new idx(), u291.r(nim0Var, 64.0f), (max) null, yla.p(x340Var31), new zzq0(8.0f, 8.0f, 8.0f, 8.0f), false, (idn0) null, (ga80) null, apo.r(-2074115456, new f90(spxVar, (byte) 6), x340Var31), x340Var31, 0, 6, 920);
                x340Var33.r(true);
                return rih1Var;
            case 17:
                jw0 jw0Var = (jw0) obj2;
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(t4k.n.a(f5p1.r(jw0Var.a.d, b0kVar2)), apo.r(407995652, new l2i(jw0Var, (iu30) obj3, (byte) 2), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 18:
                nw0 nw0Var = (nw0) obj2;
                iu30 iu30Var15 = (iu30) obj3;
                x340 x340Var34 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                z5 = (((iIntValue12 & 896) ^ 384) > 256 && x340Var34.g(iu30Var15)) || (iIntValue12 & 384) == 256;
                x340 x340Var35 = x340Var34;
                Object objT13 = x340Var35.T();
                if (z5 || objT13 == fkj0.X) {
                    objT13 = new yth(iu30Var15, (byte) 16);
                    x340Var35.s0(objT13);
                }
                gbx gbxVar3 = new gbx(z50Var, (Function0) objT13);
                ldx ldxVar = ldx.c;
                gdx gdxVarP = yla.p(x340Var35);
                zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                if (!nw0Var.b) {
                    haxVar = new hax("Disabled");
                }
                wro1.h(gbxVar3, ldxVar, (qim0) null, haxVar, gdxVarP, zzq0Var, false, (idn0) null, (ga80) null, m3i.a, x340Var35, 0, 6, 908);
                return rih1Var;
            case 19:
                sw0 sw0Var = (sw0) obj2;
                iu30 iu30Var16 = (iu30) obj3;
                x340 x340Var36 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                z5 = (((iIntValue13 & 896) ^ 384) > 256 && x340Var36.g(iu30Var16)) || (iIntValue13 & 384) == 256;
                x340 x340Var37 = x340Var36;
                Object objT14 = x340Var37.T();
                if (z5 || objT14 == fkj0.X) {
                    objT14 = new yth(iu30Var16, (byte) 17);
                    x340Var37.s0(objT14);
                }
                gbx gbxVar4 = new gbx(z50Var, (Function0) objT14);
                ldx ldxVar2 = ldx.c;
                gdx gdxVarP2 = yla.p(x340Var37);
                zzq0 zzq0Var2 = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                if (!sw0Var.b) {
                    haxVar = new hax("Disabled");
                }
                wro1.h(gbxVar4, ldxVar2, (qim0) null, haxVar, gdxVarP2, zzq0Var2, false, (idn0) null, (ga80) null, n3i.a, x340Var37, 0, 6, 908);
                return rih1Var;
            case 20:
                ((Number) obj5).intValue();
                x340 x340Var38 = (b0k) obj4;
                Object objT15 = x340Var38.T();
                if (objT15 == fkj0.X) {
                    objT15 = nyf.Z0;
                    x340Var38.s0(objT15);
                }
                wro1.h(new gbx(z50Var, (Function0) objT15), ldx.c, (qim0) null, new hax(cwl1.o0(x340Var38, 2131962557)), yla.p(x340Var38), new zzq0(8.0f, 8.0f, 8.0f, 8.0f), false, (idn0) null, (ga80) null, o3i.a, x340Var38, 0, 6, 908);
                return rih1Var;
            case 21:
                t691 t691Var = (t691) obj2;
                iu30 iu30Var17 = (iu30) obj3;
                x340 x340Var39 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                boolean z19 = (((iIntValue14 & 896) ^ 384) > 256 && x340Var39.g(iu30Var17)) || (iIntValue14 & 384) == 256;
                x340 x340Var40 = x340Var39;
                Object objT16 = x340Var40.T();
                if (z19 || objT16 == fkj0.X) {
                    objT16 = new yth(iu30Var17, (byte) 18);
                    x340Var40.s0(objT16);
                }
                gbx gbxVar5 = new gbx(z50Var, (Function0) objT16);
                ldx ldxVar3 = ldx.c;
                gdx gdxVarP3 = yla.p(x340Var40);
                zzq0 zzq0Var3 = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
                if (t691Var.b) {
                    x340Var40.i0(-497897405);
                    x340Var40.r(false);
                } else {
                    x340Var40.i0(-497895493);
                    haxVar = new hax(cwl1.o0(x340Var40, 2131962558));
                    x340Var40.r(false);
                }
                wro1.h(gbxVar5, ldxVar3, (qim0) null, haxVar, gdxVarP3, zzq0Var3, false, (idn0) null, (ga80) null, p3i.a, x340Var40, 0, 6, 908);
                return rih1Var;
            case 22:
                int iIntValue15 = ((Number) obj5).intValue();
                q3p1.a((ez0) obj2, (qim0) null, (iu30) obj3, (b0k) obj4, (iIntValue15 & 896) | ((iIntValue15 >> 3) & 14));
                return rih1Var;
            case 23:
                ub1 ub1Var = (ub1) obj2;
                iu30 iu30Var18 = (iu30) obj3;
                x340 x340Var41 = (b0k) obj4;
                int iIntValue16 = ((Number) obj5).intValue();
                ldx ldxVar4 = ldx.c;
                gdx gdxVarR = yla.r(x340Var41);
                boolean z20 = (((iIntValue16 & 896) ^ 384) > 256 && x340Var41.g(iu30Var18)) || (iIntValue16 & 384) == 256;
                x340 x340Var42 = x340Var41;
                Object objT17 = x340Var42.T();
                if (z20 || objT17 == fkj0.X) {
                    objT17 = new yth(iu30Var18, (byte) 19);
                    x340Var42.s0(objT17);
                }
                gbx gbxVar6 = new gbx(z50Var, (Function0) objT17);
                if (ub1Var.d) {
                    x340Var42.i0(-1083793813);
                    haxVar = new hax(cwl1.o0(x340Var42, ub1Var.c ? 2131959649 : 2131959638));
                    x340Var42.r(false);
                } else {
                    x340Var42.i0(-1083461617);
                    x340Var42.r(false);
                }
                wro1.h(gbxVar6, ldxVar4, anm1.N("parental_hub_entity_row_add_button_trailing_action", nim0Var), haxVar, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(2075275676, new qff(ub1Var, (byte) 28), x340Var42), x340Var42, 0, 6, 968);
                return rih1Var;
            case 24:
                return a(obj, obj2, obj3, obj4, obj5);
            case 25:
                return d(obj, obj2, obj3, obj4, obj5);
            case 26:
                return e(obj, obj2, obj3, obj4, obj5);
            case 27:
                iu30 iu30Var19 = (iu30) obj3;
                x340 x340Var43 = (b0k) obj4;
                int iIntValue17 = ((Number) obj5).intValue();
                boolean z21 = (((iIntValue17 & 896) ^ 384) > 256 && x340Var43.g(iu30Var19)) || (iIntValue17 & 384) == 256;
                x340 x340Var44 = x340Var43;
                Object objT18 = x340Var44.T();
                if (z21 || objT18 == fkj0.X) {
                    objT18 = new yth(iu30Var19, (byte) 23);
                    x340Var44.s0(objT18);
                }
                t5p1.a(0, (Function0) objT18, x340Var44, (qim0) null);
                return rih1Var;
            case 28:
                return f(obj, obj2, obj3, obj4, obj5);
            default:
                iu30 iu30Var20 = (iu30) obj3;
                x340 x340Var45 = (b0k) obj4;
                int iIntValue18 = ((Number) obj5).intValue();
                gdx gdxVarR2 = yla.r(x340Var45);
                idx idxVar = new idx(4);
                z5 = (((iIntValue18 & 896) ^ 384) > 256 && x340Var45.g(iu30Var20)) || (iIntValue18 & 384) == 256;
                x340 x340Var46 = x340Var45;
                Object objT19 = x340Var46.T();
                if (z5 || objT19 == fkj0.X) {
                    objT19 = new yth(iu30Var20, (byte) 25);
                    x340Var46.s0(objT19);
                }
                foo1.c(new gbx(z50Var, (Function0) objT19), idxVar, anm1.N("add_page_number_button", nim0Var), (max) null, gdxVarR2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, l4i.a, x340Var46, 0, 48, 2008);
                return rih1Var;
        }
    }
}
