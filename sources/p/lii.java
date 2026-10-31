package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lii extends hab0 implements zu30 {
    public static final lii N0;
    public static final lii O0;
    public static final lii P0;
    public static final lii Q0;
    public static final lii R0;
    public static final lii S0;
    public static final lii T0;
    public static final lii U0;
    public static final lii V0;
    public static final lii W0;
    public static final lii X;
    public static final lii X0;
    public static final lii Y;
    public static final lii Y0;
    public static final lii Z;
    public static final lii Z0;
    public static final lii a1;
    public static final lii b;
    public static final lii b1;
    public static final lii c;
    public static final lii c1;
    public static final lii d;
    public static final lii d1;
    public static final lii e;
    public static final lii e1;
    public static final lii f;
    public static final lii g;
    public static final lii h;
    public static final lii i;
    public static final lii t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new lii(i2, (byte) 0);
        c = new lii(i2, (byte) 1);
        d = new lii(i2, (byte) 2);
        e = new lii(i2, (byte) 3);
        f = new lii(i2, (byte) 4);
        g = new lii(i2, (byte) 5);
        h = new lii(i2, (byte) 6);
        i = new lii(i2, (byte) 7);
        t = new lii(i2, (byte) 8);
        X = new lii(i2, (byte) 9);
        Y = new lii(i2, (byte) 10);
        Z = new lii(i2, (byte) 11);
        N0 = new lii(i2, (byte) 12);
        O0 = new lii(i2, (byte) 13);
        P0 = new lii(i2, (byte) 14);
        Q0 = new lii(i2, (byte) 15);
        R0 = new lii(i2, (byte) 16);
        S0 = new lii(i2, (byte) 17);
        T0 = new lii(i2, (byte) 18);
        U0 = new lii(i2, (byte) 19);
        V0 = new lii(i2, (byte) 20);
        W0 = new lii(i2, (byte) 21);
        X0 = new lii(i2, (byte) 22);
        Y0 = new lii(i2, (byte) 23);
        Z0 = new lii(i2, (byte) 24);
        a1 = new lii(i2, (byte) 25);
        b1 = new lii(i2, (byte) 26);
        c1 = new lii(i2, (byte) 27);
        d1 = new lii(i2, (byte) 28);
        e1 = new lii(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lii(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) throws NoWhenBranchMatchedException {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        byte b2 = this.a;
        byte b3 = 3;
        nim0 nim0Var = nim0.a;
        byte b4 = 14;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                xld0 xld0Var = (xld0) obj;
                iu30 iu30Var = (iu30) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    i2 = (x340Var.g(xld0Var) ? 4 : 2) | iIntValue;
                } else {
                    i2 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
                    z = (i2 & 112) == 32;
                    Object objT = x340Var2.T();
                    if (z || objT == fkj0.X) {
                        objT = new jii(iu30Var, b3);
                        x340Var2.s0(objT);
                    }
                    o1p1.o(xld0Var, (Function0) objT, (qim0) null, x340Var2, i2 & 14);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                vpg1 vpg1Var = (vpg1) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue2 & 6) == 0) {
                    i3 = iIntValue2 | (x340Var3.g(vpg1Var) ? 4 : 2);
                } else {
                    i3 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i3 |= x340Var3.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(i3 & 1, (i3 & 147) != 146)) {
                    int i13 = i3 & 112;
                    boolean z2 = i13 == 32;
                    Object objT2 = x340Var4.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new jii(iu30Var2, (byte) 7);
                        x340Var4.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean z3 = i13 == 32;
                    Object objT3 = x340Var4.T();
                    if (z3 || objT3 == m4cVar) {
                        objT3 = new jii(iu30Var2, (byte) 8);
                        x340Var4.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean z4 = i13 == 32;
                    Object objT4 = x340Var4.T();
                    if (z4 || objT4 == m4cVar) {
                        objT4 = new jii(iu30Var2, (byte) 9);
                        x340Var4.s0(objT4);
                    }
                    Function0 function2 = (Function0) objT4;
                    boolean z5 = i13 == 32;
                    Object objT5 = x340Var4.T();
                    if (z5 || objT5 == m4cVar) {
                        objT5 = new jii(iu30Var2, (byte) 10);
                        x340Var4.s0(objT5);
                    }
                    Function0 function3 = (Function0) objT5;
                    z = i13 == 32;
                    Object objT6 = x340Var4.T();
                    if (z || objT6 == m4cVar) {
                        objT6 = new jii(iu30Var2, (byte) 11);
                        x340Var4.s0(objT6);
                    }
                    qon1.l(vpg1Var, function0, function1, function2, function3, (Function0) objT6, (qim0) null, (idn0) null, x340Var4, i3 & 14);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                zdj1 zdj1Var = (zdj1) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var5 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                if ((iIntValue3 & 6) == 0) {
                    i4 = iIntValue3 | (x340Var5.g(zdj1Var) ? 4 : 2);
                } else {
                    i4 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i4 |= x340Var5.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i4 & 1, (i4 & 147) != 146)) {
                    int i14 = i4 & 112;
                    boolean z6 = i14 == 32;
                    Object objT7 = x340Var6.T();
                    if (z6 || objT7 == m4cVar2) {
                        objT7 = new jii(iu30Var3, (byte) 12);
                        x340Var6.s0(objT7);
                    }
                    Function0 function4 = (Function0) objT7;
                    boolean z7 = i14 == 32;
                    Object objT8 = x340Var6.T();
                    if (z7 || objT8 == m4cVar2) {
                        objT8 = new jii(iu30Var3, (byte) 13);
                        x340Var6.s0(objT8);
                    }
                    Function0 function5 = (Function0) objT8;
                    boolean z8 = i14 == 32;
                    Object objT9 = x340Var6.T();
                    if (z8 || objT9 == m4cVar2) {
                        objT9 = new jii(iu30Var3, b4);
                        x340Var6.s0(objT9);
                    }
                    Function0 function6 = (Function0) objT9;
                    z = i14 == 32;
                    Object objT10 = x340Var6.T();
                    if (z || objT10 == m4cVar2) {
                        objT10 = new jii(iu30Var3, (byte) 15);
                        x340Var6.s0(objT10);
                    }
                    s1p1.r(zdj1Var, function4, function5, function6, (Function0) objT10, (qim0) null, x340Var6, 14 & i4);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                ((Number) obj4).intValue();
                return rih1Var;
            case 4:
                hzu hzuVar = (hzu) obj2;
                x340 x340Var7 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (hzuVar == null) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-2090985406);
                    uwr uwrVar = cbx.a;
                    xto1.e((qim0) null, 2, cbx.a(x340Var8).b.a, 0L, x340Var8, 48, 9);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-2090822718);
                    String strN0 = cwl1.n0(2131959053, new Object[]{Integer.valueOf(hzuVar.a), Integer.valueOf(hzuVar.b)}, x340Var9);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(strN0, (qim0) null, cbx.d(x340Var9).h, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var9, 0, 0, 1722);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 5:
                b0k b0kVar = (b0k) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                uwr uwrVar3 = cbx.a;
                uwo1.e((String) obj2, (qim0) null, cbx.d(b0kVar).m, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, ((iIntValue4 >> 3) & 14) | 1572864, 0, 1714);
                return rih1Var;
            case 6:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                b0k b0kVar2 = (b0k) obj3;
                ((Number) obj4).intValue();
                hux huxVar = zBooleanValue ? ctx.c : xpx.c;
                uwr uwrVar4 = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar2).g;
                w0h1.a(huxVar, isl.a, u291.r(nim0Var, 32.0f), 0L, 0L, false, b0kVar2, 56, 56);
                return rih1Var;
            case 7:
                ed20 ed20Var = (ed20) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                if ((iIntValue5 & 6) == 0) {
                    i5 = iIntValue5 | (x340Var10.g(ed20Var) ? 4 : 2);
                } else {
                    i5 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i5 |= x340Var10.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i5 & 1, (i5 & 147) != 146)) {
                    xd20.a(ed20Var, iu30Var4, null, null, false, x340Var11, i5 & 126);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 8:
                r740 r740Var = (r740) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var12 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i6 = iIntValue6 | (x340Var12.g(r740Var) ? 4 : 2);
                } else {
                    i6 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i6 |= x340Var12.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i6 & 1, (i6 & 147) != 146)) {
                    apo.c(r740Var, uyn1.B(nim0.a, 16.0f, 0.0f, 16.0f, 0.0f, 10), iu30Var5, x340Var13, ((i6 << 3) & 896) | (i6 & 14));
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 9:
                r740 r740Var2 = (r740) obj;
                iu30 iu30Var6 = (iu30) obj2;
                x340 x340Var14 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                if ((iIntValue7 & 6) == 0) {
                    i7 = iIntValue7 | (x340Var14.g(r740Var2) ? 4 : 2);
                } else {
                    i7 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i7 |= x340Var14.i(iu30Var6) ? 32 : 16;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i7 & 1, (i7 & 147) != 146)) {
                    apo.c(r740Var2, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, 16.0f, 5), iu30Var6, x340Var15, ((i7 << 3) & 896) | (i7 & 14));
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 10:
                r740 r740Var3 = (r740) obj;
                iu30 iu30Var7 = (iu30) obj2;
                x340 x340Var16 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i8 = (x340Var16.g(r740Var3) ? 4 : 2) | iIntValue8;
                } else {
                    i8 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i8 |= x340Var16.i(iu30Var7) ? 32 : 16;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i8 & 1, (i8 & 147) != 146)) {
                    apo.c(r740Var3, uyn1.A(nim0Var, 16.0f, 16.0f, 16.0f, 16.0f), iu30Var7, x340Var17, ((i8 << 3) & 896) | (i8 & 14));
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 11:
                n2c0 n2c0Var = (n2c0) obj;
                int iIntValue9 = ((Number) obj4).intValue();
                n2c0Var.getClass();
                jzn1.f(n2c0Var, (iu30) obj2, (b0k) obj3, iIntValue9 & 112);
                return rih1Var;
            case 12:
                n2c0 n2c0Var2 = (n2c0) obj;
                int iIntValue10 = ((Number) obj4).intValue();
                n2c0Var2.getClass();
                mqo1.g(n2c0Var2, (iu30) obj2, (b0k) obj3, iIntValue10 & 112);
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                x4p1.f(0, 1, (b0k) obj3, (qim0) null);
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                x340 x340Var18 = (b0k) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue11 & 1, (iIntValue11 & 129) != 128)) {
                    tx9.b((qim0) null, x340Var19, 0);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 15:
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var20 = (b0k) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= x340Var20.e(iIntValue12) ? 32 : 16;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    iko1.j(0, x340Var21, (qim0) null, iIntValue12 >= 3);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 16:
                s6j0 s6j0Var = (s6j0) obj;
                iu30 iu30Var8 = (iu30) obj2;
                x340 x340Var22 = (b0k) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i9 = iIntValue14 | (x340Var22.g(s6j0Var) ? 4 : 2);
                } else {
                    i9 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i9 |= x340Var22.i(iu30Var8) ? 32 : 16;
                }
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(i9 & 1, (i9 & 147) != 146)) {
                    z = (i9 & 112) == 32;
                    Object objT11 = x340Var23.T();
                    if (z || objT11 == fkj0.X) {
                        objT11 = new exi(iu30Var8, (byte) 21);
                        x340Var23.s0(objT11);
                    }
                    k8p1.d(s6j0Var, (Function0) objT11, (qim0) null, x340Var23, i9 & 14);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var24 = (b0k) obj3;
                ((Number) obj4).intValue();
                int iOrdinal = ((mbk0) obj2).ordinal();
                if (iOrdinal == 0) {
                    x340 x340Var25 = x340Var24;
                    x340Var25.i0(-1090371156);
                    w0h1.a(ctx.c, new jsl(cwl1.o0(x340Var25, 2131958673)), anm1.N("stop_icon", nim0Var), 0L, 0L, false, x340Var25, ctx.d | 384, 56);
                    x340Var25.r(false);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw p3d1.k(x340Var24, 1211750379, false);
                    }
                    x340 x340Var26 = x340Var24;
                    x340Var26.i0(-1090371156);
                    w0h1.a(ctx.c, new jsl(cwl1.o0(x340Var26, 2131958673)), anm1.N("stop_icon", nim0Var), 0L, 0L, false, x340Var26, ctx.d | 384, 56);
                    x340Var26.r(false);
                } else {
                    x340 x340Var27 = x340Var24;
                    x340Var27.i0(-1089974356);
                    w0h1.a(xpx.c, new jsl(cwl1.o0(x340Var27, 2131958672)), anm1.N("play_icon", nim0Var), 0L, 0L, false, x340Var27, xpx.d | 384, 56);
                    x340Var27.r(false);
                }
                return rih1Var;
            case 18:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                x340 x340Var28 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (zBooleanValue2) {
                    x340 x340Var29 = x340Var28;
                    x340Var29.i0(1856169101);
                    w0h1.a(spx.c, new jsl(cwl1.n0(2131959800, new Object[]{""}, x340Var29)), anm1.N("pause_icon", nim0Var), 0L, 0L, false, x340Var29, spx.d, 56);
                    x340Var29.r(false);
                } else {
                    x340 x340Var30 = x340Var28;
                    x340Var30.i0(1856180290);
                    w0h1.a(xpx.c, new jsl(cwl1.n0(2131959801, new Object[]{""}, x340Var30)), anm1.N("play_icon", nim0Var), 0L, 0L, false, x340Var30, xpx.d, 56);
                    x340Var30.r(false);
                }
                return rih1Var;
            case 19:
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                x340 x340Var31 = (b0k) obj3;
                ((Number) obj4).intValue();
                isl islVar = isl.a;
                if (zBooleanValue3) {
                    x340 x340Var32 = x340Var31;
                    x340Var32.i0(378357947);
                    uwr uwrVar5 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var32).g;
                    w0h1.a(spx.c, islVar, u291.r(nim0Var, 24.0f), ((vex) zex.a.b).a, 0L, false, x340Var32, spx.d | 48, 48);
                    x340Var32.r(false);
                } else {
                    x340 x340Var33 = x340Var31;
                    x340Var33.i0(378638652);
                    uwr uwrVar6 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var33).g;
                    w0h1.a(xpx.c, islVar, u291.r(nim0Var, 24.0f), ((vex) zex.a.b).a, 0L, false, x340Var33, xpx.d | 48, 48);
                    x340Var33.r(false);
                }
                return rih1Var;
            case 20:
                iu30 iu30Var9 = (iu30) obj2;
                x340 x340Var34 = (b0k) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                if ((iIntValue15 & 48) == 0) {
                    iIntValue15 |= x340Var34.i(iu30Var9) ? 32 : 16;
                }
                x340 x340Var35 = x340Var34;
                if (x340Var35.Y(iIntValue15 & 1, (iIntValue15 & 145) != 144)) {
                    z = (iIntValue15 & 112) == 32;
                    Object objT12 = x340Var35.T();
                    if (z || objT12 == fkj0.X) {
                        objT12 = new q4j(iu30Var9, (byte) 28);
                        x340Var35.s0(objT12);
                    }
                    t0c.b(0, (Function0) objT12, x340Var35, (qim0) null);
                } else {
                    x340Var35.b0();
                }
                return rih1Var;
            case 21:
                q4w0 q4w0Var = (q4w0) obj;
                iu30 iu30Var10 = (iu30) obj2;
                x340 x340Var36 = (b0k) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i10 = iIntValue16 | (x340Var36.g(q4w0Var) ? 4 : 2);
                } else {
                    i10 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i10 |= x340Var36.i(iu30Var10) ? 32 : 16;
                }
                x340 x340Var37 = x340Var36;
                if (x340Var37.Y(i10 & 1, (i10 & 147) != 146)) {
                    aym.g(q4w0Var, iu30Var10, (qim0) null, x340Var37, i10 & 126);
                } else {
                    x340Var37.b0();
                }
                return rih1Var;
            case 22:
                ye5 ye5Var = (ye5) obj;
                km61 km61Var = (km61) obj2;
                x340 x340Var38 = (b0k) obj3;
                ((Number) obj4).intValue();
                String strO0 = cwl1.o0(x340Var38, 2131961949);
                x340 x340Var39 = x340Var38;
                boolean zI = x340Var39.i(km61Var);
                Object objT13 = x340Var39.T();
                if (zI || objT13 == fkj0.X) {
                    objT13 = new mwh(km61Var, (byte) 5);
                    x340Var39.s0(objT13);
                }
                vhg.b(ye5Var, strO0, "learn_more", (iu30) objT13);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                float fFloatValue = ((Number) obj).floatValue();
                qim0 qim0Var = (qim0) obj2;
                x340 x340Var40 = (b0k) obj3;
                int iIntValue17 = ((Number) obj4).intValue();
                if ((iIntValue17 & 6) == 0) {
                    i11 = iIntValue17 | (x340Var40.d(fFloatValue) ? 4 : 2);
                } else {
                    i11 = iIntValue17;
                }
                if ((iIntValue17 & 48) == 0) {
                    i11 |= x340Var40.g(qim0Var) ? 32 : 16;
                }
                x340 x340Var41 = x340Var40;
                if (x340Var41.Y(i11 & 1, (i11 & 147) != 146)) {
                    mue1.q(fFloatValue, qim0Var, 0L, 0L, x340Var41, i11 & 126);
                } else {
                    x340Var41.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var42 = (b0k) obj3;
                ((Number) obj4).intValue();
                if (((wuj1) obj2) instanceof quj1) {
                    x340 x340Var43 = x340Var42;
                    x340Var43.i0(-2027422215);
                    gfx.b(18, wbj.a, x340Var43, 54);
                    x340Var43.r(false);
                } else {
                    x340 x340Var44 = x340Var42;
                    x340Var44.i0(1575044094);
                    x340Var44.r(false);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ghm0 ghm0Var = (ghm0) obj;
                iu30 iu30Var11 = (iu30) obj2;
                x340 x340Var45 = (b0k) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i12 = iIntValue18 | (x340Var45.g(ghm0Var) ? 4 : 2);
                } else {
                    i12 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i12 |= x340Var45.i(iu30Var11) ? 32 : 16;
                }
                x340 x340Var46 = x340Var45;
                if (x340Var46.Y(i12 & 1, (i12 & 147) != 146)) {
                    ghm0Var.getClass();
                    dug.b(ghm0Var, iu30Var11, (qim0) null, x340Var46, i12 & 112);
                } else {
                    x340Var46.b0();
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                h5p1.g(u291.f(nim0Var, 1.0f), (b0k) obj3, 0);
                return rih1Var;
            case 27:
                int iIntValue19 = ((Number) obj).intValue();
                eeo0 eeo0Var = (eeo0) obj2;
                b0k b0kVar3 = (b0k) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                j82.j(iIntValue19, eeo0Var, apo.r(-365028159, new mrj(eeo0Var, (byte) 0), b0kVar3), b0kVar3, (iIntValue20 & 112) | (iIntValue20 & 14) | 384);
                return rih1Var;
            case 28:
                int iIntValue21 = ((Number) obj).intValue();
                eeo0 eeo0Var2 = (eeo0) obj2;
                b0k b0kVar4 = (b0k) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                j82.j(iIntValue21, eeo0Var2, apo.r(-1210784995, new mrj(eeo0Var2, (byte) 1), b0kVar4), b0kVar4, (iIntValue22 & 112) | (iIntValue22 & 14) | 384);
                return rih1Var;
            default:
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                b0k b0kVar5 = (b0k) obj3;
                ((Number) obj4).intValue();
                String strO1 = cwl1.o0(b0kVar5, zBooleanValue4 ? 2131964066 : 2131964165);
                uwr uwrVar7 = cbx.a;
                uwo1.e(strO1, (qim0) null, cbx.d(b0kVar5).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, 0, 0, 2042);
                return rih1Var;
        }
    }
}
