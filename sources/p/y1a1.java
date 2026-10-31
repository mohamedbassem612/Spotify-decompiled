package p;

import android.R;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.TextUnit;
import androidx.media3.session.legacy.MediaSessionCompat;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class y1a1 implements q2a1 {
    public static final HubsImmutableComponentBundle[] a = new HubsImmutableComponentBundle[0];
    public static b180 b;

    public static j0f0 A(Context context, t250 t250Var, t250 t250Var2, t250 t250Var3) {
        return new j0f0((String) null, context.getString(2131956273), cnx.c, new h0f0(context.getString(R.string.ok), t250Var), (h0f0) null, (i3u) null, t250Var3, t250Var2, 49);
    }

    public static void B(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean C(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static final boolean D(v161 v161Var, Resources resources) {
        if (ggo1.G(v161Var)) {
            return false;
        }
        o161 o161Var = v161Var.d;
        if (o161Var.c) {
            return true;
        }
        Object objG = o161Var.a.g(z161.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !((list != null ? (String) o7h.s0(list) : null) == null && y(v161Var) == null && x(v161Var, resources) == null && !w(v161Var)) && E(v161Var);
    }

    public static final boolean E(v161 v161Var) {
        if (!v161Var.n()) {
            List listJ = v161.j(4, v161Var);
            int size = listJ.size();
            for (int i = 0; i < size; i++) {
                if (zko1.m((v161) listJ.get(i))) {
                }
            }
            hmb0 hmb0VarV = v161Var.c.v();
            while (true) {
                if (hmb0VarV == null) {
                    hmb0VarV = null;
                    break;
                }
                o161 o161VarX = hmb0VarV.x();
                if (o161VarX != null && o161VarX.c) {
                    break;
                }
                hmb0VarV = hmb0VarV.v();
            }
            return !(hmb0VarV != null);
        }
        return false;
    }

    public static void F(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
    public static x6h1 G(HubsImmutableComponentBundle hubsImmutableComponentBundle, String str) {
        ?? arrayList;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = hubsImmutableComponentBundle.F("ubi:app", "");
        x6h1VarI.a = hubsImmutableComponentBundle.F("ubi:specification_id", "");
        x6h1VarI.f = hubsImmutableComponentBundle.F("ubi:specification_version", "");
        x6h1VarI.g = hubsImmutableComponentBundle.F("ubi:generator_version", "");
        x6h1VarI.k = hubsImmutableComponentBundle.F("ubi:annotator_version", "");
        x6h1VarI.l = hubsImmutableComponentBundle.F("ubi:annotator_configuration_version", "");
        x6h1VarI.b = hubsImmutableComponentBundle.B("ubi:pageIdentifier");
        x6h1VarI.d = hubsImmutableComponentBundle.F("ubi:pageUri", str);
        x6h1VarI.c = hubsImmutableComponentBundle.r("ubi:pagePosition");
        x6h1VarI.e = hubsImmutableComponentBundle.B("ubi:pageReason");
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = hubsImmutableComponentBundle.h("ubi:path");
        WeakHashMap weakHashMap = xoi1.a;
        if (hubsImmutableComponentBundleArrH == null) {
            hubsImmutableComponentBundleArrH = a;
        }
        if (hubsImmutableComponentBundleArrH.length > 0) {
            arrayList = new ArrayList(hubsImmutableComponentBundleArrH.length);
            for (HubsImmutableComponentBundle hubsImmutableComponentBundle2 : hubsImmutableComponentBundleArrH) {
                arrayList.add(new a7h1(hubsImmutableComponentBundle2.F("name", ""), hubsImmutableComponentBundle2.B("id"), hubsImmutableComponentBundle2.r("position"), hubsImmutableComponentBundle2.B("uri"), hubsImmutableComponentBundle2.B("reason")));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = x6h1VarI.i;
        arrayList2.clear();
        arrayList2.addAll((Collection) arrayList);
        return x6h1VarI;
    }

    public static final wck0 H(v7l v7lVar) {
        return new wck0(v7lVar, (byte) 22);
    }

    public static void I(p5t0 p5t0Var, q5t0 q5t0Var, xol1 xol1Var) {
        if (Float.isNaN(xol1Var.f) && Float.isNaN(xol1Var.g) && Float.isNaN(xol1Var.h) && Float.isNaN(xol1Var.i) && Float.isNaN(xol1Var.j) && Float.isNaN(xol1Var.k) && Float.isNaN(xol1Var.l) && Float.isNaN(xol1Var.m) && Float.isNaN(xol1Var.n)) {
            p5t0.i(p5t0Var, q5t0Var, (((long) xol1Var.b) << 32) | (((long) xol1Var.c) & 4294967295L));
        } else {
            p5t0Var.r(q5t0Var, xol1Var.b, xol1Var.c, Float.isNaN(xol1Var.k) ? 0.0f : xol1Var.k, new v7l(xol1Var, (byte) 3));
        }
    }

    public static void J(IBinder iBinder, Bundle bundle) {
        bundle.putBinder(MediaSessionCompat.KEY_EXTRA_BINDER, iBinder);
    }

    public static final float K(long j, float f, wat watVar) {
        if (TextUnit.a(j, TextUnit.c)) {
            return f;
        }
        long jB = TextUnit.b(j);
        if (wee1.a(jB, 4294967296L)) {
            return watVar.q0(j);
        }
        if (wee1.a(jB, 8589934592L)) {
            return TextUnit.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float L(long j, float f, wat watVar) {
        float fC;
        long jB = TextUnit.b(j);
        if (wee1.a(jB, 4294967296L)) {
            if (watVar.U0() <= 1.05d) {
                return watVar.q0(j);
            }
            fC = TextUnit.c(j) / TextUnit.c(watVar.L(f));
        } else {
            if (!wee1.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = TextUnit.c(j);
        }
        return fC * f;
    }

    public static void M(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static final void N(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(z4p1.G(j)), i, i2, 33);
        }
    }

    public static final void O(Spannable spannable, long j, wat watVar, int i, int i2) {
        long jB = TextUnit.b(j);
        if (wee1.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(jch0.U(watVar.q0(j)), false), i, i2, 33);
        } else if (wee1.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(TextUnit.c(j)), i, i2, 33);
        }
    }

    public static void P(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void Q(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void R(Drawable drawable, int i) {
        drawable.setLayoutDirection(i);
    }

    public static final void S(Spannable spannable, LocaleList localeList, int i, int i2) {
        if (localeList != null) {
            ArrayList arrayList = new ArrayList(q7h.U(localeList, 10));
            Iterator it = localeList.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ehe0) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new android.os.LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static void T(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void U(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void V(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static int W(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((yb41) it.next()).a;
        }
        return i;
    }

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1823287720);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            eso1.e(Uri.parse(str), isl.a, z ? i1p1.q(qim0Var3, er31.a) : qim0Var3, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ryh(str, z, qim0Var2, i, (byte) 1);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(949656235);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            xtx xtxVar = xtx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.f;
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131954168));
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var2 = nim0.a;
            w0h1.a(xtxVar, jslVar, u291.r(qim0Var2, 12.0f), j, 0L, false, x340Var, xtx.d, 48);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 11);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1800096354);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131954169);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var2, 12.0f);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new fki0(strO0, (byte) 19);
                x340Var.s0(objT);
            }
            xto1.e(s161.b(qim0VarR, false, (iu30) objT), 1, j, 0L, x340Var, 48, 8);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 12);
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-341067717);
        if (x340Var.Y(i & 1, i != 0)) {
            xtx xtxVar = xtx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xtxVar, isl.a, u291.r(nim0.a, 12.0f), 0L, 0L, false, x340Var, xtx.d | 48, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 12);
        }
    }

    public static final void e(boolean z, qim0 qim0Var, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2029676132);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i4 != 0 ? qim0Var4 : qim0Var2;
            String strO0 = cwl1.o0(x340Var, 2131954171);
            if (z) {
                strK = x0d.k(x340Var, -603601174, 2131954170, x340Var, false);
            } else {
                x340Var.i0(-1531678302);
                x340Var.r(false);
                strK = "";
            }
            String strE = f4i1.e(strO0, strK);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var5);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            vu30Var.invoke(x340Var, 6);
            op71.g(x340Var, u291.r(qim0Var4, 4.0f));
            uwr uwrVar = cbx.a;
            uwo1.e(strE, anm1.N("videoLabelTag", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rkk0(z, qim0Var3, vu30Var, i, i2);
        }
    }

    public static final void f(emy emyVar, yqg yqgVar, r1m r1mVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        gra graVar = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(934692100);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(emyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(yqgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(r1mVar) : x340Var.i(r1mVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarH = rwq.h(r1mVar.g, x340Var, 0);
            ven0 ven0VarH2 = rwq.h(r1mVar.i, x340Var, 0);
            boolean zJ = u890.j((String) ven0VarH.getValue(), emyVar.b);
            gra graVar2 = een.d;
            gfh0 gfh0VarC = t1c.c(graVar2, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            a(0, emyVar.a, x340Var, null, emyVar.d);
            String strO0 = cwl1.o0(x340Var, zJ ? 2131953587 : 2131953588);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).c, d4o1.a);
            boolean zH = x340Var.h(zJ) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = new z20(zJ, iu30Var, (byte) 15);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13);
            gfh0 gfh0VarC2 = t1c.c(graVar2, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i3 = i2;
            isl islVar = isl.a;
            h2c h2cVar = h2c.a;
            if (zJ) {
                x340Var.i0(-1363168993);
                spx spxVar = spx.c;
                long j = cbx.a(x340Var).b.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(spxVar, islVar, h2cVar.a(u291.r(nim0Var, 12.0f), graVar), j, 0L, false, x340Var, spx.d | 48, 48);
                i091 i091Var = (i091) ven0VarH2.getValue();
                if (i091Var == null) {
                    x340Var.i0(-1362847307);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1362847306);
                    g(i091Var, yqgVar, h2cVar.a(nim0Var, graVar), x340Var, i3 & ContentType.LONG_FORM_ON_DEMAND);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(-1362641745);
                xpx xpxVar = xpx.c;
                long j2 = cbx.a(x340Var).b.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(xpxVar, islVar, h2cVar.a(u291.r(nim0Var, 24.0f), graVar), j2, 0L, false, x340Var, xpx.d | 48, 48);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, emyVar, yqgVar, r1mVar, iu30Var, (byte) 13);
        }
    }

    public static final void g(i091 i091Var, yqg yqgVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        yqg yqgVar2;
        drr0 drr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(811680687);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(i091Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yqgVar2 = yqgVar;
            i2 |= x340Var.g(yqgVar2) ? 32 : 16;
        } else {
            yqgVar2 = yqgVar;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = us71.i(0.0f, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT;
            o091 o091Var = i091Var.h;
            boolean zI = x340Var.i(i091Var) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32) | x340Var.i(drr0Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                drr0Var = drr0Var2;
                gmy gmyVar = new gmy(i091Var, yqgVar2, drr0Var, (lnm) null, (byte) 0);
                x340Var.s0(gmyVar);
                objT2 = gmyVar;
            } else {
                drr0Var = drr0Var2;
            }
            qxd0.t(o091Var, x340Var, (vu30) objT2);
            float fS = drr0Var.s();
            uwr uwrVar = cbx.a;
            xto1.f(fS, 4, ((i3 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 384, 0, cbx.a(x340Var).b.a, u7h.j, x340Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(i091Var, yqgVar, qim0Var, i, (byte) 24);
        }
    }

    public static final void h(r7x0 r7x0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        Uri uri;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-898899604);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(r7x0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131960559);
            String str = r7x0Var.c;
            if (str == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            uri.getClass();
            Uri uri2 = uri;
            String str2 = r7x0Var.a;
            boolean z = true;
            String str3 = r7x0Var.b;
            long jE = z4p1.e(r7x0Var.k);
            x340Var.i0(-554076035);
            boolean zG = x340Var.g(strO0);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new zqu0(strO0, (byte) 21);
                x340Var.s0(objT);
            }
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var4, false, (iu30) objT);
            if (r7x0Var.m) {
                if ((i3 & ContentType.LONG_FORM_ON_DEMAND) != 32) {
                    z = false;
                }
                Object objT2 = x340Var.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new h7w0(iu30Var, (byte) 8);
                    x340Var.s0(objT2);
                }
                qim0Var3 = qim0Var4;
                qim0VarB = qim0VarB.then(bin.x(qim0Var3, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15));
            } else {
                qim0Var3 = qim0Var4;
            }
            qim0 qim0Var5 = qim0VarB;
            x340Var.r(false);
            bmq0.a(uri2, qim0Var5, hcx.f, str2, str3, jE, 0L, false, x340Var, 384, 192);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nva(r7x0Var, iu30Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void i(int i, String str, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1224448550);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            a(i3 & 126, str, x340Var, null, z);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, ((vex) zex.a.e).c, d4o1.a);
            String strO0 = cwl1.o0(x340Var, 2131953588);
            boolean z3 = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new y9y(iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, strO0, (pm31) null, (idn0) null, (Function0) objT, 13);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xpx xpxVar = xpx.c;
            long j = cbx.a(x340Var).b.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0Var2 = qim0Var3;
            w0h1.a(xpxVar, isl.a, h2c.a.a(u291.r(qim0Var3, 24.0f), een.h), j, 0L, false, x340Var, xpx.d | 48, 48);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hmy(str, z, qim0Var2, iu30Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.dlv */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.util.List] */
    public static final void j(gzl1 gzl1Var, qim0 qim0Var, b0k b0kVar, int i) throws dlv {
        ?? arrayList;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(369319912);
        int i2 = (i & 6) == 0 ? (x340Var.e(gzl1Var.ordinal()) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.f;
            vex vexVar = (vex) zex.a.b;
            long j2 = vexVar.l;
            long j3 = vexVar.i;
            long j4 = vexVar.g;
            long j5 = cbx.a(x340Var).c.d;
            int iOrdinal = gzl1Var.ordinal();
            if (iOrdinal == 0) {
                arrayList = new ArrayList(13);
                for (int i4 = 0; i4 < 13; i4++) {
                    arrayList.add(new n8a(0.8f, j3));
                }
            } else if (iOrdinal == 1) {
                arrayList = p7h.M(new n8a[]{new n8a(0.2f, j), new n8a(0.2f, j), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.8f, j3), new n8a(0.2f, j), new n8a(0.2f, j)});
            } else if (iOrdinal == 2) {
                arrayList = p7h.M(new n8a[]{new n8a(0.2f, j), new n8a(0.3f, j), new n8a(0.45f, j2), new n8a(0.6f, j2), new n8a(0.75f, j3), new n8a(0.9f, j4), new n8a(1.0f, j5), new n8a(0.9f, j4), new n8a(0.75f, j3), new n8a(0.6f, j2), new n8a(0.45f, j2), new n8a(0.3f, j), new n8a(0.2f, j)});
            } else {
                if (iOrdinal != 3) {
                    eg.o();
                    return;
                }
                arrayList = p7h.M(new n8a[]{new n8a(0.2f, j), new n8a(1.0f, j5), new n8a(0.2f, j), new n8a(1.0f, j5), new n8a(0.2f, j), new n8a(1.0f, j5), new n8a(0.2f, j), new n8a(1.0f, j5), new n8a(0.2f, j), new n8a(1.0f, j5), new n8a(0.2f, j), new n8a(1.0f, j5), new n8a(0.2f, j)});
            }
            uwr uwrVar2 = cbx.a;
            int iH = (int) jfv.h(cbx.c(x340Var).b.c);
            x340Var.i0(-1565840490);
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (true) {
                dlv dlvVar = null;
                if (!it.hasNext()) {
                    x340Var.r(false);
                    x340Var.i0(-1565830708);
                    ArrayList arrayList3 = new ArrayList(q7h.U(iterable, 10));
                    int i6 = 0;
                    for (Object obj : iterable) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            dlv dlvVar2 = dlvVar;
                            p7h.T();
                            throw dlvVar2;
                        }
                        x340Var.f0(1501436378, Integer.valueOf(i6));
                        u7h u7hVar = (u7h) w191.a(((n8a) obj).b, irn1.o0(iH, 0, dlvVar, 6), f4i1.c(i6, "bar_color_"), x340Var, 0, 8).getValue();
                        long j6 = u7hVar.a;
                        x340Var.r(false);
                        arrayList3.add(u7hVar);
                        dlvVar = dlvVar;
                        i6 = i7;
                    }
                    x340Var.r(false);
                    boolean zG = x340Var.g(arrayList2) | x340Var.g(arrayList3);
                    Object objT = x340Var.T();
                    if (zG || objT == fkj0.X) {
                        objT = new iod0(arrayList2, arrayList3, (byte) 1);
                        x340Var.s0(objT);
                    }
                    j0o1.b((i3 >> 3) & 14, x340Var, (iu30) objT, qim0Var);
                    break;
                }
                Object next = it.next();
                int i8 = i5 + 1;
                if (i5 < 0) {
                    p7h.T();
                    throw null;
                }
                x340Var.f0(-460835357, Integer.valueOf(i5));
                float fFloatValue = ((Number) z95.b(((n8a) next).a, irn1.o0(iH, 0, (dlv) null, 6), f4i1.c(i5, "bar_height_"), (iu30) null, x340Var, 0, 20).getValue()).floatValue();
                x340Var.r(false);
                arrayList2.add(Float.valueOf(fFloatValue));
                i5 = i8;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(gzl1Var, qim0Var, i, (byte) 2);
        }
    }

    public static final boolean k(we weVar, Object obj) {
        if (weVar == obj) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        String str = weVar.a;
        we weVar2 = (we) obj;
        cv30 cv30Var = weVar2.b;
        if (!u890.j(str, weVar2.a)) {
            return false;
        }
        cv30 cv30Var2 = weVar.b;
        if (cv30Var2 != null || cv30Var == null) {
            return cv30Var2 == null || cv30Var != null;
        }
        return false;
    }

    public static final boolean l(v161 v161Var) {
        return !v161Var.k().a.c(z161.j);
    }

    public static final boolean m(v161 v161Var) {
        return v161Var.c.a1 == flb0.b;
    }

    public static final boolean n(double d) {
        return d == -2.0d || d == -3.0d;
    }

    public static final boolean o(v161 v161Var, o161 o161Var) {
        Iterator it = o161Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o161 o161VarK = v161Var.k();
            if (!o161VarK.a.c((d261) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void p(or80 or80Var, ddn0 ddn0Var, ddn0 ddn0Var2, Resources resources) {
        ddn0Var.a();
        ddn0Var2.a();
        x161 x161Var = (x161) or80Var.b(-1);
        v161 v161Var = x161Var != null ? x161Var.a : null;
        v161Var.getClass();
        ArrayList arrayListB = f261.b(v161Var, new j6(or80Var, (byte) 6), new j6(resources, (byte) 7), Collections.singletonList(v161Var));
        int iL = p7h.L(arrayListB);
        int i = 1;
        if (1 > iL) {
            return;
        }
        while (true) {
            int i2 = ((v161) arrayListB.get(i - 1)).f;
            int i3 = ((v161) arrayListB.get(i)).f;
            ddn0Var.f(i2, i3);
            ddn0Var2.f(i3, i2);
            if (i == iL) {
                return;
            } else {
                i++;
            }
        }
    }

    public static void q(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static final void r(ynb1 ynb1Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            afh0 afh0Var = (afh0) list.get(i);
            Object objS = t3k1.s(afh0Var);
            if (objS == null) {
                afh0Var.g();
                objS = new pvc((byte) 2);
            }
            dil dilVarB = ynb1Var.b(objS.toString());
            if (dilVarB != null) {
                dilVarB.f0 = afh0Var;
                cjl cjlVar = dilVarB.g0;
                if (cjlVar != null) {
                    cjlVar.h0 = afh0Var;
                }
            }
            afh0Var.g();
        }
    }

    public static void s(Drawable drawable) {
        drawable.canApplyTheme();
    }

    public static List t(JobScheduler jobScheduler) {
        return jobScheduler.getAllPendingJobs();
    }

    public static int u(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static android.graphics.ColorFilter v(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static final boolean w(v161 v161Var) {
        Object objG = v161Var.d.a.g(z161.L);
        if (objG == null) {
            objG = null;
        }
        rze1 rze1Var = (rze1) objG;
        nen0 nen0Var = v161Var.d.a;
        Object objG2 = nen0Var.g(z161.z);
        if (objG2 == null) {
            objG2 = null;
        }
        pm31 pm31Var = (pm31) objG2;
        boolean z = rze1Var != null;
        Object objG3 = nen0Var.g(z161.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (pm31Var != null && pm31Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String x(v161 v161Var, Resources resources) {
        int iP;
        o161 o161Var = v161Var.d;
        o161 o161Var2 = v161Var.d;
        Object objG = o161Var.a.g(z161.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        nen0 nen0Var = o161Var2.a;
        Object objG2 = nen0Var.g(z161.L);
        if (objG2 == null) {
            objG2 = null;
        }
        rze1 rze1Var = (rze1) objG2;
        Object objG3 = nen0Var.g(z161.z);
        if (objG3 == null) {
            objG3 = null;
        }
        pm31 pm31Var = (pm31) objG3;
        if (rze1Var != null) {
            int iOrdinal = rze1Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(app.p000rive.runtime.kotlin.R.string.indeterminate);
                    }
                } else if (pm31Var != null && pm31Var.a == 2 && objG == null) {
                    objG = resources.getString(app.p000rive.runtime.kotlin.R.string.state_off);
                }
            } else if (pm31Var != null && pm31Var.a == 2 && objG == null) {
                objG = resources.getString(app.p000rive.runtime.kotlin.R.string.state_on);
            }
        }
        Object objG4 = nen0Var.g(z161.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((pm31Var == null || pm31Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(app.p000rive.runtime.kotlin.R.string.selected) : resources.getString(app.p000rive.runtime.kotlin.R.string.not_selected);
            }
        }
        Object objG5 = nen0Var.g(z161.c);
        if (objG5 == null) {
            objG5 = null;
        }
        vfx0 vfx0Var = (vfx0) objG5;
        if (vfx0Var != null) {
            if (vfx0Var != vfx0.d) {
                if (objG == null) {
                    ksg ksgVar = vfx0Var.b;
                    float fFloatValue = ((Number) ksgVar.n()).floatValue() - ((Number) ksgVar.m()).floatValue() == 0.0f ? 0.0f : (vfx0Var.a - ((Number) ksgVar.m()).floatValue()) / (((Number) ksgVar.n()).floatValue() - ((Number) ksgVar.m()).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iP = 0;
                    } else {
                        iP = fFloatValue == 1.0f ? 100 : yoi1.p(Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objG = resources.getString(app.p000rive.runtime.kotlin.R.string.template_percent, Integer.valueOf(iP));
                }
            } else if (objG == null) {
                objG = resources.getString(app.p000rive.runtime.kotlin.R.string.in_progress);
            }
        }
        d261 d261Var = z161.G;
        if (nen0Var.c(d261Var)) {
            nen0 nen0Var2 = new v161(v161Var.a, true, v161Var.c, o161Var2).k().a;
            Object objG6 = nen0Var2.g(z161.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = nen0Var2.g(z161.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = nen0Var2.g(d261Var);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(app.p000rive.runtime.kotlin.R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final af5 y(v161 v161Var) {
        Object objG = v161Var.d.a.g(z161.G);
        if (objG == null) {
            objG = null;
        }
        af5 af5Var = (af5) objG;
        Object objG2 = v161Var.d.a.g(z161.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return af5Var == null ? list != null ? (af5) o7h.s0(list) : null : af5Var;
    }

    public static int z(Drawable drawable) {
        return drawable.getLayoutDirection();
    }
}
