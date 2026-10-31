package p;

import com.spotify.analyzer_esperanto.proto.LoudnessResponseOuterClass;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function8;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.socialgraph.esperanto.proto.FollowedUsersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yz10 implements Function, s2i1, eq20, BiFunction, jc31, Init, BiPredicate, Function8, Predicate {
    public final /* synthetic */ byte a;
    public static final yz10 b = new yz10(0);
    public static final yz10 c = new yz10(1);
    public static final yz10 d = new yz10(2);
    public static final yz10 e = new yz10(3);
    public static final yz10 f = new yz10(4);
    public static final yz10 g = new yz10(5);
    public static final yz10 h = new yz10(6);
    public static final yz10 i = new yz10(7);
    public static final yz10 t = new yz10(8);
    public static final yz10 X = new yz10(9);
    public static final yz10 Y = new yz10(11);
    public static final yz10 Z = new yz10(12);
    public static final yz10 N0 = new yz10(13);
    public static final yz10 O0 = new yz10(14);
    public static final yz10 P0 = new yz10(15);
    public static final yz10 Q0 = new yz10(16);
    public static final yz10 R0 = new yz10(17);
    public static final yz10 S0 = new yz10(18);
    public static final yz10 T0 = new yz10(20);
    public static final yz10 U0 = new yz10(21);
    public static final yz10 V0 = new yz10(22);
    public static final yz10 W0 = new yz10(23);
    public static final yz10 X0 = new yz10(24);
    public static final yz10 Y0 = new yz10(25);
    public static final yz10 Z0 = new yz10(26);
    public static final yz10 a1 = new yz10(27);
    public static final yz10 b1 = new yz10(28);
    public static final yz10 c1 = new yz10(29);

    public /* synthetic */ yz10(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static n8h1 d(int i2, String str, String str2) {
        mmr0 mmr0VarG = g(str);
        String str3 = (String) mmr0VarG.a;
        List list = (List) mmr0VarG.b;
        switch (str3.hashCode()) {
            case -1224983604:
                if (str3.equals("mobile-manage-subscription:banner")) {
                    return new ffl0(new tdl0((byte) 4), list.isEmpty() ? "" : (String) list.get(0));
                }
                break;
            case -489658001:
                if (str3.equals("mobile-your-addons:manageAddonEntry")) {
                    return new p4m0(Integer.valueOf(i2), str2, new brl0((byte) 26));
                }
                break;
            case -449535884:
                if (str3.equals("mobile-your-addons:availableAddonsCard")) {
                    return new p4m0(new brl0((byte) 26));
                }
                break;
            case -421627515:
                if (str3.equals("mobile-manage-subscription:subscriptionHeading")) {
                    return new ffl0(new tdl0((byte) 4), (byte) 5);
                }
                break;
            case -398941641:
                if (str3.equals("mobile-manage-subscription:consumptionEntry")) {
                    return new ffl0(new tdl0((byte) 4), (byte) 3);
                }
                break;
            case 122918841:
                if (str3.equals("mobile-your-plan:consumptionEntry")) {
                    return new s6m0(new p6m0((byte) 1), Integer.valueOf(i2), str2);
                }
                break;
            case 386814412:
                if (str3.equals("mobile-your-plan:benefitsListCard")) {
                    return new s6m0(new p6m0((byte) 1), (byte) 1);
                }
                break;
            case 558446441:
                if (str3.equals("mobile-manage-subscription:cancelSubscriptionButton")) {
                    return new ffl0(new tdl0((byte) 4), (byte) 2);
                }
                break;
            case 739592516:
                if (str3.equals("mobile-your-addons:banner")) {
                    return new p4m0(new brl0((byte) 26), list.isEmpty() ? "" : (String) list.get(0));
                }
                break;
            case 913691788:
                if (str3.equals("mobile-manage-subscription:benefitsCard")) {
                    return new ffl0(new tdl0((byte) 4), (byte) 1);
                }
                break;
            case 1094769647:
                if (str3.equals("mobile-your-plan:subscriptionCard")) {
                    return new s6m0(new p6m0((byte) 1), (byte) 3);
                }
                break;
            case 1241631694:
                if (str3.equals("mobile-your-plan:banner")) {
                    return new s6m0(new p6m0((byte) 1), list.isEmpty() ? "" : (String) list.get(0));
                }
                break;
            case 1808651670:
                if (str3.equals("mobile-manage-subscription:paymentCard")) {
                    return new ffl0(new tdl0((byte) 4), (byte) 4);
                }
                break;
            case 1954172266:
                if (str3.equals("mobile-your-plan:yourAddonsEntry")) {
                    return new s6m0(new p6m0((byte) 1), (byte) 4);
                }
                break;
        }
        return new z8s((byte) 4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static w7h1 f(int i2, String str, String str2) {
        mmr0 mmr0VarG = g(str);
        String str3 = (String) mmr0VarG.a;
        List list = (List) mmr0VarG.b;
        int iHashCode = str3.hashCode();
        b7x b7xVar = b7x.a;
        switch (iHashCode) {
            case -1224983604:
                if (!str3.equals("mobile-manage-subscription:banner")) {
                    return null;
                }
                List list2 = list;
                String str4 = !list2.isEmpty() ? (String) list.get(0) : "";
                if (!u890.j((list2.isEmpty() || list.size() <= 1) ? "" : (String) list.get(1), "hyperlink")) {
                    return null;
                }
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-manage-subscription";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "manage-subscription");
                x6h1VarR.i.add(new a7h1("banner", (String) null, (Integer) null, (String) null, str4));
                x6h1VarR.j = true;
                x6h1 x6h1VarC = x6h1VarR.a().c();
                x6h1VarC.i.add(new a7h1("hyperlink", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case -489658001:
                if (!str3.equals("mobile-your-addons:manageAddonEntry")) {
                    return null;
                }
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-your-addons";
                x6h1VarI2.f = "1.1.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI2.a();
                Collections.singletonList("your-addons");
                Integer numValueOf = Integer.valueOf(i2);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("manage_addon_entry", (String) null, numValueOf, str2, (String) null));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case -449535884:
                if (!str3.equals("mobile-your-addons:availableAddonsCard")) {
                    return null;
                }
                if (!u890.j(!list.isEmpty() ? (String) list.get(0) : "", "exploreAddonsButton")) {
                    return null;
                }
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-your-addons";
                x6h1VarI3.f = "1.1.0";
                x6h1VarI3.g = "22.0.0";
                x6h1 x6h1VarR2 = kk0.r(x6h1VarI3, "your-addons");
                x6h1VarR2.i.add(new a7h1("available_addons_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR2.j = true;
                x6h1 x6h1VarC3 = x6h1VarR2.a().c();
                x6h1VarC3.i.add(new a7h1("explore_addons_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
            case -398941641:
                if (!str3.equals("mobile-manage-subscription:consumptionEntry")) {
                    return null;
                }
                y6h1 y6h1Var4 = y6h1.i;
                x6h1 x6h1VarI4 = i3o1.i();
                x6h1VarI4.h = "music";
                x6h1VarI4.a = "mobile-manage-subscription";
                x6h1VarI4.f = "1.1.0";
                x6h1VarI4.g = "22.0.0";
                x6h1 x6h1VarR3 = kk0.r(x6h1VarI4, "manage-subscription");
                x6h1VarR3.i.add(new a7h1("consumption_entry", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR3.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarR3.a(), r6h1.c, System.currentTimeMillis());
            case 122918841:
                if (!str3.equals("mobile-your-plan:consumptionEntry")) {
                    return null;
                }
                y6h1 y6h1Var5 = y6h1.i;
                x6h1 x6h1VarI5 = i3o1.i();
                x6h1VarI5.h = "music";
                x6h1VarI5.a = "mobile-your-plan";
                x6h1VarI5.f = "1.1.0";
                x6h1VarI5.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI5.a();
                Collections.singletonList("your-plan");
                Integer numValueOf2 = Integer.valueOf(i2);
                x6h1 x6h1VarC4 = y6h1VarA2.c();
                x6h1VarC4.i.add(new a7h1("consumption_entry", (String) null, numValueOf2, str2, (String) null));
                x6h1VarC4.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 386814412:
                if (!str3.equals("mobile-your-plan:benefitsListCard")) {
                    return null;
                }
                if (!u890.j(!list.isEmpty() ? (String) list.get(0) : "", "exploreBenefits")) {
                    return null;
                }
                y6h1 y6h1Var6 = y6h1.i;
                x6h1 x6h1VarI6 = i3o1.i();
                x6h1VarI6.h = "music";
                x6h1VarI6.a = "mobile-your-plan";
                x6h1VarI6.f = "1.1.0";
                x6h1VarI6.g = "22.0.0";
                x6h1 x6h1VarR4 = kk0.r(x6h1VarI6, "your-plan");
                x6h1VarR4.i.add(new a7h1("benefits_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR4.j = true;
                x6h1 x6h1VarC5 = x6h1VarR4.a().c();
                x6h1VarC5.i.add(new a7h1("explore_benefits", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
            case 558446441:
                if (!str3.equals("mobile-manage-subscription:cancelSubscriptionButton")) {
                    return null;
                }
                y6h1 y6h1Var7 = y6h1.i;
                x6h1 x6h1VarI7 = i3o1.i();
                x6h1VarI7.h = "music";
                x6h1VarI7.a = "mobile-manage-subscription";
                x6h1VarI7.f = "1.1.0";
                x6h1VarI7.g = "22.0.0";
                x6h1 x6h1VarR5 = kk0.r(x6h1VarI7, "manage-subscription");
                x6h1VarR5.i.add(new a7h1("cancel_subscription_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR5.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarR5.a(), r6h1.c, System.currentTimeMillis());
            case 739592516:
                if (!str3.equals("mobile-your-addons:banner")) {
                    return null;
                }
                List list3 = list;
                String str5 = !list3.isEmpty() ? (String) list.get(0) : "";
                if (!u890.j((list3.isEmpty() || list.size() <= 1) ? "" : (String) list.get(1), "hyperlink")) {
                    return null;
                }
                y6h1 y6h1Var8 = y6h1.i;
                x6h1 x6h1VarI8 = i3o1.i();
                x6h1VarI8.h = "music";
                x6h1VarI8.a = "mobile-your-addons";
                x6h1VarI8.f = "1.1.0";
                x6h1VarI8.g = "22.0.0";
                x6h1 x6h1VarR6 = kk0.r(x6h1VarI8, "your-addons");
                x6h1VarR6.i.add(new a7h1("banner", (String) null, (Integer) null, (String) null, str5));
                x6h1VarR6.j = true;
                x6h1 x6h1VarC6 = x6h1VarR6.a().c();
                x6h1VarC6.i.add(new a7h1("hyperlink", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis());
            case 1094769647:
                if (!str3.equals("mobile-your-plan:subscriptionCard")) {
                    return null;
                }
                if (!u890.j(!list.isEmpty() ? (String) list.get(0) : "", "manageButton")) {
                    return null;
                }
                y6h1 y6h1Var9 = y6h1.i;
                x6h1 x6h1VarI9 = i3o1.i();
                x6h1VarI9.h = "music";
                x6h1VarI9.a = "mobile-your-plan";
                x6h1VarI9.f = "1.1.0";
                x6h1VarI9.g = "22.0.0";
                x6h1 x6h1VarR7 = kk0.r(x6h1VarI9, "your-plan");
                x6h1VarR7.i.add(new a7h1("subscription_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR7.j = true;
                x6h1 x6h1VarC7 = x6h1VarR7.a().c();
                x6h1VarC7.i.add(new a7h1("manage_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis());
            case 1241631694:
                if (!str3.equals("mobile-your-plan:banner")) {
                    return null;
                }
                List list4 = list;
                String str6 = !list4.isEmpty() ? (String) list.get(0) : "";
                if (!u890.j((list4.isEmpty() || list.size() <= 1) ? "" : (String) list.get(1), "hyperlink")) {
                    return null;
                }
                y6h1 y6h1Var10 = y6h1.i;
                x6h1 x6h1VarI10 = i3o1.i();
                x6h1VarI10.h = "music";
                x6h1VarI10.a = "mobile-your-plan";
                x6h1VarI10.f = "1.1.0";
                x6h1VarI10.g = "22.0.0";
                x6h1 x6h1VarR8 = kk0.r(x6h1VarI10, "your-plan");
                x6h1VarR8.i.add(new a7h1("banner", (String) null, (Integer) null, (String) null, str6));
                x6h1VarR8.j = true;
                x6h1 x6h1VarC8 = x6h1VarR8.a().c();
                x6h1VarC8.i.add(new a7h1("hyperlink", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
            case 1808651670:
                if (!str3.equals("mobile-manage-subscription:paymentCard")) {
                    return null;
                }
                String str7 = !list.isEmpty() ? (String) list.get(0) : "";
                if (u890.j(str7, "disclaimerLink")) {
                    y6h1 y6h1Var11 = y6h1.i;
                    x6h1 x6h1VarI11 = i3o1.i();
                    x6h1VarI11.h = "music";
                    x6h1VarI11.a = "mobile-manage-subscription";
                    x6h1VarI11.f = "1.1.0";
                    x6h1VarI11.g = "22.0.0";
                    x6h1 x6h1VarR9 = kk0.r(x6h1VarI11, "manage-subscription");
                    x6h1VarR9.i.add(new a7h1("payment_card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR9.j = true;
                    x6h1 x6h1VarC9 = x6h1VarR9.a().c();
                    x6h1VarC9.i.add(new a7h1("disclaimer_link", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!u890.j(str7, "editPaymentMethodEntry")) {
                    return null;
                }
                y6h1 y6h1Var12 = y6h1.i;
                x6h1 x6h1VarI12 = i3o1.i();
                x6h1VarI12.h = "music";
                x6h1VarI12.a = "mobile-manage-subscription";
                x6h1VarI12.f = "1.1.0";
                x6h1VarI12.g = "22.0.0";
                x6h1 x6h1VarR10 = kk0.r(x6h1VarI12, "manage-subscription");
                x6h1VarR10.i.add(new a7h1("payment_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR10.j = true;
                x6h1 x6h1VarC10 = x6h1VarR10.a().c();
                x6h1VarC10.i.add(new a7h1("edit_payment_method_entry", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
            case 1954172266:
                if (!str3.equals("mobile-your-plan:yourAddonsEntry")) {
                    return null;
                }
                y6h1 y6h1Var13 = y6h1.i;
                x6h1 x6h1VarI13 = i3o1.i();
                x6h1VarI13.h = "music";
                x6h1VarI13.a = "mobile-your-plan";
                x6h1VarI13.f = "1.1.0";
                x6h1VarI13.g = "22.0.0";
                x6h1 x6h1VarR11 = kk0.r(x6h1VarI13, "your-plan");
                x6h1VarR11.i.add(new a7h1("your_addons_entry", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR11.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarR11.a(), r6h1.c, System.currentTimeMillis());
            default:
                return null;
        }
    }

    public static mmr0 g(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{":"}, 0, 6);
        return new mmr0(listQ0.size() > 1 ? pze0.i(":", listQ0.get(0), listQ0.get(1)) : "", listQ0.size() > 2 ? listQ0.subList(2, listQ0.size()) : z6x.a);
    }

    public static pvp0 h(ovp0 ovp0Var, Map map) {
        zxp0 zxp0Var;
        nrp0 nrp0Var;
        String str = ovp0Var.a;
        yxp0 yxp0Var = ovp0Var.b;
        gup0 gup0Var = null;
        if (yxp0Var != null) {
            ArrayList<oxp0> arrayList = yxp0Var.a;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (oxp0 oxp0Var : arrayList) {
                String str2 = oxp0Var.a;
                String str3 = oxp0Var.b;
                String str4 = oxp0Var.c;
                ArrayList arrayList3 = oxp0Var.d;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new uxp0(((txp0) it.next()).a));
                }
                rxp0 rxp0Var = oxp0Var.e;
                arrayList2.add(new pxp0(str2, str3, str4, arrayList4, rxp0Var != null ? new sxp0(rxp0Var.a, rxp0Var.b) : null, oxp0Var.f, oxp0Var.g, oxp0Var.h));
            }
            zxp0Var = new zxp0(arrayList2);
        } else {
            zxp0Var = null;
        }
        mrp0 mrp0Var = ovp0Var.c;
        if (mrp0Var != null) {
            ArrayList<krp0> arrayList5 = mrp0Var.a;
            ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
            for (krp0 krp0Var : arrayList5) {
                arrayList6.add(new lrp0(krp0Var.d, krp0Var.e, krp0Var.a, krp0Var.b, krp0Var.c));
            }
            nrp0Var = new nrp0(arrayList6);
        } else {
            nrp0Var = null;
        }
        fup0 fup0Var = ovp0Var.d;
        if (fup0Var != null) {
            ArrayList<dup0> arrayList7 = fup0Var.a;
            ArrayList arrayList8 = new ArrayList(q7h.U(arrayList7, 10));
            for (dup0 dup0Var : arrayList7) {
                arrayList8.add(new eup0(dup0Var.a, dup0Var.b, dup0Var.c));
            }
            gup0Var = new gup0(arrayList8);
        }
        ArrayList<ynp0> arrayList9 = ovp0Var.e;
        gup0 gup0Var2 = gup0Var;
        nrp0 nrp0Var2 = nrp0Var;
        ArrayList arrayList10 = new ArrayList(q7h.U(arrayList9, 10));
        for (ynp0 ynp0Var : arrayList9) {
            mw41 mw41Var = (mw41) map.get(ynp0Var.a);
            String str5 = ynp0Var.a;
            String str6 = ynp0Var.b;
            String str7 = ynp0Var.c;
            List list = ynp0Var.d;
            boolean z = false;
            boolean z2 = mw41Var != null ? mw41Var.a : false;
            if (mw41Var != null) {
                z = mw41Var.b;
            }
            arrayList10.add(new znp0(str5, str6, str7, list, z2, z));
        }
        return new pvp0(str, zxp0Var, nrp0Var2, gup0Var2, arrayList10);
    }

    public void a(Object[] objArr) {
        n57.i(false, "Service %s has a configurator but no HttpCallFactoryBuilder is wired into this RetrofitMaker", Arrays.copyOf(objArr, objArr.length));
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return v300.a;
            case 1:
                FollowedUsersResponse followedUsersResponse = (FollowedUsersResponse) obj;
                int statusCode = followedUsersResponse.n().getStatusCode();
                if (statusCode < 200 || statusCode > 299) {
                    Observable observableError = Observable.error(new Throwable(ab80.n("subscribeUsers failed with status code ", " and reason ", statusCode, followedUsersResponse.n().o())));
                    observableError.getClass();
                    return observableError;
                }
                Observable observableJust = Observable.just(followedUsersResponse.o());
                observableJust.getClass();
                return observableJust;
            case 2:
            case 6:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
            default:
                boolean zT = y7y0.t("offline", (Map) obj);
                if (zT) {
                    return olq0.a;
                }
                if (!zT) {
                    return plq0.a;
                }
                eg.o();
                return null;
            case 3:
                return ((r0e0) obj).e;
            case 4:
                whz whzVar = ((gt60) obj).b;
                if (whzVar.equals(shz.a)) {
                    return fi70.c;
                }
                if (whzVar.equals(rhz.a)) {
                    return ei70.c;
                }
                if (whzVar.equals(thz.a)) {
                    return gi70.c;
                }
                if (whzVar.equals(uhz.a)) {
                    return hi70.c;
                }
                if (whzVar.equals(qhz.a)) {
                    return di70.c;
                }
                if (whzVar instanceof phz) {
                    return new ki70(((phz) whzVar).a);
                }
                if (whzVar.equals(ohz.a)) {
                    return ci70.c;
                }
                if (whzVar.equals(vhz.a)) {
                    return ii70.c;
                }
                eg.o();
                return null;
            case 5:
                return (wsc0) ((py21) obj).d();
            case 7:
                return -1;
            case 8:
                List list = ((wsc0) obj).e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zuc0) it.next()).c);
                }
                return arrayList;
            case 9:
                return new pqd0(qqd0.d);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsOffline.GetContextsResponse.r(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.offline_esperanto.proto.EsOffline.GetContextsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(t4n1.r((u310) it2.next()));
                }
                return arrayList2;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((PlayerState) obj).playbackId();
            case 22:
                return ((z310) obj).a;
            case 23:
                PlayerState playerState = (PlayerState) obj;
                return new vut0(playerState.contextUri(), playerState.isPlaying(), playerState.isPaused());
        }
    }

    public Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return new gzo0((PlayerState) obj, (lzo0) obj2, ((Boolean) obj3).booleanValue(), (hry0) obj4, (t62) obj5, ((Boolean) obj6).booleanValue(), (Map) obj7, ((Boolean) obj8).booleanValue());
    }

    public a8b0 c(rgy0 rgy0Var, String str, qx81 qx81Var, qx81 qx81Var2) {
        if (str.equals("kotlin.jvm.PlatformType")) {
            return rgy0Var.j(eka0.f) ? new nwz0(qx81Var, qx81Var2, 0) : y3o1.Z(qx81Var, qx81Var2);
        }
        return bkz.b(zjz.Z, new String[]{str, qx81Var.toString(), qx81Var2.toString()});
    }

    public First e0(Object obj) {
        return First.b((fli0) obj);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        int i2 = 0;
        switch (this.a) {
            case 2:
                return new ia40(str2, str, xkg0Var);
            case 15:
                String str3 = (String) linkedHashMap.get("track_id");
                if (str3 == null || str3.length() != 22) {
                    return null;
                }
                int length = str3.length();
                while (i2 < length) {
                    char cCharAt = str3.charAt(i2);
                    if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && ('0' > cCharAt || cCharAt >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new kan0(str3, xkg0Var, str2, str);
            case 26:
                String str4 = (String) linkedHashMap.get("playlist_id");
                if (str4 == null || str4.length() != 22) {
                    return null;
                }
                int length2 = str4.length();
                while (i2 < length2) {
                    char cCharAt2 = str4.charAt(i2);
                    if (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && ('0' > cCharAt2 || cCharAt2 >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new qxu0(str4, xkg0Var, str2, str);
            default:
                String str5 = (String) linkedHashMap.get("playlist_id");
                if (str5 == null || str5.length() != 22) {
                    return null;
                }
                int length3 = str5.length();
                while (i2 < length3) {
                    char cCharAt3 = str5.charAt(i2);
                    if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && ('0' > cCharAt3 || cCharAt3 >= ':'))) {
                        return null;
                    }
                    i2++;
                }
                return new uxu0(str5, xkg0Var, str2, str);
        }
    }

    public boolean test(Object obj, Object obj2) {
        spq0 spq0Var = (spq0) obj;
        spq0 spq0Var2 = (spq0) obj2;
        l0l l0lVar = (l0l) spq0Var.h();
        Boolean boolValueOf = l0lVar != null ? Boolean.valueOf(l0lVar.l()) : null;
        l0l l0lVar2 = (l0l) spq0Var2.h();
        if (!u890.j(boolValueOf, l0lVar2 != null ? Boolean.valueOf(l0lVar2.l()) : null)) {
            return false;
        }
        l0l l0lVar3 = (l0l) spq0Var.h();
        Boolean boolValueOf2 = l0lVar3 != null ? Boolean.valueOf(l0lVar3.isActive()) : null;
        l0l l0lVar4 = (l0l) spq0Var2.h();
        return u890.j(boolValueOf2, l0lVar4 != null ? Boolean.valueOf(l0lVar4.isActive()) : null);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 25:
                return ((spq0) obj).c();
            default:
                return ((cma1) obj).b == 1;
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                LoudnessResponseOuterClass.LoudnessResponse loudnessResponse = (LoudnessResponseOuterClass.LoudnessResponse) obj2;
                String strO = loudnessResponse.o();
                Object linkedHashMap2 = linkedHashMap.get(strO);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap.put(strO, linkedHashMap2);
                }
                ((Map) linkedHashMap2).put(Long.valueOf(loudnessResponse.p()), Double.valueOf(((Number) o7h.q0(loudnessResponse.n())).doubleValue() / 100.0d));
                if (linkedHashMap.keySet().size() > 300) {
                    linkedHashMap.remove(o7h.p0(linkedHashMap.keySet()));
                }
                return linkedHashMap;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new mmr0((PlayerState) obj, (Map) obj2);
            default:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                Map map = (Map) obj2;
                boolean zK = yto.k((String) map.get("filter-explicit-content"), false);
                boolean zK2 = yto.k((String) map.get("filter-age-restricted-content"), false);
                ContextTrack contextTrack = (ContextTrack) playerQueue.track().h();
                b380 b380VarNextTracks = playerQueue.nextTracks();
                Set set = wlm.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : b380VarNextTracks) {
                    if (l4o1.S((ContextTrack) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayListB = wlm.b(arrayList, zK2);
                b380 b380VarNextTracks2 = playerQueue.nextTracks();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : b380VarNextTracks2) {
                    if (!l4o1.S((ContextTrack) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                return new y7z0(contextTrack, arrayListB, wlm.b(arrayList2, zK2), zK, zK2, playerQueue.revision());
        }
    }
}
