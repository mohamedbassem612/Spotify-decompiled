package p;

import android.appwidget.AppWidgetManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class px5 implements Callable {
    public final /* synthetic */ rx5 a;

    public px5(rx5 rx5Var) {
        this.a = rx5Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AppWidgetManager appWidgetManager = this.a.b;
        boolean z = false;
        if (appWidgetManager != null && appWidgetManager.isRequestPinAppWidgetSupported()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
