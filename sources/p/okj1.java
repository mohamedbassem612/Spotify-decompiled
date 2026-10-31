package p;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class okj1 implements gd50 {
    public final npj1 a;
    public final int b;
    public final long c;
    public final AtomicLong d = new AtomicLong();

    public okj1(npj1 npj1Var, int i, long j) {
        this.a = npj1Var;
        this.b = i;
        this.c = j;
    }

    @Override // p.p5q0
    public final void a(e4w e4wVar, long j, ie30 ie30Var, boolean z) {
        String scheme;
        int i;
        soh0 soh0Var = e4wVar.a.b;
        boolean zEquals = (soh0Var == null || (scheme = soh0Var.a.getScheme()) == null) ? false : scheme.equals("transformer_surface_asset");
        long jB = e4wVar.b(j);
        AtomicLong atomicLong = this.d;
        if (ie30Var != null) {
            if (ie30Var.C % 180 != 0) {
                ge30 ge30VarA = ie30Var.a();
                ge30VarA.v = ie30Var.x;
                ge30VarA.w = ie30Var.w;
                ge30VarA.B = 0;
                ie30Var = new ie30(ge30VarA);
            }
            ie30 ie30Var2 = ie30Var;
            if (zEquals) {
                i = 4;
            } else {
                String str = ie30Var2.f66p;
                str.getClass();
                if (asj0.m(str)) {
                    i = 2;
                } else if (str.equals("video/raw")) {
                    i = 3;
                } else {
                    if (!asj0.o(str)) {
                        hhg1.n("MIME type not supported ".concat(str));
                        return;
                    }
                    i = 1;
                }
            }
            this.a.o(this.b, i, ie30Var2, e4wVar.f.b, atomicLong.get() + this.c);
        }
        atomicLong.addAndGet(jB);
    }

    @Override // p.d541
    public final Surface c() {
        return this.a.f(this.b);
    }

    @Override // p.d541
    public final int f() {
        return this.a.k(this.b);
    }

    @Override // p.d541
    public final void g() {
        this.a.n(this.b);
    }

    @Override // p.d541
    public final boolean h(long j) {
        return this.a.c(this.b);
    }

    @Override // p.d541
    public final int i(Bitmap bitmap, rgl rglVar) {
        return this.a.d(this.b, bitmap, rglVar) ? 1 : 2;
    }
}
