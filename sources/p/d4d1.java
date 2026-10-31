package p;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d4d1 implements Closeable {
    public final mzc X;
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public dkl f;
    public Executor g;
    public final pzc t;
    public final Object a = new Object();
    public boolean h = false;
    public boolean i = false;

    public d4d1(Surface surface, int i, Size size, l29 l29Var, l29 l29Var2) {
        float[] fArr = new float[16];
        this.e = fArr;
        this.b = surface;
        this.c = i;
        this.d = size;
        a(fArr, new float[16], l29Var);
        a(new float[16], new float[16], l29Var2);
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        try {
            this.X = mzcVar;
            mzcVar.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            pzcVar.a(e);
        }
        this.t = pzcVar;
    }

    public static void a(float[] fArr, float[] fArr2, l29 l29Var) {
        Matrix.setIdentityM(fArr, 0);
        if (l29Var == null) {
            return;
        }
        Size size = l29Var.a;
        boolean z = l29Var.e;
        int i = l29Var.d;
        wgo1.B(fArr);
        wgo1.A(i, fArr);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeE = pfg1.e(size, i);
        android.graphics.Matrix matrixA = pfg1.a(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), new RectF(0.0f, 0.0f, sizeE.getWidth(), sizeE.getHeight()), i, z);
        RectF rectF = new RectF(l29Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeE.getWidth();
        float height = ((sizeE.getHeight() - rectF.height()) - rectF.top) / sizeE.getHeight();
        float fWidth = rectF.width() / sizeE.getWidth();
        float fHeight = rectF.height() / sizeE.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        n3d n3dVar = l29Var.c;
        Matrix.setIdentityM(fArr2, 0);
        wgo1.B(fArr2);
        if (n3dVar != null) {
            o0c.q("Camera has no transform.", n3dVar.n());
            wgo1.A(n3dVar.g().a(), fArr2);
            if (n3dVar.g().d() == 0) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final Surface c(js50 js50Var, dkl dklVar) {
        boolean z;
        synchronized (this.a) {
            this.g = js50Var;
            this.f = dklVar;
            z = this.h;
        }
        if (z) {
            d();
        }
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.i) {
                    this.i = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.X.b((Object) null);
    }

    public final void d() {
        byte b;
        Executor executor;
        dkl dklVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                b = 1;
                if (this.g == null || (dklVar = this.f) == null) {
                    this.h = true;
                } else if (!this.i) {
                    atomicReference.set(dklVar);
                    executor = this.g;
                    this.h = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new qub1(this, atomicReference, b));
            } catch (RejectedExecutionException unused) {
                j2h1.z(3, j2h1.J("SurfaceOutputImpl"));
            }
        }
    }
}
