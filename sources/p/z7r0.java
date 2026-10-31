package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.appendix.contentviewstate.view.LoadingView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z7r0 implements j6t0 {
    public LoadingView a;

    public final void a(boolean z) {
        int i;
        LoadingView loadingView = this.a;
        if (loadingView != null) {
            if (!z || (i = loadingView.N0) == 2 || i == 3 || i == 4) {
                if (z) {
                    return;
                }
                loadingView.post(loadingView.Q0);
                return;
            }
            loadingView.b();
            LoadingView loadingView2 = this.a;
            int i2 = loadingView2.c;
            if (loadingView2.N0 == 1) {
                loadingView2.N0 = 2;
                loadingView2.postDelayed(loadingView2.O0, i2);
            }
        }
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        lqc lqcVar = LoadingView.S0;
        LoadingView loadingView = (LoadingView) layoutInflater.inflate(2131625163, (ViewGroup) null);
        this.a = loadingView;
        rwq0.s(loadingView, new dh((byte) 11));
    }

    public final View getView() {
        return this.a;
    }

    public final void stop() {
        LoadingView loadingView = this.a;
        if (loadingView != null) {
            loadingView.post(loadingView.Q0);
        }
    }

    public final void start() {
    }
}
