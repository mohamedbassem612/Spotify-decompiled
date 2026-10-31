package p;

import android.view.View;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.PlayerState;
import com.spotify.podcast.access.proto.OfferExplanation;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zi20 implements v0i, Function, k1q0, Predicate, Init, BiFunction, yfr0, s2i1 {
    public final /* synthetic */ byte a;
    public static final zi20 b = new zi20(0);
    public static final zi20 c = new zi20(1);
    public static final zi20 d = new zi20(2);
    public static final zi20 e = new zi20(3);
    public static final zi20 f = new zi20(5);
    public static final zi20 g = new zi20(7);
    public static final zi20 h = new zi20(9);
    public static final zi20 i = new zi20(10);
    public static final zi20 t = new zi20(11);
    public static final zi20 X = new zi20(12);
    public static final zi20 Y = new zi20(13);
    public static final zi20 Z = new zi20(14);
    public static final zi20 N0 = new zi20(15);
    public static final zi20 O0 = new zi20(16);
    public static final zi20 P0 = new zi20(17);
    public static final zi20 Q0 = new zi20(18);
    public static final zi20 R0 = new zi20(19);
    public static final zi20 S0 = new zi20(20);
    public static final zi20 T0 = new zi20(21);
    public static final zi20 U0 = new zi20(22);
    public static final zi20 V0 = new zi20(23);
    public static final zi20 W0 = new zi20(24);
    public static final zi20 X0 = new zi20(25);
    public static final zi20 Y0 = new zi20(26);
    public static final zi20 Z0 = new zi20(27);
    public static final zi20 a1 = new zi20(28);
    public static final zi20 b1 = new zi20(29);

    public /* synthetic */ zi20(byte b2) {
        this.a = b2;
    }

    public static kka0 b(String str) {
        nja0 nja0Var;
        char cCharAt = str.charAt(0);
        nja0[] nja0VarArrValues = nja0.values();
        int length = nja0VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                nja0Var = null;
                break;
            }
            nja0Var = nja0VarArrValues[i2];
            if (nja0Var.c.charAt(0) == cCharAt) {
                break;
            }
            i2++;
        }
        if (nja0Var != null) {
            return new jka0(nja0Var);
        }
        if (cCharAt == 'V') {
            return new jka0((nja0) null);
        }
        if (cCharAt == '[') {
            return new hka0(b(str.substring(1)));
        }
        if (cCharAt == 'L') {
            ihc1.n0(str, ';');
        }
        return new ika0(cy30.h(1, 1, str));
    }

    public static boolean c(gqm1 gqm1Var) {
        return gqm1Var.a.h();
    }

    public static kt60 d(fv60 fv60Var, String str) {
        Object next;
        os60 os60Var = fv60Var.a;
        ms60 ms60Var = os60Var != null ? os60Var.b : null;
        ls60 ls60Var = ms60Var instanceof ls60 ? (ls60) ms60Var : null;
        if (ls60Var != null) {
            ArrayList arrayList = ls60Var.b.a;
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((js60) next).b, str));
            js60 js60Var = (js60) next;
            if (js60Var != null) {
                ArrayList<js60> arrayListJ0 = o7h.J0(arrayList, js60Var);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayListJ0, 10));
                for (js60 js60Var2 : arrayListJ0) {
                    arrayList2.add(new kgs0(js60Var2.b, js60Var2.c.name(), js60Var2.d));
                }
                return new kt60(new np21(arrayList2));
            }
        }
        return null;
    }

    public static String e(kka0 kka0Var) {
        if (kka0Var instanceof hka0) {
            return "[".concat(e(((hka0) kka0Var).i));
        }
        if (kka0Var instanceof jka0) {
            nja0 nja0Var = ((jka0) kka0Var).i;
            return nja0Var != null ? nja0Var.c : "V";
        }
        if (kka0Var instanceof ika0) {
            return gvg.k(new StringBuilder("L"), ((ika0) kka0Var).i, ';');
        }
        eg.o();
        return null;
    }

    public static Next f(fv60 fv60Var, ru60 ru60Var) {
        gt60 lt60Var;
        String str;
        ns60 ns60Var;
        ps60 ps60Var;
        List list;
        Set setA;
        kt60 kt60VarD;
        js60 js60Var;
        ps60 ps60Var2;
        Object next;
        os60 os60Var = fv60Var.a;
        if (ru60Var instanceof yt60) {
            yt60 yt60Var = (yt60) ru60Var;
            return Next.a(Effects.a(new at60[]{new at60(yt60Var.a, yt60Var.b, yt60Var.c, yt60Var.d, yt60Var.e, yt60Var.f)}));
        }
        if (ru60Var instanceof eu60) {
            return Next.a(Effects.a(new ct60[]{new ct60(((eu60) ru60Var).a)}));
        }
        if (ru60Var instanceof bu60) {
            bu60 bu60Var = (bu60) ru60Var;
            return Next.a(Effects.a(new bt60[]{new bt60(bu60Var.a, bu60Var.b)}));
        }
        if (ru60Var instanceof vt60) {
            vt60 vt60Var = (vt60) ru60Var;
            return Next.a(Effects.a(new zs60[]{new zs60(vt60Var.a, vt60Var.b, vt60Var.c)}));
        }
        if (ru60Var instanceof nu60) {
            nu60 nu60Var = (nu60) ru60Var;
            return Next.a(Effects.a(new et60[]{new et60(nu60Var.a, nu60Var.b, nu60Var.c)}));
        }
        ms60 ms60Var = null;
        if (ru60Var instanceof ku60) {
            ku60 ku60Var = (ku60) ru60Var;
            ms60Var = os60Var != null ? os60Var.b : null;
            if (ms60Var instanceof ls60) {
                ArrayList arrayList = ((ls60) ms60Var).b.a;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((js60) it.next()).e);
                    }
                    return Next.a(Effects.a(new dt60[]{new dt60(arrayList2, ku60Var.a)}));
                }
            }
            return Next.j();
        }
        if (ru60Var instanceof au60) {
            return Next.a(Effects.a(new lt60[]{new lt60(((au60) ru60Var).a.a)}));
        }
        if (ru60Var instanceof zt60) {
            us60 us60Var = ((zt60) ru60Var).a;
            boolean zEquals = us60Var.equals(ts60.b);
            shz shzVar = rhz.a;
            if (!zEquals) {
                if (!(us60Var instanceof us60)) {
                    eg.o();
                    return null;
                }
                int iC = l1d.C(us60Var.b);
                if (iC == 0) {
                    shzVar = shz.a;
                } else if (iC != 1 && iC != 2) {
                    eg.o();
                    return null;
                }
            }
            return Next.a(Effects.a(new gt60[]{new gt60(shzVar)}));
        }
        if (ru60Var instanceof du60) {
            return Next.a(Effects.a(new lt60[]{new lt60(((du60) ru60Var).a.a)}));
        }
        if (ru60Var instanceof cu60) {
            return Next.a(Effects.a(new gt60[]{new gt60(thz.a)}));
        }
        boolean z = ru60Var instanceof xt60;
        is60 is60Var = is60.a;
        if (z) {
            kb kbVar = ((xt60) ru60Var).b;
            if (kbVar == null) {
                return Next.j();
            }
            np21 np21Var = kbVar.a;
            if (oto1.r(np21Var)) {
                return Next.h(new fv60(os60Var != null ? os60.a(os60Var, (ns60) null, is60Var, 1) : new os60((ns60) null, is60Var, 1)));
            }
            np21Var.getClass();
            return Next.a(Effects.a(new kt60[]{new kt60(np21Var)}));
        }
        if (ru60Var instanceof wt60) {
            wt60 wt60Var = (wt60) ru60Var;
            ms60 ms60Var2 = wt60Var.a;
            ss60 ss60Var = wt60Var.b;
            boolean zEquals2 = ss60Var.equals(rs60.b);
            phz phzVar = ohz.a;
            if (!zEquals2) {
                if (!(ss60Var instanceof ss60)) {
                    eg.o();
                    return null;
                }
                int iC2 = l1d.C(ss60Var.b);
                if (iC2 == 0) {
                    phzVar = qhz.a;
                } else if (iC2 == 1) {
                    ms60 ms60Var3 = os60Var != null ? os60Var.b : null;
                    ls60 ls60Var = ms60Var3 instanceof ls60 ? (ls60) ms60Var3 : null;
                    if (ls60Var != null) {
                        Iterator it2 = ls60Var.b.a.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!u890.j(((js60) next).b, ms60Var2));
                        js60Var = (js60) next;
                    } else {
                        js60Var = null;
                    }
                    if (js60Var != null && (ps60Var2 = js60Var.a) != null) {
                        ms60Var = ps60Var2.b;
                    }
                    if (ms60Var == null) {
                        ms60Var = ms60Var2;
                    }
                    phzVar = new phz(ms60Var);
                } else if (iC2 != 2) {
                    eg.o();
                    return null;
                }
            }
            HashSet hashSetA = Effects.a(new gt60[]{new gt60(phzVar)});
            if ((phzVar instanceof phz) && (kt60VarD = d(fv60Var, ms60Var2)) != null) {
                hashSetA.add(kt60VarD);
            }
            return Next.a(hashSetA);
        }
        boolean z2 = ru60Var instanceof pu60;
        jto1 jto1Var = jt60.b;
        if (z2) {
            zj11 zj11Var = ((pu60) ru60Var).b;
            if (zj11Var == null) {
                return Next.j();
            }
            np21 np21Var2 = zj11Var.a;
            if (oto1.r(np21Var2)) {
                return Next.i(new fv60(os60Var != null ? os60.a(os60Var, (ns60) null, is60Var, 1) : new os60((ns60) null, is60Var, 1)), Effects.a(new jt60[]{jto1Var}));
            }
            np21Var2.getClass();
            return Next.a(Effects.a(new jto1[]{new kt60(np21Var2), jto1Var}));
        }
        if (ru60Var instanceof ou60) {
            ou60 ou60Var = (ou60) ru60Var;
            hv60 hv60Var = ou60Var.b;
            boolean zEquals3 = hv60Var.equals(gv60.b);
            vhz vhzVar = vhz.a;
            if (zEquals3) {
                setA = Effects.a(new gt60[]{new gt60(vhzVar)});
            } else {
                if (!(hv60Var instanceof hv60)) {
                    eg.o();
                    return null;
                }
                int iC3 = l1d.C(hv60Var.b);
                if (iC3 == 0) {
                    Set setW0 = dm61.w0(new jto1[]{jto1Var});
                    kt60 kt60VarD2 = d(fv60Var, ou60Var.a);
                    if (kt60VarD2 != null) {
                        setW0.add(kt60VarD2);
                    }
                    setA = setW0;
                } else {
                    if (iC3 != 1) {
                        eg.o();
                        return null;
                    }
                    setA = Effects.a(new gt60[]{new gt60(vhzVar)});
                }
            }
            return Next.a(setA);
        }
        if (ru60Var instanceof mu60) {
            return Next.h(new fv60(os60Var != null ? os60.a(os60Var, (ns60) null, is60Var, 1) : new os60((ns60) null, is60Var, 1)));
        }
        if (ru60Var instanceof lu60) {
            return Next.j();
        }
        if (ru60Var instanceof hu60) {
            e5a0 e5a0Var = ((hu60) ru60Var).a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            np21 np21Var3 = e5a0Var.d;
            if (np21Var3 == null || (list = np21Var3.a) == null || list.isEmpty()) {
                fv60Var = new fv60(os60Var != null ? os60.a(os60Var, (ns60) null, is60Var, 1) : new os60((ns60) null, is60Var, 1));
            } else {
                linkedHashSet.add(new kt60(np21Var3));
            }
            linkedHashSet.add(new lt60(e5a0Var.c));
            return Next.i(fv60Var, linkedHashSet);
        }
        if (ru60Var instanceof iu60) {
            iu60 iu60Var = (iu60) ru60Var;
            switch (l1d.C(iu60Var.a)) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    return Next.j();
                case 1:
                case 2:
                case 5:
                    np21 np21Var4 = iu60Var.b;
                    if (oto1.r(np21Var4)) {
                        return Next.h(new fv60(os60Var != null ? os60.a(os60Var, (ns60) null, is60Var, 1) : new os60((ns60) null, is60Var, 1)));
                    }
                    np21Var4.getClass();
                    return Next.a(Collections.singleton(new kt60(np21Var4)));
                case 3:
                case 4:
                case 7:
                    return Next.a(Effects.a(new jto1[]{new lt60((wb0) null), it60.b}));
                case 6:
                    if (os60Var == null || (ns60Var = os60Var.a) == null || (ps60Var = ns60Var.b) == null) {
                        str = null;
                    } else {
                        str = ps60Var.b;
                        if (str == null) {
                            str = ps60Var.a;
                        }
                    }
                    Set setW1 = dm61.w0(new jto1[]{new lt60((wb0) null)});
                    if (str != null) {
                        setW1.add(new ht60(str));
                    }
                    return Next.a(setW1);
                default:
                    eg.o();
                    return null;
            }
        }
        if (ru60Var instanceof qu60) {
            return Next.j();
        }
        if (ru60Var instanceof ju60) {
            ns60 ns60Var2 = ((ju60) ru60Var).a;
            return Next.h(new fv60(os60Var != null ? os60.a(os60Var, ns60Var2, (ms60) null, 2) : new os60(ns60Var2, (ms60) null, 2)));
        }
        if (ru60Var instanceof gu60) {
            ms60 ms60Var4 = ((gu60) ru60Var).a;
            return Next.h(new fv60(os60Var != null ? os60.a(os60Var, (ns60) null, ms60Var4, 1) : new os60((ns60) null, ms60Var4, 1)));
        }
        if (!(ru60Var instanceof fu60)) {
            eg.o();
            return null;
        }
        ys60 ys60Var = ((fu60) ru60Var).a;
        boolean zEquals4 = ys60Var.equals(xs60.b);
        uhz uhzVar = uhz.a;
        if (zEquals4) {
            lt60Var = new gt60(uhzVar);
        } else {
            if (!(ys60Var instanceof ys60)) {
                eg.o();
                return null;
            }
            int iC4 = l1d.C(ys60Var.b);
            if (iC4 == 0) {
                lt60Var = new lt60((wb0) null);
            } else {
                if (iC4 != 1) {
                    eg.o();
                    return null;
                }
                lt60Var = new gt60(uhzVar);
            }
        }
        return Next.a(Effects.a(new jto1[]{lt60Var}));
    }

    public rfr0 a(int i2, String str, zob1 zob1Var) {
        return new rfr0(gio1.b(Collections.singletonList(new cfr0(str, new tfr0(Integer.valueOf(i2), (y6h1) null, 2)))), false);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Map map = (Map) obj;
                return Boolean.valueOf(u890.j(map.get("employee"), "1") && !y7y0.G(map) && u890.j(map.get("employee-free-opt-in"), "1"));
            case 2:
                int i2 = hu50.a;
                return gu50.a.F((String) obj, Charset.defaultCharset()).toString();
            case 3:
                i9z i9zVar = (i9z) obj;
                if (i9zVar instanceof h9z) {
                    return ((h9z) i9zVar).a;
                }
                bhn0.t("Episode response failed");
                return null;
            case 4:
            case 6:
            case 7:
            case 8:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
            case 14:
            case 15:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
            case 22:
            case 24:
            case 26:
            default:
                return (eww0) ((spq0) obj).b();
            case 5:
                int iC = l1d.C(((yi61) obj).a);
                if (iC == 0) {
                    return aei1.b;
                }
                if (iC == 1) {
                    return aei1.c;
                }
                if (iC == 2) {
                    return aei1.d;
                }
                if (iC == 3) {
                    return aei1.e;
                }
                if (iC == 4) {
                    return aei1.f;
                }
                eg.o();
                return null;
            case 9:
                return ((djo) obj).c();
            case 10:
                return a200.a;
            case 13:
                vqi0 vqi0Var = (vqi0) obj;
                String str = vqi0Var.a;
                String str2 = vqi0Var.b;
                int i3 = vqi0Var.c;
                String str3 = vqi0Var.d;
                byte[] bArr = vqi0Var.f;
                return new lri0(str, str2, i3, str3, bArr != null ? OfferExplanation.s(bArr) : null);
            case 16:
                return Boolean.valueOf(yto.k((String) obj, true));
            case 17:
                gk40 gk40Var = (gk40) obj;
                if (gk40Var instanceof ck40) {
                    ck40 ck40Var = (ck40) gk40Var;
                    return new ob0(new k560(ck40Var.b(), ck40Var.a()), ck40Var.c());
                }
                if (gk40Var.equals(fk40.a)) {
                    return qb0.a;
                }
                eg.o();
                return null;
            case 18:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return EsOffline.DevicesWithContextResponse.p(bArr2);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.DevicesWithContextResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return cqg0.b((EsOffline.GetContextsResponse) obj);
            case 21:
                wew wewVar = (wew) obj;
                Observable observableJust = Observable.just(wewVar);
                wewVar.getClass();
                return observableJust.delay(10000L, TimeUnit.MILLISECONDS).map(yi20.V0);
            case 23:
                return (l0l) ((spq0) obj).b();
            case 25:
                return (String) ((spq0) obj).b();
            case 27:
                return l6v0.a;
            case 28:
                return Boolean.TRUE;
        }
    }

    public First e0(Object obj) {
        return First.b((msg0) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new kxu0(xkg0Var, str2, str);
    }

    public Object m(dxy dxyVar) {
        return qgo1.q((Executor) dxyVar.d(new lzy0(tbc0.class, Executor.class)));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return ((PlayerState) obj).track().c();
            case 15:
                return ((String) obj).length() > 0;
            case 22:
                gcl1 gcl1Var = (gcl1) obj;
                return (gcl1Var instanceof ecl1) || (gcl1Var instanceof dcl1);
            default:
                return !((uv00) obj).f;
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        view.setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, nk80VarI.d);
        return hsl1.b;
    }

    public Object apply(Object obj, Object obj2) {
        return new tfm0((mmr0) obj, ((Number) obj2).intValue());
    }
}
