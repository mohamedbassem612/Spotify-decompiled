package p;

import android.os.Bundle;
import android.util.ArrayMap;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y2l1 extends w3x implements f4h1, ihr0, o5s {
    public final iu30 N0;
    public final ArrayList O0;
    public final sjf1 P0;
    public final boolean X;
    public final q2l1 Y;
    public final boolean Z;
    public final cir0 d;
    public final MobiusLoop.Controller e;
    public final View f;
    public final WebView g;
    public final View h;
    public final m4l1 i;
    public final xao0 t;

    public y2l1(cir0 cir0Var, MobiusLoop.Controller controller, View view, WebView webView, View view2, m4l1 m4l1Var, xao0 xao0Var, boolean z, q2l1 q2l1Var, boolean z2, Bundle bundle, iu30 iu30Var, ArrayList arrayList, sjf1 sjf1Var) {
        String string;
        Bundle bundle2;
        super(true);
        this.d = cir0Var;
        this.e = controller;
        this.f = view;
        this.g = webView;
        this.h = view2;
        this.i = m4l1Var;
        this.t = xao0Var;
        this.X = z;
        this.Y = q2l1Var;
        this.Z = z2;
        this.N0 = iu30Var;
        this.O0 = arrayList;
        this.P0 = sjf1Var;
        cir0Var.j(this);
        if (bundle != null && (bundle2 = bundle.getBundle("vtec_webview")) != null) {
            webView.restoreState(bundle2);
        }
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("vtec_native_session_storage_data");
            String[] stringArray = bundle.getStringArray("vtec_native_session_storage_keys");
            if (stringArray != null) {
                for (String str : stringArray) {
                    str.getClass();
                    if (bundle3 == null || (string = bundle3.getString(str)) == null) {
                        string = "";
                    }
                    q2l1Var.setItem(str, string);
                }
            }
        }
    }

    public final boolean b(ehr0 ehr0Var) {
        ArrayList arrayList = this.O0;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ihr0) it.next()).b(ehr0Var)) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        boolean z = this.X;
        p1l1 p1l1Var = p1l1.a;
        iu30 iu30Var = this.N0;
        if (!z) {
            WebView webView = this.g;
            if (webView.canGoBack()) {
                webView.goBack();
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 && nhc1.Y(webBackForwardListCopyBackForwardList.getItemAtIndex(0).getUrl(), "https://accounts.spotify.com/", false)) {
                    iu30Var.invoke(p1l1Var);
                    return;
                }
                return;
            }
        }
        iu30Var.invoke(p1l1Var);
    }

    public final Object getView() {
        return this.f;
    }

    public final void onPause(iac0 iac0Var) {
        this.N0.invoke(t1l1.a);
    }

    public final void onResume(iac0 iac0Var) {
        this.N0.invoke(w1l1.a);
    }

    public final Bundle serialize() {
        if (!this.Z) {
            return null;
        }
        p2l1 p2l1Var = (p2l1) this.e.a();
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        this.g.saveState(bundle2);
        bundle.putBundle("vtec_webview", bundle2);
        bundle.putString("vtec_current_url", p2l1Var.b);
        ArrayMap arrayMap = this.Y.a;
        ArrayList arrayList = new ArrayList(arrayMap.size());
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        bundle.putStringArray("vtec_native_session_storage_keys", (String[]) arrayList.toArray(new String[0]));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : arrayMap.entrySet()) {
            bundle3.putString((String) entry.getKey(), (String) entry.getValue());
        }
        bundle.putBundle("vtec_native_session_storage_data", bundle3);
        return bundle;
    }

    public final void start() {
        this.d.e().getLifecycle().a(this);
        this.f.setKeepScreenOn(true);
        m4l1 m4l1Var = this.i;
        WebView.setWebContentsDebuggingEnabled(m4l1Var.d.b && m4l1Var.f);
        WebViewClient webViewClient = m4l1Var.c;
        WebView webView = this.g;
        webView.setWebViewClient(webViewClient);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setNeedInitialFocus(false);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        WebSettings settings = webView.getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " VtecTheStage/" + m4l1Var.e.a());
        webView.addJavascriptInterface(m4l1Var.a, "spotifyAndroidClient");
        webView.addJavascriptInterface(m4l1Var.b, "spotifyAndroidClientSessionStorage");
        webView.setWebChromeClient(this.t);
        ed2 ed2Var = ed2.i;
        MobiusLoop.Controller controller = this.e;
        controller.c(ed2Var);
        controller.start();
        this.h.setOnClickListener(new gl61(this, (byte) 17));
    }

    public final void stop() {
        this.P0.invoke();
        this.i.getClass();
        WebView.setWebContentsDebuggingEnabled(false);
        this.g.destroy();
        MobiusLoop.Controller controller = this.e;
        controller.stop();
        controller.disconnect();
        this.d.e().getLifecycle().d(this);
    }
}
