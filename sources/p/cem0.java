package p;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cem0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public cem0(vu30 vu30Var, o95 o95Var, vy71 vy71Var, vu30 vu30Var2, j2i j2iVar, Function0 function0, c9n c9nVar, boolean z) {
        this.b = vu30Var;
        this.g = o95Var;
        this.c = vy71Var;
        this.h = vu30Var2;
        this.i = j2iVar;
        this.d = function0;
        this.e = c9nVar;
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:43:0x013a  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:50:0x014e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0154  */
    /* JADX WARN: Code duplicated, block: B:59:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x019c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ff A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0201  */
    /* JADX WARN: Code duplicated, block: B:74:0x0261  */
    /* JADX WARN: Code duplicated, block: B:77:0x0267  */
    /* JADX WARN: Code duplicated, block: B:82:0x028d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0291  */
    /* JADX WARN: Code duplicated, block: B:86:0x0294  */
    /* JADX WARN: Code duplicated, block: B:89:0x029b  */
    /* JADX WARN: Code duplicated, block: B:90:0x029d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0324  */
    public final Object invoke(Object obj, Object obj2) {
        lee1 lee1Var;
        Object obj3;
        mah z9cVar;
        FontWeight fontWeight;
        FontWeight fontWeight2;
        BaselineShift baselineShift;
        float f;
        TextGeometricTransform textGeometricTransform;
        TextGeometricTransform textGeometricTransform2;
        TextGeometricTransform textGeometricTransform3;
        Shadow shadow;
        Shadow shadow2;
        Shadow shadowV;
        Shadow shadow3;
        PlatformSpanStyle platformSpanStyle;
        PlatformSpanStyle platformSpanStyle2;
        u8e1 u8e1Var;
        u8e1 u8e1Var2;
        edt0 edt0Var;
        edt0 edt0Var2;
        edt0 edt0Var3;
        boolean z;
        boolean z2;
        edt0 edt0Var4;
        edt0 edt0Var5;
        tob1 tob1Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        boolean z3 = this.f;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.i;
        Object obj7 = this.g;
        Object obj8 = this.h;
        Object obj9 = this.e;
        Object obj10 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Object obj11 = fkj0.X;
                c9n c9nVar = (c9n) obj9;
                Function0 function0 = (Function0) obj10;
                final vy71 vy71Var = (vy71) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(vy71Var) | x340Var2.g(function0) | x340Var2.i(c9nVar);
                    Object objT = x340Var2.T();
                    if (zG || objT == obj11) {
                        objT = new wdm0(vy71Var, function0, c9nVar);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarW = bin.w((Function0) objT);
                    boolean zH = x340Var2.h(z3) | x340Var2.g(vy71Var) | x340Var2.g((String) obj7) | x340Var2.g(function0) | x340Var2.g((String) obj8) | x340Var2.i(c9nVar) | x340Var2.g((String) obj6);
                    final String str = (String) obj7;
                    final String str2 = (String) obj8;
                    final String str3 = (String) obj6;
                    final Function0 function1 = (Function0) obj10;
                    final c9n c9nVar2 = (c9n) obj9;
                    Object objT2 = x340Var2.T();
                    if (zH || objT2 == obj11) {
                        final boolean z4 = this.f;
                        objT2 = new iu30() { // from class: p.bem0
                            public final Object invoke(Object obj12) {
                                e261 e261Var = (e261) obj12;
                                if (z4) {
                                    zxs zxsVar = new zxs(function1, (byte) 4);
                                    mma0[] mma0VarArr = b261.a;
                                    e261Var.b(m161.v, new we(str, zxsVar));
                                    vy71 vy71Var2 = vy71Var;
                                    xy71 xy71VarD = vy71Var2.d();
                                    xy71 xy71Var = xy71.c;
                                    c9n c9nVar3 = c9nVar2;
                                    if (xy71VarD == xy71Var) {
                                        e261Var.b(m161.t, new we(str2, new uc9(vy71Var2, c9nVar3, vy71Var2, (byte) 8)));
                                    } else if (vy71Var2.f()) {
                                        e261Var.b(m161.u, new we(str3, new cyb(vy71Var2, c9nVar3, (byte) 4)));
                                    }
                                }
                                return rih1.a;
                            }
                        };
                        x340Var2.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(qim0VarW, true, (iu30) objT2);
                    vu30 vu30Var = (vu30) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iK = tgp1.k(x340Var2);
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
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var2, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    us71.j(0, vu30Var, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                vy71 vy71Var2 = (vy71) obj5;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                o95 o95Var = (o95) obj7;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarY = too1.y(u291.f(nim0.a, 1.0f), (erl1) ((vu30) obj4).invoke(x340Var4, 0));
                    boolean zI = x340Var4.i(o95Var);
                    Object objT3 = x340Var4.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new gv20(o95Var, (byte) 24);
                        x340Var4.s0(objT3);
                    }
                    qim0 qim0VarC = i541.C(i541.C(qim0VarY, (iu30) objT3), new vxb(vy71Var2, (byte) 0));
                    vu30 vu30Var2 = (vu30) obj8;
                    j2i j2iVar = (j2i) obj6;
                    Function0 function2 = (Function0) obj10;
                    c9n c9nVar3 = (c9n) obj9;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var4, 0);
                    int iK2 = tgp1.k(x340Var4);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarC);
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
                    llj lljVar2 = y580.R0;
                    if (x340Var4.S || !u890.j(x340Var4.T(), Integer.valueOf(iK2))) {
                        z5c.f(iK2, x340Var4, iK2, lljVar2);
                    }
                    nko1.H(qim0VarE2, x340Var4, y580.Y);
                    if (vu30Var2 != null) {
                        x340Var4.i0(1352934765);
                        ly71.b(54, apo.r(2000500644, new cem0(vy71Var2, function2, c9nVar3, this.f, bno1.q(x340Var4, 2131957932), bno1.q(x340Var4, 2131957934), bno1.q(x340Var4, 2131957931), vu30Var2), x340Var4), x340Var4);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1356009965);
                        x340Var4.r(false);
                    }
                    j2iVar.invoke(pbh.a, x340Var4, 6);
                    x340Var4.r(true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lee1 lee1Var2 = (lee1) obj5;
                    lee1 lee1Var3 = (lee1) obj10;
                    float fFloatValue = ((Number) ((tob1) obj9).getValue()).floatValue();
                    zma1 zma1Var = lee1Var2.a;
                    zma1 zma1Var2 = lee1Var3.a;
                    j8e1 j8e1Var = ana1.d;
                    z9c z9cVar2 = zma1Var.a;
                    z9c z9cVar3 = zma1Var2.a;
                    boolean z5 = z9cVar2 instanceof z9c;
                    mah mahVar = i8e1.a;
                    if (z5) {
                        obj3 = obj4;
                    } else {
                        obj3 = obj4;
                        if (!(z9cVar3 instanceof z9c)) {
                            long jA = z4p1.A(fFloatValue, z9cVar2.a(), z9cVar3.a());
                            if (jA != 16) {
                                z9cVar = new mah(jA);
                                mahVar = z9cVar;
                            }
                        }
                        mah mahVar2 = mahVar;
                        FontFamily fontFamily = (FontFamily) ana1.b(fFloatValue, zma1Var.f, zma1Var2.f);
                        long jC = ana1.c(fFloatValue, zma1Var.b, zma1Var2.b);
                        fontWeight = zma1Var.c;
                        if (fontWeight == null) {
                            fontWeight = FontWeight.t;
                        }
                        fontWeight2 = zma1Var2.c;
                        if (fontWeight2 == null) {
                            fontWeight2 = FontWeight.t;
                        }
                        FontWeight fontWeight3 = new FontWeight(yoi1.p(dm5.U(fontWeight.a, fontWeight2.a, fFloatValue), 1, 1000));
                        FontStyle fontStyle = (FontStyle) ana1.b(fFloatValue, zma1Var.d, zma1Var2.d);
                        FontSynthesis fontSynthesis = (FontSynthesis) ana1.b(fFloatValue, zma1Var.e, zma1Var2.e);
                        String str4 = (String) ana1.b(fFloatValue, zma1Var.g, zma1Var2.g);
                        long jC2 = ana1.c(fFloatValue, zma1Var.h, zma1Var2.h);
                        baselineShift = zma1Var.i;
                        if (baselineShift != null) {
                            f = baselineShift.a;
                        } else {
                            f = 0.0f;
                        }
                        BaselineShift baselineShift2 = zma1Var2.i;
                        float fT = dm5.T(f, baselineShift2 != null ? baselineShift2.a : 0.0f, fFloatValue);
                        textGeometricTransform = zma1Var.j;
                        textGeometricTransform2 = TextGeometricTransform.c;
                        if (textGeometricTransform == null) {
                            textGeometricTransform = textGeometricTransform2;
                        }
                        textGeometricTransform3 = zma1Var2.j;
                        if (textGeometricTransform3 != null) {
                            textGeometricTransform2 = textGeometricTransform3;
                        }
                        TextGeometricTransform textGeometricTransform4 = new TextGeometricTransform(dm5.T(textGeometricTransform.a, textGeometricTransform2.a, fFloatValue), dm5.T(textGeometricTransform.b, textGeometricTransform2.b, fFloatValue));
                        LocaleList localeList = (LocaleList) ana1.b(fFloatValue, zma1Var.k, zma1Var2.k);
                        long jA2 = z4p1.A(fFloatValue, zma1Var.l, zma1Var2.l);
                        TextDecoration textDecoration = (TextDecoration) ana1.b(fFloatValue, zma1Var.m, zma1Var2.m);
                        shadow = zma1Var.n;
                        shadow2 = zma1Var2.n;
                        if (shadow == null || shadow2 != null) {
                            if (shadow == null) {
                                shadow2.getClass();
                                shadowV = pto1.v(new Shadow(shadow2.c, u7h.b(shadow2.a, 0.0f, 0.0f, 0.0f, 0.0f, 14), shadow2.b), shadow2, fFloatValue);
                            } else if (shadow2 == null) {
                                shadowV = pto1.v(shadow, new Shadow(shadow.c, u7h.b(shadow.a, 0.0f, 0.0f, 0.0f, 0.0f, 14), shadow.b), fFloatValue);
                            } else {
                                shadowV = pto1.v(shadow, shadow2, fFloatValue);
                            }
                            shadow3 = shadowV;
                        } else {
                            shadow3 = null;
                        }
                        platformSpanStyle = zma1Var.o;
                        PlatformSpanStyle platformSpanStyle3 = zma1Var2.o;
                        if (platformSpanStyle == null || platformSpanStyle3 != null) {
                            if (platformSpanStyle == null) {
                                platformSpanStyle = PlatformSpanStyle.a;
                            }
                            platformSpanStyle2 = platformSpanStyle;
                        } else {
                            platformSpanStyle2 = null;
                        }
                        zma1 zma1Var3 = new zma1(mahVar2, jC, fontWeight3, fontStyle, fontSynthesis, fontFamily, str4, jC2, new BaselineShift(fT), textGeometricTransform4, localeList, jA2, textDecoration, shadow3, platformSpanStyle2, (DrawStyle) ana1.b(fFloatValue, zma1Var.p, zma1Var2.p));
                        cpr0 cpr0Var = lee1Var2.b;
                        cpr0 cpr0Var2 = lee1Var3.b;
                        int i = dpr0.b;
                        int i2 = ((a0e1) ana1.b(fFloatValue, new a0e1(cpr0Var.a), new a0e1(cpr0Var2.a))).a;
                        int i3 = ((z3e1) ana1.b(fFloatValue, new z3e1(cpr0Var.b), new z3e1(cpr0Var2.b))).a;
                        long jC3 = ana1.c(fFloatValue, cpr0Var.c, cpr0Var2.c);
                        u8e1Var = cpr0Var.d;
                        if (u8e1Var == null) {
                            u8e1Var = u8e1.c;
                        }
                        u8e1Var2 = cpr0Var2.d;
                        if (u8e1Var2 == null) {
                            u8e1Var2 = u8e1.c;
                        }
                        u8e1 u8e1Var3 = new u8e1(ana1.c(fFloatValue, u8e1Var.a, u8e1Var2.a), ana1.c(fFloatValue, u8e1Var.b, u8e1Var2.b));
                        edt0Var = cpr0Var.e;
                        edt0Var2 = cpr0Var2.e;
                        if (edt0Var == null || edt0Var2 != null) {
                            edt0Var3 = edt0.c;
                            if (edt0Var == null) {
                                edt0Var = edt0Var3;
                            }
                            if (edt0Var2 == null) {
                                edt0Var2 = edt0Var3;
                            }
                            z = edt0Var.a;
                            z2 = edt0Var2.a;
                            if (z == z2) {
                                edt0Var4 = edt0Var;
                            } else {
                                edt0Var4 = new edt0(((f5x) ana1.b(fFloatValue, new f5x(edt0Var.b), new f5x(edt0Var2.b))).a, ((Boolean) ana1.b(fFloatValue, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue());
                            }
                            edt0Var5 = edt0Var4;
                        } else {
                            edt0Var5 = null;
                        }
                        lee1Var = new lee1(zma1Var3, new cpr0(i2, i3, jC3, u8e1Var3, edt0Var5, (shc0) ana1.b(fFloatValue, cpr0Var.f, cpr0Var2.f), ((mhc0) ana1.b(fFloatValue, new mhc0(cpr0Var.g), new mhc0(cpr0Var2.g))).a, ((yf70) ana1.b(fFloatValue, new yf70(cpr0Var.h), new yf70(cpr0Var2.h))).a, (gbe1) ana1.b(fFloatValue, cpr0Var.i, cpr0Var2.i)));
                        tob1Var = (tob1) obj8;
                        if (z3) {
                            lee1Var = lee1.a(lee1Var, ((u7h) tob1Var.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                        }
                        i3p1.g(((u7h) ((tob1) obj7).getValue()).a, lee1Var, apo.r(1157484991, new ek1((xu30) obj6, (m5e1) obj3, (byte) 16), x340Var6), x340Var6, 384);
                    }
                    if (z5 && (z9cVar3 instanceof z9c)) {
                        z9c z9cVar4 = z9cVar2;
                        z9c z9cVar5 = z9cVar3;
                        n6a1 n6a1Var = (Brush) ana1.b(fFloatValue, z9cVar4.a, z9cVar5.a);
                        float fT2 = dm5.T(z9cVar4.b, z9cVar5.b, fFloatValue);
                        if (n6a1Var != null) {
                            if (n6a1Var instanceof n6a1) {
                                long jA3 = ila0.A(fT2, n6a1Var.a);
                                if (jA3 != 16) {
                                    z9cVar = new mah(jA3);
                                }
                            } else {
                                if (!(n6a1Var instanceof zv61)) {
                                    eg.o();
                                    return null;
                                }
                                z9cVar = new z9c((zv61) n6a1Var, fT2);
                            }
                            mahVar = z9cVar;
                        }
                    } else {
                        mahVar = (j8e1) ana1.b(fFloatValue, z9cVar2, z9cVar3);
                    }
                    mah mahVar3 = mahVar;
                    FontFamily fontFamily2 = (FontFamily) ana1.b(fFloatValue, zma1Var.f, zma1Var2.f);
                    long jC4 = ana1.c(fFloatValue, zma1Var.b, zma1Var2.b);
                    fontWeight = zma1Var.c;
                    if (fontWeight == null) {
                        fontWeight = FontWeight.t;
                    }
                    fontWeight2 = zma1Var2.c;
                    if (fontWeight2 == null) {
                        fontWeight2 = FontWeight.t;
                    }
                    FontWeight fontWeight4 = new FontWeight(yoi1.p(dm5.U(fontWeight.a, fontWeight2.a, fFloatValue), 1, 1000));
                    FontStyle fontStyle2 = (FontStyle) ana1.b(fFloatValue, zma1Var.d, zma1Var2.d);
                    FontSynthesis fontSynthesis2 = (FontSynthesis) ana1.b(fFloatValue, zma1Var.e, zma1Var2.e);
                    String str5 = (String) ana1.b(fFloatValue, zma1Var.g, zma1Var2.g);
                    long jC5 = ana1.c(fFloatValue, zma1Var.h, zma1Var2.h);
                    baselineShift = zma1Var.i;
                    if (baselineShift != null) {
                        f = baselineShift.a;
                    } else {
                        f = 0.0f;
                    }
                    BaselineShift baselineShift3 = zma1Var2.i;
                    float fT3 = dm5.T(f, baselineShift3 != null ? baselineShift3.a : 0.0f, fFloatValue);
                    textGeometricTransform = zma1Var.j;
                    textGeometricTransform2 = TextGeometricTransform.c;
                    if (textGeometricTransform == null) {
                        textGeometricTransform = textGeometricTransform2;
                    }
                    textGeometricTransform3 = zma1Var2.j;
                    if (textGeometricTransform3 != null) {
                        textGeometricTransform2 = textGeometricTransform3;
                    }
                    TextGeometricTransform textGeometricTransform5 = new TextGeometricTransform(dm5.T(textGeometricTransform.a, textGeometricTransform2.a, fFloatValue), dm5.T(textGeometricTransform.b, textGeometricTransform2.b, fFloatValue));
                    LocaleList localeList2 = (LocaleList) ana1.b(fFloatValue, zma1Var.k, zma1Var2.k);
                    long jA4 = z4p1.A(fFloatValue, zma1Var.l, zma1Var2.l);
                    TextDecoration textDecoration2 = (TextDecoration) ana1.b(fFloatValue, zma1Var.m, zma1Var2.m);
                    shadow = zma1Var.n;
                    shadow2 = zma1Var2.n;
                    if (shadow == null) {
                        if (shadow == null) {
                            shadow2.getClass();
                            shadowV = pto1.v(new Shadow(shadow2.c, u7h.b(shadow2.a, 0.0f, 0.0f, 0.0f, 0.0f, 14), shadow2.b), shadow2, fFloatValue);
                        } else if (shadow2 == null) {
                            shadowV = pto1.v(shadow, new Shadow(shadow.c, u7h.b(shadow.a, 0.0f, 0.0f, 0.0f, 0.0f, 14), shadow.b), fFloatValue);
                        } else {
                            shadowV = pto1.v(shadow, shadow2, fFloatValue);
                        }
                        shadow3 = shadowV;
                    } else {
                        if (shadow == null) {
                            shadow2.getClass();
                            shadowV = pto1.v(new Shadow(shadow2.c, u7h.b(shadow2.a, 0.0f, 0.0f, 0.0f, 0.0f, 14), shadow2.b), shadow2, fFloatValue);
                        } else if (shadow2 == null) {
                            shadowV = pto1.v(shadow, new Shadow(shadow.c, u7h.b(shadow.a, 0.0f, 0.0f, 0.0f, 0.0f, 14), shadow.b), fFloatValue);
                        } else {
                            shadowV = pto1.v(shadow, shadow2, fFloatValue);
                        }
                        shadow3 = shadowV;
                    }
                    platformSpanStyle = zma1Var.o;
                    PlatformSpanStyle platformSpanStyle4 = zma1Var2.o;
                    if (platformSpanStyle == null) {
                        if (platformSpanStyle == null) {
                            platformSpanStyle = PlatformSpanStyle.a;
                        }
                        platformSpanStyle2 = platformSpanStyle;
                    } else {
                        if (platformSpanStyle == null) {
                            platformSpanStyle = PlatformSpanStyle.a;
                        }
                        platformSpanStyle2 = platformSpanStyle;
                    }
                    zma1 zma1Var4 = new zma1(mahVar3, jC4, fontWeight4, fontStyle2, fontSynthesis2, fontFamily2, str5, jC5, new BaselineShift(fT3), textGeometricTransform5, localeList2, jA4, textDecoration2, shadow3, platformSpanStyle2, (DrawStyle) ana1.b(fFloatValue, zma1Var.p, zma1Var2.p));
                    cpr0 cpr0Var3 = lee1Var2.b;
                    cpr0 cpr0Var4 = lee1Var3.b;
                    int i4 = dpr0.b;
                    int i5 = ((a0e1) ana1.b(fFloatValue, new a0e1(cpr0Var3.a), new a0e1(cpr0Var4.a))).a;
                    int i6 = ((z3e1) ana1.b(fFloatValue, new z3e1(cpr0Var3.b), new z3e1(cpr0Var4.b))).a;
                    long jC6 = ana1.c(fFloatValue, cpr0Var3.c, cpr0Var4.c);
                    u8e1Var = cpr0Var3.d;
                    if (u8e1Var == null) {
                        u8e1Var = u8e1.c;
                    }
                    u8e1Var2 = cpr0Var4.d;
                    if (u8e1Var2 == null) {
                        u8e1Var2 = u8e1.c;
                    }
                    u8e1 u8e1Var4 = new u8e1(ana1.c(fFloatValue, u8e1Var.a, u8e1Var2.a), ana1.c(fFloatValue, u8e1Var.b, u8e1Var2.b));
                    edt0Var = cpr0Var3.e;
                    edt0Var2 = cpr0Var4.e;
                    if (edt0Var == null) {
                        edt0Var3 = edt0.c;
                        if (edt0Var == null) {
                            edt0Var = edt0Var3;
                        }
                        if (edt0Var2 == null) {
                            edt0Var2 = edt0Var3;
                        }
                        z = edt0Var.a;
                        z2 = edt0Var2.a;
                        if (z == z2) {
                            edt0Var4 = edt0Var;
                        } else {
                            edt0Var4 = new edt0(((f5x) ana1.b(fFloatValue, new f5x(edt0Var.b), new f5x(edt0Var2.b))).a, ((Boolean) ana1.b(fFloatValue, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue());
                        }
                        edt0Var5 = edt0Var4;
                    } else {
                        edt0Var3 = edt0.c;
                        if (edt0Var == null) {
                            edt0Var = edt0Var3;
                        }
                        if (edt0Var2 == null) {
                            edt0Var2 = edt0Var3;
                        }
                        z = edt0Var.a;
                        z2 = edt0Var2.a;
                        if (z == z2) {
                            edt0Var4 = edt0Var;
                        } else {
                            edt0Var4 = new edt0(((f5x) ana1.b(fFloatValue, new f5x(edt0Var.b), new f5x(edt0Var2.b))).a, ((Boolean) ana1.b(fFloatValue, Boolean.valueOf(z), Boolean.valueOf(z2))).booleanValue());
                        }
                        edt0Var5 = edt0Var4;
                    }
                    lee1Var = new lee1(zma1Var4, new cpr0(i5, i6, jC6, u8e1Var4, edt0Var5, (shc0) ana1.b(fFloatValue, cpr0Var3.f, cpr0Var4.f), ((mhc0) ana1.b(fFloatValue, new mhc0(cpr0Var3.g), new mhc0(cpr0Var4.g))).a, ((yf70) ana1.b(fFloatValue, new yf70(cpr0Var3.h), new yf70(cpr0Var4.h))).a, (gbe1) ana1.b(fFloatValue, cpr0Var3.i, cpr0Var4.i)));
                    tob1Var = (tob1) obj8;
                    if (z3) {
                        lee1Var = lee1.a(lee1Var, ((u7h) tob1Var.getValue()).a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
                    }
                    i3p1.g(((u7h) ((tob1) obj7).getValue()).a, lee1Var, apo.r(1157484991, new ek1((xu30) obj6, (m5e1) obj3, (byte) 16), x340Var6), x340Var6, 384);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    public cem0(vy71 vy71Var, Function0 function0, c9n c9nVar, boolean z, String str, String str2, String str3, vu30 vu30Var) {
        this.c = vy71Var;
        this.d = function0;
        this.e = c9nVar;
        this.f = z;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.b = vu30Var;
    }

    public cem0(lee1 lee1Var, lee1 lee1Var2, fhg1 fhg1Var, fhg1 fhg1Var2, boolean z, fhg1 fhg1Var3, xu30 xu30Var, m5e1 m5e1Var) {
        this.c = lee1Var;
        this.d = lee1Var2;
        this.e = fhg1Var;
        this.g = fhg1Var2;
        this.f = z;
        this.h = fhg1Var3;
        this.i = xu30Var;
        this.b = m5e1Var;
    }
}
