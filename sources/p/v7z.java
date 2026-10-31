package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7z implements Connectable {
    public final String a;
    public final jar0 b;
    public final c3s c;
    public final e7p0 d;
    public final z8c0 e;
    public final pxr f;
    public final boolean g;
    public final Scheduler h;
    public Disposable i;

    public v7z(String str, jar0 jar0Var, c3s c3sVar, e7p0 e7p0Var, z8c0 z8c0Var, pxr pxrVar, boolean z, Scheduler scheduler) {
        this.a = str;
        this.b = jar0Var;
        this.c = c3sVar;
        this.d = e7p0Var;
        this.e = z8c0Var;
        this.f = pxrVar;
        this.g = z;
        this.h = scheduler;
    }

    public final Connection L(Consumer consumer) {
        return new rp(this, (byte) 27);
    }

    public final void a(String str, d1z d1zVar, tv80 tv80Var, long j, long j2, long j3) {
        this.e.e(new s0u0(str, this.a, j, tv80Var, j2, j3));
        if (d1zVar == d1z.a && this.g && this.c.d()) {
            this.i = this.f.a(this.a, this.h).filter(rbc.d1).take(1L).doOnError(dxu.t).subscribe(new lgr(tv80Var != null ? tv80Var.a : null, this, (byte) 16));
        }
    }
}
