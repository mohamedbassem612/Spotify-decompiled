package p;

import android.webkit.WebView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class des0 extends WebView.VisualStateCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ double b;
    public final /* synthetic */ Object c;

    public /* synthetic */ des0(Object obj, double d, byte b) {
        this.a = b;
        this.c = obj;
        this.b = d;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        byte b = this.a;
        double d = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((iu30) obj).invoke(new uds0(d));
                break;
            default:
                gpv0 gpv0Var = (gpv0) obj;
                gpv0Var.c.setValue(Double.valueOf(d));
                ees0 ees0Var = gpv0Var.f;
                if (ees0Var != null) {
                    ees0Var.h(d);
                }
                break;
        }
    }
}
