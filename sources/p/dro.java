package p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import androidx.car.app.model.Alert;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Next;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dro {
    public static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final dra b = new dra(-1.0f);
    public static final dra c = new dra(1.0f);
    public static final cra d = new cra(-1.0f);
    public static final cra e = new cra(1.0f);
    public static b180 f;
    public static b180 g;
    public static ynb0 h;

    public static final String A() {
        if (dhn.a.contains(dro.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + wf10.a().getPackageName();
        } catch (Throwable th) {
            dhn.a(dro.class, th);
            return null;
        }
    }

    public static Intent B(String str, String str2, WidgetInteraction widgetInteraction) {
        u5b1 u5b1Var;
        ynb0 ynb0Var = h;
        if (ynb0Var == null || (u5b1Var = (u5b1) ynb0Var.get()) == null) {
            eg.m("IntentFactory not initialized");
            return null;
        }
        Intent intent = new Intent(u5b1Var.a, (Class<?>) WidgetsProxyActivity.class);
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_CAMPAIGN", widgetInteraction.getBranchCampaign());
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_BRANCH_DEEPLINK_PATH", str);
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_PAGE_ID", widgetInteraction.getPageIdentifierPath());
        String strR = rc11.a.b(u5b1Var.b.getClass()).r();
        strR.getClass();
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_RECEIVER_NAME", strR);
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_INTERACTION", (Parcelable) widgetInteraction);
        intent.putExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY", str2);
        intent.setFlags(268435456);
        return intent;
    }

    public static final String C(String str) {
        if (dhn.a.contains(dro.class)) {
            return null;
        }
        try {
            if (w0h1.v(wf10.a(), str)) {
                return str;
            }
            return w0h1.v(wf10.a(), A()) ? A() : "";
        } catch (Throwable th) {
            dhn.a(dro.class, th);
            return null;
        }
    }

    public static void D(ynb0 ynb0Var) {
        h = ynb0Var;
    }

    public static jql0 E() {
        return new jql0();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    public static Next F(kzz kzzVar) {
        String queryParameter;
        Next nextA;
        String queryParameter2;
        Integer numC0;
        String queryParameter3;
        String str = kzzVar.a;
        Uri uri = Uri.parse(str);
        String path = uri.getPath();
        String strE = f4i1.e(path != null ? ihc1.g1(path, new char[]{'/'}) : null, "/");
        if (strE.equals("/api/payment-sdk/android/v3/proceed/redirect/")) {
            Uri uri2 = Uri.parse(str);
            String queryParameter4 = uri2.getQueryParameter("payment-session-id");
            if (queryParameter4 == null || (queryParameter2 = uri2.getQueryParameter("attempt")) == null || (numC0 = nhc1.c0(queryParameter2)) == null) {
                nextA = null;
            } else {
                int iIntValue = numC0.intValue();
                String queryParameter5 = uri2.getQueryParameter("provider");
                if (queryParameter5 == null) {
                    nextA = null;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : uri2.getQueryParameterNames()) {
                        if (!f46.S0(new String[]{"payment-session-id", "attempt", "provider"}).contains(str2) && (queryParameter3 = uri2.getQueryParameter(str2)) != null) {
                            linkedHashMap.put(str2, queryParameter3);
                        }
                    }
                    nextA = Next.i(new izc(str, queryParameter4, queryParameter5, iIntValue, linkedHashMap), Collections.singleton(new zfw(queryParameter4, queryParameter5, iIntValue, linkedHashMap)));
                }
            }
        } else if (!strE.equals("/api/payment-sdk/android/v3/cancel/") || (queryParameter = uri.getQueryParameter("payment-session-id")) == null) {
            nextA = null;
        } else {
            nextA = Next.a(Collections.singleton(new mhw(queryParameter)));
        }
        if (nextA != null) {
            return nextA;
        }
        Logger.d("Failed to initialize from URL: ".concat(str), new Object[0]);
        return Next.a(Collections.singleton(new ehw((String) null, 3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public static ft21 G(ft21 ft21Var, ft21 ft21Var2) {
        if (ft21Var2 == null) {
            return ft21Var;
        }
        if (ft21Var == null) {
            return ft21Var2;
        }
        bbn bbnVar = ft21Var.a;
        gt21 gt21Var = ft21Var.b;
        boolean z = ft21Var.c;
        bbn bbnVar2 = ft21Var2.a;
        if (bbnVar2 != null) {
            bbnVar = bbnVar2;
        }
        gt21 gt21Var2 = ft21Var2.b;
        if (gt21Var2 != null) {
            gt21Var = gt21Var2;
        }
        boolean z2 = ft21Var2.c;
        ?? r3 = z;
        if (z2) {
            r3 = z2;
        }
        return new ft21(bbnVar, gt21Var, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EventSource H(Observable observable, agr agrVar, g0l g0lVar, onr onrVar, l6s l6sVar, jks jksVar, Scheduler scheduler, Observable observable2, Observable observable3) {
        return RxEventSources.a(new ObservableSource[]{observable, agrVar.b.map(kuw0.t), ((inr) g0lVar).d().map(jcx0.X0), Observable.create(new ilh1(l6sVar, onrVar, (byte) 16)).startWith(Single.just(new psk1(onrVar.a()))).distinctUntilChanged(), yoi1.i(jksVar.c(), o6x.a).doOnNext(wx91.X).debounce(200L, TimeUnit.MILLISECONDS, scheduler).map(new ezb1(onrVar, (byte) 22)), hqq0.J(g0lVar).map(pdx0.X0), observable2.map(kcx0.X0), observable3.map(rdx0.W0)});
    }

    public static final String I(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return "timeline_text_left_handle";
        }
        if (iC == 1) {
            return "timeline_text_right_handle";
        }
        if (iC == 2) {
            return "timeline_text_progress_handle";
        }
        if (iC == 3) {
            return "timeline_text_frame_duration";
        }
        if (iC == 4) {
            return "timeline_text_preview_progress";
        }
        eg.o();
        return null;
    }

    public static final kmv0 J(Set set) {
        boolean zContains = set.contains("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
        osm1 osm1Var = osm1.d;
        osm1 osm1Var2 = zContains ? osm1Var : null;
        if (!set.contains("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
            osm1Var = null;
        }
        return new kmv0(osm1Var2, osm1Var, set.contains("spotify:playlist:37i9dQZF1FgnTBfUlzkeKt") ? osm1.b : null, 8);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(rzn1 rzn1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-909587856);
        int i2 = (x340Var.i(rzn1Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (rzn1Var instanceof wfm) {
            x340Var.i0(2059401298);
            n((wfm) rzn1Var, x340Var, i2 & 14);
            x340Var.r(false);
        } else if (rzn1Var instanceof vfm) {
            x340Var.i0(2059403447);
            m((vfm) rzn1Var, x340Var, i2 & 14);
            x340Var.r(false);
        } else if (rzn1Var instanceof ufm) {
            x340Var.i0(2059405622);
            shx.a(((ufm) rzn1Var).f, (qim0) null, (hcx) null, (idn0) null, x340Var, 8, 62);
            x340Var.r(false);
        } else {
            if (!(rzn1Var instanceof tfm)) {
                throw p3d1.k(x340Var, 2059400141, false);
            }
            x340Var.i0(2059407763);
            d((tfm) rzn1Var, x340Var, i2 & 14);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vtj(rzn1Var, i);
        }
    }

    public static final void b(rzn1 rzn1Var, vim vimVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(898165387);
        int i2 = (x340Var.i(rzn1Var) ? 4 : 2) | i | (x340Var.i(vimVar) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            kno1.e(er31.a, apo.r(-1075981162, new boj(vimVar, (byte) 2), x340Var), (qim0) null, apo.r(-1620853736, new vtj(rzn1Var), x340Var), x340Var, 25008, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(rzn1Var, vimVar, i, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(rzn1 rzn1Var, wim wimVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1845319779);
        int i2 = (x340Var.i(rzn1Var) ? 4 : 2) | i | (x340Var.i(wimVar) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (wimVar != null) {
            x340Var.i0(-1659724455);
            if ((rzn1Var instanceof wfm) || (rzn1Var instanceof vfm)) {
                x340Var.i0(-469179050);
                b(rzn1Var, wimVar.a, x340Var, i2 & 14);
                x340Var.r(false);
            } else {
                if (!(rzn1Var instanceof ufm) && !(rzn1Var instanceof tfm)) {
                    throw p3d1.k(x340Var, -469181495, false);
                }
                x340Var.i0(-469175427);
                a(rzn1Var, x340Var, i2 & 14);
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            if (wimVar != null) {
                throw p3d1.k(x340Var, -469183343, false);
            }
            x340Var.i0(-469173923);
            a(rzn1Var, x340Var, i2 & 14);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l2i(rzn1Var, wimVar, i, (byte) 20);
        }
    }

    public static final void d(tfm tfmVar, b0k b0kVar, int i) {
        zvx zvxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1979404232);
        int i2 = (x340Var.i(tfmVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            vzn1 vzn1Var = tfmVar.f.g;
            if ((vzn1Var instanceof hgm) || u890.j(vzn1Var, yfm.c) || u890.j(vzn1Var, agm.c)) {
                x340Var.i0(463050115);
                x340Var.r(false);
                zvxVar = er31.a;
            } else {
                if (!u890.j(vzn1Var, xfm.c) && !u890.j(vzn1Var, zfm.c) && !u890.j(vzn1Var, bgm.c) && !u890.j(vzn1Var, cgm.c) && !u890.j(vzn1Var, dgm.c) && !u890.j(vzn1Var, egm.c) && !u890.j(vzn1Var, fgm.c) && !u890.j(vzn1Var, ggm.c)) {
                    throw p3d1.k(x340Var, 463047791, false);
                }
                x340Var.i0(463055039);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar = new zvx();
                x340Var.r(false);
            }
            kno1.e(zvxVar, apo.r(1876842435, new wtj(tfmVar, (byte) 0), x340Var), (qim0) null, apo.r(1442336837, new wtj(tfmVar, (byte) 1), x340Var), x340Var, 25008, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wtj(tfmVar, i);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(252299129);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("ComposeContextMenuHeaderTitle", u291.f(qim0Var3, 1.0f));
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).h, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, (i2 & 14) | 1572864, 0, 1696);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
    public static final void f(igm igmVar, yim yimVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        af5 af5VarZ;
        af5 af5VarP;
        xu30 xu30Var;
        xu30 xu30Var2;
        m4c m4cVar = fkj0.X;
        rzn1 rzn1Var = igmVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1349007922);
        int i2 = i | (x340Var.i(igmVar) ? 4 : 2) | (x340Var.i(yimVar) ? 32 : 16) | 384 | (x340Var.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String str = igmVar.c;
            xu30 xu30VarR = null;
            wim wimVar = yimVar != null ? yimVar.b : null;
            int i3 = (i2 >> 3) & 896;
            x340Var.i0(1562947922);
            if (str == null || str.length() == 0) {
                str = null;
            }
            if (wimVar == null) {
                x340Var.i0(41342226);
                x340Var.r(false);
                str = str;
                af5VarZ = null;
            } else {
                x340Var.i0(-1245592369);
                int i4 = i3 >> 3;
                x340Var.i0(890765930);
                x340Var.i0(1327572454);
                vim vimVar = wimVar.a;
                String str2 = vimVar.b;
                if (str2 == null) {
                    str2 = vimVar.a;
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                } else {
                    if (str2.length() == 0) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str2 = vimVar.a;
                        if (str2.length() == 0) {
                            str2 = null;
                        }
                    }
                }
                if (str2 == null) {
                    x340Var.r(false);
                    x340Var.r(false);
                    af5VarZ = null;
                } else {
                    uwr uwrVar = cbx.a;
                    String str3 = str2;
                    zma1 zma1Var = new zma1(cbx.a(x340Var).b.c, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                    boolean zI = ((((i4 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && x340Var.g(iu30Var)) || (i4 & 48) == 32) | x340Var.i(wimVar);
                    Object objT = x340Var.T();
                    if (zI || objT == m4cVar) {
                        objT = new puh(iu30Var, wimVar, (byte) 18);
                        x340Var.s0(objT);
                    }
                    af5VarZ = wmo1.z(2131954323, str3, "attributedUser", zma1Var, (iu30) objT, x340Var);
                    x340Var.r(false);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            if (str == null && af5VarZ == null) {
                x340Var.r(false);
                af5VarP = null;
            } else {
                ye5 ye5Var = new ye5();
                if (str != null) {
                    ye5Var.g(str);
                }
                if (str != null && af5VarZ != null) {
                    ye5Var.g(" • ");
                }
                if (af5VarZ != null) {
                    ye5Var.h(af5VarZ);
                }
                af5VarP = ye5Var.p();
                x340Var.r(false);
            }
            boolean z = af5VarP == null && rzn1Var == null;
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = cjj.X;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT2);
            uvx uvxVarB = uvx.b((uvx) x340Var.k(vvx.a), z ? 1 : 3, (tvx) null, (p3v) null, 27);
            if (rzn1Var == null) {
                x340Var.i0(-167040727);
                x340Var.r(false);
                xu30Var = null;
            } else {
                x340Var.i0(-167040726);
                xu30 xu30VarR2 = apo.r(1560474680, new e6j(rzn1Var, yimVar, (byte) 2), x340Var);
                x340Var.r(false);
                xu30Var = xu30VarR2;
            }
            if (af5VarP == null) {
                x340Var.i0(-166837956);
                x340Var.r(false);
                xu30Var2 = null;
            } else {
                x340Var.i0(-166837955);
                xu30 xu30VarR3 = apo.r(84373786, new pf1(af5VarP, (byte) 4), x340Var);
                x340Var.r(false);
                xu30Var2 = xu30VarR3;
            }
            xim ximVar = yimVar != null ? yimVar.a : null;
            if (ximVar == null) {
                x340Var.i0(-166745855);
            } else {
                x340Var.i0(-166745854);
                xu30VarR = apo.r(5406750, new okg(ximVar, (byte) 24), x340Var);
            }
            x340Var.r(false);
            jto1.b(qim0VarB2, uvxVarB, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, xu30Var, (xu30) null, xu30Var2, xu30VarR, (xu30) null, (xu30) null, apo.r(1506727593, new zw2(z, igmVar, (byte) 6), x340Var), x340Var, 64, 196608, 26108);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(igmVar, yimVar, qim0Var2, iu30Var, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0233  */
    public static final void g(String str, b4v0 b4v0Var, boolean z, qim0 qim0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        String str2;
        int iC;
        boolean z2;
        boolean z3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1288367183);
        int i2 = i | (x340Var.i(str) ? 4 : 2) | (x340Var.i(b4v0Var) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(function0) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.i(function1) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (i2 & 74899) != 74898)) {
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = b4v0Var.a(str);
                x340Var.s0(objT);
            }
            af5 af5Var = (af5) objT;
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
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT2;
            String strM = l1d.m("… ", cwl1.o0(x340Var, 2131954939));
            String strO0 = cwl1.o0(x340Var, 2131954938);
            zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, cbx.d(x340Var).h.a.b, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var).h.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.b, (Shadow) null, (PlatformSpanStyle) null, 61404);
            err0 err0Var2 = err0Var;
            boolean zE = x340Var.e(err0Var2.s()) | x340Var.g(str);
            Object objT3 = x340Var.T();
            if (zE || objT3 == obj) {
                if (err0Var2.s() > 0) {
                    int iS = err0Var2.s();
                    if (iS < 0) {
                        sf80.a("width must be >= 0");
                    }
                    objT3 = yae1.b(yae1VarQ, af5Var, lee1Var, 0, false, 0, jjl.h(iS, iS, 0, Alert.DURATION_SHOW_INDEFINITELY), flb0Var, (wat) null, (f930) null, 1852);
                    lee1Var = lee1Var;
                } else {
                    objT3 = null;
                }
                x340Var.s0(objT3);
            }
            y9e1 y9e1Var = (y9e1) objT3;
            lee1 lee1Var2 = cbx.d(x340Var).h;
            boolean zG2 = x340Var.g(strM);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                objT4 = Integer.valueOf((int) (yae1.a(yae1VarQ, strM.concat(" "), lee1Var2, 0, false, 0, 0L, flb0Var, (xat) null, 956).c >> 32));
                x340Var.s0(objT4);
            }
            int iIntValue = ((Number) objT4).intValue();
            boolean zE2 = x340Var.e(err0Var2.s()) | x340Var.g(str);
            Object objT5 = x340Var.T();
            if (zE2 || objT5 == obj) {
                if (y9e1Var != null) {
                    zrm0 zrm0Var = y9e1Var.b;
                    if (zrm0Var.f > 5) {
                        str2 = strM;
                        int i3 = (int) (y9e1Var.c >> 32);
                        iC = zrm0Var.c(4, true) - 1;
                        while (iC > 0 && i3 - y9e1Var.c(iC).c <= iIntValue) {
                            iC--;
                        }
                    } else {
                        str2 = strM;
                        iC = 0;
                    }
                } else {
                    str2 = strM;
                    iC = 0;
                }
                objT5 = Integer.valueOf(iC);
                x340Var.s0(objT5);
            } else {
                str2 = strM;
            }
            int iIntValue2 = ((Number) objT5).intValue();
            boolean z4 = (y9e1Var != null ? y9e1Var.b.f : 0) > 5;
            ye5 ye5VarO = kk0.o(1424003613, x340Var);
            if (z || iIntValue2 <= 0 || iIntValue2 >= af5Var.b.length() || !z4) {
                z2 = false;
                x340Var.i0(1343867489);
                x340Var.r(false);
                ye5VarO.h(af5Var);
            } else {
                x340Var.i0(1343639887);
                ye5VarO.h(af5Var.f(0, iIntValue2));
                boolean z5 = (i2 & 57344) == 16384;
                Object objT6 = x340Var.T();
                if (z5 || objT6 == obj) {
                    objT6 = new vj0(function0, (byte) 29);
                    x340Var.s0(objT6);
                }
                vhg.a(ye5VarO, str2, "description_expand", zma1Var, (iu30) objT6);
                z2 = false;
                x340Var.r(false);
            }
            af5 af5VarP = ye5VarO.p();
            x340Var.r(z2);
            uwr uwrVar2 = cbx.a;
            long j = cbx.a(x340Var).b.a;
            cjc0 cjc0Var = new cjc0(z ? Alert.DURATION_SHOW_INDEFINITELY : 5);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            boolean zI = x340Var.i(err0Var);
            Object objT7 = x340Var.T();
            if (zI || objT7 == obj) {
                objT7 = new tu9(err0Var, (byte) 8);
                x340Var.s0(objT7);
            }
            boolean z6 = z4;
            uwo1.d(af5VarP, j, ern1.x(qim0VarZ, (iu30) objT7), lee1Var, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 3760);
            x340Var = x340Var;
            if (z6 && z) {
                x340Var.i0(1195335813);
                boolean zG3 = x340Var.g(strO0);
                Object objT8 = x340Var.T();
                if (zG3 || objT8 == obj) {
                    objT8 = new i3o(strO0, (byte) 16);
                    x340Var.s0(objT8);
                }
                qim0 qim0VarA = s161.a(nim0Var, (iu30) objT8);
                ye5 ye5VarO2 = kk0.o(1424038329, x340Var);
                boolean z7 = (i2 & 458752) == 131072;
                Object objT9 = x340Var.T();
                if (z7 || objT9 == obj) {
                    z3 = false;
                    objT9 = new xet(function1, (byte) 0);
                    x340Var.s0(objT9);
                } else {
                    z3 = false;
                }
                vhg.a(ye5VarO2, strO0, "description_expand", zma1Var, (iu30) objT9);
                af5 af5VarP2 = ye5VarO2.p();
                x340Var.r(z3);
                uwo1.f(af5VarP2, qim0VarA, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4092);
                x340Var = x340Var;
                x340Var.r(z3);
            } else {
                x340Var.i0(1195701179);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, b4v0Var, z, qim0Var, function0, function1, i, (byte) 6);
        }
    }

    public static final void h(int i, iu30 iu30Var, String str, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(24343432);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.g(str) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            avw0 avw0Var = cbx.b(x340Var).c;
            float fX0 = ((wat) x340Var.k(t4k.h)).X0(4.0f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            qim0 qim0VarN = anm1.N(str, u291.v(u291.c(qim0Var, 1.0f), 48.0f));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = nhe1.X;
                x340Var.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT2);
            ae4 ae4Var = new ae4(idn0Var, b2);
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB = f8d1.b(qim0VarA, rih1Var, ae4Var);
            boolean z = ((i3 & 14) == 4) | ((i3 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new cue1(i, iu30Var);
                x340Var.s0(objT3);
            }
            qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB2);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            long j = u7h.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarA2 = da80.a(u291.v(u291.c(uyn1.z(0.0f, 12.0f, 1, eqr0.D(i == 1 ? 39.0f : 5.0f, 0.0f, 2, nim0.a)), 1.0f), 4.0f), idn0Var, jtr.f);
            boolean zF = x340Var.f(j) | x340Var.d(fX0);
            Object objT4 = x340Var.T();
            if (zF || objT4 == m4cVar) {
                objT4 = new qf0(j, fX0, (byte) 6);
                x340Var.s0(objT4);
            }
            j0o1.b(0, x340Var, (iu30) objT4, qim0VarA2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(i, iu30Var, str, qim0Var, i2, (byte) 22);
        }
    }

    public static final void i(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1756664132);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = nhe1.Y;
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarB, 0.0f, 0.0f, 0.0f, 2.0f, 7);
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarB2, jC, er31.b(8.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1Var = cbx.d(x340Var).j;
            cjc0 cjc0Var = new cjc0(1);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.y(qim0Var3, 8.0f, 4.0f), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var, (i2 & 14) | 12582912, 0, 1640);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 24);
        }
    }

    public static final void j(float f2, float f3, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-784589832);
        int i2 = i | (x340Var.d(f2) ? 4 : 2) | (x340Var.d(f3) ? 32 : 16) | (x340Var.i(qim0Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.c;
            x340Var.i0(1923420165);
            kiv kivVar = t4k.h;
            wat watVar = (wat) x340Var.k(kivVar);
            cua cuaVar = cbx.b(x340Var).f;
            float fX0 = watVar.X0(8.0f);
            x340Var.r(false);
            x340Var.i0(1923423427);
            wat watVar2 = (wat) x340Var.k(kivVar);
            avw0 avw0Var = cbx.b(x340Var).c;
            float fX1 = watVar2.X0(4.0f);
            x340Var.r(false);
            float fX2 = ((wat) x340Var.k(kivVar)).X0(14.0f);
            float f4 = f2 - fX2;
            float f5 = f3 + fX2;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zD = x340Var.d(f4) | x340Var.d(f5) | x340Var.d(fX0) | x340Var.d(fX1) | x340Var.f(j);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                due1 due1Var = new due1(f4, f5, fX0, fX1, j);
                x340Var.s0(due1Var);
                objT = due1Var;
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarF);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k82(f2, f3, qim0Var, i, (byte) 2);
        }
    }

    public static final void k(float f2, float f3, Function0 function0, iu30 iu30Var, Function0 function1, float f4, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-532684234);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function1) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.d(f4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            float fX0 = watVar.X0(2.0f);
            float f5 = (fX0 / 2.0f) + f2 + (((f3 - f2) - fX0) * f4);
            cvx cvxVar = cbx.b(x340Var).b;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            qim0 qim0VarD = eqr0.D(watVar.N0(f5) - 8.0f, 0.0f, 2, u291.v(qim0Var, 16.0f));
            ae4 ae4Var = new ae4(idn0Var, (byte) 16);
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB = f8d1.b(qim0VarD, rih1Var, ae4Var);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new mhg(function0, iu30Var, function1, (byte) 12);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = nhe1.Z;
                x340Var.s0(objT3);
            }
            qim0 qim0VarN = anm1.N("timeline_progress_bar", da80.a(s161.a(qim0VarB2, (iu30) objT3), idn0Var, jtr.f));
            boolean zD = x340Var.d(fX0);
            Object objT4 = x340Var.T();
            if (zD || objT4 == m4cVar) {
                objT4 = new vbk0((byte) 24, fX0);
                x340Var.s0(objT4);
            }
            j0o1.b(0, x340Var, (iu30) objT4, qim0VarN);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eue1(f2, f3, function0, iu30Var, function1, f4, qim0Var, i);
        }
    }

    public static final void l(Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1537195408);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var, 2131956120);
            String strO1 = cwl1.o0(x340Var, 2131956118);
            String strO2 = cwl1.o0(x340Var, 2131956119);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new zg20(function0, (byte) 6);
                x340Var.s0(objT);
            }
            zgx zgxVar = new zgx(strO2, new gbx(z50.c, (Function0) objT));
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new zg20(function0, (byte) 7);
                x340Var.s0(objT2);
            }
            mqo1.d((Function0) objT2, (i3u) null, (hux) null, strO0, strO1, zgxVar, (zgx) null, x340Var, 262144, 70);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vgz(function0, i, (byte) 16);
        }
    }

    public static final void m(vfm vfmVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1236200600);
        int i2 = (x340Var.g(vfmVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Drawable drawable = vfmVar.f;
            eso1.f(new yk4(mno1.y(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888)), isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, x340Var, 48, 508);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new boj(vfmVar, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    public static final void n(wfm wfmVar, b0k b0kVar, int i) {
        akx akxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1178417278);
        int i2 = i | (x340Var.i(wfmVar) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            vzn1 vzn1Var = wfmVar.g;
            boolean z = vzn1Var instanceof hgm;
            if (z) {
                x340Var.i0(1412366031);
                Uri uri = wfmVar.f;
                hgm hgmVar = (hgm) vzn1Var;
                String str = hgmVar.c;
                String str2 = hgmVar.d;
                if (str2 == null) {
                    str2 = "";
                }
                bmq0.a(uri, (qim0) null, (hcx) null, str, str2, u7h.k, 0L, false, x340Var, 0, 198);
                x340Var.r(false);
            } else {
                yfm yfmVar = yfm.c;
                if (u890.j(vzn1Var, yfmVar)) {
                    x340Var.i0(1412374278);
                    bmq0.a(wfmVar.f, (qim0) null, (hcx) null, (String) null, (String) null, 0L, 0L, false, x340Var, 0, 254);
                    x340Var.r(false);
                } else {
                    agm agmVar = agm.c;
                    if (u890.j(vzn1Var, agmVar)) {
                        x340Var.i0(1412374278);
                        bmq0.a(wfmVar.f, (qim0) null, (hcx) null, (String) null, (String) null, 0L, 0L, false, x340Var, 0, 254);
                        x340Var.r(false);
                    } else {
                        xfm xfmVar = xfm.c;
                        boolean zJ = u890.j(vzn1Var, xfmVar);
                        ggm ggmVar = ggm.c;
                        fgm fgmVar = fgm.c;
                        egm egmVar = egm.c;
                        dgm dgmVar = dgm.c;
                        cgm cgmVar = cgm.c;
                        bgm bgmVar = bgm.c;
                        zfm zfmVar = zfm.c;
                        if (!zJ && !u890.j(vzn1Var, zfmVar) && !u890.j(vzn1Var, bgmVar) && !u890.j(vzn1Var, cgmVar) && !u890.j(vzn1Var, dgmVar) && !u890.j(vzn1Var, egmVar) && !u890.j(vzn1Var, fgmVar) && !u890.j(vzn1Var, ggmVar)) {
                            throw p3d1.k(x340Var, 1412364270, false);
                        }
                        x340Var.i0(1412379270);
                        Uri uri2 = wfmVar.f;
                        if (u890.j(vzn1Var, xfmVar)) {
                            akxVar = akx.c;
                        } else if (u890.j(vzn1Var, yfmVar)) {
                            akxVar = nkx.c;
                        } else if (u890.j(vzn1Var, zfmVar)) {
                            akxVar = pkx.c;
                        } else if (u890.j(vzn1Var, agmVar)) {
                            akxVar = qkx.c;
                        } else if (u890.j(vzn1Var, bgmVar)) {
                            akxVar = box.c;
                        } else if (u890.j(vzn1Var, dgmVar)) {
                            akxVar = grx.c;
                        } else if (u890.j(vzn1Var, egmVar)) {
                            akxVar = gnx.c;
                        } else if (u890.j(vzn1Var, cgmVar) || u890.j(vzn1Var, fgmVar)) {
                            akxVar = mrx.c;
                        } else if (u890.j(vzn1Var, ggmVar)) {
                            akxVar = ltx.c;
                        } else {
                            if (!z) {
                                eg.o();
                                return;
                            }
                            akxVar = ttx.c;
                        }
                        eso1.e(uri2, isl.a, (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(akxVar, akxVar), false, false, x340Var, 1073741872, 0, 3580);
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new boj(wfmVar, i, (byte) 4);
        }
    }

    public static final void o(nue1 nue1Var, float f2, float f3, float f4, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-622476254);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(h2c.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(nue1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f3) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f4) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            float f5 = nue1Var.e;
            uvg1 uvg1Var = nue1Var.b;
            String strM = ulo1.m((long) ((uvg1Var.c * f5) + uvg1Var.a));
            int i4 = 458752 & i3;
            boolean z = i4 == 131072;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new pwc1(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 131072;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new b1c1(iu30Var, (byte) 14);
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean z3 = i4 == 131072;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new pwc1(iu30Var, (byte) 23);
                x340Var.s0(objT3);
            }
            k(f2, f3, function0, iu30Var2, (Function0) objT3, f5, u291.h(nim0.a, 46.0f), x340Var, (i3 >> 6) & 126);
            wat watVar = (wat) x340Var.k(t4k.h);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            float fX0 = watVar.X0(2.0f);
            t(nue1Var.g == 3, strM, (fX0 / 2.0f) + f2 + (((f3 - f2) - fX0) * f5), f4 / 2.0f, I(3), null, x340Var, i3 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new atl(nue1Var, f2, f3, f4, iu30Var, i);
        }
    }

    public static final void p(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1043155854);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("ComposeContextMenuHeaderTitle", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0VarN, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var, (i2 & 14) | 1572864, 0, 1712);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 16);
        }
    }

    public static final void q(nue1 nue1Var, ggv ggvVar, float f2, float f3, float f4, b0k b0kVar, int i) {
        int i2;
        fue1 fue1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-7049079);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(nue1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ggvVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.d(f4) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i4 = nue1Var.g;
            uvg1 uvg1Var = nue1Var.b;
            uvg1 uvg1Var2 = nue1Var.c;
            float f5 = (f2 + f3) / 2.0f;
            int iC = l1d.C(i4);
            if (iC == 0) {
                fue1Var = new fue1(f2, i4, ulo1.m(uvg1Var.a));
            } else if (iC == 1) {
                fue1Var = new fue1(f3, i4, ulo1.m(uvg1Var.b));
            } else if (iC != 2) {
                fgv fgvVar = ulo1.a;
                if (iC == 3) {
                    long j = uvg1Var2.c;
                    if (j < 1000) {
                        j = 1000;
                    }
                    fue1Var = new fue1(f5, i4, ggvVar.a(j / 1000, fgvVar));
                } else {
                    if (iC != 4) {
                        eg.o();
                        return;
                    }
                    long j2 = uvg1Var2.c;
                    long j3 = (long) (j2 * nue1Var.e);
                    if (j3 < 1000) {
                        j3 = 1000;
                    }
                    String strA = ggvVar.a(j3 / 1000, fgvVar);
                    if (j2 < 1000) {
                        j2 = 1000;
                    }
                    fue1Var = new fue1(f5, i4, f4i1.f(strA, " / ", ggvVar.a(j2 / 1000, fgvVar)));
                }
            } else {
                fue1Var = null;
            }
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.q(fue1Var);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (fue1Var != null) {
                ven0Var.setValue(fue1Var);
            }
            fq7.g(fue1Var != null, h2cVar.a(nim0.a, een.h), xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(-2103834783, new pr30((byte) 1, f4, ven0Var), x340Var), x340Var, 196608, 16);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new atl(nue1Var, ggvVar, f2, f3, f4, i, (byte) 3);
        }
    }

    public static final void r(boolean z, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function1;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1674587918);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, qim0VarF);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarZ);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarP);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(cwl1.o0(x340Var2, 2131953535), uyn1.z(0.0f, 16.0f, 1, nim0Var), cbx.d(x340Var2).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            pm31 pm31Var = new pm31(1);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new ag21(iu30Var, z, (byte) 1);
                x340Var2.s0(objT);
            }
            qim0 qim0VarQ = dgo1.q(nim0Var, z, false, pm31Var, (Function0) objT, 10);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0VarQ);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new g21(eraVar, (byte) 29)), fraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            uwo1.e(cwl1.o0(x340Var2, 2131953531), kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, false), cbx.d(x340Var2).g, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = er81.Z;
                x340Var2.s0(objT2);
            }
            boolean z4 = false;
            aex.b(z, iu30Var, s161.a(nim0Var, (iu30) objT2), (String) null, 0, (idn0) null, (ga80) null, x340Var2, i2 & 126, 120);
            x340Var2.r(true);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarZ3 = uyn1.z(0.0f, 8.0f, 1, nim0Var);
            idx idxVar = new idx(4);
            if ((i2 & 896) == 256) {
                z4 = true;
            }
            Object objT3 = x340Var2.T();
            if (z4 || objT3 == m4cVar) {
                function1 = function0;
                objT3 = new pt61(function1, (byte) 16);
                x340Var2.s0(objT3);
            } else {
                function1 = function0;
            }
            foo1.c(new gbx(z50.c, (Function0) objT3), idxVar, qim0VarZ3, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, iij.a, (vu30) null, iij.b, x340Var2, 805306368, 48, 1528);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(z, iu30Var, function1, i, (byte) 27);
        }
    }

    public static final void s(af5 af5Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-928103302);
        int i2 = i | (x340Var.g(af5Var) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("ComposeContextMenuHeaderSubtitle", qim0Var3);
            uwr uwrVar = cbx.a;
            uwo1.d(af5Var, cbx.a(x340Var).b.b, qim0VarN, cbx.d(x340Var).j, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, (cqs0) null, x340Var, (i2 & 14) | 1572864, 0, 3760);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gnj(af5Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void t(boolean z, String str, float f2, float f3, String str2, nl3 nl3Var, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        nl3 nl3Var2;
        int i3;
        nl3 nl3Var3;
        gra graVar;
        gra graVar2 = een.h;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1264228375);
        int i4 = i & 6;
        h2c h2cVar = h2c.a;
        if (i4 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f2) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                i3 = i2 & (-3670017);
                nl3Var3 = een.Q0;
            } else {
                x340Var.b0();
                i3 = i2 & (-3670017);
                nl3Var3 = nl3Var;
            }
            x340Var.s();
            float fN0 = ((wat) x340Var.k(t4k.h)).N0(f2 - f3);
            if (u890.j(nl3Var3, een.P0)) {
                graVar = een.d;
            } else {
                graVar = u890.j(nl3Var3, een.R0) ? een.f : graVar2;
            }
            fq7.g(z2, anm1.N(str2, u291.A(eqr0.C(h2cVar.a(nim0.a, graVar2), fN0, -46.0f), graVar, true)), xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(264127631, new dba1(str, (byte) 6), x340Var), x340Var, ((i3 >> 3) & 14) | 196608, 16);
            nl3Var2 = nl3Var3;
        } else {
            x340Var.b0();
            nl3Var2 = nl3Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gue1(z, str, f2, f3, str2, nl3Var2, i);
        }
    }

    public static final void u(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(5467954);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ni6(iu30Var, (byte) 5);
                x340Var.s0(objT);
            }
            rih1 rih1Var = rih1.a;
            qim0 qim0VarB = f8d1.b(qim0VarD, rih1Var, (PointerInputEventHandler) objT);
            boolean z2 = i3 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ni6(iu30Var, (byte) 6);
                x340Var.s0(objT2);
            }
            t1c.a(f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new luy0(iu30Var, i, (byte) 3);
        }
    }

    public static final void v(nue1 nue1Var, ggv ggvVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        h311 h311VarV;
        hue1 hue1Var;
        o95 o95Var;
        uvg1 uvg1Var = nue1Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-238038916);
        int i2 = (b0kVar3.i(qim0Var) ? SemanticState.Modal : SemanticState.ReadOnly) | i | (b0kVar3.i(nue1Var) ? 4 : 2) | (b0kVar3.i(ggvVar) ? 32 : 16) | (b0kVar3.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ejk1 ejk1Var = nue1Var.a;
            float f2 = ejk1Var.b;
            long j = ejk1Var.c;
            if (f2 <= 0.0f) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    hue1Var = new hue1(nue1Var, ggvVar, iu30Var, qim0Var, i, (byte) 0);
                }
            } else {
                float fB = ejk1Var.b() * (uvg1Var.a - j);
                float fB2 = ejk1Var.b() * (uvg1Var.b - j);
                z061 z061Var = nue1Var.d;
                Throwable th = null;
                z061 z061Var2 = z061Var instanceof z061 ? z061Var : null;
                float f3 = z061Var2 != null ? z061Var2.c : 0.0f;
                boolean z = z061Var instanceof b161;
                Object objT = b0kVar3.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = c97.b(fB);
                    b0kVar3.s0(objT);
                }
                o95 o95Var2 = (o95) objT;
                Object objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = c97.b(fB2);
                    b0kVar3.s0(objT2);
                }
                o95 o95Var3 = (o95) objT2;
                Float fValueOf = Float.valueOf(fB);
                Boolean boolValueOf = Boolean.valueOf(z);
                boolean zH = b0kVar3.h(z) | b0kVar3.i(o95Var2) | b0kVar3.d(fB);
                Object objT3 = b0kVar3.T();
                if (zH || objT3 == m4cVar) {
                    objT3 = new iue1(z, o95Var2, fB, null, (byte) 0);
                    th = null;
                    b0kVar3.s0(objT3);
                }
                qxd0.s(fValueOf, boolValueOf, (vu30) objT3, b0kVar3);
                Float fValueOf2 = Float.valueOf(fB2);
                Boolean boolValueOf2 = Boolean.valueOf(z);
                boolean zH2 = b0kVar3.h(z) | b0kVar3.i(o95Var3) | b0kVar3.d(fB2);
                Object objT4 = b0kVar3.T();
                if (zH2 || objT4 == m4cVar) {
                    o95Var = o95Var3;
                    objT4 = new iue1(z, o95Var, fB2, th, (byte) 1);
                    b0kVar3.s0(objT4);
                } else {
                    o95Var = o95Var3;
                }
                qxd0.s(fValueOf2, boolValueOf2, (vu30) objT4, b0kVar3);
                boolean z2 = z061Var2 != null;
                Boolean boolValueOf3 = Boolean.valueOf(z2);
                boolean zH3 = b0kVar3.h(z2) | ((i2 & 896) == 256);
                Object objT5 = b0kVar3.T();
                if (zH3 || objT5 == m4cVar) {
                    objT5 = new oy3(z2, iu30Var, th, (byte) 20);
                    b0kVar3.s0(objT5);
                }
                qxd0.t(boolValueOf3, b0kVar3, (vu30) objT5);
                wat watVar = (wat) b0kVar3.k(t4k.h);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                Throwable th2 = th;
                int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM = b0kVar3.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
                hzj.A.getClass();
                if (((x340) b0kVar3).a == null) {
                    tgp1.p();
                    throw th2;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(hmb0.t1);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(gfh0VarC, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                float fFloatValue = ((z061Var2 != null ? z061Var2.a : 0) == 1 ? f3 : 0.0f) + ((Number) o95Var2.e()).floatValue();
                float fFloatValue2 = ((Number) o95Var.e()).floatValue();
                if ((z061Var2 != null ? z061Var2.a : 0) != 2) {
                    f3 = 0.0f;
                }
                float f4 = fFloatValue2 + f3;
                nim0 nim0Var = nim0.a;
                j(fFloatValue, f4, h2c.a.a(u291.h(nim0Var, 46.0f), een.X), b0kVar3, 0);
                u(iu30Var, b0kVar3, (i2 >> 6) & 14);
                float f5 = ejk1Var.b;
                int i3 = i2 << 3;
                int i4 = 6 | (i3 & ContentType.LONG_FORM_ON_DEMAND);
                o(nue1Var, fFloatValue, f4, f5, iu30Var, b0kVar3, ((i2 << 9) & 458752) | i4);
                q(nue1Var, ggvVar, fFloatValue, f4, ejk1Var.b / 2.0f, b0kVar3, i4 | (i3 & 896));
                b0kVar2 = b0kVar3;
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(b0kVar2).d;
                qim0 qim0VarD = eqr0.D(watVar.N0(fFloatValue) - 48.0f, 0.0f, 2, nim0Var);
                int i5 = ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 390;
                h(1, iu30Var, "timeline_left_handle", qim0VarD, b0kVar2, i5);
                h(2, iu30Var, "timeline_right_handle", eqr0.D(watVar.N0(f4), 0.0f, 2, nim0Var), b0kVar2, i5);
                b0kVar2.r(true);
            }
            h311VarV.d = hue1Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            hue1Var = new hue1(nue1Var, ggvVar, iu30Var, qim0Var, i, (byte) 1);
            h311VarV.d = hue1Var;
        }
    }

    public static final Integer w(qfd qfdVar) {
        rh7 rh7Var = qfdVar.d;
        if (rh7Var == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(rh7Var.a);
        if (qfdVar.b || qfdVar.c != 3) {
            return null;
        }
        return numValueOf;
    }

    public static final Object x(nav0 nav0Var, Function0 function0, iu30 iu30Var, Function0 function1, lnm lnmVar) {
        m811 m811Var = new m811();
        Object objH = g5v.h(new d110(m811Var, function1, (byte) 1), new d110(m811Var, function1, (byte) 2), lnmVar, new hii0(function0, (byte) 29), new sdb1(m811Var, iu30Var, (byte) 27), nav0Var);
        return objH == d9n.a ? objH : rih1.a;
    }

    public static long y() {
        return vzp0.c;
    }

    public static final String z() {
        if (!dhn.a.contains(dro.class)) {
            try {
                Context contextA = wf10.a();
                List<ResolveInfo> listQueryIntentServices = contextA.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                String[] strArr = a;
                HashSet hashSet = new HashSet(zno1.s(3));
                f46.K0(strArr, hashSet);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th) {
                dhn.a(dro.class, th);
                return null;
            }
        }
        return null;
    }
}
