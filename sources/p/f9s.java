package p;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f9s implements ijc {
    public final /* synthetic */ Context a;
    public final /* synthetic */ b14 b;
    public final /* synthetic */ iu30 c;

    public f9s(Context context, b14 b14Var, iu30 iu30Var) {
        this.a = context;
        this.b = b14Var;
        this.c = iu30Var;
    }

    @JavascriptInterface
    public final void bannerHeight(int i) {
        this.c.invoke(new kgj0(i));
        b14 b14Var = this.b;
        WebView webView = (WebView) b14Var.d;
        if (webView != null) {
            webView.post(new e9s(b14Var, i, this.a, (byte) 0));
        }
    }

    @Override // p.ijc
    @JavascriptInterface
    public void call(String str) {
        this.c.invoke(new igj0(str, DismissType.ActionDeterminedDismiss.INSTANCE, new Bundle()));
    }

    @Override // p.ijc
    @JavascriptInterface
    public void callV2(String str, String str2, boolean z) {
        uga0 uga0VarL = fga0.l(nfa0.d.c(str2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : uga0VarL.a.entrySet()) {
            String str3 = (String) entry.getKey();
            aha0 aha0Var = (ega0) entry.getValue();
            if (aha0Var instanceof aha0) {
                aha0 aha0Var2 = aha0Var;
                if (aha0Var2.c()) {
                    linkedHashMap.put(str3, aha0Var2.b());
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("CLICK_ACTION_METADATA", new HashMap(linkedHashMap));
        this.c.invoke(new igj0(str, new DismissType.OverriddenDismiss(z), bundle));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f A[Catch: Exception -> 0x0035, TryCatch #0 {Exception -> 0x0035, blocks: (B:4:0x0008, B:6:0x001a, B:8:0x0021, B:7:0x001f), top: B:12:0x0008 }] */
    @Override // p.ijc
    @JavascriptInterface
    public void documentReady(String str) {
        w7x w7xVarP1;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.b.c;
        if (str != null) {
            try {
                smc0 smc0VarH = tm80.H(str, this.a.getResources().getDisplayMetrics().density);
                if (smc0VarH != null) {
                    w7xVarP1 = o7h.p1(smc0VarH);
                } else {
                    w7xVarP1 = w7x.a;
                }
            } catch (Exception unused) {
                n57.e("ClientMessagingPlatform: Failed to parse touch boundaries");
                return;
            }
        } else {
            w7xVarP1 = w7x.a;
        }
        linkedHashSet.clear();
        linkedHashSet.addAll((Collection) w7xVarP1);
        this.c.invoke(new ogj0(w7xVarP1));
    }

    @JavascriptInterface
    public final void noteHeight(int i) {
        this.c.invoke(new kgj0(i));
        b14 b14Var = this.b;
        WebView webView = (WebView) b14Var.d;
        if (webView != null) {
            webView.post(new e9s(b14Var, i, this.a, (byte) 1));
        }
    }

    @JavascriptInterface
    public final void shouldDismissOnSwipe(boolean z) {
        this.c.invoke(new jgj0(z));
    }

    @Override // p.ijc
    @JavascriptInterface
    public void documentReady() {
    }
}
