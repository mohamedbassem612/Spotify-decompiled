package p;

import android.view.View;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z2b1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpotifyCheckoutActivity b;

    public /* synthetic */ z2b1(SpotifyCheckoutActivity spotifyCheckoutActivity, byte b) {
        this.a = b;
        this.b = spotifyCheckoutActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        xfk1 xfk1Var;
        van vanVar;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        SpotifyCheckoutActivity spotifyCheckoutActivity = this.b;
        switch (b) {
            case 0:
                int i = SpotifyCheckoutActivity.D1;
                spotifyCheckoutActivity.m0().U(o500.a);
                return;
            case 1:
                wgk1 wgk1Var = spotifyCheckoutActivity.s1;
                kgk1 kgk1Var = wgk1Var instanceof kgk1 ? (kgk1) wgk1Var : null;
                String str = (kgk1Var == null || (xfk1Var = kgk1Var.c) == null) ? null : xfk1Var.b;
                uba ubaVarD = spotifyCheckoutActivity.d();
                dsk0 dsk0Var = spotifyCheckoutActivity.r1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("change_product_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                ubaVarD.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                spotifyCheckoutActivity.m0().U(vwz.a);
                return;
            case 2:
                wgk1 wgk1Var2 = spotifyCheckoutActivity.s1;
                kgk1 kgk1Var2 = wgk1Var2 instanceof kgk1 ? (kgk1) wgk1Var2 : null;
                sce sceVar = kgk1Var2 != null ? kgk1Var2.g : null;
                uba ubaVarD2 = spotifyCheckoutActivity.d();
                dsk0 dsk0Var2 = spotifyCheckoutActivity.r1;
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
                y6h1 y6h1VarA = x6h1VarC4.a();
                String str2 = sceVar != null ? sceVar.a : null;
                ubaVarD2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                if (sceVar == null || (vanVar = sceVar.c) == null) {
                    return;
                }
                spotifyCheckoutActivity.m0().U(new swz(vanVar));
                return;
            case 3:
                uba ubaVarD3 = spotifyCheckoutActivity.d();
                dsk0 dsk0Var3 = spotifyCheckoutActivity.r1;
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
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("update_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                ubaVarD3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                spotifyCheckoutActivity.m0().U(r500.a);
                return;
            default:
                uba ubaVarD4 = spotifyCheckoutActivity.d();
                dsk0 dsk0Var4 = spotifyCheckoutActivity.r1;
                if (dsk0Var4 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC8 = dsk0Var4.b.c();
                x6h1VarC8.i.add(new a7h1("loaded_state", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("update_subscription_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("cancel_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                ubaVarD4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                spotifyCheckoutActivity.m0().U(s500.a);
                return;
        }
    }
}
