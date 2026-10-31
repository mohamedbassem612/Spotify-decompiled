package p;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p561 implements d541 {
    public final d541 a;
    public final int b;
    public long c;
    public final /* synthetic */ q561 d;

    public p561(q561 q561Var, d541 d541Var, int i) {
        this.d = q561Var;
        this.a = d541Var;
        this.b = i;
    }

    @Override // p.d541
    public final Surface c() {
        return this.a.c();
    }

    @Override // p.d541
    public final gar d() {
        return this.a.d();
    }

    @Override // p.d541
    public final boolean e() {
        d541 d541Var = this.a;
        gar garVarD = d541Var.d();
        garVarD.getClass();
        if (garVarD.f(4)) {
            q561 q561Var = this.d;
            q561Var.k.decrementAndGet();
            if (!q561Var.j()) {
                if (this.b == 1 && q561Var.f117p) {
                    dm5.y(d541Var.e());
                } else {
                    garVarD.g();
                    garVarD.f = 0L;
                }
                if (q561Var.k.get() == 0) {
                    q561Var.f.f(new v241(this, (byte) 3));
                }
                return true;
            }
        }
        dm5.y(d541Var.e());
        return true;
    }

    @Override // p.d541
    public final int f() {
        return this.a.f();
    }

    @Override // p.d541
    public final void g() {
        q561 q561Var = this.d;
        AtomicInteger atomicInteger = q561Var.k;
        atomicInteger.decrementAndGet();
        if (q561Var.j()) {
            this.a.g();
        } else if (atomicInteger.get() == 0) {
            q561Var.f.f(new v241(this, (byte) 3));
        }
    }

    @Override // p.d541
    public final boolean h(long j) {
        return this.a.h(j);
    }

    @Override // p.d541
    public final int i(Bitmap bitmap, rgl rglVar) {
        return this.a.i(bitmap, rglVar.a());
    }
}
