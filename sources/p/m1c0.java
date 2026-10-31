package p;

import android.os.Build;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m1c0 implements xxy0 {
    public final zxy0 b;
    public final pux0 c;
    public final dma1 d;
    public final Scheduler e;
    public final CompositeDisposable f = new CompositeDisposable();

    public m1c0(zxy0 zxy0Var, pux0 pux0Var, dma1 dma1Var, Scheduler scheduler) {
        this.b = zxy0Var;
        this.c = pux0Var;
        this.d = dma1Var;
        this.e = scheduler;
    }

    public final void a() {
        this.f.g();
    }

    public final void b(int i, String str) {
        pux0 pux0Var = this.c;
        gyy0 gyy0Var = (gyy0) pux0Var.c;
        zym0 zym0Var = (ajg) pux0Var.b;
        String str2 = zym0Var.a;
        String str3 = Build.VERSION.RELEASE;
        this.f.b(gyy0Var.b(new nxy0(str, str2, zym0Var.e())).g(new l1c0(this, str, (byte) 0)).subscribe(ps4.P0, k530.Y0));
    }

    public final void c() {
        this.f.b(this.b.a().retry(1L).subscribe(new rwa0(this, (byte) 4), k530.W0));
    }

    public final Completable d() {
        xxy0.a.getClass();
        String strE = this.d.e(wxy0.b, "");
        return this.b.a().subscribeOn(this.e).flatMapCompletable(new v6a0(strE != null ? strE : "", this, (byte) 13));
    }

    public final Completable e() {
        xxy0.a.getClass();
        String strE = this.d.e(wxy0.b, "");
        String str = strE != null ? strE : "";
        return str.length() == 0 ? CompletableEmpty.a : ((gyy0) this.c.c).a(Collections.singletonList(new eyy0(str))).s(this.e).h(k530.V0).g(new f72(this, (byte) 27)).o(Functions.h);
    }
}
