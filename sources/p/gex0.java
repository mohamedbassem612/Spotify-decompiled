package p;

import android.app.Application;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentaccess.membershipsinternal.confirmation.proto.ShowMembershipWelcomeEntrypointResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.socialgraphimpl.proto.BlockedlistResponse;
import com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gex0 implements Function, Predicate, Function3, usi1, BiFunction, BiPredicate, s2i1, Init, c36 {
    public final /* synthetic */ byte a;
    public static final gex0 b = new gex0(0);
    public static final gex0 c = new gex0(1);
    public static final gex0 d = new gex0(2);
    public static final gex0 e = new gex0(3);
    public static final gex0 f = new gex0(4);
    public static final gex0 g = new gex0(5);
    public static final gex0 h = new gex0(6);
    public static final gex0 i = new gex0(7);
    public static final gex0 t = new gex0(8);
    public static final gex0 X = new gex0(9);
    public static final gex0 Y = new gex0(10);
    public static final gex0 Z = new gex0(11);
    public static final gex0 N0 = new gex0(12);
    public static final gex0 O0 = new gex0(13);
    public static final gex0 P0 = new gex0(14);
    public static final gex0 Q0 = new gex0(15);
    public static final gex0 R0 = new gex0(16);
    public static final gex0 S0 = new gex0(18);
    public static final gex0 T0 = new gex0(19);
    public static final gex0 U0 = new gex0(20);
    public static final gex0 V0 = new gex0(21);
    public static final gex0 W0 = new gex0(22);
    public static final gex0 X0 = new gex0(23);
    public static final gex0 Y0 = new gex0(25);
    public static final gex0 Z0 = new gex0(26);

    public /* synthetic */ gex0(byte b2) {
        this.a = b2;
    }

    public static final ic9 b(b0k b0kVar) {
        int i2 = j6a.h;
        int iH = (int) jfv.h(j6a.g);
        uwr uwrVar = cbx.a;
        ceo ceoVar = ((jhx) cbx.c(b0kVar).a.b).a;
        p9m p9mVarP = hm5.P(xay.e(2, irn1.o0(iH, 0, ceoVar, 2)), xay.f(2, irn1.o0(iH, 0, ceoVar, 2)));
        x340 x340Var = (x340) b0kVar;
        boolean zE = x340Var.e(iH) | x340Var.i(ceoVar);
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new d6a(iH, ceoVar);
            x340Var.s0(objT);
        }
        return new ic9(p9mVarP, hm5.h(1, (vu30) objT), (byte) 7);
    }

    public static final pxg1 c(int i2, ceo ceoVar) {
        return irn1.o0(i2, 0, ceoVar, 2);
    }

    public static String d(z7a z7aVar) {
        return f4i1.c(z7aVar.hashCode(), "BannerTicket-");
    }

    public static tif1 f() {
        return !ihc1.h0("profile", "release", false) ? xco0.a : e95.a;
    }

    public static pug g(Application application, String str) {
        return new pug(new ytw0((byte) 22), new r5n1(), new gtv0((byte) 22), new zov0((byte) 16), application, str);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                BlockedlistResponse.RelationsUsernameResponse relationsUsernameResponse = (BlockedlistResponse.RelationsUsernameResponse) obj;
                String nextPageToken = relationsUsernameResponse.getNextPageToken();
                nextPageToken.getClass();
                String str = nextPageToken.length() > 0 ? nextPageToken : null;
                h290<BlockedlistResponse.UsernameUser> h290VarO = relationsUsernameResponse.o();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
                for (BlockedlistResponse.UsernameUser usernameUser : h290VarO) {
                    Set set = s4b1.f;
                    String strZ = uic.C(usernameUser.getUsername(), (String) null).z();
                    strZ.getClass();
                    arrayList.add(new obx0(jbx0.a, strZ, (String) null, (String) null, (String) null, (q730) null, (String) null, 4092));
                }
                return new j8x0(3, arrayList, str, str == null, 104);
            case 1:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (qfd qfdVar : (List) obj) {
                    linkedHashMap.put(qfdVar.a, Boolean.valueOf(qfdVar.b));
                }
                return new l7z0(linkedHashMap);
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
            case 11:
            case 14:
            case 17:
            case 18:
            default:
                sy21 sy21Var = (sy21) obj;
                int i2 = sy21Var.a.d;
                ShowMembershipWelcomeEntrypointResponse showMembershipWelcomeEntrypointResponse = (ShowMembershipWelcomeEntrypointResponse) sy21Var.b;
                String strN = showMembershipWelcomeEntrypointResponse != null ? showMembershipWelcomeEntrypointResponse.n() : null;
                if (i2 == 200 && strN != null && !ihc1.y0(strN)) {
                    return Optional.of(strN);
                }
                if (i2 == 200 || i2 == 204) {
                    return Optional.empty();
                }
                Logger.d("Welcome clip entrypoint failed with HTTP %d", new Object[]{Integer.valueOf(i2)});
                return Optional.empty();
            case 3:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to fetch recommendations for entity", new Object[0]);
                return new oy01(z6x.a, null);
            case 6:
                return (i430) o7h.V0((List) obj);
            case 8:
                String str2 = (String) ((PlayerState) obj).contextMetadata().get("duration");
                Long lValueOf = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
            case 10:
                byte[] bArr = (byte[]) obj;
                try {
                    return GetUnfinishedEpisodesResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 12:
                Map map = (Map) obj;
                return new wtw0(y7y0.L(map), yto.j((String) map.get("pick-and-shuffle")));
            case 13:
                return new g8o0((Throwable) obj, (bk8) null);
            case 15:
                return Boolean.valueOf(((w8c0) obj).a(w8c0.e));
            case 16:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to get episode recommendations", new Object[0]);
                return b7x.a;
            case 19:
                return new vlg1();
        }
    }

    public void e(wat watVar, int i2, int[] iArr, flb0 flb0Var, int[] iArr2) {
        int i3 = 0;
        if (flb0Var == flb0.a) {
            int length = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int i6 = iArr[i3];
                iArr2[i4] = i5;
                i5 += i6;
                i3++;
                i4++;
            }
            return;
        }
        int length2 = iArr.length;
        int i7 = 0;
        while (i3 < length2) {
            i7 += iArr[i3];
            i3++;
        }
        int i8 = i2 - i7;
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i9 = iArr[length3];
            iArr2[length3] = i8;
            i8 += i9;
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 22:
                return First.c((eyk1) obj, w7x.a);
            default:
                return First.b((yg1) obj);
        }
    }

    public Object h(eha0 eha0Var, float f2) {
        boolean z = eha0Var.o() == 1;
        if (z) {
            eha0Var.a();
        }
        float fI = (float) eha0Var.i();
        float fI2 = (float) eha0Var.i();
        while (eha0Var.g()) {
            eha0Var.v();
        }
        if (z) {
            eha0Var.d();
        }
        return new pg41((fI / 100.0f) * f2, (fI2 / 100.0f) * f2);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4 = (String) linkedHashMap.get("account_id");
        if (str4 == null || !gho1.k(str4) || (str3 = (String) linkedHashMap.get("social_handle")) == null) {
            return null;
        }
        return new gji1(str4, str3, xkg0Var, str2, str);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 4:
                return new yvg1((String) obj, (t380) obj2, (fvf1) obj3);
            default:
                Boolean bool = (Boolean) obj;
                String str = (String) obj3;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (List) obj2) {
                    if (!((lc40) obj4).d) {
                        arrayList.add(obj4);
                    }
                }
                return new yvg1(bool, arrayList, str);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((uv00) obj).f;
            case 9:
                return !((uv00) obj).f;
            case 14:
                return ((Boolean) obj).booleanValue();
            default:
                return ((Integer) obj).intValue() == 0;
        }
    }

    public String toString() {
        switch (this.a) {
            case 28:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }

    public boolean test(Object obj, Object obj2) {
        return ((evf1) obj).b == 2 && ((evf1) obj2).b == 1;
    }

    public Object apply(Object obj, Object obj2) {
        return qq81.a((qq81) obj, null, null, null, null, null, (wjn0) obj2, false, null, null, 0, null, 16351);
    }
}
