package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fmx0 extends ijl1 {
    public final pjq0 V1;
    public a1r0 W1;

    public fmx0(pjq0 pjq0Var) {
        this.V1 = pjq0Var;
    }

    public final void c1() {
        WebView webView = ((ijl1) this).H1;
        if (webView != null) {
            webView.setBackgroundColor(-16777216);
            webView.getSettings().setSupportZoom(true);
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setDisplayZoomControls(false);
            l1("https://about-recommendations.spotify.com/");
        }
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super/*p.zf30*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        N0().J().a(this, new ydb(this, (byte) 24));
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewX0 = super.x0(layoutInflater, viewGroup, bundle);
        viewX0.setBackgroundColor(-16777216);
        Object parent = viewX0.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setBackgroundColor(-16777216);
        }
        View viewFindViewById = viewX0.findViewById(2131429821);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(-16777216);
        }
        return viewX0;
    }
}
