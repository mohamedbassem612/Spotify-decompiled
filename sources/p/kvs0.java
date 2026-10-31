package p;

import android.os.Bundle;
import j$.net.URLEncoder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kvs0 {
    public static final Map e;
    public final lzn0 a;
    public final qrl0 b;
    public final hul0 c;
    public final i8h1 d;

    static {
        nbc nbcVar = bma1.b;
        e = sqg0.J(new mmr0[]{new mmr0(jvs0.e, nbcVar.q("pick_n_shuffle:queue_btn:dismiss_timestamp")), new mmr0(jvs0.b, nbcVar.q("pick_n_shuffle:scrub_bar:dismiss_timestamp")), new mmr0(jvs0.d, nbcVar.q("pick_n_shuffle:back_skip_btn:dismiss_timestamp")), new mmr0(jvs0.f, nbcVar.q("pick_n_shuffle:shuffle_btn:dismiss_timestamp")), new mmr0(jvs0.g, nbcVar.q("pick_n_shuffle:repeat_btn:dismiss_timestamp")), new mmr0(jvs0.c, nbcVar.q("pick_n_shuffle:forward_skip_btn:dismiss_timestamp"))});
    }

    public kvs0(lzn0 lzn0Var, qrl0 qrl0Var, hul0 hul0Var, i8h1 i8h1Var) {
        this.a = lzn0Var;
        this.b = qrl0Var;
        this.c = hul0Var;
        this.d = i8h1Var;
    }

    public final void a(jvs0 jvs0Var) {
        y6h1 y6h1Var = this.b.b;
        int iOrdinal = jvs0Var.ordinal();
        i8h1 i8h1Var = this.d;
        switch (iOrdinal) {
            case 0:
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("seek_ahead_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            case 1:
                i8h1Var.f(this.c.e(), (Set) null);
                break;
            case 2:
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("backwards_skip_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).b = r6h1.c;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var2.a(), (Set) null);
                break;
            case 3:
                x6h1 x6h1VarC5 = y6h1Var.c();
                x6h1VarC5.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("queue_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).b = r6h1.c;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var3.a(), (Set) null);
                break;
            case 4:
                x6h1 x6h1VarC7 = y6h1Var.c();
                x6h1VarC7.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("shuffle_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                y6h1 y6h1VarA4 = x6h1VarC8.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).b = r6h1.c;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var4.a(), (Set) null);
                break;
            case 5:
                x6h1 x6h1VarC9 = y6h1Var.c();
                x6h1VarC9.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("repeat_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                y6h1 y6h1VarA5 = x6h1VarC10.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).b = r6h1.c;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var5.a(), (Set) null);
                break;
            case 6:
                x6h1 x6h1VarC11 = y6h1Var.c();
                x6h1VarC11.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                x6h1VarC12.i.add(new a7h1("repeat_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = true;
                y6h1 y6h1VarA6 = x6h1VarC12.a();
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1VarA6;
                ((xjn) k7h1Var6).b = r6h1.c;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var6.a(), (Set) null);
                break;
            default:
                eg.o();
                break;
        }
    }

    public final void b(jvs0 jvs0Var, String str) {
        tv80 tv80VarM;
        String strH = gvg.h("spotify:upsell:premium_in_app_destination?displayReason=", URLEncoder.encode(jvs0Var.a, "UTF-8"), "&imageUri=", URLEncoder.encode(str, "UTF-8"));
        y6h1 y6h1Var = this.b.b;
        int iOrdinal = jvs0Var.ordinal();
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.d;
        switch (iOrdinal) {
            case 0:
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("seek_ahead_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                x6h1 x6h1VarC3 = this.c.a.c();
                x6h1VarC3.i.add(new a7h1("explore_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 2:
                x6h1 x6h1VarC4 = y6h1Var.c();
                x6h1VarC4.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("backwards_skip_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 3:
                x6h1 x6h1VarC6 = y6h1Var.c();
                x6h1VarC6.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("queue_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 4:
                x6h1 x6h1VarC8 = y6h1Var.c();
                x6h1VarC8.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("shuffle_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 5:
                x6h1 x6h1VarC10 = y6h1Var.c();
                x6h1VarC10.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("repeat_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = true;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 6:
                x6h1 x6h1VarC12 = y6h1Var.c();
                x6h1VarC12.i.add(new a7h1("now_playing_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = false;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("repeat_upsell_message_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC13.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                eg.o();
                return;
        }
        this.a.a(strH, tv80VarM, (Bundle) null);
    }
}
