package p;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gl00 implements ViewTreeObserver.OnDrawListener {
    public boolean a;
    public final /* synthetic */ View b;
    public final /* synthetic */ t3x c;

    public gl00(View view, t3x t3xVar) {
        this.b = view;
        this.c = t3xVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.a) {
            return;
        }
        this.a = true;
        t3x t3xVar = this.c;
        View view = this.b;
        view.post(new uu1(view, this, t3xVar, (byte) 12));
    }
}
