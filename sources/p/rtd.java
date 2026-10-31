package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rtd implements wrd {
    public final tvd a;

    public rtd(tvd tvdVar, jsd jsdVar) {
        this.a = tvdVar;
        tvdVar.setAppearance(jsdVar);
    }

    public final void a(vrd vrdVar) {
        this.a.setTextLayout(vrdVar);
    }

    public final View getView() {
        return this.a;
    }

    @Override // p.qa0
    public final void setActive(boolean z) {
        this.a.setActive(z);
    }
}
