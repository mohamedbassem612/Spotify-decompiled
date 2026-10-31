package p;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rts implements e4d1, SurfaceTexture.OnFrameAvailableListener {
    public final ArrayList X;
    public final xmm0 a;
    public final HandlerThread b;
    public final js50 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean t;

    public rts(liv livVar) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.t = false;
        this.X = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new js50(handler);
        this.a = new xmm0();
        try {
            g(livVar);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    @Override // p.e4d1
    public final void a(d4d1 d4d1Var) {
        if (this.e.get()) {
            d4d1Var.close();
        } else {
            d(new e0i((Object) this, (Object) d4d1Var, (byte) 14), new fss(d4d1Var, (byte) 3));
        }
    }

    @Override // p.e4d1
    public final void b(j4d1 j4d1Var) {
        if (this.e.get()) {
            j4d1Var.c();
        } else {
            d(new e0i((Object) this, (Object) j4d1Var, (byte) 15), new qts(j4d1Var, (byte) 0));
        }
    }

    public final void c() {
        if (this.t && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((d4d1) it.next()).close();
            }
            Iterator it2 = this.X.iterator();
            if (it2.hasNext()) {
                ((o09) it2.next()).getClass();
                new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
                throw null;
            }
            linkedHashMap.clear();
            xmm0 xmm0Var = this.a;
            if (((AtomicBoolean) xmm0Var.c).getAndSet(false)) {
                hy30.c((Thread) xmm0Var.e);
                xmm0Var.m();
            }
            this.b.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new c45((Object) this, (Object) runnable2, (Object) runnable, (byte) 12));
        } catch (RejectedExecutionException unused) {
            j2h1.N("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void e(Exception exc) {
        ArrayList arrayList = this.X;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((o09) it.next()).getClass();
            throw null;
        }
        arrayList.clear();
    }

    public final Bitmap f(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        wgo1.A(i, fArr2);
        wgo1.B(fArr2);
        Size sizeE = pfg1.e(size, i);
        xmm0 xmm0Var = this.a;
        xmm0Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeE.getHeight() * sizeE.getWidth() * 4);
        o0c.k("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeE.getHeight() * sizeE.getWidth()) * 4);
        o0c.k("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = hy30.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        hy30.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        hy30.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        hy30.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeE.getWidth(), sizeE.getHeight(), 0, 6407, 5121, null);
        hy30.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        hy30.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        hy30.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        hy30.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        hy30.b("glActiveTexture");
        GLES20.glBindTexture(36197, xmm0Var.b);
        hy30.b("glBindTexture");
        xmm0Var.j = null;
        GLES20.glViewport(0, 0, sizeE.getWidth(), sizeE.getHeight());
        GLES20.glScissor(0, 0, sizeE.getWidth(), sizeE.getHeight());
        fy30 fy30Var = (fy30) xmm0Var.l;
        fy30Var.getClass();
        if (fy30Var instanceof gy30) {
            GLES20.glUniformMatrix4fv(((gy30) fy30Var).f, 1, false, fArr2, 0);
            hy30.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        hy30.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeE.getWidth(), sizeE.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        hy30.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        hy30.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        hy30.b("glDeleteFramebuffers");
        int i4 = xmm0Var.b;
        GLES20.glActiveTexture(33984);
        hy30.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        hy30.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeE.getWidth(), sizeE.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.c(bitmapCreateBitmap, byteBufferAllocateDirect, sizeE.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void g(liv livVar) {
        Map map = Collections.EMPTY_MAP;
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            d(new m2d(this, livVar, mzcVar), new k((byte) 8));
            mzcVar.a = "Init GlRenderer";
        } catch (Exception e) {
            pzcVar.a(e);
        }
        try {
            pzcVar.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            k220.p("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void h(yvg1 yvg1Var) {
        ArrayList arrayList = this.X;
        if (arrayList.isEmpty()) {
            return;
        }
        if (yvg1Var == null) {
            e(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    byteArrayOutputStream.close();
                    return;
                }
                ((o09) it.next()).getClass();
                Bitmap bitmapF = f((Size) yvg1Var.b, (float[]) yvg1Var.c, 0);
                byteArrayOutputStream.reset();
                bitmapF.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Surface surface = (Surface) yvg1Var.a;
                Objects.requireNonNull(byteArray);
                ImageProcessingUtil.f(byteArray, surface);
                throw null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e(e);
        }
        e(e);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        yvg1 yvg1Var = null;
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            d4d1 d4d1Var = (d4d1) entry.getKey();
            float[] fArr2 = d4d1Var.e;
            float[] fArr3 = this.g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = d4d1Var.c;
            if (i == 34) {
                try {
                    this.a.o(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException unused) {
                    j2h1.q("DefaultSurfaceProcessor");
                }
            } else {
                o0c.q("Unsupported format: " + i, i == 256);
                o0c.q("Only one JPEG output is supported.", yvg1Var == null);
                yvg1Var = new yvg1(surface, d4d1Var.d, (float[]) fArr3.clone());
            }
        }
        try {
            h(yvg1Var);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    @Override // p.e4d1
    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        d(new fss(this, (byte) 4), new k((byte) 8));
    }
}
