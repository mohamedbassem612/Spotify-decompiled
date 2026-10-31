package p;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e9s implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b14 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Context d;

    public /* synthetic */ e9s(b14 b14Var, int i, Context context, byte b) {
        this.a = b;
        this.b = b14Var;
        this.c = i;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Context context = this.d;
        int i = this.c;
        b14 b14Var = this.b;
        switch (b) {
            case 0:
                WebView webView = (WebView) b14Var.d;
                ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.height = (int) (i * context.getResources().getDisplayMetrics().density);
                    webView.setLayoutParams(layoutParams);
                }
                break;
            default:
                WebView webView2 = (WebView) b14Var.d;
                ViewGroup.LayoutParams layoutParams2 = webView2.getLayoutParams();
                if (layoutParams2 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams2.height = (int) (i * context.getResources().getDisplayMetrics().density);
                    webView2.setLayoutParams(layoutParams2);
                }
                break;
        }
    }
}
