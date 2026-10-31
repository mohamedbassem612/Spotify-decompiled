package p;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontWeight;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class u890 {
    public static final float[] a = new float[91];
    public static final int[] b = {R.attr.theme, 2130970446};
    public static final int[] c = {2130969726};
    public static final String[] d = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] e = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static b180 f = null;
    public static boolean g = true;
    public static Field h;
    public static boolean i;

    public static String A(Object obj, String str) {
        return str + obj;
    }

    public static void B() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void C(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(f4i1.f("lateinit property ", str, " has not been initialized"));
        y(uninitializedPropertyAccessException, u890.class.getName());
        throw uninitializedPropertyAccessException;
    }

    public static final double D(int i2) {
        return (((double) ((i2 >>> 31) << 30)) * 2.0d) + ((double) (Integer.MAX_VALUE & i2));
    }

    public static final double E(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final long F(long j, long j2) {
        int iE;
        int iG = nbe1.g(j);
        int iF = nbe1.f(j);
        if ((nbe1.g(j2) < nbe1.f(j)) && (nbe1.g(j) < nbe1.f(j2))) {
            if (nbe1.a(j2, j)) {
                iG = nbe1.g(j2);
                iF = iG;
            } else {
                if (nbe1.a(j, j2)) {
                    iE = nbe1.e(j2);
                } else {
                    int iG2 = nbe1.g(j2);
                    if (iG >= nbe1.f(j2) || iG2 > iG) {
                        iF = nbe1.g(j2);
                    } else {
                        iG = nbe1.g(j2);
                        iE = nbe1.e(j2);
                    }
                }
                iF -= iE;
            }
        } else if (iF > nbe1.g(j2)) {
            iG -= nbe1.e(j2);
            iE = nbe1.e(j2);
            iF -= iE;
        }
        return e6p1.e(iG, iF);
    }

    public static final Object G(k1r k1rVar) {
        if (k1rVar instanceof i1r) {
            return ((i1r) k1rVar).a;
        }
        return null;
    }

    public static ia30 H(int i2) {
        if (1 > i2 || i2 >= 1001) {
            rf80.a("'wght' value must be in [1, 1000]. Actual: " + i2);
        }
        return new ia30(i2);
    }

    public static ha30 I(float f2) {
        if (f2 <= 0.0f) {
            rf80.a("'wdth' must be strictly > 0.0f. Actual: " + f2);
        }
        return new ha30("wdth", f2);
    }

    public static Context J(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof plm) && ((plm) context).a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        plm plmVar = new plm(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, b);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            plmVar.getTheme().applyStyle(resourceId2, true);
        }
        return plmVar;
    }

    public static Object K(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static final void a(id01 id01Var, iu30 iu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-370860690);
        int i4 = i2 | (x340Var.e(id01Var == null ? -1 : id01Var.ordinal()) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var);
            d36 d36Var = new d36(wuxVarB.b.b, true, new um5((byte) 16));
            fra fraVar = een.N0;
            qim0 qim0VarT = l6o1.t(nim0.a, l6o1.C(0, 0, 1, x340Var), 14);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarT);
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
            yy51.b(((i4 >> 3) & 896) | 3078, cwl1.o0(x340Var, 2131955623), "ereader_selection_menu_color_picker_back", function1, dsi.a, x340Var);
            x340Var.i0(-178800805);
            t0z t0zVarA = id01.a();
            t0zVarA.getClass();
            d7 d7Var = new d7(t0zVarA, (byte) 0);
            while (d7Var.hasNext()) {
                id01 id01Var2 = (id01) d7Var.next();
                j2i j2iVarR = apo.r(-884701107, new kf2(id01Var2 == id01Var, wuxVarB, id01Var2), x340Var);
                int iOrdinal = id01Var2.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2131955646;
                } else if (iOrdinal == 1) {
                    i3 = 2131955643;
                } else if (iOrdinal == 2) {
                    i3 = 2131955642;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return;
                    }
                    i3 = 2131955644;
                }
                String strO0 = cwl1.o0(x340Var, i3);
                boolean zE = ((i4 & 112) == 32) | x340Var.e(id01Var2.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new hs20(iu30Var, id01Var2, (byte) 22);
                    x340Var.s0(objT);
                }
                yy51.b(6, strO0, rjo1.o(id01Var2), (Function0) objT, j2iVarR, x340Var);
            }
            x340Var.r(false);
            if (id01Var != null) {
                x340Var.i0(-1246681982);
                yy51.b((i4 & 896) | 3078, cwl1.o0(x340Var, 2131955645), "ereader_selection_menu_color_picker_remove", function0, apo.r(-671898909, new yg20(wuxVarB, (byte) 18), x340Var), x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-1245807472);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(id01Var, iu30Var, function0, function1, i2, (byte) 1);
        }
    }

    public static final void b(kc91 kc91Var, j2i j2iVar, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(994750566);
        int i3 = (x340Var.g(kc91Var) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            tob1 tob1VarJ = null;
            zob1 zob1VarA = kc91Var != null ? kc91Var.a() : null;
            if (zob1VarA == null) {
                x340Var.i0(-660099253);
            } else {
                x340Var.i0(-1822408842);
                tob1VarJ = xto.j(zob1VarA, x340Var);
            }
            x340Var.r(false);
            if (tob1VarJ == null || ((Boolean) tob1VarJ.getValue()).booleanValue()) {
                x340Var.i0(-660017412);
                x340Var.r(false);
            } else {
                x340Var.i0(-660051047);
                j2iVar.invoke(apo.r(1392786726, new dj71(kc91Var, (byte) 28), x340Var), x340Var, 54);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l04(kc91Var, j2iVar, i2, (byte) 8);
        }
    }

    public static final void c(pa51 pa51Var, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        mmr0 mmr0Var;
        cr31 cr31VarB;
        jsl jslVar;
        ltx ltxVar;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(878711945);
        int i3 = i2 | (x340Var.g(pa51Var) ? 4 : 2) | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            int iC = l1d.C(pa51Var.a());
            if (iC == 0) {
                x340Var.i0(1893151295);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                mmr0Var = new mmr0(new p3v(48.0f), new p3v(48.0f));
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, -1601500440, false);
                }
                x340Var.i0(1893320586);
                mmr0Var = new mmr0(new p3v(dsa0.m(x340Var, 2131167202)), new p3v(dsa0.m(x340Var, 2131167201)));
                x340Var.r(false);
            }
            float f2 = ((p3v) mmr0Var.a).a;
            float f3 = ((p3v) mmr0Var.b).a;
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (pa51Var.h()) {
                x340Var.i0(1620732169);
                String strE = pa51Var.e();
                if (strE == null) {
                    strE = "";
                }
                too1.a(strE, (gw70) x340Var.k(oi7.a), u291.s(qim0Var3, f2, f3), x340Var, 0, 0);
                x340Var.r(false);
                z = false;
                qim0Var2 = qim0Var3;
            } else {
                x340Var.i0(1620962499);
                qim0 qim0VarS = u291.s(qim0Var3, f2, f3);
                int iOrdinal = pa51Var.d().ordinal();
                if (iOrdinal == 0) {
                    x340Var.i0(-2029233306);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    cr31VarB = er31.b(4.0f);
                    x340Var.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var, -2029234324, false);
                    }
                    x340Var.i0(-2029230887);
                    x340Var.r(false);
                    cr31VarB = er31.a;
                }
                qim0 qim0VarH = pqo.h(i1p1.q(qim0VarS, cr31VarB), pa51Var.f());
                String strE2 = pa51Var.e();
                Uri uri = strE2 != null ? Uri.parse(strE2) : Uri.EMPTY;
                uri.getClass();
                if (pa51Var.g()) {
                    x340Var.i0(1621250210);
                    jslVar = new jsl(cwl1.o0(x340Var, 2131963744));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1621397243);
                    x340Var.r(false);
                    jslVar = isl.a;
                }
                jsl jslVar2 = jslVar;
                switch (pa51Var.c().ordinal()) {
                    case 0:
                        ltxVar = akx.c;
                        break;
                    case 1:
                        ltxVar = nkx.c;
                        break;
                    case 2:
                        ltxVar = pkx.c;
                        break;
                    case 3:
                        ltxVar = qkx.c;
                        break;
                    case 4:
                        ltxVar = mrx.c;
                        break;
                    case 5:
                        ltxVar = ykx.c;
                        break;
                    case 6:
                        ltxVar = znx.c;
                        break;
                    case 7:
                        ltxVar = grx.c;
                        break;
                    case 8:
                        ltxVar = mrx.c;
                        break;
                    case 9:
                        ltxVar = ltx.c;
                        break;
                    default:
                        eg.o();
                        return;
                }
                z = false;
                qim0Var2 = qim0Var3;
                eso1.e(uri, jslVar2, qim0VarH, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, new pux(hso1.G(ltxVar, 0L, 0L, x340Var, 8, 30)), false, false, x340Var, 1075314688, 0, 3512);
                x340Var.r(false);
            }
            if (pa51Var.b().length() > 0) {
                x340Var.i0(1621710870);
                String strB = pa51Var.b();
                qim0 qim0VarA = h2c.a.a(qim0Var2, graVar);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                suo1.f(strB, 18, uyn1.x(qim0VarA, 4.0f), 1, x340Var, 24624, 8);
                x340Var.r(z);
            } else {
                x340Var.i0(1621954003);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jt41(pa51Var, qim0Var2, i2, (byte) 3);
        }
    }

    public static ja30 d(FontWeight fontWeight, ga30... ga30VarArr) {
        c8b1 c8b1Var = new c8b1(3);
        c8b1Var.a(H(fontWeight.a));
        c8b1Var.a(new ha30("ital", 0.0f));
        c8b1Var.b(ga30VarArr);
        return new ja30((ga30[]) c8b1Var.d(new ga30[c8b1Var.c()]));
    }

    public static umv0 e(omv0 omv0Var, omv0 omv0Var2) {
        return new umv0(Arrays.asList(omv0Var, omv0Var2));
    }

    public static boolean f(float f2, Float f3) {
        return f3 != null && f2 == f3.floatValue();
    }

    public static boolean g(Double d2, double d3) {
        return d2 != null && d2.doubleValue() == d3;
    }

    public static boolean h(Float f2, float f3) {
        return f2 != null && f2.floatValue() == f3;
    }

    public static boolean i(Float f2, Float f3) {
        if (f2 == null) {
            return f3 == null;
        }
        return f3 != null && f2.floatValue() == f3.floatValue();
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    public static final Object k(k1r k1rVar, d0r d0rVar, n4r n4rVar) {
        String strConcat;
        if (k1rVar instanceof i1r) {
            return ((i1r) k1rVar).a;
        }
        if (n4rVar == null) {
            strConcat = null;
        } else {
            String strG = d0rVar != null ? d0rVar.g(n4rVar) : null;
            if (strG != null) {
                strConcat = "\nPool: ".concat(strG);
            } else {
                strConcat = null;
            }
        }
        if (strConcat == null) {
            strConcat = "";
        }
        eg.m(f4i1.f("Kodiak expected the DataResult to be loaded, but it wasn't.\nPlease ensure you requested the data in your DataElement.\nIf you're not using List Content, make sure the host surface filters out unloaded elements.\nDataResult: ", i3p1.v(k1rVar), strConcat));
        return null;
    }

    public static final Object l(hfp1 hfp1Var, onm onmVar) throws Exception {
        if (!hfp1Var.i()) {
            ohd ohdVar = new ohd(1, aym.t(onmVar));
            ohdVar.t();
            hfp1Var.l(m5u.b, new o6b0(ohdVar));
            return ohdVar.r();
        }
        Exception excF = hfp1Var.f();
        if (excF != null) {
            throw excF;
        }
        if (!hfp1Var.d) {
            return hfp1Var.g();
        }
        throw new CancellationException("Task " + hfp1Var + " was cancelled normally.");
    }

    public static Object m(moy0 moy0Var, int i2, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        vbm[] vbmVarArr = q601.a;
        if (vbmVarArr.length <= 0) {
            moy0Var.subscribe(new rc9(ohdVar, i2));
            return ohdVar.r();
        }
        vbm vbmVar = vbmVarArr[0];
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(x8c0 x8c0Var, onm onmVar) throws Throwable {
        hbc0 hbc0Var;
        x8c0 x8c0Var2;
        p811 p811Var;
        Throwable th;
        hac0 hac0Var;
        hac0 hac0Var2;
        if (onmVar instanceof hbc0) {
            hbc0Var = (hbc0) onmVar;
            int i2 = hbc0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hbc0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                hbc0Var = new hbc0(onmVar);
            }
        } else {
            hbc0Var = new hbc0(onmVar);
        }
        Object obj = hbc0Var.c;
        int i3 = hbc0Var.d;
        rih1 rih1Var = rih1.a;
        if (i3 == 0) {
            hm5.M(obj);
            if (!x8c0Var.b().a(w8c0.d)) {
                p811 p811Var2 = new p811();
                try {
                    hbc0Var.a = x8c0Var;
                    hbc0Var.b = p811Var2;
                    hbc0Var.d = 1;
                    ohd ohdVar = new ohd(1, aym.t(hbc0Var));
                    ohdVar.t();
                    ibc0 ibc0Var = new ibc0(ohdVar);
                    p811Var2.a = ibc0Var;
                    x8c0Var.a(ibc0Var);
                    Object objR = ohdVar.r();
                    d9n d9nVar = d9n.a;
                    if (objR == d9nVar) {
                        return d9nVar;
                    }
                    x8c0Var2 = x8c0Var;
                    p811Var = p811Var2;
                    hac0Var2 = (hac0) p811Var.a;
                    if (hac0Var2 != null) {
                        x8c0Var2.d(hac0Var2);
                    }
                } catch (Throwable th2) {
                    x8c0Var2 = x8c0Var;
                    p811Var = p811Var2;
                    th = th2;
                    hac0Var = (hac0) p811Var.a;
                    if (hac0Var != null) {
                        x8c0Var2.d(hac0Var);
                    }
                    throw th;
                }
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var = hbc0Var.b;
            x8c0Var2 = hbc0Var.a;
            try {
                hm5.M(obj);
                hac0Var2 = (hac0) p811Var.a;
                if (hac0Var2 != null) {
                    x8c0Var2.d(hac0Var2);
                }
            } catch (Throwable th3) {
                th = th3;
                hac0Var = (hac0) p811Var.a;
                if (hac0Var != null) {
                    x8c0Var2.d(hac0Var);
                }
                throw th;
            }
        }
        return rih1Var;
    }

    public static int o(int i2, int i3, int i4) {
        if (i2 < i3) {
            return i3;
        }
        return i2 > i4 ? i4 : i2;
    }

    public static final void p(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                j2h1.h(th, th2);
            }
        }
    }

    public static int q(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }

    public static int r(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static n5n1 s(Context context) {
        yrg0 yrg0Var;
        synchronized (m5n1.class) {
            yrg0Var = m5n1.a;
            if (yrg0Var == null) {
                yrg0Var = new yrg0(xyn1.m(context));
                m5n1.a = yrg0Var;
            }
        }
        return (n5n1) ((l5n1) yrg0Var.b).b();
    }

    public static final bn31 t(Context context, Class cls, String str) {
        if (ihc1.y0(str)) {
            hhg1.n("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new bn31(context, cls, str);
        }
        hhg1.n("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3 A[RETURN] */
    public static rhc u(String str) {
        int i2;
        char cCharAt;
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i3 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i3];
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i4 >= length) {
                int i8 = i5 % 4;
                if (i8 != 1) {
                    if (i8 == 2) {
                        bArrCopyOf[i7] = (byte) ((i6 << 12) >> 16);
                        i7++;
                    } else if (i8 == 3) {
                        int i9 = i6 << 6;
                        int i10 = i7 + 1;
                        bArrCopyOf[i7] = (byte) (i9 >> 16);
                        i7 += 2;
                        bArrCopyOf[i10] = (byte) (i9 >> 8);
                    }
                    if (i7 != i3) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i7);
                    }
                }
                if (bArrCopyOf != null) {
                    return new rhc(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i4);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i2 = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i2 = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i2 = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i2 = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i2 = 63;
                }
                i4++;
            }
            i6 = (i6 << 6) | i2;
            i5++;
            if (i5 % 4 == 0) {
                bArrCopyOf[i7] = (byte) (i6 >> 16);
                int i11 = i7 + 2;
                bArrCopyOf[i7 + 1] = (byte) (i6 >> 8);
                i7 += 3;
                bArrCopyOf[i11] = (byte) i6;
            }
            i4++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new rhc(bArrCopyOf);
        }
        return null;
    }

    public static rhc v(String str) {
        if (str.length() % 2 != 0) {
            hhg1.f("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (bro1.j(str.charAt(i3 + 1)) + (bro1.j(str.charAt(i3)) << 4));
        }
        return new rhc(bArr);
    }

    public static rhc w(String str) {
        rhc rhcVar = new rhc(ryn1.m(str));
        rhcVar.c = str;
        return rhcVar;
    }

    public static void y(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public float x(View view) {
        if (g) {
            try {
                return g961.d(view);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        return view.getAlpha();
    }

    public void z(View view, float f2) {
        if (g) {
            try {
                g961.f(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
        view.setAlpha(f2);
    }
}
