package p;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.kidsaccount.api.v3.proto.AgeRequirements;
import com.spotify.kidsaccount.api.v3.proto.CardParentalVerification;
import com.spotify.kidsaccount.api.v3.proto.ExpectedAccountType;
import com.spotify.kidsaccount.api.v3.proto.ParentRequirements;
import com.spotify.kidsaccount.api.v3.proto.ParentalControls;
import com.spotify.kidsaccount.api.v3.proto.ParentalVerificationMethod;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l0o1 {
    public static final cjc0 a = new cjc0(2);
    public static final cjc0 b = new cjc0(2);
    public static Method c;
    public static Method d;
    public static boolean e;
    public static b180 f;

    public static final void a(String str, String str2, String str3, Function0 function0, l4o1 l4o1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1390588443);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(l4o1Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            nyx.a(2, (wux) null, apo.r(-1721214734, new sxj(str, str2, l4o1Var, function0, str3), x340Var), x340Var, 3078, 6);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(str, str2, str3, function0, l4o1Var, qim0Var2, i, (byte) 13);
        }
    }

    public static final void b(ku50 ku50Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1984128533);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ku50Var) : x340Var.i(ku50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(18, apo.r(-336874730, new jj50(function0, ku50Var, b2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(ku50Var, function0, i, (byte) 26);
        }
    }

    public static final void c(hcl1 hcl1Var, lu50 lu50Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1118584627);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(hcl1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.g(lu50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.g(qim0Var) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str = lu50Var.a;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            int i3 = i2;
            uwo1.e(str, u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f), cbx.d(b0kVar2).e, 0L, null, null, 2, false, new cjc0(1), 0, null, b0kVar2, 1572864, 0, 1720);
            b0kVar2 = b0kVar2;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            q0o1.b(hcl1Var, lu50Var.b, iu30Var, apo.r(-1882391483, new t7i(iu30Var, (byte) 5), b0kVar2), null, b0kVar2, (i3 & 14) | 3136 | (i3 & 896));
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, hcl1Var, lu50Var, iu30Var, qim0Var, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    public static final void d(String str, String str2, qim0 qim0Var, String str3, u7h u7hVar, u7h u7hVar2, b0k b0kVar, int i) {
        int i2;
        int i3;
        long j;
        nim0 nim0Var;
        boolean z;
        long j2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1808766531);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(u7hVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(u7hVar2) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i4 = i2 & 7168;
            boolean z2 = i4 == 2048;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z3 = i4 == 2048;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                if (str3 == null) {
                    objT2 = null;
                } else {
                    String str4 = str3.length() > 0 ? str3 : null;
                    if (str4 != null) {
                        objT2 = Uri.parse(str4);
                    } else {
                        objT2 = null;
                    }
                }
                x340Var.s0(objT2);
            }
            Uri uri = (Uri) objT2;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nim0 nim0Var2 = nim0.a;
            if (uri == null || ((Boolean) ven0Var.getValue()).booleanValue()) {
                i3 = i2;
                x340Var.i0(1622492628);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).d;
                if (u7hVar == null) {
                    x340Var.i0(-1887320233);
                    j = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1887321318);
                    x340Var.r(false);
                    j = u7hVar.a;
                }
                nim0Var = nim0Var2;
                uwo1.e(str, u291.x(0.0f, 282.0f, 1, nim0Var2), lee1Var, j, null, null, 2, false, a, 0, null, x340Var, i3 & 14, 0, 1712);
                z = false;
                x340Var.r(false);
            } else {
                x340Var.i0(1622013492);
                boolean zI = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new abh0(ven0Var, (byte) 28);
                    x340Var.s0(objT3);
                }
                i3 = i2;
                eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) objT3, (iu30) null, 0L, x340Var, 0, 0, 122878), new jsl(str), u291.x(0.0f, 282.0f, 1, u291.h(nim0Var2, 40.0f)), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, x340Var, 224256, 384);
                x340Var = x340Var;
                x340Var.r(false);
                nim0Var = nim0Var2;
                z = false;
            }
            if (str2 == null || str2.length() == 0) {
                x340Var.i0(1623109807);
                x340Var.r(z);
            } else {
                v8i0.i(4.0f, 1622816702, x340Var, x340Var, nim0Var);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var).j;
                if (u7hVar2 == null) {
                    x340Var.i0(-1887307465);
                    j2 = cbx.a(x340Var).b.a;
                    x340Var.r(z);
                } else {
                    x340Var.i0(-1887308643);
                    x340Var.r(z);
                    j2 = u7hVar2.a;
                }
                uwo1.e(str2, null, lee1Var2, j2, null, null, 2, false, b, 0, null, x340Var, (i3 >> 3) & 14, 0, 1714);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0(str, str2, qim0Var, str3, u7hVar, u7hVar2, i);
        }
    }

    public static final be e(SchedulingTransport schedulingTransport) {
        return new be(schedulingTransport);
    }

    public static StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, gl5 gl5Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i2);
        try {
            gl5Var.a(builderObtain, textView);
        } catch (ClassCastException unused) {
        }
        return builderObtain.build();
    }

    public static void g(Canvas canvas, boolean z) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            x74.z(canvas, z);
            return;
        }
        if (!e) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            e = true;
        }
        if (z) {
            try {
                Method method4 = c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final klb1 h(ExoPlayer exoPlayer, bjh0 bjh0Var, Long l) {
        long jLongValue = l != null ? l.longValue() : zoi1.W(bjh0Var.r);
        xkg0 xkg0Var = new xkg0();
        if (exoPlayer.U().a(1)) {
            ie30 ie30VarL0 = exoPlayer.L0();
            xkg0Var.put(1, ie30VarL0 != null ? ie30VarL0.a : null);
        }
        if (exoPlayer.U().a(2)) {
            ie30 ie30VarS = exoPlayer.S();
            xkg0Var.put(2, ie30VarS != null ? ie30VarS.a : null);
        }
        return new klb1(zoi1.H(exoPlayer.l().a, jLongValue), xkg0Var.b());
    }

    public static final boolean i(vun vunVar, p6r0 p6r0Var) {
        return !(new wvq0(p6r0Var, (byte) 11).invoke(d5p1.h(((zir0) vunVar.b).a).a.getValue()) == wir0.a);
    }

    public static final r551 j(List list, Map map) {
        mmr0 mmr0Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            List items = ((f1r) it.next()).getItems();
            ArrayList<e1r> arrayList = new ArrayList();
            for (Object obj : items) {
                e1r e1rVar = (e1r) obj;
                zjd1 zjd1Var = e1rVar.d;
                jh5 jh5Var = e1rVar.a;
                if (zjd1Var == null) {
                    zjd1Var = jh5Var.a;
                }
                if ((zjd1Var instanceof xv00) && !jh5Var.a()) {
                    arrayList.add(obj);
                }
            }
            boolean z = false;
            boolean z2 = false;
            for (e1r e1rVar2 : arrayList) {
                d1r d1rVarB = e1rVar2.b(map);
                int i2 = e1rVar2.b;
                boolean z3 = d1rVarB instanceof d1r;
                i3r i3rVar = i3r.a;
                if (z3) {
                    jh5 jh5Var2 = d1rVarB.c;
                    i3r i3rVar2 = (k3r) map.get(jh5Var2);
                    if (i3rVar2 != null) {
                        i3rVar = i3rVar2;
                    }
                    mmr0Var = new mmr0(jh5Var2, i3rVar);
                } else if (d1rVarB instanceof c1r) {
                    mmr0Var = new mmr0(e1rVar2.a, i3rVar);
                } else {
                    if (!(d1rVarB instanceof b1r)) {
                        eg.o();
                        return null;
                    }
                    b1r b1rVar = (b1r) d1rVarB;
                    mmr0Var = new mmr0(b1rVar.c, new h3r(b1rVar.d));
                }
                jh5 jh5Var3 = (jh5) mmr0Var.a;
                h3r h3rVar = (k3r) mmr0Var.b;
                if (h3rVar instanceof j3r) {
                    if (!((Boolean) e1rVar2.e.invoke(((j3r) h3rVar).a)).booleanValue()) {
                        z = z || i2 == 1;
                        linkedHashSet.add(jh5Var3);
                    }
                } else if (!(h3rVar instanceof h3r) || (h3rVar.a instanceof b3r)) {
                    z2 = true;
                } else {
                    z = z || i2 == 1;
                    linkedHashSet.add(jh5Var3);
                }
            }
            if (z) {
                i++;
            } else if (z2) {
                return null;
            }
        }
        return new r551(i, linkedHashSet.size());
    }

    public static final void k(dma1 dma1Var, bma1 bma1Var, bma1 bma1Var2, bma1 bma1Var3) {
        if (dma1Var.h(bma1Var2, false)) {
            return;
        }
        int iL = dma1Var.l(bma1Var3, 0);
        int i = Build.VERSION.SDK_INT;
        if (i != 37) {
            if (iL != i) {
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.b(bma1Var3, i);
                hma1VarEdit.g();
                return;
            }
            return;
        }
        hma1 hma1VarEdit2 = dma1Var.edit();
        hma1VarEdit2.a(bma1Var2, true);
        if (iL != i) {
            hma1VarEdit2.b(bma1Var3, i);
        }
        if (iL < 37) {
            hma1VarEdit2.b(bma1Var, 0);
        }
        hma1VarEdit2.g();
    }

    public static final pjn l(ParentRequirements parentRequirements, AgeRequirements ageRequirements, ParentalControls parentalControls, ExpectedAccountType expectedAccountType, bat batVar, boolean z) {
        tpw0 tpw0Var;
        boolean zQ = parentRequirements.q();
        int i = hza0.b[parentRequirements.o().ordinal()];
        int i2 = 3;
        int i3 = 2;
        if (i == 1) {
            tpw0Var = tpw0.b;
        } else if (i == 2) {
            tpw0Var = tpw0.c;
        } else if (i != 3) {
            tpw0Var = i != 4 ? tpw0.a : tpw0.e;
        } else {
            tpw0Var = tpw0.d;
        }
        boolean zP = parentRequirements.p();
        h290 h290VarR = parentRequirements.r();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarR.iterator();
        while (true) {
            sbs0 l2j1Var = null;
            if (!it.hasNext()) {
                break;
            }
            ParentalVerificationMethod parentalVerificationMethod = (ParentalVerificationMethod) it.next();
            parentalVerificationMethod.getClass();
            int iO = parentalVerificationMethod.o();
            int i4 = iO != 0 ? hza0.c[l1d.C(iO)] : -1;
            if (i4 == 1) {
                l2j1Var = new l2j1(hza0.d[parentalVerificationMethod.p().o().ordinal()] == 1 ? 1 : 2, "");
            } else if (i4 == 2) {
                CardParentalVerification cardParentalVerificationN = parentalVerificationMethod.n();
                l2j1Var = new k2j1(cardParentalVerificationN.p() ? new sbs0(cardParentalVerificationN.o().o(), ((double) cardParentalVerificationN.o().n()) / 100.0d) : null, parentalVerificationMethod.n().getUrl());
            }
            if (l2j1Var != null) {
                arrayList.add(l2j1Var);
            }
        }
        gtr0 gtr0Var = new gtr0(zQ, tpw0Var, zP, arrayList);
        wh2 wh2Var = new wh2(ageRequirements.o(), ageRequirements.n(), ageRequirements.q(), ageRequirements.r());
        dxr0 dxr0Var = new dxr0(new ewr0(parentalControls.getAllowExplicitContent()), new ewr0(parentalControls.getAllowVideoContent()));
        int iO2 = expectedAccountType.o();
        xq00 xq00Var = (iO2 != 0 ? hza0.a[l1d.C(iO2)] : -1) == 1 ? new xq00(expectedAccountType.p().o()) : wq00.a;
        int iOrdinal = batVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                dxr0Var = dxr0Var;
                i3 = 1;
                xq00Var = xq00Var;
                z = z;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    eg.o();
                    return null;
                }
            }
            return new pjn(gtr0Var, wh2Var, dxr0Var, xq00Var, i3, z);
        }
        i2 = 0;
        i3 = i2;
        return new pjn(gtr0Var, wh2Var, dxr0Var, xq00Var, i3, z);
    }

    public static final void m(ne4 ne4Var) {
        int i = wdy0.a[ne4Var.ordinal()];
    }

    public static final Integer n(op80 op80Var) {
        k3h1 k3h1VarA = op80Var.a(rtw0.h);
        if (k3h1VarA != null) {
            return Integer.valueOf(k3h1VarA.b);
        }
        return null;
    }

    public static Rect o(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    public static List p(a7o1 a7o1Var) {
        Point[] pointArr = new Point[4];
        double dSin = Math.sin(Math.toRadians(a7o1Var.e));
        double dCos = Math.cos(Math.toRadians(a7o1Var.e));
        int i = a7o1Var.a;
        int i2 = a7o1Var.b;
        pointArr[0] = new Point(i, i2);
        double d2 = a7o1Var.c;
        Point point = new Point((int) (((double) i) + (d2 * dCos)), (int) ((d2 * dSin) + ((double) i2)));
        pointArr[1] = point;
        double d3 = point.x;
        int i3 = a7o1Var.d;
        pointArr[2] = new Point((int) (d3 - (((double) i3) * dSin)), (int) ((((double) i3) * dCos) + ((double) pointArr[1].y)));
        Point point2 = pointArr[0];
        int i4 = point2.x;
        Point point3 = pointArr[2];
        int i5 = point3.x;
        Point point4 = pointArr[1];
        pointArr[3] = new Point((i5 - point4.x) + i4, (point3.y - point4.y) + point2.y);
        return Arrays.asList(pointArr);
    }
}
