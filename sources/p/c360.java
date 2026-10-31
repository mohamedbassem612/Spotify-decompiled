package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c360 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c360(float f, sdd0 sdd0Var, boolean z, tdd0 tdd0Var, boolean z2, ven0 ven0Var) {
        super(2);
        this.b = f;
        this.e = sdd0Var;
        this.c = z;
        this.f = tdd0Var;
        this.d = z2;
        this.g = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        float f;
        boolean z;
        qim0 qim0Var;
        boolean z2;
        qbe1 rbe1Var;
        x340 x340Var;
        ArrayList arrayList;
        boolean z3;
        byte b = this.a;
        byte b2 = 14;
        float f2 = this.b;
        boolean z4 = this.d;
        qim0 qim0Var2 = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.e;
        Object obj5 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                gho1.c(this.c, this.d, this.b, (j2i) obj4, (j2i) obj5, (qim0) obj3, (b0k) obj, czo1.p(224257));
                return rih1Var;
            case 1:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                sdd0 sdd0Var = (sdd0) obj4;
                xdd0 xdd0Var = sdd0Var.h;
                x340 x340Var3 = x340Var2;
                boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var3.a;
                if (!zY) {
                    x340Var3.b0();
                    return rih1Var;
                }
                qim0 qim0VarH = l6o1.H(bmq0.L(u291.j(0.0f, f2, 1, qim0Var2), k1o1.q(x340Var3), (g6o0) null), l6o1.C(0, 0, 1, x340Var3), false, 14);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarY = voo1.y(x0d.p(lhc.g(x340Var3).g, 32, qim0VarH), voo1.f);
                hgd0 hgd0Var = sdd0Var.k;
                if (!xdd0Var.g || hgd0Var.h()) {
                    x340Var3.i0(1778846504);
                    x340Var3.r(false);
                    f = 0.0f;
                } else {
                    x340Var3.i0(1778845517);
                    uwr uwrVar = cbx.a;
                    float f3 = cbx.b(x340Var3).b.e;
                    x340Var3.r(false);
                    f = f3;
                }
                qim0 qim0VarB = uyn1.B(qim0VarY, 0.0f, 0.0f, 0.0f, f, 7);
                tdd0 tdd0Var = (tdd0) obj5;
                String str = tdd0Var.a;
                tob1 tob1Var = (tob1) obj3;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                boolean z5 = x340Var3.S;
                n4k n4kVar = hmb0.t1;
                if (z5) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, x340Var3, lljVar4);
                nko1.H(xos0VarM, x340Var3, lljVar3);
                x0d.q(iHashCode, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE, x340Var3, lljVar);
                boolean z6 = this.c;
                boolean z7 = !z6;
                bby bbyVarA = xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15));
                ln00 ln00VarA = xay.f(3, (ni20) null).a(xay.l(15, (ni20) null));
                j2i j2iVarR = apo.r(92649464, new h6a0(sdd0Var, tdd0Var, (byte) 10), x340Var3);
                pbh pbhVar = pbh.a;
                fq7.b(pbhVar, z7, (qim0) null, bbyVarA, ln00VarA, (String) null, j2iVarR, x340Var3, 1572870, 18);
                x340 x340Var4 = x340Var3;
                boolean z8 = xdd0Var.g;
                z201 z201Var = sdd0Var.i;
                if (z8) {
                    x340Var4.i0(251148338);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(250862921);
                    fq7.b(pbhVar, z7, (qim0) null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), (String) null, apo.r(219014013, new qdd0(tob1Var, (byte) 0), x340Var4), x340Var4, 1572870, 18);
                    x340Var4.r(false);
                }
                String str2 = xdd0Var.b;
                if (str2 == null || ihc1.y0(str2)) {
                    z = z7;
                    x340Var4.i0(253948754);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(251453037);
                    fq7.b(pbhVar, z7, (qim0) null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), (String) null, apo.r(-371806362, new rdd0(sdd0Var, (byte) 0), x340Var4), x340Var4, 1572870, 18);
                    z = z7;
                    fq7.b(pbhVar, z6, (qim0) null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), (String) null, apo.r(-94711025, new rdd0(sdd0Var, (byte) 1), x340Var4), x340Var4, 1572870, 18);
                    x340Var4.r(false);
                }
                if (ihc1.y0(str) || str2 == null || ihc1.y0(str2)) {
                    x340Var4.i0(256521010);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(254166560);
                    if (z8) {
                        x340Var4.i0(254166095);
                        if (hgd0Var.h()) {
                            x340Var4.i0(254235876);
                            List list = scd0.a;
                            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(new w630((String) it.next()));
                            }
                            fq7.b(pbhVar, z, (qim0) null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), (String) null, apo.r(283246479, new cy00(sdd0Var, tdd0Var, arrayList2, (byte) 23), x340Var4), x340Var4, 1572870, 18);
                            z3 = false;
                            x340Var4.r(false);
                        } else {
                            z3 = false;
                            x340Var4.i0(255141138);
                            x340Var4.r(false);
                        }
                        x340Var4.r(z3);
                    } else {
                        boolean z9 = z;
                        x340Var4.i0(255201247);
                        boolean zE = hgd0Var.e();
                        if (zE) {
                            x340Var4.i0(255339941);
                            Object objT = x340Var4.T();
                            if (objT == m4cVar) {
                                objT = z201Var.a((String) null);
                                x340Var4.s0(objT);
                            }
                            ven0 ven0VarG = rwq.g((mr20) objT, z201.b, null, x340Var4, 0, 2);
                            x340Var = x340Var4;
                            c380 c380Var = (c380) ven0VarG.getValue();
                            arrayList = new ArrayList(q7h.U(c380Var, 10));
                            Iterator it2 = c380Var.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new myz0(((s201) it2.next()).a));
                            }
                            x340Var.r(false);
                        } else {
                            x340Var = x340Var4;
                            x340Var.i0(255638161);
                            x340Var.r(false);
                            List list2 = scd0.a;
                            arrayList = new ArrayList(q7h.U(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(new myz0((String) it3.next()));
                            }
                        }
                        x340 x340Var5 = x340Var;
                        fq7.b(pbhVar, z9, (qim0) null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), (String) null, apo.r(-622254687, new tf((Object) sdd0Var, (Object) tdd0Var, zE, (Object) arrayList, (byte) 16), x340Var), x340Var5, 1572870, 18);
                        x340Var4 = x340Var5;
                        z3 = false;
                        x340Var4.r(false);
                    }
                    x340Var4.r(z3);
                }
                if (z4) {
                    x340Var4.i0(256571974);
                    String str3 = xdd0Var.h;
                    if (str3 != null) {
                        rbe1Var = new qbe1(str3);
                    } else {
                        String str4 = tdd0Var.b;
                        if (str4 == null) {
                            str4 = str;
                        }
                        rbe1Var = new rbe1(str4);
                    }
                    vbe1 vbe1Var = sdd0Var.g;
                    tbe1 tbe1Var = new tbe1(str, str2, xdd0Var.f, rbe1Var);
                    qim0Var = qim0Var2;
                    otw.c(vbe1Var, tbe1Var, u291.j(0.0f, f2, 1, qim0Var), (ipb1) null, x340Var4, 0, 8);
                    x340Var4.r(false);
                } else {
                    qim0Var = qim0Var2;
                    x340Var4.i0(257198546);
                    x340Var4.r(false);
                }
                if (z8 == 0) {
                    x340Var4.i0(257272977);
                    Object objT2 = x340Var4.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var4);
                        x340Var4.s0(objT2);
                    }
                    c9n c9nVar = (c9n) objT2;
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    mta mtaVar = cbx.b(x340Var4).d;
                    qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarF);
                    boolean zI = x340Var4.i(c9nVar) | x340Var4.i(sdd0Var) | x340Var4.g(tdd0Var);
                    Object objT3 = x340Var4.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new dt90(c9nVar, sdd0Var, tdd0Var, (byte) 9);
                        x340Var4.s0(objT3);
                    }
                    qim0 qim0VarX = bin.x(qim0VarJ, false, null, null, null, (Function0) objT3, 15);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM2 = x340Var4.m();
                    qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarX);
                    hzj.A.getClass();
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, lljVar4);
                    nko1.H(xos0VarM2, x340Var4, lljVar3);
                    x0d.q(iHashCode2, x340Var4, lljVar2, x340Var4);
                    nko1.H(qim0VarE2, x340Var4, lljVar);
                    uwo1.e(cwl1.o0(x340Var4, 2131957395), null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                    z2 = true;
                    x340Var4.r(true);
                    x340Var4.r(false);
                } else {
                    z2 = true;
                    x340Var4.i0(258288754);
                    x340Var4.r(false);
                }
                x340Var4.r(z2);
                return rih1Var;
            default:
                x340 x340Var6 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                bmf0 bmf0Var = (bmf0) obj5;
                ven0 ven0Var = (ven0) obj4;
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var7.i0(849621767);
                    qim0 qim0VarN = anm1.N("#LyricsTranslationLoadingTag", qim0Var2);
                    Object objT4 = x340Var7.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT4 == m4cVar2) {
                        objT4 = klf0.c;
                        x340Var7.s0(objT4);
                    }
                    qim0 qim0VarF2 = u291.f(s161.b(qim0VarN, false, (iu30) objT4), 1.0f);
                    Function0 function0 = (Function0) obj3;
                    if (this.c) {
                        flb0 flb0Var = (flb0) x340Var7.k(t4k.n);
                        d261 d261Var = wlf0.a;
                        qim0VarF2 = qim0VarF2.then(z4 ? j9k1.x(qim0Var2, new h6a0(function0, flb0Var, (byte) 20)) : j9k1.x(qim0Var2, new ye6(((Number) function0.invoke()).floatValue(), (Object) flb0Var, (byte) 4)));
                    }
                    x340Var7.r(false);
                    y9e1 y9e1Var = (y9e1) ven0Var.getValue();
                    d261 d261Var2 = wlf0.a;
                    qim0 qim0VarI = zr7.i(qim0VarF2, new k2d0(y9e1Var, (byte) 29));
                    String str5 = bmf0Var.e;
                    if (str5.length() == 0) {
                        str5 = bmf0Var.b;
                    }
                    long j = u7h.j;
                    uwr uwrVar3 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var7).g;
                    long j2 = cbx.d(x340Var7).g.a.b;
                    fc11.o(j2);
                    lee1 lee1VarA = lee1.a(lee1Var, 0L, fc11.Y(TextUnit.c(j2) * f2, 1095216660480L & j2), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                    a0e1 a0e1Var = new a0e1(bmf0Var.d);
                    Object objT5 = x340Var7.T();
                    if (objT5 == m4cVar2) {
                        objT5 = new sqa0(ven0Var, b2);
                        x340Var7.s0(objT5);
                    }
                    uwo1.e(str5, qim0VarI, lee1VarA, j, a0e1Var, (iu30) objT5, 0, false, null, 0, null, x340Var7, 199680, 0, 1984);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c360(boolean z, ven0 ven0Var, bmf0 bmf0Var, float f, Function0 function0, boolean z2) {
        super(2);
        this.c = z;
        this.e = ven0Var;
        this.f = bmf0Var;
        this.b = f;
        this.g = function0;
        this.d = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c360(boolean z, boolean z2, float f, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, int i) {
        super(2);
        this.c = z;
        this.d = z2;
        this.b = f;
        this.e = j2iVar;
        this.f = j2iVar2;
        this.g = qim0Var;
    }
}
