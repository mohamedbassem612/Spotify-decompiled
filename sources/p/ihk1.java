package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ihk1 implements lku {
    public final View a;
    public volatile s2t b;

    public ihk1(View view, s2t s2tVar) {
        this.a = view;
        this.b = s2tVar;
    }

    @Override // p.lku
    public final l2t a() {
        return this.b;
    }

    @Override // p.lku
    public final void dispose() {
        boolean z;
        khk1 khk1VarW = eth.w(this.a);
        synchronized (khk1VarW) {
            z = this != khk1VarW.b;
        }
        if (z) {
            return;
        }
        eth.w(this.a).a();
    }
}
