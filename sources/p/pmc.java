package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import com.spotify.adsdisplay.products.cmp.CMPActivity;
import com.spotify.legacyglue.icons.SpotifyIconView;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/pmc;", "Lp/ijl1;", "<init>", "()V", "src_main_java_com_spotify_adsdisplay_products-products"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class pmc extends ijl1 {
    public static final /* synthetic */ int Z1 = 0;
    public ic9 V1;
    public fta W1;
    public dma1 X1;
    public final idd1 Y1 = new idd1(new ptb(this, (byte) 9));

    public final void I0(View view, Bundle bundle) {
        CMPActivity cMPActivityN0 = N0();
        cMPActivityN0.J().a(n0(), new ydb(this, (byte) 1));
        rwq0.s(view, new j8a(view, (byte) 1));
        SpotifyIconView spotifyIconViewN = b8k1.n(view, 2131427810);
        spotifyIconViewN.setOnClickListener(new c20(cMPActivityN0, (byte) 11));
        spotifyIconViewN.setIcon(j4b1.Q7);
        n1().m(m1());
    }

    public final int Z0() {
        return 2131624682;
    }

    public final boolean b1(Uri uri) {
        String host = Uri.parse(m1()).getHost();
        if (host == null) {
            eg.m("The URI supplied to The Stage has no host.");
            return false;
        }
        fta ftaVar = this.W1;
        if (ftaVar == null) {
            u890.C("presenter");
            throw null;
        }
        dg30 dg30VarN0 = N0();
        if (host.equalsIgnoreCase(uri.getHost()) || "accounts.spotify.com".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        Set set = s4b1.f;
        if (uic.u(uri.toString())) {
            ((lzn0) ftaVar.e).h(uri.toString());
        } else {
            dg30VarN0.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
        ((ic9) ftaVar.d).m(uri.toString());
        return true;
    }

    public final void c1() {
        fn31.T(cto1.q(this), (o8n) null, 0, new w7a(this, (lnm) null, (byte) 29), 3);
    }

    public final void f1(String str) {
        String string = Uri.parse(str).buildUpon().clearQuery().build().toString();
        ic9 ic9VarN1 = n1();
        i8h1 i8h1Var = (i8h1) ic9VarN1.b;
        x6h1 x6h1VarC = ((yok0) ic9VarN1.c).b.c();
        x6h1VarC.i.add(new a7h1("web_view", (String) null, (Integer) null, str, string));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public final void g1(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ic9 ic9VarN1 = n1();
        String strM1 = m1();
        int errorCode = webResourceError.getErrorCode();
        CharSequence description = webResourceError.getDescription();
        ic9VarN1.n(strM1, "[CMP] - web error: " + errorCode + " " + ((Object) description) + " when loading " + webResourceRequest.getUrl());
    }

    public final void h1(SslError sslError) {
        n1().n(m1(), "[CMP] - SSL Error: " + sslError);
    }

    public final String m1() {
        return (String) this.Y1.getValue();
    }

    public final ic9 n1() {
        ic9 ic9Var = this.V1;
        if (ic9Var != null) {
            return ic9Var;
        }
        u890.C("logger");
        throw null;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.zf30*/.v0(context);
    }

    public final void y0() {
        super.y0();
        ic9 ic9VarN1 = n1();
        String strM1 = m1();
        x6h1 x6h1VarC = ((yok0) ic9VarN1.c).b.c();
        x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, strM1, (String) null));
        x6h1VarC.j = false;
        x6h1VarC.a();
        b7x b7xVar = b7x.a;
        new z7h1("hit", 1, b7xVar);
        new x7h1("ui_hide", 1, b7xVar);
        r6h1 r6h1Var = r6h1.c;
        System.currentTimeMillis();
    }
}
