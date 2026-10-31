package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hn8 extends v4n {
    public final vq6 b2;
    public wm8 c2;
    public e2p d2;
    public b4v0 e2;
    public final idd1 f2 = new idd1(new gn8(this, (byte) 0));
    public final idd1 g2 = new idd1(new gn8(this, (byte) 1));

    public hn8(vq6 vq6Var) {
        this.b2 = vq6Var;
    }

    @Override // p.haa
    public final void k1(t4n t4nVar) {
        t4nVar.g().L(3);
    }

    @Override // p.v4n
    public final View n1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.s1.a((hac0) this.f2.getValue());
        this.s1.a((qyb) this.g2.getValue());
        ComposeView composeView = new ComposeView(P0(), null, 0, 6, null);
        composeView.setContent(apo.j(1143123729, new mu6(this, (byte) 15), true));
        return composeView;
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.b2.f(this);
        super.v0(context);
    }

    @Override // p.zf30
    public final void y0() {
        this.s1.d((hac0) this.f2.getValue());
        this.s1.d((qyb) this.g2.getValue());
        this.h1 = true;
    }
}
