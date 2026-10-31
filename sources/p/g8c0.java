package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class g8c0 extends zf30 implements ug30 {
    @Override // p.ug30
    public final String A(Context context) {
        return context.getString(2131957323);
    }

    @Override // p.fn10
    public final gn10 Q() {
        return mno1.E;
    }

    @Override // p.lir0
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return nhc.m(yon1.h5());
    }

    @Override // p.ug30
    public final String s() {
        return "internal:licenses";
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = (WebView) layoutInflater.inflate(2131624694, viewGroup, false);
        webView.loadUrl("file:///android_asset/licenses.xhtml");
        int i = kgr0.T0;
        return xyn1.z(webView);
    }
}
