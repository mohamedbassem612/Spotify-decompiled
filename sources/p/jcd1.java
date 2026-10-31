package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jcd1 implements xxy0 {
    public final zxy0 b;
    public final pux0 c;
    public final dma1 d;
    public final Scheduler e;
    public final kly0 f;
    public final q8n g;
    public final CompositeDisposable h = new CompositeDisposable();

    public jcd1(zxy0 zxy0Var, pux0 pux0Var, dma1 dma1Var, Scheduler scheduler, caq caqVar, q8n q8nVar) {
        this.b = zxy0Var;
        this.c = pux0Var;
        this.d = dma1Var;
        this.e = scheduler;
        this.f = caqVar;
        this.g = q8nVar;
    }

    public final void a() {
        this.h.g();
    }

    public final void b(int i, String str) {
        int i2;
        int iC = l1d.C(i);
        int i3 = 2;
        if (iC == 0) {
            i2 = i3;
        } else if (iC == 1) {
            i2 = 4;
        } else if (iC != 2) {
            eg.o();
            return;
        } else {
            i3 = 3;
            i2 = i3;
        }
        this.h.b(j2h1.D(this.g, new zi3(this, str, i2, (lnm) null, (byte) 17)).g(new dkb1(this, str, (byte) 4)).subscribe(ps4.Z0, iqa1.P0));
    }

    public final void c() {
        this.h.b(this.b.a().retry(1L).subscribe(new z2a1(this, (byte) 12), iqa1.O0));
    }

    public final Completable d() {
        return this.b.a().subscribeOn(this.e).flatMapCompletable(new q881(this, (byte) 18));
    }

    public final Completable e() {
        xxy0.a.getClass();
        String strE = this.d.e(wxy0.b, "");
        String str = strE != null ? strE : "";
        return str.length() == 0 ? CompletableEmpty.a : ((gyy0) this.c.c).a(Collections.singletonList(new eyy0(str))).s(this.e).h(iqa1.N0).g(new ruz0(this, (byte) 17)).o(Functions.h);
    }
}
