package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/ypv0;", "Lp/ijl1;", "<init>", "()V", "src_main_java_com_spotify_premiumaccountmanagement_management-management"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ypv0 extends ijl1 {
    public static final /* synthetic */ int Z1 = 0;
    public Disposable V1;
    public Uri W1;
    public g341 X1;
    public izj Y1;

    public final void A0() {
        ((zf30) this).h1 = true;
        Disposable disposable = this.V1;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final int Z0() {
        return 2131624683;
    }

    public final boolean b1(Uri uri) {
        izj izjVar = this.Y1;
        if (izjVar != null) {
            return izjVar.c(uri);
        }
        u890.C("uriInterceptor");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    public final void c1() {
        Single singleC;
        if (((ijl1) this).H1 == null) {
            n57.e("Attempted to render url while view was detached.");
            return;
        }
        Uri uri = this.W1;
        if (uri == null) {
            n57.e("Attempted to render null url.");
            return;
        }
        Disposable disposable = this.V1;
        if (disposable != null) {
            disposable.dispose();
        }
        String scheme = uri.getScheme();
        if ("http".equals(scheme) || "https".equals(scheme)) {
            String host = uri.getHost();
            if (!"spotify.com".equals(host)) {
                host.getClass();
                if (!nhc1.R(host, ".spotify.com", false)) {
                    singleC = Single.just(uri);
                    singleC.getClass();
                }
            }
            g341 g341Var = this.X1;
            if (g341Var == null) {
                u890.C("webToken");
                throw null;
            }
            singleC = g341Var.c(uri);
        } else {
            singleC = Single.just(uri);
            singleC.getClass();
        }
        this.V1 = singleC.subscribe(new ixp0(this, (byte) 24), new z0u0((Object) this, (Object) uri, (byte) 4));
    }

    public final void v0(Context context) {
        String string;
        nmn1.p(this);
        super/*p.zf30*/.v0(context);
        Bundle bundle = ((zf30) this).f;
        this.W1 = (bundle == null || (string = bundle.getString("KEY_IN_APP_INTERNAL_WEBVIEW_URI")) == null) ? null : Uri.parse(string);
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        N0().J().a(this, new ydb(this, (byte) 23));
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewX0 = super.x0(layoutInflater, viewGroup, bundle);
        int i = 2131430893;
        View viewT = m5n1.t(viewX0, 2131430893);
        if (viewT != null) {
            int i2 = 2131427810;
            SpotifyIconView spotifyIconViewT = m5n1.t(viewT, 2131427810);
            if (spotifyIconViewT != null) {
                i2 = 2131430475;
                if (((TextView) m5n1.t(viewT, 2131430475)) != null) {
                    i = 2131430894;
                    if (m5n1.t(viewX0, 2131430894) != null) {
                        spotifyIconViewT.setOnClickListener(new hid0(this, (byte) 14));
                        spotifyIconViewT.setIcon(j4b1.Q7);
                        return viewX0;
                    }
                }
            }
            bhn0.i("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i2)));
            return null;
        }
        bhn0.i("Missing required view with ID: ".concat(viewX0.getResources().getResourceName(i)));
        return null;
    }
}
