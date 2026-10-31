package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b5a1 implements yt90 {
    public final Context a;
    public final lx91 b;
    public final c9c0 c;
    public final g0l d;
    public final Observable e;
    public final kt91 f;
    public final b0a0 g;
    public final jut h;
    public final z1s i;
    public final kor j;
    public final dxz0 k;
    public final zeu0 l;
    public final Scheduler m;
    public final rku n = new rku();
    public final rku o = new rku();

    public b5a1(Context context, lx91 lx91Var, c9c0 c9c0Var, g0l g0lVar, Observable observable, kt91 kt91Var, b0a0 b0a0Var, jut jutVar, z1s z1sVar, kor korVar, dxz0 dxz0Var, zeu0 zeu0Var, Scheduler scheduler) {
        this.a = context;
        this.b = lx91Var;
        this.c = c9c0Var;
        this.d = g0lVar;
        this.e = observable;
        this.f = kt91Var;
        this.g = b0a0Var;
        this.h = jutVar;
        this.i = z1sVar;
        this.j = korVar;
        this.k = dxz0Var;
        this.l = zeu0Var;
        this.m = scheduler;
    }

    @Override // p.yt90
    public final void start() {
        this.n.b(yoi1.i(this.c.e.a(), o6x.a).map(wdx0.O0).distinctUntilChanged().filter(gex0.P0).subscribe((Consumer) new z2a1(this, (byte) 2)));
    }

    @Override // p.yt90
    public final void stop() {
        this.o.a();
        this.n.a();
    }
}
