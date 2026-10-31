package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.Annotation;
import android.text.SpannedString;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
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
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class azo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(893876436);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131953896);
            String strO1 = cwl1.o0(x340Var, 2131953895);
            String strO2 = cwl1.o0(x340Var, 2131953893);
            String strO3 = cwl1.o0(x340Var, 2131953893);
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO2, new gbx(new y50(strO3), function0));
            String strO4 = cwl1.o0(x340Var, 2131953894);
            String strO5 = cwl1.o0(x340Var, 2131953894);
            if (ihc1.y0(strO5)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function1, null, null, strO0, strO1, zgxVar, new zgx(strO4, new gbx(new y50(strO5), function1)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 6);
        }
    }

    public static final void b(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1853031817);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            SpannedString spannedString = (SpannedString) ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getText(2131955120);
            ye5 ye5VarO = kk0.o(-239990738, x340Var);
            uwr uwrVar = cbx.a;
            int iO = ye5VarO.o(new zma1(cbx.a(x340Var).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
            try {
                ye5VarO.g(spannedString.toString());
                ye5VarO.k(iO);
                x340Var.i0(1297145228);
                for (Object obj : spannedString.getSpans(0, ye5VarO.a.length(), Annotation.class)) {
                    Annotation annotation = (Annotation) obj;
                    int spanStart = spannedString.getSpanStart(annotation);
                    int spanEnd = spannedString.getSpanEnd(annotation);
                    ye5VarO.d(new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531), spanStart, spanEnd);
                    uwr uwrVar2 = cbx.a;
                    ye5VarO.d(new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534), spanStart, spanEnd);
                }
                x340Var.r(false);
                af5 af5VarP = ye5VarO.p();
                x340Var.r(false);
                nyx.a(2, (wux) null, apo.r(2025627396, new g1o(iu30Var, af5VarP), x340Var), x340Var, 3078, 6);
                qim0Var2 = nim0.a;
            } catch (Throwable th) {
                ye5VarO.k(iO);
                throw th;
            }
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(qim0Var2, iu30Var, i, (byte) 6);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(498369725);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131953897);
            String strO1 = cwl1.o0(x340Var, 2131953898);
            cnx cnxVar = cnx.c;
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                function2 = function1;
                mqo1.d(function2, null, cnxVar, null, strO0, new zgx(strO1, new gbx(new y50(strO1), function0)), null, x340Var, ((i2 >> 3) & 14) | (cnx.d << 6) | 262144, 74);
            }
        } else {
            function2 = function1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function2, i, (byte) 7);
        }
    }

    public static final void d(hux huxVar, String str, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1594662560);
        int i2 = i | ((i & 8) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.g(str) ? 32 : 16) | 384;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            uvx uvxVar = new uvx((pgx) null, 4, (tvx) null, (p3v) null, 26);
            j2i j2iVarR = apo.r(-1687765354, new g70(huxVar, (byte) 10), b0kVar3);
            j2i j2iVarR2 = apo.r(1072712092, new iww0(str, (byte) 23), b0kVar3);
            qim0Var2 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var2, uvxVar, null, false, null, null, null, null, j2iVarR, null, null, null, null, null, null, j2iVarR2, b0kVar2, 100663366, 196608, 32508);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sgd(huxVar, str, qim0Var2, i, (byte) 1);
        }
    }

    public static final void e(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1273480596);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.g(13, apo.r(-388187583, new ql(cwl1.o0(x340Var, 2131957367), function0, (byte) 14), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 16, i, function0, false);
        }
    }

    public static final void f(r6d0 r6d0Var, Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(788814036);
        int i2 = i | (x340Var.g(r6d0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            m1p1.a(r6d0Var.a, r6d0Var.b, r6d0Var.c, null, x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131957368), ab80.o(nim0Var, 16.0f, x340Var, nim0Var, 1.0f), lee1.a(cbx.d(x340Var).e, 0L, fc11.G(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(cwl1.n0(2131957366, new Object[]{r6d0Var.b}, x340Var), ab80.o(nim0Var, 6.0f, x340Var, nim0Var, 1.0f), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            function1 = function0;
            e(function1, x340Var, (i2 >> 3) & 14);
            x0d.s(nim0Var, cbx.b(x340Var).b.c, x340Var, true);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx90(r6d0Var, function1, i, (byte) 22);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1431888226);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(1673377457, new h621(function0), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t531(function0, qim0Var, i, (byte) 5);
        }
    }

    public static final void h(bft0 bft0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-621687392);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bft0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.g(bft0Var.b == 1 ? 8 : 4, apo.r(-272811949, new hws0(bft0Var, iu30Var, (byte) 6), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) bft0Var, (Object) iu30Var, i, (byte) 5);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(x0j1 x0j1Var, iu30 iu30Var, jtl1 jtl1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(458217853);
        int i2 = (x340Var.g(x0j1Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(jtl1Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            if (x0j1Var instanceof v0j1) {
                x340Var.i0(1618062860);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = new azy0(new uyh1(iu30Var, (byte) 29), jtl1Var);
                    x340Var.s0(objT);
                }
                azy0 azy0Var = (azy0) objT;
                v0j1 v0j1Var = (v0j1) x0j1Var;
                otw.c(azy0Var, new yyy0(v0j1Var.a, v0j1Var.b, v0j1Var.d), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                if (!(x0j1Var instanceof w0j1)) {
                    throw p3d1.k(x340Var, 2130403889, false);
                }
                x340Var.i0(1618613482);
                boolean z = (i2 & 112) == 32;
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new uyh1(iu30Var, (byte) 28);
                    x340Var.s0(objT2);
                }
                w0j1 w0j1Var = (w0j1) x0j1Var;
                otw.c(new f2o0((Function0) objT2, (byte) 1), new o2j1(w0j1Var.a, w0j1Var.b), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, x0j1Var, iu30Var, jtl1Var, qim0Var, (byte) 26);
        }
    }

    public static final LayerDrawable j(Context context, Drawable drawable) {
        Drawable drawable2 = context.getDrawable(2131232966);
        drawable2.getClass();
        drawable2.setTintList(x74.E(context, 2131101342));
        int intrinsicWidth = (drawable.getIntrinsicWidth() - drawable2.getIntrinsicWidth()) / 2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165718) + drawable.getIntrinsicHeight();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerGravity(0, 16);
        layerDrawable.setLayerInset(1, intrinsicWidth, dimensionPixelSize, intrinsicWidth, 0);
        return layerDrawable;
    }

    public static void k(hf91 hf91Var, List list, i311 i311Var) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int iC = hf91Var.c((s340) list.get(i));
            int iO = hf91Var.O(hf91Var.q(iC), hf91Var.b);
            Object obj = iO < hf91Var.f(hf91Var.q(iC + 1), hf91Var.b) ? hf91Var.c[hf91Var.g(iO)] : fkj0.X;
            h311 h311Var = obj instanceof h311 ? (h311) obj : null;
            if (h311Var != null) {
                h311Var.a = i311Var;
            }
        }
    }

    public static dr8 l(String str, String str2) {
        if ("access_denied".equals(str)) {
            return new dr8(nhz.Z, (String) null, str2);
        }
        return ("consent_required".equals(str) || "interaction_required".equals(str) || "account_selection_required".equals(str)) ? new dr8(nhz.O0, str, str2) : new dr8(nhz.i, str, str2);
    }

    public static final TextView m(MetadataRow metadataRow, String str) {
        TextView textView = new TextView(metadataRow.getContext());
        textView.setId(View.generateViewId());
        textView.setText(str);
        textView.setTextAppearance(2132018006);
        textView.setTextColor(textView.getContext().getColor(2131101506));
        return textView;
    }

    public static dr8 n(String str, String str2) {
        return new dr8(nhz.X, gvg.h("Validation of state parameter failed. Expected: ", str, ", actual: ", str2), str2);
    }

    public static fr8 o(String str, String str2) {
        Uri uri = Uri.parse(str);
        if (uri == null) {
            return new cr8();
        }
        String encodedFragment = uri.getEncodedFragment();
        String queryParameter = null;
        if (encodedFragment != null && !encodedFragment.isEmpty()) {
            String strDecode = null;
            String strDecode2 = null;
            String strDecode3 = null;
            for (String str3 : encodedFragment.split("&")) {
                String[] strArrSplit = str3.split("=");
                if (strArrSplit.length == 2) {
                    if (strArrSplit[0].startsWith("error")) {
                        queryParameter = Uri.decode(strArrSplit[1]);
                    }
                    if (strArrSplit[0].startsWith("access_token")) {
                        strDecode3 = Uri.decode(strArrSplit[1]);
                    }
                    if (strArrSplit[0].startsWith("expires_in")) {
                        strDecode = Uri.decode(strArrSplit[1]);
                    }
                    if (strArrSplit[0].startsWith("state")) {
                        strDecode2 = Uri.decode(strArrSplit[1]);
                    }
                }
            }
            if (queryParameter != null) {
                return l(queryParameter, strDecode2);
            }
            if (strDecode != null && strDecode3 != null) {
                try {
                    return !str2.equals(strDecode2) ? n(str2, strDecode2) : new ar8(strDecode3, uri.toString(), Integer.parseInt(strDecode), strDecode2);
                } catch (NumberFormatException e) {
                    Logger.e(e, "Could not parse expiresIn parameter", new Object[0]);
                    return new dr8(nhz.t, "Could not parse expiresIn parameter", strDecode2);
                }
            }
            queryParameter = strDecode2;
        }
        if (encodedFragment == null) {
            queryParameter = uri.getQueryParameter("state");
            String queryParameter2 = uri.getQueryParameter("error");
            if (queryParameter2 != null) {
                return l(queryParameter2, queryParameter);
            }
            if (!str2.equals(queryParameter)) {
                return n(str2, queryParameter);
            }
            String queryParameter3 = uri.getQueryParameter("code");
            if (queryParameter3 != null) {
                return new br8(queryParameter3, uri.toString(), queryParameter);
            }
        }
        return new er8(uri.toString(), queryParameter);
    }

    public static int p(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final g4b1 q(int i, Context context, j4b1 j4b1Var) {
        return r(context, j4b1Var, i, context.getResources().getDimensionPixelSize(2131165724));
    }

    public static final g4b1 r(Context context, j4b1 j4b1Var, int i, int i2) {
        g4b1 g4b1Var = new g4b1(context, j4b1Var, i2);
        g4b1Var.c(x74.E(context, i));
        return g4b1Var;
    }

    public static boolean s(ze91 ze91Var, List list) {
        List list2 = list;
        if (!list2.isEmpty()) {
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                s340 s340Var = (s340) list.get(i);
                if (ze91Var.k(s340Var)) {
                    int iB = ze91Var.b(s340Var);
                    int iD = bf91.d(iB, ze91Var.a);
                    int i2 = iB + 1;
                    if (((i2 < ze91Var.b ? ze91Var.a[(i2 * 5) + 4] : ze91Var.c.length) - iD > 0 ? ze91Var.c[iD] : fkj0.X) instanceof h311) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean t(gwt0 gwt0Var) {
        if (gwt0Var instanceof xvt0) {
            return ((xvt0) gwt0Var).c;
        }
        if (gwt0Var instanceof yvt0) {
            return ((yvt0) gwt0Var).c;
        }
        if (gwt0Var instanceof bwt0) {
            return ((bwt0) gwt0Var).c;
        }
        if (gwt0Var instanceof zvt0) {
            return ((zvt0) gwt0Var).c;
        }
        if (gwt0Var instanceof vvt0) {
            return ((vvt0) gwt0Var).e;
        }
        if (gwt0Var instanceof uvt0) {
            return ((uvt0) gwt0Var).b;
        }
        if (gwt0Var instanceof wvt0) {
            return ((wvt0) gwt0Var).d;
        }
        return false;
    }

    public static final boolean u(int i, Resources resources) {
        return i <= ((int) resources.getDimension(2131165820));
    }
}
