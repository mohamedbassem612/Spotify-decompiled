package p;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vq01 implements ViewTreeObserver.OnWindowFocusChangeListener {
    public static final vq01 a = new vq01();

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            ew01.a.a(rih1.a);
        }
    }
}
