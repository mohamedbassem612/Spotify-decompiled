package p;

import android.graphics.Bitmap;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.pam.v2.GetInviteMembersViewResponse;
import com.spotify.profile.profile.proto.ProfilelistResponse$SmallProfileList;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kc20 implements Function, s2i1, BiFunction, Producer, io.reactivex.rxjava3.functions.BiFunction, Predicate, k1q0 {
    public final /* synthetic */ byte a;
    public static final kc20 b = new kc20(0);
    public static final kc20 c = new kc20(1);
    public static final kc20 d = new kc20(2);
    public static final kc20 e = new kc20(3);
    public static final kc20 f = new kc20(4);
    public static final kc20 g = new kc20(5);
    public static final kc20 h = new kc20(6);
    public static final kc20 i = new kc20(7);
    public static final kc20 t = new kc20(8);
    public static final kc20 X = new kc20(9);
    public static final kc20 Y = new kc20(10);
    public static final kc20 Z = new kc20(11);
    public static final kc20 N0 = new kc20(12);
    public static final kc20 O0 = new kc20(13);
    public static final kc20 P0 = new kc20(14);
    public static final kc20 Q0 = new kc20(15);
    public static final kc20 R0 = new kc20(16);
    public static final kc20 S0 = new kc20(17);
    public static final kc20 T0 = new kc20(18);
    public static final kc20 U0 = new kc20(19);
    public static final acn1 V0 = new acn1("PackageViewDescriptorFactory", (byte) 7);
    public static final kc20 W0 = new kc20(21);
    public static final kc20 X0 = new kc20(22);
    public static final kc20 Y0 = new kc20(23);
    public static final kc20 Z0 = new kc20(24);
    public static final kc20 a1 = new kc20(25);
    public static final kc20 b1 = new kc20(26);
    public static final kc20 c1 = new kc20(27);
    public static final kc20 d1 = new kc20(28);

    public /* synthetic */ kc20(byte b2) {
        this.a = b2;
    }

    public static rpv0 a(ne neVar) {
        return new rpv0(neVar, (byte) 4);
    }

    public Object apply(Object obj) {
        Object obj2;
        switch (this.a) {
            case 0:
                return ((uz21) obj).a();
            case 1:
                ProfilelistResponse$SmallProfileList profilelistResponse$SmallProfileList = (ProfilelistResponse$SmallProfileList) ((sy21) obj).b;
                return profilelistResponse$SmallProfileList == null ? ProfilelistResponse$SmallProfileList.n() : profilelistResponse$SmallProfileList;
            case 2:
            case 8:
            case 14:
            case 17:
            case 20:
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
            default:
                j231 j231Var = (m331) obj;
                if (j231Var instanceof w231) {
                    return z231.a;
                }
                if (j231Var instanceof j231) {
                    return new k231(j231Var.a);
                }
                eg.o();
                return null;
            case 3:
                String str = ((yaa0) obj).a;
                return (str == null || str.length() == 0) ? i5b.a : new h5b(str);
            case 4:
                return ((l0l) ((spq0) obj).b()).d();
            case 5:
                List list = (List) obj;
                int iS = zno1.s(q7h.U(list, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : list) {
                    linkedHashMap.put(((eww0) obj3).a, obj3);
                }
                return linkedHashMap;
            case 6:
                return new ayt0();
            case 7:
                return IconCompat.c((Bitmap) obj);
            case 9:
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (List) obj) {
                    if (((em01) obj4).a.length() > 0) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            case 10:
                if (!((th61) obj).b) {
                    return Maybe.e(ize0.a);
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeEmpty.getClass();
                return maybeEmpty;
            case 11:
                return new pif0(tpf0.a);
            case 12:
                sy21 sy21Var = (sy21) obj;
                return (!sy21Var.a.Q0 || (obj2 = sy21Var.b) == null) ? new wmg0(1) : new xmg0((umg0) obj2);
            case 13:
                GetInviteMembersViewResponse getInviteMembersViewResponse = (GetInviteMembersViewResponse) obj;
                String strQ = getInviteMembersViewResponse.q();
                String strR = getInviteMembersViewResponse.r();
                String strS = getInviteMembersViewResponse.s();
                eni0 eni0Var = new eni0(getInviteMembersViewResponse.v(), getInviteMembersViewResponse.u());
                eni0 eni0Var2 = new eni0(getInviteMembersViewResponse.o(), getInviteMembersViewResponse.n());
                boolean zP = getInviteMembersViewResponse.p();
                l371 l371Var = new l371(getInviteMembersViewResponse.x().getTitle(), getInviteMembersViewResponse.x().getMessage(), getInviteMembersViewResponse.x().o(), getInviteMembersViewResponse.t());
                int i2 = vmi0.a[getInviteMembersViewResponse.w().ordinal()];
                return new gni0(strQ, strR, strS, eni0Var, eni0Var2, zP, l371Var, i2 != 1 ? i2 == 2 ? 3 : 1 : 2);
            case 15:
                return Long.valueOf(((dma1) obj).g(v1o0.g, 0L));
            case 16:
                c2l c2lVar = (c2l) obj;
                if (c2lVar.equals(b2l.a)) {
                    return a7l.a;
                }
                if (c2lVar instanceof a2l) {
                    return new y6l(new hry0(((a2l) c2lVar).a, 2));
                }
                if (c2lVar instanceof z1l) {
                    return x6l.a;
                }
                if (c2lVar instanceof y1l) {
                    y1l y1lVar = (y1l) c2lVar;
                    return new w6l(new hry0(y1lVar.e, 2), y1lVar.d);
                }
                eg.o();
                return null;
            case 18:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.DownloadResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.DownloadResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 19:
                return ((EsOffline.GetListsContainingItemResponse) obj).n();
            case 21:
                tfw tfwVar = (tfw) obj;
                return new j500(tfwVar.b, tfwVar.c);
            case 22:
                return ((kow) obj).a;
            case 24:
                return new a211((srt0) obj);
        }
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        switch (this.a) {
            case 2:
                String str3 = (String) linkedHashMap.get("child_id");
                if (str3 == null) {
                    return null;
                }
                return new rc40(str3, xkg0Var, str2, str);
            default:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length = str4.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str4.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                }
                String str5 = (String) linkedHashMap.get("permission_token");
                if (str5 == null) {
                    return null;
                }
                return new byu0(str4, str5, xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj) {
        return ((g0u0) obj).b == l650.a;
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(647);
        int i2 = nk80VarI.b;
        int i3 = nk80VarI.d;
        view.setPadding(nk80VarI.a, i2, nk80VarI.c, i3);
        return hsl1.b;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                tr3 tr3Var = (tr3) obj;
                sxc0 sxc0Var = (sxc0) obj2;
                tr3Var.getClass();
                sxc0Var.getClass();
                return tr3.b(tr3Var, (List) null, sxc0Var, (w7c0) null, false, 13);
            case 17:
                return new MaybeFlatten((Maybe) obj, new yfc0((jap0) obj2, (byte) 27));
            default:
                return new fvf1(((Number) obj).longValue(), ((Number) obj2).longValue());
        }
    }
}
