package p;

import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o7m0 extends hab0 implements Function0 {
    public final /* synthetic */ q7m0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ WebView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7m0(q7m0 q7m0Var, View view, WebView webView) {
        super(0);
        this.a = q7m0Var;
        this.b = view;
        this.c = webView;
    }

    public final Object invoke() {
        q7m0 q7m0Var = this.a;
        q7m0Var.getClass();
        View view = this.b;
        view.setVisibility(0);
        boolean zB = q7m0Var.i.b(3);
        view.findViewById(2131431655).setVisibility(zB ? 0 : 8);
        view.findViewById(2131431656).setVisibility(zB ? 8 : 0);
        this.c.setVisibility(4);
        return rih1.a;
    }
}
