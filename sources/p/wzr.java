package p;

import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wzr implements Connectable, ych1 {
    public final pe a;
    public final cir0 b;
    public final p5 c;
    public final qzr d;
    public final r1k e;
    public final da f;
    public final uhp g;
    public final ComposeView h;
    public final bpb1 i = gio1.b((Object) null);
    public final idd1 t = new idd1(new dor(this, (byte) 13));
    public final bpb1 X = gio1.b(ms41.a);
    public iu30 Y = nvr.a1;

    public wzr(ComposeView composeView, pe peVar, cir0 cir0Var, p5 p5Var, qzr qzrVar, r1k r1kVar, da daVar, uhp uhpVar) {
        this.a = peVar;
        this.b = cir0Var;
        this.c = p5Var;
        this.d = qzrVar;
        this.e = r1kVar;
        this.f = daVar;
        this.g = uhpVar;
        this.h = composeView;
        composeView.setContent(new j2i(891941566, new g1o(this, new obk1(composeView), (byte) 17), true));
    }

    public final Connection L(Consumer consumer) {
        this.Y = new wsr(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 4);
        return new cn(this.e.L(consumer), this, (byte) 12);
    }

    public final void c(hia1 hia1Var) {
        ((nps) this.t.getValue()).a(hia1Var);
    }

    public final void e(boolean z) {
        ns41 ns41Var = z ? ns41.a : ls41.a;
        bpb1 bpb1Var = this.X;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, ns41Var);
    }

    public final void f(ssi0 ssi0Var) {
        this.c.invoke(ssi0Var);
    }

    public final void d() {
    }
}
