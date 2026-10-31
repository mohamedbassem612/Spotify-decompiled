package p;

import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Completable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k1t implements Connectable, ych1 {
    public final vqb0 O0;
    public final bpb1 P0;
    public iu30 Q0;
    public final idd1 Y;
    public final pe a;
    public final cir0 b;
    public final p5 c;
    public final t381 d;
    public final g1t e;
    public final r1k f;
    public final ffr g;
    public final uhp h;
    public final mes i;
    public final ComposeView t;
    public final bpb1 X = gio1.b((Object) null);
    public final idd1 Z = new idd1(new j1t(this, (byte) 0));
    public final idd1 N0 = new idd1(new j1t(this, (byte) 1));

    public k1t(ComposeView composeView, pe peVar, cir0 cir0Var, p5 p5Var, t381 t381Var, g1t g1tVar, r1k r1kVar, ffr ffrVar, ivq ivqVar, uhp uhpVar, jvq jvqVar, mes mesVar) {
        this.a = peVar;
        this.b = cir0Var;
        this.c = p5Var;
        this.d = t381Var;
        this.e = g1tVar;
        this.f = r1kVar;
        this.g = ffrVar;
        this.h = uhpVar;
        this.i = mesVar;
        this.t = composeView;
        this.Y = new idd1(new nxr(this, ivqVar, (byte) 29));
        l8s l8sVarT = ((lvq) jvqVar.a.c).b.T();
        c8o.l(l8sVarT);
        this.O0 = new vqb0(l8sVarT, composeView, (byte) 7);
        this.P0 = gio1.b(ms41.a);
        this.Q0 = d0t.Y;
        composeView.setContent(new j2i(1564859826, new g1o(this, new obk1(composeView), (byte) 29), true));
    }

    public final Connection L(Consumer consumer) {
        this.Q0 = new wsr(1, consumer, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0, (byte) 28);
        return new cn(this.f.L(consumer), this, (byte) 14);
    }

    public final void a(List list) {
        ((b431) this.Z.getValue()).a(new dum1(new bsm1(list, null)), (String) null);
    }

    public final Completable b(tv80 tv80Var) {
        return (Completable) ((z481) this.Y.getValue()).invoke(tv80Var);
    }

    public final void c(hia1 hia1Var) {
        ((nps) this.N0.getValue()).a(hia1Var);
    }

    public final void d() {
        this.d.invoke();
    }

    public final void e(boolean z) {
        ns41 ns41Var = z ? ns41.a : ls41.a;
        bpb1 bpb1Var = this.P0;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, ns41Var);
    }

    public final void f(ssi0 ssi0Var) {
        this.c.invoke(ssi0Var);
    }

    public final void g() {
        this.t.post(new a6n(this, (byte) 11));
    }

    public final void h() {
        this.i.a.setValue(Boolean.TRUE);
    }
}
