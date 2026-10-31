package p;

import android.os.Bundle;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x2b1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyCheckoutActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2b1(SpotifyCheckoutActivity spotifyCheckoutActivity, byte b) {
        super(0);
        this.a = b;
        this.b = spotifyCheckoutActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        g0i g0iVar = this.b;
        switch (b) {
            case 0:
                return g0iVar.A1.doOnSubscribe(new w2b1(g0iVar, (byte) 3)).firstOrError();
            case 1:
                Bundle extras = g0iVar.getIntent().getExtras();
                f3b1 f3b1Var = extras != null ? (f3b1) jhc1.t(extras, "EXTRA_ARGS", f3b1.class) : null;
                if (f3b1Var != null) {
                    return f3b1Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 2:
                dsk0 dsk0Var = g0iVar.r1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("summary_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 3:
                dsk0 dsk0Var2 = g0iVar.r1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC3 = dsk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("change_country_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 4:
                dsk0 dsk0Var3 = g0iVar.r1;
                if (dsk0Var3 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC5 = dsk0Var3.b.c();
                x6h1VarC5.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("update_subscription_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA3 = x6h1VarC6.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 5:
                dsk0 dsk0Var4 = g0iVar.r1;
                if (dsk0Var4 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC7 = dsk0Var4.b.c();
                x6h1VarC7.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("update_subscription_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("cancel_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                y6h1 y6h1VarA4 = x6h1VarC9.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 6:
                dsk0 dsk0Var5 = g0iVar.r1;
                if (dsk0Var5 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC10 = dsk0Var5.b.c();
                x6h1VarC10.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                y6h1 y6h1VarA5 = x6h1VarC10.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            case 7:
                dsk0 dsk0Var6 = g0iVar.r1;
                if (dsk0Var6 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC11 = dsk0Var6.b.c();
                x6h1VarC11.i.add(new a7h1("item_unavailable", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = true;
                y6h1 y6h1VarA6 = x6h1VarC11.a();
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1VarA6;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var6.a();
            case 8:
                wgk1 wgk1Var = g0iVar.s1;
                kgk1 kgk1Var = wgk1Var instanceof kgk1 ? (kgk1) wgk1Var : null;
                if (kgk1Var == null || !kgk1Var.i) {
                    dsk0 dsk0Var7 = g0iVar.r1;
                    if (dsk0Var7 == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC12 = dsk0Var7.b.c();
                    x6h1VarC12.i.add(new a7h1("loader", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = true;
                    y6h1 y6h1VarA7 = x6h1VarC12.a();
                    k7h1 k7h1Var7 = new k7h1();
                    ((xjn) k7h1Var7).a = y6h1VarA7;
                    ((xjn) k7h1Var7).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var7.a();
                }
                dsk0 dsk0Var8 = g0iVar.r1;
                if (dsk0Var8 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC13 = dsk0Var8.b.c();
                x6h1VarC13.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("loader", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = true;
                y6h1 y6h1VarA8 = x6h1VarC14.a();
                k7h1 k7h1Var8 = new k7h1();
                ((xjn) k7h1Var8).a = y6h1VarA8;
                ((xjn) k7h1Var8).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var8.a();
            case 9:
                dsk0 dsk0Var9 = g0iVar.r1;
                if (dsk0Var9 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC15 = dsk0Var9.b.c();
                x6h1VarC15.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = true;
                y6h1 y6h1VarA9 = x6h1VarC15.a();
                k7h1 k7h1Var9 = new k7h1();
                ((xjn) k7h1Var9).a = y6h1VarA9;
                ((xjn) k7h1Var9).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var9.a();
            case 10:
                dsk0 dsk0Var10 = g0iVar.r1;
                if (dsk0Var10 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC16 = dsk0Var10.b.c();
                x6h1VarC16.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = true;
                x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                x6h1VarC17.i.add(new a7h1("product_breakdown", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = true;
                y6h1 y6h1VarA10 = x6h1VarC17.a();
                k7h1 k7h1Var10 = new k7h1();
                ((xjn) k7h1Var10).a = y6h1VarA10;
                ((xjn) k7h1Var10).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var10.a();
            case 11:
                dsk0 dsk0Var11 = g0iVar.r1;
                if (dsk0Var11 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC18 = dsk0Var11.b.c();
                x6h1VarC18.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = true;
                x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                x6h1VarC19.i.add(new a7h1("change_product_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = true;
                y6h1 y6h1VarA11 = x6h1VarC19.a();
                k7h1 k7h1Var11 = new k7h1();
                ((xjn) k7h1Var11).a = y6h1VarA11;
                ((xjn) k7h1Var11).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var11.a();
            case 12:
                dsk0 dsk0Var12 = g0iVar.r1;
                if (dsk0Var12 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC20 = dsk0Var12.b.c();
                x6h1VarC20.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = true;
                x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                x6h1VarC21.i.add(new a7h1("address_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC21.j = true;
                y6h1 y6h1VarA12 = x6h1VarC21.a();
                k7h1 k7h1Var12 = new k7h1();
                ((xjn) k7h1Var12).a = y6h1VarA12;
                ((xjn) k7h1Var12).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var12.a();
            case 13:
                dsk0 dsk0Var13 = g0iVar.r1;
                if (dsk0Var13 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC22 = dsk0Var13.b.c();
                x6h1VarC22.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = true;
                x6h1 x6h1VarC23 = x6h1VarC22.a().c();
                x6h1VarC23.i.add(new a7h1("payment_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC23.j = true;
                y6h1 y6h1VarA13 = x6h1VarC23.a();
                k7h1 k7h1Var13 = new k7h1();
                ((xjn) k7h1Var13).a = y6h1VarA13;
                ((xjn) k7h1Var13).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var13.a();
            case 14:
                dsk0 dsk0Var14 = g0iVar.r1;
                if (dsk0Var14 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC24 = dsk0Var14.b.c();
                x6h1VarC24.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC24.j = true;
                x6h1 x6h1VarC25 = x6h1VarC24.a().c();
                x6h1VarC25.i.add(new a7h1("current_payment_details", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC25.j = true;
                y6h1 y6h1VarA14 = x6h1VarC25.a();
                k7h1 k7h1Var14 = new k7h1();
                ((xjn) k7h1Var14).a = y6h1VarA14;
                ((xjn) k7h1Var14).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var14.a();
            case 15:
                dsk0 dsk0Var15 = g0iVar.r1;
                if (dsk0Var15 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC26 = dsk0Var15.b.c();
                x6h1VarC26.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC26.j = true;
                x6h1 x6h1VarC27 = x6h1VarC26.a().c();
                x6h1VarC27.i.add(new a7h1("payment_placeholder", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC27.j = true;
                y6h1 y6h1VarA15 = x6h1VarC27.a();
                k7h1 k7h1Var15 = new k7h1();
                ((xjn) k7h1Var15).a = y6h1VarA15;
                ((xjn) k7h1Var15).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var15.a();
            case 16:
                dsk0 dsk0Var16 = g0iVar.r1;
                if (dsk0Var16 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC28 = dsk0Var16.b.c();
                x6h1VarC28.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC28.j = true;
                x6h1 x6h1VarC29 = x6h1VarC28.a().c();
                x6h1VarC29.i.add(new a7h1("summary_placeholder", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC29.j = true;
                y6h1 y6h1VarA16 = x6h1VarC29.a();
                k7h1 k7h1Var16 = new k7h1();
                ((xjn) k7h1Var16).a = y6h1VarA16;
                ((xjn) k7h1Var16).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var16.a();
            case 17:
                return g0iVar.o();
            case 18:
                return g0iVar.O();
            default:
                m3b1 m3b1Var = g0iVar.f1;
                if (m3b1Var != null) {
                    return m3b1Var;
                }
                u890.C("vmFactory");
                throw null;
        }
    }
}
