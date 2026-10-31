package p;

import android.os.Build;
import android.view.ViewGroup;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ppl1 implements iyf0 {
    public final i85 a;
    public final em3 b;
    public final pu71 c;
    public final rx5 d;
    public final yzu e;
    public final Scheduler f;
    public final Scheduler g;
    public final vku h = new vku();

    public ppl1(i85 i85Var, em3 em3Var, pu71 pu71Var, rx5 rx5Var, yzu yzuVar, Scheduler scheduler, Scheduler scheduler2) {
        this.a = i85Var;
        this.b = em3Var;
        this.c = pu71Var;
        this.d = rx5Var;
        this.e = yzuVar;
        this.f = scheduler;
        this.g = scheduler2;
    }

    @Override // p.iyf0
    public final void c() {
        if (Build.VERSION.SDK_INT >= 26) {
            Scheduler scheduler = this.f;
            this.h.a(rqt0.F(w0h1.h(scheduler), new i7u0(this, (lnm) null, (byte) 16)).flatMap(new lxh1(this, (byte) 10)).subscribeOn(scheduler).observeOn(this.g).map(new h5a1(this, (byte) 27)).observeOn(scheduler).subscribe((Consumer) new rdj1(this, (byte) 16)));
        }
    }

    @Override // p.iyf0
    public final void d() {
        this.h.c();
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
