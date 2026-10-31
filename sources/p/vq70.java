package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class vq70 implements qy70 {
    public ByteBuffer N0;
    public ByteBuffer O0;
    public ByteBuffer P0;
    public ByteBuffer Q0;
    public bf70 a;
    public volatile int b;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public Executor g;
    public vnd h;
    public ImageWriter i;
    public volatile int d = 1;
    public Rect t = new Rect();
    public Rect X = new Rect();
    public Matrix Y = new Matrix();
    public Matrix Z = new Matrix();
    public final Object R0 = new Object();
    public boolean S0 = true;

    public zx70 a(ry70 ry70Var) {
        return ry70Var.m();
    }

    public final n8d0 b(zx70 zx70Var) throws Throwable {
        Object obj;
        Executor executor;
        bf70 bf70Var;
        boolean z;
        vnd vndVar;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        zq70 zq70Var;
        zq70 zq70VarE;
        int i = this.e ? this.b : 0;
        Object obj2 = this.R0;
        synchronized (obj2) {
            try {
                try {
                    executor = this.g;
                    bf70Var = this.a;
                    z = this.e && i != this.c;
                    if (z) {
                        h(zx70Var, i);
                    }
                    if (this.e) {
                        d(zx70Var);
                    }
                    try {
                        vndVar = this.h;
                        try {
                            imageWriter = this.i;
                            byteBuffer = this.N0;
                            try {
                                byteBuffer2 = this.O0;
                                byteBuffer3 = this.P0;
                                byteBuffer4 = this.Q0;
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (bf70Var == null || executor == null || !this.S0) {
            return new e280(new OperationCanceledException("No analyzer or executor currently set."), (byte) 1);
        }
        if (vndVar == null) {
            zq70Var = null;
        } else {
            if (this.d == 2) {
                zq70VarE = ImageProcessingUtil.b(zx70Var, vndVar, byteBuffer, i, this.f);
            } else {
                if (this.d == 1) {
                    if (this.f) {
                        ImageProcessingUtil.a(zx70Var);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        zq70VarE = ImageProcessingUtil.e(zx70Var, vndVar, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                zq70Var = null;
            }
            zq70Var = zq70VarE;
        }
        boolean z2 = zq70Var == null;
        zx70 zx70Var2 = z2 ? zx70Var : zq70Var;
        Rect rect = new Rect();
        Matrix matrix = new Matrix();
        synchronized (this.R0) {
            if (z && !z2) {
                try {
                    g(zx70Var.getWidth(), zx70Var.getHeight(), zx70Var2.getWidth(), zx70Var2.getHeight());
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            this.c = i;
            rect.set(this.X);
            matrix.set(this.Z);
        }
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            executor.execute(new ie(this, zx70Var, matrix, zx70Var2, rect, bf70Var, mzcVar, (byte) 1));
            mzcVar.a = "analyzeImage";
            return pzcVar;
        } catch (Exception e) {
            pzcVar.a(e);
            return pzcVar;
        }
    }

    public final void d(zx70 zx70Var) {
        if (this.d != 1) {
            if (this.d == 2 && this.N0 == null) {
                this.N0 = ByteBuffer.allocateDirect(zx70Var.getHeight() * zx70Var.getWidth() * 4);
                return;
            }
            return;
        }
        ByteBuffer byteBufferAllocateDirect = this.O0;
        if (byteBufferAllocateDirect == null) {
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(zx70Var.getHeight() * zx70Var.getWidth());
            this.O0 = byteBufferAllocateDirect;
        }
        byteBufferAllocateDirect.position(0);
        ByteBuffer byteBufferAllocateDirect2 = this.P0;
        if (byteBufferAllocateDirect2 == null) {
            byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((zx70Var.getHeight() * zx70Var.getWidth()) / 4);
            this.P0 = byteBufferAllocateDirect2;
        }
        byteBufferAllocateDirect2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = this.Q0;
        if (byteBufferAllocateDirect3 == null) {
            byteBufferAllocateDirect3 = ByteBuffer.allocateDirect((zx70Var.getHeight() * zx70Var.getWidth()) / 4);
            this.Q0 = byteBufferAllocateDirect3;
        }
        byteBufferAllocateDirect3.position(0);
    }

    public final void e(ry70 ry70Var) throws Throwable {
        try {
            zx70 zx70VarA = a(ry70Var);
            if (zx70VarA != null) {
                f(zx70VarA);
            }
        } catch (IllegalStateException unused) {
            j2h1.q("ImageAnalysisAnalyzer");
        }
    }

    public void f(zx70 zx70Var) throws Throwable {
        n8d0 n8d0VarB = b(zx70Var);
        lmw lmwVar = new lmw(zx70Var, (byte) 24);
        n8d0VarB.b(new nx30((Object) n8d0VarB, (Object) lmwVar, (byte) 0), n5u.a());
    }

    public final void g(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = pfg1.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.t);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.X = rect;
        this.Z.setConcat(this.Y, matrix);
    }

    public final void h(zx70 zx70Var, int i) {
        vnd vndVar = this.h;
        if (vndVar == null) {
            return;
        }
        vndVar.k();
        int width = zx70Var.getWidth();
        int height = zx70Var.getHeight();
        int iD = this.h.d();
        int iH = this.h.h();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.h = new vnd(anm1.r(i2, width, iD, iH));
        if (this.d == 1) {
            ImageWriter imageWriter = this.i;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.i = ImageWriter.newInstance(this.h.getSurface(), this.h.h());
        }
    }

    public void c() {
    }
}
