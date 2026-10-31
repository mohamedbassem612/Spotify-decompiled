package p;

import android.view.View;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b3b1 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfk1 b;
    public final /* synthetic */ SpotifyCheckoutActivity c;

    public /* synthetic */ b3b1(nfk1 nfk1Var, SpotifyCheckoutActivity spotifyCheckoutActivity, byte b) {
        this.a = b;
        this.b = nfk1Var;
        this.c = spotifyCheckoutActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        nfk1 nfk1Var = this.b;
        SpotifyCheckoutActivity spotifyCheckoutActivity = this.c;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                mfk1 mfk1Var = nfk1Var.b;
                mfk1 mfk1Var2 = nfk1Var.b;
                if (mfk1Var instanceof lfk1) {
                    dsk0 dsk0Var = spotifyCheckoutActivity.r1;
                    if (dsk0Var == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC = dsk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (mfk1Var instanceof jfk1) {
                    dsk0 dsk0Var2 = spotifyCheckoutActivity.r1;
                    if (dsk0Var2 == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC3 = dsk0Var2.b.c();
                    x6h1VarC3.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(mfk1Var instanceof kfk1)) {
                        eg.o();
                        return;
                    }
                    dsk0 dsk0Var3 = spotifyCheckoutActivity.r1;
                    if (dsk0Var3 == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC5 = dsk0Var3.b.c();
                    x6h1VarC5.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA = x6h1VarC6.a();
                    String str = ((kfk1) mfk1Var2).a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                }
                spotifyCheckoutActivity.d().m(w7h1Var, (xj61) null);
                spotifyCheckoutActivity.o0(mfk1Var2);
                return;
            default:
                mfk1 mfk1Var3 = nfk1Var.b;
                mfk1 mfk1Var4 = nfk1Var.b;
                if (mfk1Var3 instanceof lfk1) {
                    dsk0 dsk0Var4 = spotifyCheckoutActivity.r1;
                    if (dsk0Var4 == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC7 = dsk0Var4.b.c();
                    x6h1VarC7.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                    x6h1VarC8.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis());
                } else if (mfk1Var3 instanceof jfk1) {
                    dsk0 dsk0Var5 = spotifyCheckoutActivity.r1;
                    if (dsk0Var5 == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC9 = dsk0Var5.b.c();
                    x6h1VarC9.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = true;
                    x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                    x6h1VarC10.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC10.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(mfk1Var3 instanceof kfk1)) {
                        eg.o();
                        return;
                    }
                    dsk0 dsk0Var6 = spotifyCheckoutActivity.r1;
                    if (dsk0Var6 == null) {
                        u890.C("ubiEventFactory");
                        throw null;
                    }
                    x6h1 x6h1VarC11 = dsk0Var6.b.c();
                    x6h1VarC11.i.add(new a7h1("error", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = true;
                    x6h1 x6h1VarC12 = x6h1VarC11.a().c();
                    x6h1VarC12.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC12.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC12.a();
                    String str2 = ((kfk1) mfk1Var4).a;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                spotifyCheckoutActivity.d().m(w7h1Var2, (xj61) null);
                spotifyCheckoutActivity.o0(mfk1Var4);
                return;
        }
    }
}
