package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ye6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye6(float f, Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = f;
        this.c = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        int i;
        Uri m231Var;
        byte b = this.a;
        h2c h2cVar = h2c.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        float f = this.b;
        rih1 rih1Var = rih1.a;
        boolean z2 = true;
        Object obj4 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int iIntValue = ((Number) obj).intValue();
                x340 x340Var = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    ue6 ue6Var = (ue6) obj4;
                    boolean zD = x340Var2.d(f);
                    Object objT = x340Var2.T();
                    if (zD || objT == fkj0.X) {
                        objT = new jc5((byte) 2, f);
                        x340Var2.s0(objT);
                    }
                    vgo1.c(ue6Var, iIntValue, i541.C(nim0Var, (iu30) objT), x340Var2, (iIntValue2 << 3) & 112);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                qim0 qim0VarZ = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(-2017996080);
                if (p3v.c(f, 0.0f)) {
                    z = false;
                } else {
                    if (((er00) obj4) instanceof dr00) {
                        z = false;
                        x340Var3.i0(2030988009);
                        z2 = true ^ upo1.z(x340Var3);
                    } else {
                        x340Var3.i0(-1463922152);
                        z = false;
                    }
                    x340Var3.r(z);
                    if (z2) {
                        qim0VarZ = uyn1.z(f, 0.0f, 2, qim0VarZ);
                    }
                }
                x340Var3.r(z);
                return qim0VarZ;
            case 2:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                String strO0 = cwl1.o0(x340Var4, 2131963227);
                String strO1 = cwl1.o0(x340Var4, 2131960759);
                ynv ynvVar = (ynv) obj4;
                x340 x340Var5 = x340Var4;
                boolean zI = x340Var5.i(ynvVar);
                Object objT2 = x340Var5.T();
                if (zI || objT2 == fkj0.X) {
                    objT2 = new v7v(ynvVar, (byte) 6);
                    x340Var5.s0(objT2);
                }
                myo1.d(strO0, strO1, (Function0) objT2, anm1.N("edit_button", u291.x(0.0f, f, 1, nim0Var)), null, x340Var5, 0, 16);
                return rih1Var;
            case 3:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    fra fraVar = een.N0;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarB = uyn1.B(u291.f(nim0Var2, 1.0f), 0.0f, 0.0f, this.b, 0.0f, 11);
                    zzz0 zzz0Var = (zzz0) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var7, 48);
                    int iHashCode = Long.hashCode(x340Var7.T);
                    xos0 xos0VarM = x340Var7.m();
                    qim0 qim0VarE = zr7.E(x340Var7, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var7.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var7.m0();
                    if (x340Var7.S) {
                        x340Var7.l(n4kVar);
                    } else {
                        x340Var7.v0();
                    }
                    nko1.H(jw31VarA, x340Var7, y580.O0);
                    nko1.H(xos0VarM, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE, x340Var7, y580.Y);
                    List list = zzz0Var.m;
                    String str = zzz0Var.d;
                    if (list.contains(ell.d)) {
                        i = 1;
                    } else {
                        i = list.contains(ell.b) ? 2 : 0;
                    }
                    if (i == 0) {
                        x340Var7.i0(-1911703531);
                        x340Var7.r(false);
                    } else {
                        x340Var7.i0(-1911703530);
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var7).b;
                        kqn1.d(i, 0, 0, x340Var7, uyn1.B(nim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                        x340Var7.r(false);
                    }
                    String strO2 = cwl1.o0(x340Var7, 2131960870);
                    x340Var7.i0(-200200282);
                    StringBuilder sb = new StringBuilder();
                    if (x340Var7.k(t4k.n) == flb0.a) {
                        sb.append(strO2);
                        if (!ihc1.y0(str)) {
                            sb.append(" • ");
                            sb.append(str);
                        }
                    } else {
                        if (!ihc1.y0(str)) {
                            sb.append(str);
                            sb.append(" • ");
                        }
                        sb.append(strO2);
                    }
                    String string = sb.toString();
                    x340Var7.r(false);
                    uwo1.e(string, new wnb0(1.0f, true), null, 0L, null, null, 2, false, new zic0(1), 0, null, x340Var7, 1572864, 0, 1724);
                    x340Var7.r(true);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 4:
                q5t0 q5t0VarH = ((afh0) obj2).H(((hjl) obj3).a);
                return ((ifh0) obj).S(q5t0VarH.a, jch0.U(q5t0VarH.b * f), b7x.a, new ulf0(q5t0VarH, f, (flb0) obj4, (byte) 0));
            case 5:
                i2c i2cVar = (i2c) obj;
                x340 x340Var8 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                ve8 ve8Var = (ve8) obj4;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var8.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var9 = x340Var8;
                if (!x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x340Var9.b0();
                } else if (p3v.b(i2cVar.c(), f) >= 0) {
                    x340Var9.i0(-435264022);
                    yj41 yj41Var = (yj41) ve8Var.d;
                    boolean zG = x340Var9.g(yj41Var);
                    Object objT3 = x340Var9.T();
                    if (zG || objT3 == fkj0.X) {
                        objT3 = new yk4(yj41Var.a);
                        x340Var9.s0(objT3);
                    }
                    ksl kslVarA = yj41Var.a();
                    h6m h6mVar = mif1.Q0;
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var9).f;
                    cua cuaVar2 = cbx.b(x340Var9).f;
                    eso1.f((yk4) objT3, kslVarA, uyn1.B(d7e.r(2.8796296f, u291.f(nim0Var, 1.0f), false), 0.0f, 0.0f, 0.0f, 20.0f, 7), (p3v) null, new zvx(), (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, x340Var9, 1573248, 424);
                    x340Var9.r(false);
                } else {
                    x340Var9.i0(-434764302);
                    x340Var9.r(false);
                }
                return rih1Var;
            case 6:
                ((Number) obj3).intValue();
                x340 x340Var10 = (b0k) obj2;
                x340Var10.i0(839257582);
                fe5 fe5Var = (fe5) obj4;
                qim0 qim0VarX = j9k1.x((qim0) obj, new u6t0(((p3v) z95.a(this.b, fe5Var, (String) null, x340Var10, 0, 12).getValue()).a, ((p3v) z95.a(0.0f, fe5Var, (String) null, x340Var10, 0, 12).getValue()).a, (byte) 0));
                x340Var10.r(false);
                return qim0VarX;
            case 7:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    a9t0 a9t0Var = (a9t0) obj4;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM2 = x340Var12.m();
                    qim0 qim0VarE2 = zr7.E(x340Var12, nim0Var);
                    hzj.A.getClass();
                    if (x340Var12.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    nko1.H(gfh0VarC, x340Var12, y580.O0);
                    nko1.H(xos0VarM2, x340Var12, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var12, y580.R0);
                    nko1.F(x340Var12);
                    nko1.H(qim0VarE2, x340Var12, y580.Y);
                    zxo1.j(a9t0Var.d, a9t0Var.b, a9t0Var.c, this.b, null, x340Var12, 0);
                    x340Var12.r(true);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var13 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarR = d7e.r(1.5f, u291.f(nim0Var, 1.0f), false);
                syv0 syv0Var = (syv0) obj4;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var14 = x340Var13;
                int iHashCode3 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM3 = x340Var14.m();
                qim0 qim0VarE3 = zr7.E(x340Var13, qim0VarR);
                hzj.A.getClass();
                x340 x340Var15 = x340Var13;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC2, x340Var13, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var13, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var13, lljVar3);
                nko1.F(x340Var13);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var13, lljVar4);
                cso1.d(Uri.parse(syv0Var.c), new jsl(cwl1.o0(x340Var13, 2131963497)), u291.d(anm1.N("album-art-view", nim0Var), 1.0f), null, null, null, null, x340Var13, 0, 248);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarX2 = uyn1.x(dug.f(qim0VarD, ((vex) zex.a.e).c, d4o1.a), f);
                mbh mbhVarA = jbh.a(h36.g, een.P0, x340Var13, 0);
                int iHashCode4 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM4 = x340Var15.m();
                qim0 qim0VarE4 = zr7.E(x340Var13, qim0VarX2);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(mbhVarA, x340Var13, lljVar);
                nko1.H(xos0VarM4, x340Var13, lljVar2);
                i3a.l(iHashCode4, x340Var13, lljVar3, x340Var13);
                nko1.H(qim0VarE4, x340Var13, lljVar4);
                uwo1.e(cwl1.o0(x340Var13, 2131961035), anm1.N("card-title-view", nim0Var), lee1.a(cbx.d(x340Var13).h, cbx.a(x340Var13).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var13, 0, 0, 1720);
                gfx.g(18, apo.r(421735002, new t1t0(syv0Var, (byte) 27), x340Var13), x340Var13, 54);
                x340Var15.r(true);
                x340Var15.r(true);
                return rih1Var;
            case 9:
                Function0 function0 = (Function0) obj;
                x340 x340Var16 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= x340Var16.i(function0) ? 4 : 2;
                }
                x340 x340Var17 = x340Var16;
                if (!x340Var17.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x340Var17.b0();
                } else if (((Boolean) ((tob1) obj4).getValue()).booleanValue()) {
                    x340Var17.i0(403018271);
                    qim0 qim0VarD2 = eqr0.D(0.0f, f, 1, h2cVar.a(nim0Var, een.f));
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM5 = x340Var17.m();
                    qim0 qim0VarE5 = zr7.E(x340Var17, qim0VarD2);
                    hzj.A.getClass();
                    if (x340Var17.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var17, y580.O0);
                    nko1.H(xos0VarM5, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE5, x340Var17, y580.Y);
                    y251.d(((iIntValue6 << 3) & 112) | 6, function0, x340Var17, true);
                    x340Var17.r(true);
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(403206627);
                    x340Var17.r(false);
                }
                return rih1Var;
            case 10:
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                Context context = (Context) obj4;
                p05 p05Var = new p05(p3v.b(f, 180.0f) > 0 ? 2131233396 : 2131233393);
                String string2 = context.getString(2131959288);
                x340 x340Var19 = x340Var18;
                boolean zD2 = x340Var19.d(f);
                Object objT4 = x340Var19.T();
                if (zD2 || objT4 == m4cVar) {
                    objT4 = new vbk0((byte) 20, f);
                    x340Var19.s0(objT4);
                }
                et40 et40Var = et40.a;
                yoi1.d(p05Var, string2, iko1.x(et40Var, (iu30) objT4), 0, (u8h) null, x340Var19, 0, 24);
                String string3 = context.getString(2131955164);
                kee1 kee1Var = nee1.f;
                o4p1.g(string3, eqr0.F(et40Var, 4.0f, 0.0f), kee1Var, 0, x340Var19, 0, 8);
                String string4 = context.getString(2131959297);
                Object objT5 = x340Var19.T();
                if (objT5 == m4cVar) {
                    objT5 = er81.t;
                    x340Var19.s0(objT5);
                }
                o4p1.g(string4, iko1.x(et40Var, (iu30) objT5), kee1Var, 1, x340Var19, 3072, 0);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var20 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    qim0 qim0VarB2 = uyn1.B(u291.f(nim0Var, 1.0f), this.b, 0.0f, 0.0f, 0.0f, 14);
                    xu30 xu30Var = (xu30) obj4;
                    gfh0 gfh0VarC4 = t1c.c(een.d, false);
                    int iHashCode6 = Long.hashCode(x340Var21.T);
                    xos0 xos0VarM6 = x340Var21.m();
                    qim0 qim0VarE6 = zr7.E(x340Var21, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var21.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var21.m0();
                    if (x340Var21.S) {
                        x340Var21.l(n4kVar);
                    } else {
                        x340Var21.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var21, y580.O0);
                    nko1.H(xos0VarM6, x340Var21, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode6), x340Var21, y580.R0);
                    nko1.F(x340Var21);
                    nko1.H(qim0VarE6, x340Var21, y580.Y);
                    hrt.k(6, xu30Var, h2cVar, x340Var21, true);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var22 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarQ = i1p1.q(u291.r(nim0Var, f), er31.a);
                y8f1 y8f1Var = (y8f1) obj4;
                gfh0 gfh0VarC5 = t1c.c(een.d, false);
                x340 x340Var23 = x340Var22;
                int iHashCode7 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM7 = x340Var23.m();
                qim0 qim0VarE7 = zr7.E(x340Var22, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var24 = x340Var22;
                if (x340Var24.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var24.m0();
                if (x340Var24.S) {
                    x340Var24.l(n4kVar);
                } else {
                    x340Var24.v0();
                }
                nko1.H(gfh0VarC5, x340Var22, y580.O0);
                nko1.H(xos0VarM7, x340Var22, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var22, y580.R0);
                nko1.F(x340Var22);
                nko1.H(qim0VarE7, x340Var22, y580.Y);
                try {
                    m231Var = Uri.parse(y8f1Var.d);
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Uri uri = m231Var instanceof m231 ? null : m231Var;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                nkx nkxVar = nkx.c;
                nux nuxVar = new nux(nkxVar, nkxVar);
                cbx.a.getClass();
                eso1.e(uri, isl.a, (qim0) null, new p3v(f), (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var22, 1073766448, 0, 3524);
                x340Var24.r(true);
                return rih1Var;
            default:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var25 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var25.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var26 = x340Var25;
                if (!x340Var26.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x340Var26.b0();
                } else if (p3v.b(i2cVar2.c(), 48.0f) >= 0) {
                    x340Var26.i0(1717675085);
                    cwl1.g((yk4) obj4, (String) null, d7e.r(1.0f, u291.i(nim0Var, 48.0f, f), true), mif1.P0, 0, x340Var26, 24624, 232);
                    x340Var26.r(false);
                } else {
                    x340Var26.i0(1717948195);
                    x340Var26.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye6(Object obj, float f, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = f;
    }
}
