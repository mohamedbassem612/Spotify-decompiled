package p;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pzj implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ qzj a;

    public pzj(qzj qzjVar) {
        this.a = qzjVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        qzj qzjVar = this.a;
        qzjVar.g.a.clear();
        ax21 ax21Var = qzjVar.h;
        synchronized (ax21Var) {
            ax21Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        qzj qzjVar = this.a;
        qzjVar.g.a.clear();
        ax21 ax21Var = qzjVar.h;
        synchronized (ax21Var) {
            ax21Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.a.t.c.setValue(Boolean.valueOf(z));
    }
}
