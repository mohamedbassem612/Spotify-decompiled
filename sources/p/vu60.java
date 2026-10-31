package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vu60 implements yt90 {
    public final ynb0 a;
    public final p900 b;
    public final idd1 c = new idd1(new g050(this, (byte) 21));
    public final rku d = new rku();
    public final bpb1 e = gio1.b((Object) null);

    public vu60(ynb0 ynb0Var, p900 p900Var) {
        this.a = ynb0Var;
        this.b = p900Var;
    }

    @Override // p.yt90
    public final void start() {
        ev60 ev60Var = (ev60) ((cv60) this.c.getValue());
        this.d.b(Observable.never().compose(RxMobius.b(l1d.g(Mobius.d(new dv60(), RxConnectables.a(ut60.c(ev60Var.b, ev60Var.f, ev60Var.k, ev60Var.g, ev60Var.h, ev60Var.i, ev60Var.j, ev60Var.m, ev60Var.l, ev60Var.n))).h(uu60.a(yoi1.g(ev60Var.a.a()), ev60Var.c, ev60Var.d, ev60Var.e))), new fv60(null))).subscribe((Consumer) new od30(this, (byte) 18)));
    }

    @Override // p.yt90
    public final void stop() {
        this.d.a();
    }
}
