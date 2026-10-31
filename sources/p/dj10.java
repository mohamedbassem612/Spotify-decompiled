package p;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.familyviewservice.v1.GetRemoveMemberPageResponse;
import com.spotify.familyviewservice.v1.RemoveMemberAction;
import com.spotify.familyviewservice.v1.RemoveMemberBenefits;
import com.spotify.kidsgraduation.v1.ValidateGraduationResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dj10 implements Function, s2i1, Init, Predicate, BiFunction {
    public final /* synthetic */ byte a;
    public static final dj10 b = new dj10(0);
    public static final dj10 c = new dj10(1);
    public static final dj10 d = new dj10(2);
    public static final dj10 e = new dj10(3);
    public static final dj10 f = new dj10(4);
    public static final dj10 g = new dj10(5);
    public static final dj10 h = new dj10(6);
    public static final dj10 i = new dj10(7);
    public static final dj10 t = new dj10(8);
    public static final dj10 X = new dj10(9);
    public static final dj10 Y = new dj10(10);
    public static final dj10 Z = new dj10(11);
    public static final dj10 N0 = new dj10(12);
    public static final dj10 O0 = new dj10(13);
    public static final dj10 P0 = new dj10(14);
    public static final dj10 Q0 = new dj10(16);
    public static final dj10 R0 = new dj10(17);
    public static final dj10 S0 = new dj10(18);
    public static final dj10 T0 = new dj10(19);
    public static final dj10 U0 = new dj10(20);
    public static final dj10 V0 = new dj10(21);
    public static final dj10 W0 = new dj10(22);
    public static final dj10 X0 = new dj10(23);
    public static final dj10 Y0 = new dj10(24);
    public static final dj10 Z0 = new dj10(25);
    public static final dj10 a1 = new dj10(26);
    public static final dj10 b1 = new dj10(27);
    public static final dj10 c1 = new dj10(28);
    public static final dj10 d1 = new dj10(29);

    public /* synthetic */ dj10(byte b2) {
        this.a = b2;
    }

    public static final PendingIntent a(Intent intent, AppLifecycleServicePendingIntent appLifecycleServicePendingIntent, ewy0 ewy0Var) {
        qvy0 parcelableExtra = intent.getParcelableExtra("push_data");
        int iT0 = parcelableExtra != null ? parcelableExtra.t0() : UUID.randomUUID().hashCode();
        if (parcelableExtra != null) {
            intent.addCategory(fwy0.a(appLifecycleServicePendingIntent, lgo1.s(parcelableExtra)));
        }
        return ewy0Var.f(iT0, 2, intent);
    }

    public Object apply(Object obj) {
        uji0 uji0Var;
        wv0 wv0Var;
        switch (this.a) {
            case 0:
                GetRemoveMemberPageResponse getRemoveMemberPageResponse = (GetRemoveMemberPageResponse) obj;
                String title = getRemoveMemberPageResponse.getTitle();
                String description = getRemoveMemberPageResponse.getDescription();
                if (getRemoveMemberPageResponse.q()) {
                    RemoveMemberBenefits removeMemberBenefitsO = getRemoveMemberPageResponse.o();
                    uji0Var = new uji0(new tni0(removeMemberBenefitsO.r().hasColor() ? removeMemberBenefitsO.r().getColor().getValue() : 0, removeMemberBenefitsO.r().getDisplayName(), removeMemberBenefitsO.r().getImageUrl()), removeMemberBenefitsO.q(), removeMemberBenefitsO.n(), removeMemberBenefitsO.p());
                } else {
                    uji0Var = null;
                }
                h290<RemoveMemberAction> h290VarN = getRemoveMemberPageResponse.n();
                ArrayList arrayList = new ArrayList();
                for (RemoveMemberAction removeMemberAction : h290VarN) {
                    int iO = removeMemberAction.o();
                    int i2 = iO == 0 ? -1 : wni0.a[l1d.C(iO)];
                    k921 j921Var = i2 != 1 ? i2 != 2 ? null : new j921(removeMemberAction.n().o()) : i921.a;
                    l921 l921Var = j921Var != null ? new l921(j921Var, removeMemberAction.getTitle(), removeMemberAction.p()) : null;
                    if (l921Var != null) {
                        arrayList.add(l921Var);
                    }
                }
                boolean zR = getRemoveMemberPageResponse.r();
                String strP = getRemoveMemberPageResponse.p();
                if (strP == null) {
                    strP = "";
                }
                return new vni0(title, description, uji0Var, arrayList, zR, strP);
            case 1:
            case 2:
            case 10:
            case 15:
            case 16:
            case 17:
            case 21:
            case 22:
            case 24:
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
            case 27:
            default:
                return new uf7((sfu0) obj);
            case 3:
                return new ma50(false);
            case 4:
                Object obj2 = ((e331) obj).a;
                if (e331.a(obj2) != null) {
                    eg.m("Failed to fetch ad preview");
                    return null;
                }
                Map map = ((zv0) obj2).a;
                jx0 jx0Var = jx0.b;
                List list = (List) map.get("home-above-the-fold");
                if (list != null && (wv0Var = (wv0) o7h.q0(list)) != null) {
                    return new wv0(wv0Var.a, wv0Var.b, wv0Var.c, wv0Var.d, wv0Var.e, wv0Var.f, wv0Var.g, wv0Var.h, wv0Var.i, "home-above-the-fold");
                }
                eg.m("missing expected slot");
                return null;
            case 5:
                Long l = (Long) ((spq0) obj).h();
                return Long.valueOf(l != null ? l.longValue() : 0L);
            case 6:
                return (f4a0) obj;
            case 7:
                ValidateGraduationResponse validateGraduationResponse = (ValidateGraduationResponse) obj;
                return new g950(validateGraduationResponse.o(), validateGraduationResponse.n());
            case 8:
                return new x7c0(rf90.a, (Boolean) obj);
            case 9:
                return new lyd0(((Boolean) obj).booleanValue());
            case 11:
                return new vaf0((vdu0) obj);
            case 12:
                return Optional.empty();
            case 13:
                eeh eehVar = (eeh) obj;
                byte b2 = eehVar.a;
                Bundle bundle = eehVar.b;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                return new ch61(b2, bundle);
            case 14:
                return Boolean.valueOf(l4o1.J((ContextTrack) obj));
            case 18:
                return new qkp0((String) ((spq0) obj).h());
            case 19:
                List list2 = ((fuc) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ytc) it.next()).c);
                }
                arrayList2.toString();
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ytc) it2.next()).a);
                }
                return arrayList3;
            case 20:
                n57.s("[Puffin] Error fetching optimization state: " + ((Throwable) obj));
                return pnq0.b;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Observable.just(new pk91(((Integer) obj).intValue()));
            case 26:
                return new kby((String) null, -1);
            case 28:
                return Boolean.valueOf(y7y0.A((Map) obj));
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 10:
                ume0 ume0Var = (ume0) obj;
                return First.c(ume0Var, Collections.singleton(new wje0(ume0Var.a)));
            default:
                return First.b((pro0) obj);
        }
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        String str3;
        String str4;
        switch (this.a) {
            case 2:
                return new fa40(str2, str, xkg0Var);
            case 22:
                String str5 = (String) linkedHashMap.get("preset_id");
                if (str5 == null) {
                    return null;
                }
                return new pss0(str5, xkg0Var, str2, str);
            default:
                String str6 = (String) linkedHashMap.get("user_name");
                if (str6 == null || (str3 = (String) linkedHashMap.get("playlist_id")) == null || !gho1.n(str3) || (str4 = (String) linkedHashMap.get("episode_id")) == null || !gho1.n(str4)) {
                    return null;
                }
                return new yyu0(str6, str3, str4, str2, str, xkg0Var);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 17:
                return ((spq0) obj).c();
            case 21:
                return u890.j(((fs80) obj).b, "google_assistant");
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return (PlayerState) obj;
    }
}
