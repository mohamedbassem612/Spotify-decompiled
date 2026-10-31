package p;

import android.view.View;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.kidsaccount.api.v2.proto.GetChildAccountEducationAttributesResponse;
import com.spotify.lyrics.serviceretrofit.proto.ColorLyricsResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o610 implements Function, Predicate, Init, sh, jc31, av30, l0i, vlc1, BiFunction, s2i1, qct0 {
    public final /* synthetic */ byte a;
    public static final o610 b = new o610(0);
    public static final o610 c = new o610(1);
    public static final o610 d = new o610(2);
    public static final o610 e = new o610(3);
    public static final o610 f = new o610(4);
    public static final o610 g = new o610(5);
    public static final o610 h = new o610(6);
    public static final o610 i = new o610(7);
    public static final o610 t = new o610(8);
    public static final o610 X = new o610(9);
    public static final o610 Y = new o610(10);
    public static final o610 Z = new o610(11);
    public static final o610 N0 = new o610(12);
    public static final o610 O0 = new o610(13);
    public static final o610 P0 = new o610(14);
    public static final o610 Q0 = new o610(15);
    public static final o610 R0 = new o610(16);
    public static final o610 S0 = new o610(17);
    public static final o610 T0 = new o610(18);
    public static final o610 U0 = new o610(19);
    public static final o610 V0 = new o610(22);
    public static final o610 W0 = new o610(23);
    public static final o610 X0 = new o610(24);
    public static final o610 Y0 = new o610(25);
    public static final o610 Z0 = new o610(26);
    public static final o610 a1 = new o610(27);
    public static final o610 b1 = new o610(28);
    public static final o610 c1 = new o610(29);

    public /* synthetic */ o610(byte b2) {
        this.a = b2;
    }

    public static bkr0 b() {
        return new bkr0();
    }

    public static Next d(s1m1 s1m1Var, int i2, String str, int i3, String str2, Integer num) {
        int i4;
        iyl1 iyl1VarA;
        if (!p2o1.u(s1m1Var, str2, i2)) {
            return Next.j();
        }
        int iC = l1d.C(i2);
        if (iC != 2) {
            i4 = iC != 4 ? 10 : 8;
        } else {
            i4 = 5;
        }
        xj61 xj61Var = new xj61();
        mmr0 mmr0Var = new mmr0("stage", pzm.s(i2));
        mmr0 mmr0Var2 = new mmr0("error", str);
        wa0 wa0Var = s1m1Var.f;
        xj61Var.add(new d0m1(sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("ssml", (wa0Var == null || (iyl1VarA = wa0Var.a()) == null) ? "" : iyl1VarA.a)})));
        xj61Var.add(new a0m1(2));
        xj61Var.add(p2o1.x(s1m1Var, i4, new veo(i3, num, null, 0, 0, 28)));
        if (s1m1Var.k) {
            xj61Var.add(new f0m1(str2));
        }
        return Next.i(s1m1.a(p2o1.l(s1m1Var), 2, 0, null, null, null, null, null, 0, null, false, null, false, null, 0, null, null, false, 0, 8388605), cwl1.j(xj61Var));
    }

    public void a(Object[] objArr) {
        n57.i(false, "Service %s has a configurator but no HttpCallFactoryBuilder is wired into this RetrofitMaker", Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    public Object apply(Object obj) {
        pfb pfbVar;
        float fFloatValue;
        ArrayList arrayList;
        switch (this.a) {
            case 0:
                return new aqc(true, (RestrictedIntegrationsResponse) obj);
            case 1:
                cma1 cma1Var = (cma1) obj;
                return Boolean.valueOf(cma1Var.b == 1 && u890.j(cma1Var.a, Boolean.TRUE));
            case 2:
            case 3:
            case 4:
            case 8:
            case 10:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            case 27:
            default:
                return new quv0((String) obj);
            case 5:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case 6:
                return new o3a0((Set) obj);
            case 7:
                return Integer.valueOf(((GetChildAccountEducationAttributesResponse) obj).n());
            case 9:
                return ((fqd0) obj).a;
            case 11:
                gfb gfbVar = (gfb) obj;
                if (!gfbVar.a || (pfbVar = gfbVar.b) == null) {
                    return haf0.a;
                }
                pfbVar.getClass();
                String str = pfbVar.a;
                str.getClass();
                return new gaf0(new igb(str));
            case 12:
                return b9h.a((ColorLyricsResponse) obj);
            case 13:
                return new eeh0((Throwable) obj);
            case 14:
                return (hi90) o7h.q0((List) obj);
            case 17:
                return Boolean.valueOf(((e2p0) obj).c);
            case 24:
                Float f2 = (Float) ((PlayerState) obj).options().playbackSpeed().h();
                if (f2 == null) {
                    fFloatValue = 1.0f;
                } else {
                    if (f2.floatValue() == 0.0f) {
                        f2 = null;
                    }
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                }
                return Integer.valueOf((int) (fFloatValue * 100.0f));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return j5.a;
            case 26:
                List listB = ((uv00) obj).b(gh3.class);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    gh3 gh3Var = ((tv00) it.next()).b;
                    if (gh3Var != null) {
                        ArrayList arrayList3 = gh3Var.g;
                        arrayList = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            r7h.W(((fh3) it2.next()).a, arrayList);
                        }
                    } else {
                        arrayList = z6x.a;
                    }
                    r7h.W(arrayList, arrayList2);
                }
                return arrayList2;
            case 28:
                return nbv0.c;
        }
    }

    public void c(ulc1 ulc1Var) {
        ulc1Var.clear();
    }

    public First e0(Object obj) {
        return First.b((p750) obj);
    }

    public boolean f(beg begVar, iit iitVar) {
        return !iitVar.getAnnotations().d0(rct0.a);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 22:
                return new gss0(xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("user_name");
                if (str4 != null && (str3 = (String) linkedHashMap.get("playlist_id")) != null && str3.length() == 22) {
                    int length = str3.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str3.charAt(i2);
                        if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || ('0' <= cCharAt && cCharAt < ':'))) {
                        }
                    }
                    return new wyu0(str4, str3, xkg0Var, str2, str);
                }
                return null;
        }
    }

    public boolean j(Object obj, Object obj2) {
        return false;
    }

    public boolean r(View view) {
        return false;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((uv00) obj).f;
            case 10:
                return ((f6r0) obj) instanceof eir0;
            default:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        lai1 lai1Var = ((tip0) ((mmr0) obj).a).a;
        Object obj3 = ((mmr0) obj2).a;
        if (!lai1Var.equals(((tip0) obj3).a)) {
            return new mmr0(obj3, Boolean.TRUE);
        }
        return new mmr0(obj3, Boolean.FALSE);
    }
}
