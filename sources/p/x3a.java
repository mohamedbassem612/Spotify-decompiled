package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x3a implements isw {
    public final /* synthetic */ bs0 a;

    public x3a(bs0 bs0Var, iu30 iu30Var) {
        this.a = bs0Var;
        bs0.e(bs0Var).n(new ib2(iu30Var, (byte) 28));
    }

    public final void a(Object obj, ysw yswVar) {
        t3a t3aVar = (t3a) obj;
        bs0 bs0Var = this.a;
        bs0.e(bs0Var).getView().setVisibility((t3aVar.c() || u890.j(t3aVar.b(), t3aVar.a()) || t3aVar.a().length() <= 0 || t3aVar.b().length() <= 0) ? 8 : 0);
        bs0.e(bs0Var).f(t3aVar);
    }

    public final View getView() {
        return bs0.e(this.a).getView();
    }
}
