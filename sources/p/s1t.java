package p;

import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s1t implements Connectable, ych1 {
    public final pe a;
    public final p5 b;
    public final mxr c;
    public final r1k d;
    public final p5 e;
    public final ComposeView f;
    public final bpb1 g = gio1.b((Object) null);
    public iu30 h = d0t.Q0;

    public s1t(ComposeView composeView, pe peVar, p5 p5Var, mxr mxrVar, r1k r1kVar, p5 p5Var2) {
        this.a = peVar;
        this.b = p5Var;
        this.c = mxrVar;
        this.d = r1kVar;
        this.e = p5Var2;
        this.f = composeView;
        composeView.setContent(new j2i(14290360, new o1t(this, new obk1(composeView), (byte) 2), true));
    }

    public final Connection L(Consumer consumer) {
        this.h = new r1t(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 1);
        return new cn(this.d.L(consumer), this, (byte) 15);
    }

    public final void f(ssi0 ssi0Var) {
        this.b.invoke(ssi0Var);
    }

    public final void c(hia1 hia1Var) {
    }

    public final void e(boolean z) {
    }
}
