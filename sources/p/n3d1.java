package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n3d1 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final i29 g;
    public int h;
    public int i;
    public j4d1 k;
    public m3d1 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public n3d1(int i, int i2, i29 i29Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = i29Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new m3d1(i29Var.a, i2);
    }

    public final void a() {
        o0c.q("Edge is already closed.", !this.n);
    }

    public final void b() {
        w8p1.m();
        this.l.a();
        this.n = true;
    }

    public final j4d1 c(n3d n3dVar, boolean z) {
        w8p1.m();
        a();
        i29 i29Var = this.g;
        j4d1 j4d1Var = new j4d1(i29Var.a, n3dVar, z, i29Var.b, new k3d1(this, (byte) 0));
        try {
            g280 g280Var = j4d1Var.k;
            m3d1 m3d1Var = this.l;
            if (m3d1Var.g(g280Var, new j3d1(m3d1Var, (byte) 1))) {
                poz0.F(m3d1Var.e).b(new i2t(g280Var, (byte) 1), n5u.a());
            }
            this.k = j4d1Var;
            e();
            return j4d1Var;
        } catch (DeferrableSurface$SurfaceClosedException e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            j4d1Var.c();
            throw e2;
        }
    }

    public final void d() {
        boolean z;
        w8p1.m();
        a();
        m3d1 m3d1Var = this.l;
        w8p1.m();
        if (m3d1Var.q == null) {
            synchronized (m3d1Var.a) {
                z = m3d1Var.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new m3d1(this.g.a, this.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        i4d1 i4d1Var;
        Executor executor;
        w8p1.m();
        o29 o29Var = new o29(this.d, this.i, this.h, this.c, this.b, this.e);
        j4d1 j4d1Var = this.k;
        if (j4d1Var != null) {
            synchronized (j4d1Var.a) {
                j4d1Var.l = o29Var;
                i4d1Var = j4d1Var.m;
                executor = j4d1Var.n;
            }
            if (i4d1Var != null && executor != null) {
                executor.execute(new f4d1(i4d1Var, o29Var, (byte) 1));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((dkl) it.next()).accept(o29Var);
        }
    }
}
