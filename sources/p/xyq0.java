package p;

import android.view.ViewGroup;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xyq0 implements iyf0 {
    public static final bma1 g = bma1.b.u("po-session-date");
    public final o241 a;
    public final r241 b;
    public final dma1 c;
    public final yt4 d;
    public final yqg e;
    public final rku f = new rku();

    public xyq0(o241 o241Var, r241 r241Var, dma1 dma1Var, yt4 yt4Var, yqg yqgVar) {
        this.a = o241Var;
        this.b = r241Var;
        this.c = dma1Var;
        this.d = yt4Var;
        this.e = yqgVar;
    }

    @Override // p.iyf0
    public final void c() {
        if (this.d.a()) {
            this.f.b(this.a.a("active-session-days", "null").take(1L).subscribe((Consumer) new ixp0(this, (byte) 5)));
        }
    }

    @Override // p.iyf0
    public final void d() {
        this.f.a();
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
