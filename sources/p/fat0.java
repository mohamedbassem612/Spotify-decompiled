package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fat0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tzr0 b;

    public /* synthetic */ fat0(tzr0 tzr0Var, byte b) {
        this.a = b;
        this.b = tzr0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        tzr0 tzr0Var = this.b;
        switch (b) {
            case 0:
                ptf1 ptf1Var = (ptf1) tzr0Var.b;
                ((i8h1) ((xrp) ptf1Var.c).get()).f(((hll0) ptf1Var.b).e(), (Set) null);
                break;
            case 1:
                k9t0 k9t0Var = (k9t0) obj;
                ptf1 ptf1Var2 = (ptf1) tzr0Var.b;
                String str = k9t0Var.a;
                i8h1 i8h1Var = (i8h1) ((xrp) ptf1Var2.c).get();
                x6h1 x6h1VarC = ((hll0) ptf1Var2.b).a.c();
                x6h1VarC.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("buy_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                new Handler(Looper.getMainLooper()).post(new uu1(tzr0Var, k9t0Var, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (byte) 23));
                break;
            case 2:
                ptf1 ptf1Var3 = (ptf1) tzr0Var.b;
                String str2 = ((l9t0) obj).a;
                tzr0.k(tzr0Var, str2, ptf1Var3.l(str2), (Bundle) null, 12);
                break;
            case 3:
                ptf1 ptf1Var4 = (ptf1) tzr0Var.b;
                String str3 = ((m9t0) obj).a;
                i8h1 i8h1Var2 = (i8h1) ((xrp) ptf1Var4.c).get();
                x6h1 x6h1VarC3 = ((hll0) ptf1Var4.b).a.c();
                x6h1VarC3.i.add(new a7h1("benefit_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("see_other_plans_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                tzr0.k(tzr0Var, str3, i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 4:
                n9t0 n9t0Var = (n9t0) obj;
                ptf1 ptf1Var5 = (ptf1) tzr0Var.b;
                int i = n9t0Var.a;
                String str4 = n9t0Var.b;
                i8h1 i8h1Var3 = (i8h1) ((xrp) ptf1Var5.c).get();
                x6h1 x6h1VarC5 = ((hll0) ptf1Var5.b).a.c();
                x6h1VarC5.i.add(new a7h1("benefit_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA = x6h1VarC5.a();
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC6 = y6h1VarA.c();
                x6h1VarC6.i.add(new a7h1("benefit_row", "", numValueOf, str4, (String) null));
                x6h1VarC6.j = false;
                tzr0.k(tzr0Var, str4, i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 5:
                ptf1 ptf1Var6 = (ptf1) tzr0Var.b;
                String str5 = ((o9t0) obj).a;
                i8h1 i8h1Var4 = (i8h1) ((xrp) ptf1Var6.c).get();
                x6h1 x6h1VarC7 = ((hll0) ptf1Var6.b).a.c();
                x6h1VarC7.i.add(new a7h1("cancel_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                tzr0.k(tzr0Var, str5, i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 4);
                break;
            case 6:
                ptf1 ptf1Var7 = (ptf1) tzr0Var.b;
                String str6 = ((p9t0) obj).a;
                i8h1 i8h1Var5 = (i8h1) ((xrp) ptf1Var7.c).get();
                x6h1 x6h1VarC8 = ((hll0) ptf1Var7.b).a.c();
                x6h1VarC8.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("change_pin_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                tzr0.k(tzr0Var, str6, i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 7:
                ptf1 ptf1Var8 = (ptf1) tzr0Var.b;
                String str7 = ((q9t0) obj).a;
                i8h1 i8h1Var6 = (i8h1) ((xrp) ptf1Var8.c).get();
                x6h1 x6h1VarC10 = ((hll0) ptf1Var8.b).a.c();
                x6h1VarC10.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("home_address_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                tzr0.k(tzr0Var, str7, i8h1Var6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str7)), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 8:
                ptf1 ptf1Var9 = (ptf1) tzr0Var.b;
                String str8 = ((r9t0) obj).a;
                tzr0.k(tzr0Var, str8, ptf1Var9.l(str8), (Bundle) null, 12);
                break;
            case 9:
                ptf1 ptf1Var10 = (ptf1) tzr0Var.b;
                String str9 = ((s9t0) obj).a;
                i8h1 i8h1Var7 = (i8h1) ((xrp) ptf1Var10.c).get();
                x6h1 x6h1VarC12 = ((hll0) ptf1Var10.b).a.c();
                x6h1VarC12.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("add_member_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                tzr0.k(tzr0Var, str9, i8h1Var7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str9)), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 10:
                t9t0 t9t0Var = (t9t0) obj;
                ptf1 ptf1Var11 = (ptf1) tzr0Var.b;
                int i2 = t9t0Var.a;
                String str10 = t9t0Var.b;
                i8h1 i8h1Var8 = (i8h1) ((xrp) ptf1Var11.c).get();
                x6h1 x6h1VarC14 = ((hll0) ptf1Var11.b).a.c();
                x6h1VarC14.i.add(new a7h1("add_on_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = true;
                y6h1 y6h1VarA2 = x6h1VarC14.a();
                Integer numValueOf2 = Integer.valueOf(i2);
                x6h1 x6h1VarC15 = y6h1VarA2.c();
                x6h1VarC15.i.add(new a7h1("add_on_row", (String) null, numValueOf2, str10, (String) null));
                x6h1VarC15.j = false;
                tzr0.k(tzr0Var, str10, i8h1Var8.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str10)), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 11:
                v9t0 v9t0Var = (v9t0) obj;
                new Handler(Looper.getMainLooper()).post(new uu1(tzr0Var, v9t0Var, ((ptf1) tzr0Var.b).p(v9t0Var.a), (byte) 24));
                break;
            case 12:
                ptf1 ptf1Var12 = (ptf1) tzr0Var.b;
                String str11 = ((w9t0) obj).a;
                i8h1 i8h1Var9 = (i8h1) ((xrp) ptf1Var12.c).get();
                x6h1 x6h1VarC16 = ((hll0) ptf1Var12.b).a.c();
                x6h1VarC16.i.add(new a7h1("plan_verification_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = true;
                x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                x6h1VarC17.i.add(new a7h1("action_button", (String) null, (Integer) null, str11, (String) null));
                x6h1VarC17.j = false;
                tzr0.k(tzr0Var, str11, i8h1Var9.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str11)), x6h1VarC17.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 13:
                x9t0 x9t0Var = (x9t0) obj;
                tzr0.k(tzr0Var, x9t0Var.a, x9t0Var.b, (Bundle) null, 12);
                break;
            case 14:
                y9t0 y9t0Var = (y9t0) obj;
                String str12 = y9t0Var.a;
                tv80 tv80VarM = y9t0Var.b;
                if (tv80VarM == null) {
                    ptf1 ptf1Var13 = (ptf1) tzr0Var.b;
                    i8h1 i8h1Var10 = (i8h1) ((xrp) ptf1Var13.c).get();
                    x6h1 x6h1VarC18 = ((hll0) ptf1Var13.b).a.c();
                    x6h1VarC18.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC18.j = false;
                    x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                    x6h1VarC19.i.add(new a7h1("primary_button", (String) null, (Integer) null, str12, (String) null));
                    x6h1VarC19.j = false;
                    tv80VarM = i8h1Var10.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str12)), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                tzr0.k(tzr0Var, str12, tv80VarM, (Bundle) null, 12);
                break;
            case 15:
                z9t0 z9t0Var = (z9t0) obj;
                ptf1 ptf1Var14 = (ptf1) tzr0Var.b;
                String str13 = z9t0Var.a;
                i8h1 i8h1Var11 = (i8h1) ((xrp) ptf1Var14.c).get();
                x6h1 x6h1VarC20 = ((hll0) ptf1Var14.b).a.c();
                x6h1VarC20.i.add(new a7h1("remove_confirmation_bottomsheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = true;
                x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                x6h1VarC21.i.add(new a7h1("remove_cta", (String) null, (Integer) null, str13, (String) null));
                x6h1VarC21.j = false;
                new Handler(Looper.getMainLooper()).post(new uu1(tzr0Var, z9t0Var, i8h1Var11.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str13)), x6h1VarC21.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (byte) 25));
                break;
            case 16:
                ptf1 ptf1Var15 = (ptf1) tzr0Var.b;
                String str14 = ((aat0) obj).a;
                tzr0.k(tzr0Var, str14, ptf1Var15.p(str14), (Bundle) null, 12);
                break;
            case 17:
                ptf1 ptf1Var16 = (ptf1) tzr0Var.b;
                i8h1 i8h1Var12 = (i8h1) ((xrp) ptf1Var16.c).get();
                x6h1 x6h1VarC22 = ((hll0) ptf1Var16.b).a.c();
                x6h1VarC22.i.add(new a7h1("unboxing_hub_entry_point", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = true;
                tzr0.k(tzr0Var, "spotify:internal:unboxing:main-hub", i8h1Var12.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:unboxing:main-hub")), x6h1VarC22.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                break;
            case 18:
                ptf1 ptf1Var17 = (ptf1) tzr0Var.b;
                i8h1 i8h1Var13 = (i8h1) ((xrp) ptf1Var17.c).get();
                x6h1 x6h1VarC23 = ((hll0) ptf1Var17.b).a.c();
                x6h1VarC23.i.add(new a7h1("manage_member_bottomsheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC23.j = true;
                y6h1 y6h1VarA3 = x6h1VarC23.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA3;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var13.f(k7h1Var.a(), (Set) null);
                break;
            default:
                ptf1 ptf1Var18 = (ptf1) tzr0Var.b;
                i8h1 i8h1Var14 = (i8h1) ((xrp) ptf1Var18.c).get();
                x6h1 x6h1VarC24 = ((hll0) ptf1Var18.b).a.c();
                x6h1VarC24.i.add(new a7h1("remove_confirmation_bottomsheet", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC24.j = true;
                y6h1 y6h1VarA4 = x6h1VarC24.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA4;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var14.f(k7h1Var2.a(), (Set) null);
                break;
        }
    }
}
