package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Parcelable;
import android.text.Annotation;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.URLSpan;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.base.java.logging.Logger;
import com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity;
import com.spotify.mobius.Next;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wyo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(List list, iu30 iu30Var, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        List list2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        h311 h311VarV;
        r40 r40Var;
        float f;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-241030435);
        int i2 = i | (x340Var.i(list) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zIsEmpty = list.isEmpty();
            qim0 qim0Var3 = nim0.a;
            if (!zIsEmpty || z) {
                list2 = list;
                iu30Var2 = iu30Var;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                zzq0 zzq0VarJ = uyn1.j(16.0f, 0.0f, 16.0f, 0.0f, 10);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                if (list2.isEmpty()) {
                    x340Var.i0(-1252960954);
                    qim0 qim0VarN = anm1.N("action_chips_row", qim0Var3);
                    Object objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = ft.h;
                        x340Var.s0(objT);
                    }
                    f = 0.0f;
                    too1.b(qim0VarN, null, zzq0VarJ, (iu30) objT, x340Var, 3078, 2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1252204864);
                    qim0 qim0VarN2 = anm1.N("action_chips_row", qim0Var3);
                    boolean zI = x340Var.i(list2) | ((i2 & 112) == 32);
                    Object objT2 = x340Var.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new v40(list2, iu30Var2, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    f = 0.0f;
                    too1.b(qim0VarN2, null, zzq0VarJ, (iu30) objT2, x340Var, 6, 2);
                    x340Var.r(false);
                }
                cvx cvxVar3 = cbx.b(x340Var).b;
                cvx cvxVar4 = ywx0.k(qim0Var3, 16.0f, x340Var, x340Var).b;
                rqo1.g(0, 0, x340Var, uyn1.z(16.0f, f, 2, qim0Var3));
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    r40Var = new r40(list, iu30Var, qim0Var3, z, i, (byte) 0);
                }
            }
            h311VarV.d = r40Var;
        }
        list2 = list;
        iu30Var2 = iu30Var;
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            r40Var = new r40(list2, iu30Var2, qim0Var2, z, i, (byte) 1);
            h311VarV.d = r40Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v31 */
    public static final void b(boolean z, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1143150329);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = voo1.y(uyn1.z(36.0f, 0.0f, 2, l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14)), voo1.g);
            mbh mbhVarA = jbh.a(h36.g, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            pbh pbhVar = pbh.a;
            op71.g(x340Var, pbhVar.a(1.0f, nim0Var, true));
            w0h1.a(cnx.c, isl.a, u291.r(uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 24.0f, 7), 70.0f), 0L, 0L, false, x340Var, cnx.d | 48, 56);
            String strO0 = cwl1.o0(x340Var, 2131953901);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            uwo1.e(cwl1.o0(x340Var, 2131953900), uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 32.0f, 7), cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            String strO1 = cwl1.o0(x340Var, 2131953891);
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO1), function0), new idx(4), null, null, null, null, null, null, null, null, apo.r(1766796590, new j3b(strO1, (byte) 25), x340Var), x340Var, 0, 48, 2044);
            boolean z2 = true;
            op71.g(x340Var, pbhVar.a(1.0f, nim0Var, true));
            String string = context.getString(z ? 2131953899 : 2131953892, "");
            long j = cbx.a(x340Var).b.c;
            Spanned spannedFromHtml = Html.fromHtml(string, 63);
            ye5 ye5VarO = kk0.o(785625344, x340Var);
            ye5VarO.g(spannedFromHtml.toString());
            x340Var.i0(785632966);
            ?? r11 = 0;
            Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), URLSpan.class);
            int length = spans.length;
            int i3 = 0;
            while (i3 < length) {
                URLSpan uRLSpan = (URLSpan) spans[i3];
                int spanStart = spannedFromHtml.getSpanStart(uRLSpan);
                int spanEnd = spannedFromHtml.getSpanEnd(uRLSpan);
                long j2 = j;
                ye5VarO.d(new zma1(j2, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65530), spanStart, spanEnd);
                ?? r6 = ((((i2 & 896) ^ 384) <= 256 || !x340Var.g(function1)) && (i2 & 384) != 256) ? r11 : z2;
                Object objT = x340Var.T();
                if (r6 != 0 || objT == fkj0.X) {
                    objT = new nbg(function1, r11);
                    x340Var.s0(objT);
                }
                ye5VarO.a(new kjc0("cancel_subscription", (pae1) null, (rjc0) objT), spanStart, spanEnd);
                i3++;
                j = j2;
                z2 = true;
                r11 = 0;
            }
            x340Var.r((boolean) r11);
            af5 af5VarP = ye5VarO.p();
            x340Var.r((boolean) r11);
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 14.0f, 7);
            uwr uwrVar2 = cbx.a;
            uwo1.d(af5VarP, cbx.a(x340Var).b.b, qim0VarB, cbx.d(x340Var).j, new a0e1(3), null, 0, false, null, 0, null, dqs0.e, x340Var, 0, 48, 2016);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lf2(z, function0, function1, i, (byte) 2);
        }
    }

    public static final void c(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1979465001);
        int i2 = ((i & 6) == 0 ? (x340Var.i(iu30Var) ? 4 : 2) | i : i) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM = xvj1.m();
                new ArrayList();
                CharSequence text = context.getResources().getText(2131960963);
                sb.append(text.toString());
                if (text instanceof SpannedString) {
                    SpannedString spannedString = (SpannedString) text;
                    Annotation[] annotationArr = (Annotation[]) spannedString.getSpans(0, spannedString.length(), Annotation.class);
                    annotationArr.getClass();
                    for (Annotation annotation : annotationArr) {
                        if (u890.j(annotation.getKey(), "style") && u890.j(annotation.getValue(), "boldWhite")) {
                            arrayListM.add(new xe5(spannedString.getSpanStart(annotation), spannedString.getSpanEnd(annotation), 8, new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531), (String) null));
                        }
                    }
                }
                String string = sb.toString();
                ArrayList arrayList = new ArrayList(arrayListM.size());
                for (int iG = 0; iG < arrayListM.size(); iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                }
                objT = new af5(string, arrayList);
                x340Var.s0(objT);
            }
            af5 af5Var = (af5) objT;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("DSA_BANNER_ELEMENT_TEST_TAG", qim0Var3), 1.0f);
            boolean z = (i2 & 14) == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new qzn(iu30Var, (byte) 12);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT2, 15);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            eox eoxVar = eox.c;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(eoxVar, isl.a, u291.r(qim0Var3, 24.0f), j, 0L, false, x340Var, eox.d | 48, 48);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.d(af5Var, cbx.a(x340Var).b.b, anm1.N("dsa_banner_title", qim0Var3), kk0.p(qim0Var3, 12.0f, x340Var, x340Var).j, null, null, 0, false, null, 0, null, null, x340Var, 390, 0, 4080);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, (byte) 5);
        }
    }

    public static final void d(c311 c311Var, ufd ufdVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        c311 c311Var2 = c311Var;
        ufd ufdVar2 = ufdVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-898108867);
        if ((i & 6) == 0) {
            i2 = i | (b0kVar3.g(c311Var2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(ufdVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarB);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            cvx cvxVar5 = cbx.b(b0kVar3).b;
            qim0 qim0VarA = uyn1.A(qim0Var3, 16.0f, 12.0f, 16.0f, 12.0f);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = t011.R0;
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.e(cwl1.o0(b0kVar3, 2131960977), s161.b(qim0VarA, false, (iu30) objT), cbx.d(b0kVar3).e, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2040);
            cvx cvxVar6 = cbx.b(b0kVar2).b;
            lex lexVarW = z0o1.w(b0kVar2);
            float f = ((Configuration) b0kVar2.k(AndroidCompositionLocals_androidKt.a)).fontScale;
            wat watVar = (wat) b0kVar2.k(t4k.h);
            long j = lexVarW.e.a.b;
            fc11.o(j);
            qim0 qim0VarS = exd0.s(u291.f(u291.h(qim0Var3, (pap1.y(new p3v(lexVarW.b), new p3v((lexVarW.a.c * 2.0f) + watVar.y(fc11.Y(TextUnit.c(j) * f, 1095216660480L & j)))).a * 2.0f) + 12.0f), 1.0f), new qf0(cbx.a(b0kVar2).a.c, cbx.b(b0kVar2).b.a, (byte) 4));
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = t011.S0;
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarS, false, (iu30) objT2);
            hab1 hab1Var = new hab1();
            cvx cvxVar7 = cbx.b(b0kVar2).b;
            cvx cvxVar8 = cbx.b(b0kVar2).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            d36 d36Var = new d36(12.0f, true, new um5(false));
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT3 = b0kVar2.T();
            if (z || objT3 == m4cVar) {
                c311Var2 = c311Var;
                ufdVar2 = ufdVar;
                objT3 = new nt01(c311Var2, ufdVar2, (byte) 3);
                b0kVar2.s0(objT3);
            } else {
                c311Var2 = c311Var;
                ufdVar2 = ufdVar;
            }
            boo1.e(hab1Var, qim0VarB2, null, zzq0VarH, d36Var, 8.0f, null, false, null, (iu30) objT3, b0kVar2, 0);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(c311Var2, ufdVar2, qim0Var2, i, (byte) 19);
        }
    }

    public static final void e(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        float fM0;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(483260051);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarB, jA, er31.b(16.0f));
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new pt61(function0, (byte) 6);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT2;
            float f = cbx.b(x340Var).b.a;
            af5 af5VarV = fuo1.v(cwl1.n0(2131962291, new Object[]{str}, x340Var), new e930(cbx.d(x340Var).k.a.f, new u7h(cbx.a(x340Var).b.a)));
            long j = cbx.a(x340Var).b.b;
            lee1 lee1Var = cbx.d(x340Var).j;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            float f2 = cbx.b(x340Var).b.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(wnb0Var, f2, f, 6.0f, f);
            boolean zI = x340Var.i(err0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new myg0(err0Var, (byte) 24);
                x340Var.s0(objT3);
            }
            uwo1.d(af5VarV, j, ern1.x(qim0VarA, (iu30) objT3), lee1Var, null, null, 0, false, null, 0, null, null, x340Var, 0, 0, 4080);
            x340Var = x340Var;
            err0 err0Var2 = err0Var;
            if (err0Var2.s() == 0) {
                x340Var.i0(282918970);
                x340Var.r(false);
                fM0 = Float.NaN;
            } else {
                x340Var.i0(282920026);
                fM0 = ((wat) x340Var.k(t4k.h)).M0(err0Var2.s()) + (f * 2.0f);
                x340Var.r(false);
            }
            qim0 qim0VarS = u291.s(qim0Var3, 80.0f, fM0);
            cua cuaVar2 = cbx.b(x340Var).f;
            cua cuaVar3 = cbx.b(x340Var).f;
            qim0 qim0VarThen = i1p1.q(qim0VarS, er31.d(0.0f, 16.0f, 16.0f, 0.0f, 9)).then(new i5j1(een.N0));
            gra graVar = een.g;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarThen);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cwl1.f(i3o1.n(2131233907, x340Var, 0), (String) null, (qim0) null, graVar, mif1.U0, 0.0f, (ColorFilter) null, x340Var, 56, 100);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var2, i, (byte) 21);
        }
    }

    public static final void f(float f, int i, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(516924744);
        int i2 = (x340Var.d(32.0f) ? 32 : 16) | i | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = u291.s(qim0Var3, f, 32.0f);
            cr31 cr31Var = er31.a;
            cwl1.b(cwl1.l0(qim0VarS, 0L, cr31Var, 13), (tl3) null, cr31Var, ogx.e, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, b3i.c, x340Var, 3072, 48, 2034);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(f, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25 */
    public static final void g(wzi1 wzi1Var, iuq iuqVar, juq juqVar, kuq kuqVar, jtl1 jtl1Var, boolean z, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var;
        yaq0 yaq0Var;
        ?? r2;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-854274686);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(wzi1Var) ? 4 : 2) | (x340Var2.g(iuqVar) ? 32 : 16) | (x340Var2.g(juqVar) ? 256 : 128) | (x340Var2.i(kuqVar) ? 2048 : 1024) | (x340Var2.i(jtl1Var) ? 16384 : 8192) | (x340Var2.h(z4) ? 131072 : 65536) | (x340Var2.i(qim0Var) ? 1048576 : 524288) | (x340Var2.i(iu30Var2) ? 8388608 : 4194304);
        if (x340Var2.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            uzi1 uzi1Var = null;
            htl1 htl1Var = (htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var2, 7).getValue();
            boolean z5 = u890.j(htl1Var != null ? htl1Var.b : null, brl1.b) || (wzi1Var instanceof vzi1);
            boolean z6 = wzi1Var instanceof uzi1;
            if (z6) {
                uzi1Var = (uzi1) wzi1Var;
            }
            yaq0 yaq0Var2 = uzi1Var != null ? uzi1Var.d : uzi1Var;
            era eraVar = een.P0;
            b36 b36Var = h36.c;
            mbh mbhVarA = jbh.a(b36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw 0;
            }
            x340Var2.m0();
            boolean z7 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            boolean z8 = z5;
            qim0 qim0VarH = l6o1.H(new wnb0(1.0f, true), l6o1.C(0, 0, 1, x340Var2), false, 14);
            mbh mbhVarA2 = jbh.a(z8 ? h36.e : b36Var, een.Q0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            nim0 nim0Var = nim0.a;
            if (z6) {
                x340Var2.i0(1236049498);
                uzi1 uzi1Var2 = (uzi1) wzi1Var;
                if (uzi1Var2.a == tzi1.b) {
                    x340Var2.i0(-337156437);
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        iu30Var2 = iu30Var;
                        uyh1 uyh1Var = new uyh1(iu30Var2, (byte) 23);
                        uyh1 uyh1Var2 = new uyh1(iu30Var2, (byte) 24);
                        ceg1 ceg1Var = new ceg1(iu30Var2, (byte) 12);
                        jtl1 jtl1Var2 = (jtl1) ((b0j1) ((goq) iuqVar.a.c).g).g.get();
                        c8o.l(jtl1Var2);
                        leq0 leq0Var = new leq0(jtl1Var2, uyh1Var, uyh1Var2, ceg1Var);
                        x340Var2.s0(leq0Var);
                        objT = leq0Var;
                    } else {
                        iu30Var2 = iu30Var;
                    }
                    qim0 qim0VarN = anm1.N("firstStep", nim0Var);
                    szi1 szi1Var = uzi1Var2.b;
                    z3 = false;
                    z4 = z;
                    yaq0Var = yaq0Var2;
                    otw.c((leq0) objT, new jeq0(szi1Var.a, szi1Var.b, szi1Var.d, szi1Var.c, z), qim0VarN, (ipb1) null, x340Var2, 0, 8);
                    x340Var = x340Var2;
                    x340Var.r(false);
                    z2 = true;
                } else {
                    z4 = z;
                    iu30Var2 = iu30Var;
                    x340Var = x340Var2;
                    yaq0Var = yaq0Var2;
                    z3 = false;
                    z2 = true;
                    x340Var.i0(-336298636);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        ceg1 ceg1Var2 = new ceg1(iu30Var2, (byte) 13);
                        jtl1 jtl1Var3 = (jtl1) ((b0j1) ((goq) juqVar.a.c).g).g.get();
                        c8o.l(jtl1Var3);
                        kgq0 kgq0Var = new kgq0(jtl1Var3, ceg1Var2);
                        x340Var.s0(kgq0Var);
                        objT2 = kgq0Var;
                    }
                    qim0 qim0VarN2 = anm1.N("secondStep", nim0Var);
                    szi1 szi1Var2 = uzi1Var2.c;
                    otw.c((kgq0) objT2, new igq0(szi1Var2.a, szi1Var2.b, szi1Var2.c, z4), qim0VarN2, (ipb1) null, x340Var, 0, 8);
                    x340Var.r(false);
                }
                x340Var.r(z3);
                r2 = z3;
            } else {
                z4 = z;
                iu30Var2 = iu30Var;
                x340Var = x340Var2;
                yaq0Var = yaq0Var2;
                r2 = 0;
                z2 = true;
                if (!(wzi1Var instanceof vzi1)) {
                    throw p3d1.k(x340Var, 1236048771, false);
                }
                x340Var.i0(-335612203);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = kuqVar.a(new uyh1(iu30Var2, (byte) 25), new ceg1(iu30Var2, (byte) 14));
                    x340Var.s0(objT3);
                }
                y2j1 y2j1Var = (y2j1) objT3;
                qim0 qim0VarN3 = anm1.N("success", nim0Var);
                szi1 szi1Var3 = ((vzi1) wzi1Var).a;
                otw.c(y2j1Var, new x2j1(szi1Var3.a, szi1Var3.c, szi1Var3.b), qim0VarN3, (ipb1) null, x340Var, 72, 8);
                x340Var.r(false);
            }
            x340Var.r(z2);
            if (!z4 || yaq0Var == null) {
                x340Var.i0(87294646);
                x340Var.r((boolean) r2);
            } else {
                x340Var.i0(87119558);
                qim0 qim0VarN4 = anm1.N("onboarding_footer", nim0Var);
                ?? r5 = (i2 & 29360128) == 8388608 ? z2 : r2;
                Object objT4 = x340Var.T();
                if (r5 != 0 || objT4 == m4cVar) {
                    objT4 = new ceg1(iu30Var2, (byte) 15);
                    x340Var.s0(objT4);
                }
                yah0.h(yaq0Var, qim0VarN4, (iu30) objT4, x340Var, (int) r2);
                x340Var.r((boolean) r2);
            }
            x340Var.r(z2);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(wzi1Var, iuqVar, juqVar, kuqVar, jtl1Var, z4, qim0Var, iu30Var2, i);
        }
    }

    public static final b180 h() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.Plus24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(12.0f, 1.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        cwh0VarG.v(9.0f);
        cwh0VarG.i(9.0f);
        cwh0VarG.c(1.0f, 1.0f, true, true, 0.0f, 2.0f);
        cwh0VarG.i(-9.0f);
        cwh0VarG.v(9.0f);
        cwh0VarG.c(1.0f, 1.0f, true, true, -2.0f, 0.0f);
        cwh0VarG.v(-9.0f);
        cwh0VarG.h(2.0f);
        cwh0VarG.c(1.0f, 1.0f, true, true, 0.0f, -2.0f);
        cwh0VarG.i(9.0f);
        cwh0VarG.u(2.0f);
        cwh0VarG.c(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static final go80 i(klm klmVar, obp0 obp0Var, ubp0 ubp0Var, ubp0 ubp0Var2, ubp0 ubp0Var3, ubp0 ubp0Var4) {
        return klmVar.a("ListeningActivityPresenceDaemon", new kbp0(ubp0Var, ubp0Var2, obp0Var, ubp0Var3, ubp0Var4, (byte) 5));
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static b291 l(nhz nhzVar, String str) {
        up8 up8Var = new up8(nhzVar, str);
        int i = t380.c;
        return new b291(up8Var);
    }

    public static final tp8 m(tq8 tq8Var, wq8 wq8Var) {
        String str = tq8Var.c;
        if (str != null) {
            return new tp8(kyo1.w(wq8Var, str, Boolean.FALSE), wq8Var.c);
        }
        eg.m("Required value was null.");
        return null;
    }

    public static void n(Context context, hj70 hj70Var) {
        Intent intent = new Intent(context, (Class<?>) IPLDialogsHostActivity.class);
        intent.putExtra("notification", (Parcelable) hj70Var);
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static final z5d0 o(pp90 pp90Var) {
        Object next;
        boolean z = false;
        boolean z2 = pp90Var != null && pp90Var.h.b.e;
        String str = null;
        ArrayList arrayList = pp90Var != null ? pp90Var.c : null;
        if (arrayList == null) {
            arrayList = z6x.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((hp90) obj).f) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayListF = rwq0.F(arrayList2);
        if (pp90Var != null && pp90Var.h.b.f) {
            z = true;
        }
        if (pp90Var != null) {
            Iterator it = pp90Var.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((hp90) next).e);
            hp90 hp90Var = (hp90) next;
            if (hp90Var != null) {
                String str2 = hp90Var.b;
                if (ihc1.y0(str2)) {
                    str2 = hp90Var.c;
                }
                str = str2;
            }
        }
        if (str == null) {
            str = "";
        }
        return new z5d0(str, arrayListF, z2, z);
    }

    public static Next p(tq8 tq8Var) {
        if (!tq8Var.g || !tq8Var.h) {
            return Next.h(tq8Var);
        }
        if (tq8Var.c == null) {
            int i = t380.c;
            return Next.i(tq8Var, new b291(sp8.a));
        }
        if (!tq8Var.d) {
            return Next.h(tq8Var);
        }
        wq8 wq8Var = tq8Var.a;
        if (wq8Var == null) {
            eg.m("Required value was null.");
            return null;
        }
        sq8 sq8VarA = tq8Var.a();
        sq8VarA.d = false;
        tq8 tq8VarA = sq8VarA.a();
        tp8 tp8VarM = m(tq8Var, wq8Var);
        int i2 = t380.c;
        return Next.i(tq8VarA, new b291(tp8VarM));
    }

    public static final boolean q(Bitmap bitmap, File file) {
        Boolean m231Var;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                if (bitmap.isRecycled()) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                m231Var = Boolean.valueOf(zCompress);
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, "Couldn't write image to file \"%s\".", new Object[]{file.getAbsolutePath()});
                }
                Boolean bool = Boolean.FALSE;
                if (m231Var instanceof m231) {
                    m231Var = bool;
                }
                return m231Var.booleanValue();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            m231Var = new m231(th3);
        }
    }
}
