package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.Restrictions;
import com.spotify.show_esperanto.proto.GetShowResponse;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import spotify.profile_esperanto.proto.GetProfilesResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wdx0 implements Function, dsz0, t2n, Predicate, com.spotify.mobius.functions.Function, s2i1, etk1, Init, c36 {
    public final /* synthetic */ byte a;
    public static final wdx0 b = new wdx0(0);
    public static final wdx0 c = new wdx0(1);
    public static final wdx0 d = new wdx0(2);
    public static final wdx0 e = new wdx0(3);
    public static final wdx0 f = new wdx0(4);
    public static final wdx0 g = new wdx0(5);
    public static final wdx0 h = new wdx0(7);
    public static final wdx0 i = new wdx0(8);
    public static final wdx0 t = new wdx0(9);
    public static final wdx0 X = new wdx0(10);
    public static final wdx0 Y = new wdx0(11);
    public static final wdx0 Z = new wdx0(12);
    public static final wdx0 N0 = new wdx0(13);
    public static final wdx0 O0 = new wdx0(14);
    public static final wdx0 P0 = new wdx0(15);
    public static final wdx0 Q0 = new wdx0(16);
    public static final wdx0 R0 = new wdx0(17);
    public static final wdx0 S0 = new wdx0(18);
    public static final wdx0 T0 = new wdx0(19);
    public static final wdx0 U0 = new wdx0(20);
    public static final wdx0 V0 = new wdx0(21);
    public static final wdx0 W0 = new wdx0(22);
    public static final wdx0 X0 = new wdx0(23);
    public static final wdx0 Y0 = new wdx0(24);
    public static final wdx0 Z0 = new wdx0(25);
    public static final wdx0 a1 = new wdx0(26);

    public /* synthetic */ wdx0(byte b2) {
        this.a = b2;
    }

    public static g141 b(z7a0 z7a0Var) {
        return new g141((qb11) z7a0Var);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                try {
                    return GetProfilesResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.profile_esperanto.proto.GetProfilesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 1:
                String message = ((Throwable) obj).getMessage();
                return new p8z0(message != null ? message : "");
            case 2:
            case 6:
            case 7:
            case 9:
            case 12:
            default:
                oeg0 oeg0Var = (oeg0) obj;
                return new pig1(oeg0Var.a, oeg0Var.b);
            case 3:
                return Observable.just(new sk91(((Integer) obj).intValue()));
            case 4:
                return ((Restrictions) obj).disallowSkippingNextReasons();
            case 5:
                return Boolean.valueOf(((lfd) obj).c);
            case 8:
                return Long.valueOf(Math.max(0L, ((fvf1) obj).a));
            case 10:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return GetShowResponse.o(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.show_esperanto.proto.GetShowResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 11:
                return ((qq81) obj).f;
            case 13:
                ((axe0) obj).a.j.invoke();
                return new kn00(false, (tn00) null);
            case 14:
                bp90 bp90Var = (bp90) obj;
                return Boolean.valueOf(bp90Var.b || bp90Var.d);
            case 15:
                String message2 = ((Throwable) obj).getMessage();
                return new f011(message2 != null ? message2 : "");
            case 16:
                return ((oy01) obj).a;
            case 17:
                m78 m78Var = (m78) obj;
                ArrayList<mlz0> arrayList = m78Var.c.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (mlz0 mlz0Var : arrayList) {
                    arrayList2.add(new hgf1(s110.m(mlz0Var.a), s110.m(mlz0Var.b), mlz0Var.d, mlz0Var.e));
                }
                fid0 fid0Var = m78Var.d.g;
                return new igf1(fid0Var.a, fid0Var.b, fid0Var.c, arrayList2);
            case 18:
                return new evf1((int) ((Long) obj).longValue(), 1);
        }
    }

    public void e(wat watVar, int i2, int[] iArr, flb0 flb0Var, int[] iArr2) {
        h36.c(i2, iArr, iArr2, false);
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 24:
                g2n1 g2n1Var = (g2n1) obj;
                wro0 wro0Var = (wro0) o7h.s0(g2n1Var.d);
                String str = wro0Var != null ? wro0Var.b : null;
                return First.c(g2n1Var, (str == null || str.length() == 0) ? w7x.a : Collections.singleton(new u0n1(new ms21(str))));
            default:
                return First.b((lf1) obj);
        }
    }

    public Object g(Object obj) {
        return ((uz21) obj).f();
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        switch (this.a) {
            case 20:
                String str4 = (String) linkedHashMap.get("account_id");
                if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
                    return null;
                }
                return new cji1(str4, str3, xkg0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("slug");
                if (str5 == null) {
                    return null;
                }
                return new rll1(str5, xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return !((uv00) obj).f;
            case 12:
                return ((ij91) obj).d != null;
            default:
                return ((nwq0) obj) == nwq0.a;
        }
    }

    public String toString() {
        switch (this.a) {
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return "AbsoluteArrangement#SpaceBetween";
            default:
                return super.toString();
        }
    }
}
