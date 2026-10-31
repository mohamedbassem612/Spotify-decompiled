package p;

import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c4p0 implements iyf0 {
    public final th30 a;
    public boolean b;

    public c4p0(th30 th30Var) {
        this.a = th30Var;
    }

    @Override // p.iyf0
    public final void c() {
        if (this.b) {
            th30 th30Var = this.a;
            if (th30Var.U() || th30Var.G("NowPlayingMiniTag") != null) {
                return;
            }
            nu9 nu9Var = new nu9(th30Var);
            nu9Var.n(2131430189, new b4p0(), "NowPlayingMiniTag");
            nu9Var.f();
        }
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
        th30 th30Var;
        zf30 zf30VarG;
        boolean z = viewGroup.findViewById(2131430189) != null;
        this.b = z;
        if (z || (zf30VarG = (th30Var = this.a).G("NowPlayingMiniTag")) == null) {
            return;
        }
        nu9 nu9Var = new nu9(th30Var);
        nu9Var.m(zf30VarG);
        nu9Var.f();
    }

    @Override // p.iyf0
    public final void d() {
    }
}
