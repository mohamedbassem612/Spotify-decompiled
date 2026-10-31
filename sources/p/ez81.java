package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ez81 implements npj1 {
    public final Context a;
    public final yys b;
    public final x8h c;
    public final mpj1 d;
    public final Executor e;
    public final boolean f;
    public voj1 g;
    public o3d1 h;
    public b380 i;
    public boolean j;
    public volatile boolean k;
    public int l;

    public ez81(Context context, yys yysVar, x8h x8hVar, mpj1 mpj1Var, Executor executor, boolean z) {
        this.a = context;
        this.b = yysVar;
        this.c = x8hVar;
        this.d = mpj1Var;
        this.e = executor;
        w280 w280Var = b380.b;
        this.i = bg11.e;
        this.f = z;
        this.l = -1;
    }

    @Override // p.npj1
    public final void b() {
        this.g.getClass();
        throw new UnsupportedOperationException("Replaying when enableReplayableCache is set to false");
    }

    @Override // p.npj1
    public final boolean c(int i) {
        this.g.getClass();
        return ((azs) this.g).g();
    }

    @Override // p.npj1
    public final boolean d(int i, Bitmap bitmap, rgl rglVar) {
        this.g.getClass();
        return ((azs) this.g).f(bitmap, rglVar);
    }

    @Override // p.npj1
    public final void e(List list) {
        this.i = b380.p(list);
    }

    @Override // p.npj1
    public final Surface f(int i) {
        this.g.getClass();
        SparseArray sparseArray = ((azs) this.g).f.g;
        String str = zoi1.a;
        dm5.y(sparseArray.indexOfKey(1) >= 0);
        return ((yj80) sparseArray.get(1)).a.r();
    }

    @Override // p.npj1
    public final void flush() {
        this.g.getClass();
        ((azs) this.g).e();
    }

    @Override // p.npj1
    public final void g(long j) {
        this.g.getClass();
        azs azsVar = (azs) this.g;
        dm5.z(!azsVar.j, "Calling this method is not allowed when renderFramesAutomatically is enabled");
        azsVar.g.g(new nys(azsVar, j, (byte) 1));
    }

    @Override // p.npj1
    public final void h(m9x0 m9x0Var) {
        dm5.n(m9x0Var.equals(m9x0.W0), "SingleInputVideoGraph does not use VideoCompositor, and therefore cannot apply VideoCompositorSettings");
    }

    @Override // p.npj1
    public final boolean i() {
        return this.k;
    }

    @Override // p.npj1
    public final int k(int i) {
        this.g.getClass();
        o5 o5Var = ((azs) this.g).f.j;
        if (o5Var != null) {
            return o5Var.t();
        }
        return 0;
    }

    @Override // p.npj1
    public final void l(int i) throws VideoFrameProcessingException {
        dm5.y(this.g == null && !this.j);
        dm5.z(this.l == -1, "This VideoGraph supports only one input.");
        this.l = i;
        azs azsVarB = this.b.b(this.a, this.c, this.f, l5u.a, new w360(this));
        this.g = azsVarB;
        o3d1 o3d1Var = this.h;
        if (o3d1Var != null) {
            azsVarB.j(o3d1Var);
        }
    }

    @Override // p.npj1
    public final void m(o3d1 o3d1Var) {
        this.h = o3d1Var;
        voj1 voj1Var = this.g;
        if (voj1Var != null) {
            ((azs) voj1Var).j(o3d1Var);
        }
    }

    @Override // p.npj1
    public final void n(int i) {
        this.g.getClass();
        ((azs) this.g).k();
    }

    @Override // p.npj1
    public final void o(int i, int i2, ie30 ie30Var, List list, long j) {
        this.g.getClass();
        voj1 voj1Var = this.g;
        v280 v280Var = new v280(4);
        v280Var.e(list);
        v280Var.e(this.i);
        ((azs) voj1Var).h(i2, j, v280Var.g(), ie30Var);
    }

    @Override // p.npj1
    public final void release() {
        if (this.j) {
            return;
        }
        voj1 voj1Var = this.g;
        if (voj1Var != null) {
            ((azs) voj1Var).i();
        }
        this.j = true;
    }

    @Override // p.npj1
    public final void j() {
    }
}
