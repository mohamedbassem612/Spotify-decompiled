package p;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sa10 extends o5 {
    public static final int[] X0 = {2, 3, 6, 7, 8, 9, 11, 14};
    public static final int[] Y0 = {1920, 1088};
    public static final long Z0;
    public int N0;
    public int O0;
    public boolean P0;
    public xj30 Q0;
    public xj30 R0;
    public boolean S0;
    public ScheduledFuture T0;
    public CountDownLatch U0;
    public volatile boolean V0;
    public volatile RuntimeException W0;
    public final ConcurrentLinkedQueue X;
    public final ScheduledExecutorService Y;
    public final boolean Z;
    public final ks40 e;
    public dos f;
    public final int g;
    public final Surface h;
    public final SurfaceTexture i;
    public final float[] t;

    static {
        Z0 = zoi1.S() ? 20000L : 500L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public sa10(ks40 ks40Var, final roj1 roj1Var, boolean z, boolean z2) throws VideoFrameProcessingException {
        super(roj1Var);
        this.e = ks40Var;
        this.S0 = z;
        this.Z = z2;
        try {
            int iL = fn31.L();
            fn31.r(36197, iL, 9729);
            this.g = iL;
            SurfaceTexture surfaceTexture = new SurfaceTexture(iL);
            this.i = surfaceTexture;
            this.t = new float[16];
            this.X = new ConcurrentLinkedQueue();
            this.Y = Executors.newSingleThreadScheduledExecutor(new ask("ExtTexMgr:Timer", (byte) 2));
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: p.ra10
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    roj1Var.f(new qa10(this.a, (byte) 4), false);
                }
            });
            this.h = new Surface(surfaceTexture);
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException((Throwable) e);
        }
    }

    public static float Q(float f, int i) {
        int i2 = i;
        for (int i3 = 2; i3 <= 256; i3 *= 2) {
            int i4 = (((i + i3) - 1) / i3) * i3;
            if (T(i4, i, f) < T(i2, i, f)) {
                i2 = i4;
            }
        }
        for (int i5 = 0; i5 < 2; i5++) {
            int i6 = Y0[i5];
            if (i6 >= i && T(i6, i, f) < T(i2, i, f)) {
                i2 = i6;
            }
        }
        return T(i2, i, f) > 1.0E-9f ? f : i / i2;
    }

    public static float T(int i, int i2, float f) {
        float fAbs = 1.0f;
        for (int i3 = 0; i3 <= 2; i3++) {
            float f2 = ((i2 - i3) / i) - f;
            if (Math.abs(f2) < fAbs) {
                fAbs = Math.abs(f2);
            }
        }
        return fAbs;
    }

    @Override // p.o5
    public final void E(xj30 xj30Var) {
        this.R0 = xj30Var;
        if (!this.S0) {
            this.X.add(xj30Var);
        }
        ((roj1) this.c).f(new qa10(this, (byte) 1), true);
    }

    @Override // p.o5
    public final void F() {
        this.i.release();
        this.h.release();
        this.Y.shutdownNow();
    }

    @Override // p.o5
    public final void G() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.U0 = countDownLatch;
        ((roj1) this.c).f(new qa10(this, (byte) 2), true);
        try {
            if (!countDownLatch.await(Z0, TimeUnit.MILLISECONDS)) {
                oon1.H("Timeout reached while waiting for latch to be unblocked.");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            oon1.H("Interrupted when waiting for MediaCodec frames to arrive.");
        }
        this.U0 = null;
        if (this.W0 != null) {
            throw this.W0;
        }
    }

    @Override // p.o5
    public final void I(xj30 xj30Var, boolean z) {
        this.S0 = z;
        if (z) {
            this.R0 = xj30Var;
            ie30 ie30Var = xj30Var.a;
            this.i.setDefaultBufferSize(ie30Var.w, ie30Var.x);
        }
    }

    @Override // p.o5
    public final void K(dos dosVar) {
        this.N0 = 0;
        this.f = dosVar;
    }

    @Override // p.o5
    public final void L() {
        ((roj1) this.c).f(new qa10(this, (byte) 0), true);
    }

    public final void R() {
        if (this.N0 == 0 || this.O0 == 0 || this.Q0 != null) {
            return;
        }
        this.i.updateTexImage();
        int i = 1;
        this.O0--;
        xj30 xj30Var = (xj30) this.X.element();
        this.Q0 = xj30Var;
        this.N0--;
        this.i.getTransformMatrix(this.t);
        long timestamp = (this.i.getTimestamp() / 1000) + xj30Var.b;
        if (this.Z) {
            float[] fArr = this.t;
            ie30 ie30Var = xj30Var.a;
            int i2 = ie30Var.w;
            int i3 = ie30Var.x;
            int i4 = 0;
            int i5 = fArr.length != 16 ? 1 : 0;
            int[] iArr = X0;
            for (int i6 = 0; i6 < 8; i6++) {
                i5 |= Math.abs(fArr[iArr[i6]]) > 1.0E-9f ? 1 : 0;
            }
            int i7 = i5 | (Math.abs(fArr[10] - 1.0f) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[15] - 1.0f) > 1.0E-9f ? 1 : 0);
            byte b = 13;
            byte b2 = 12;
            byte b3 = 4;
            if (Math.abs(fArr[0]) > 1.0E-9f && Math.abs(fArr[5]) > 1.0E-9f) {
                i = (Math.abs(fArr[4]) <= 1.0E-9f ? 0 : 1) | i7 | (Math.abs(fArr[1]) > 1.0E-9f ? 1 : 0);
                b2 = 13;
                b = 12;
                b3 = 5;
            } else if (Math.abs(fArr[1]) <= 1.0E-9f || Math.abs(fArr[4]) <= 1.0E-9f) {
                i4 = -1;
                b = -1;
                b2 = -1;
                b3 = -1;
            } else {
                i4 = 1;
                i = i7 | (Math.abs(fArr[0]) > 1.0E-9f ? 1 : 0) | (Math.abs(fArr[5]) > 1.0E-9f ? 1 : 0);
            }
            if (i != 0) {
                LinkedHashMap linkedHashMap = x8r.a;
                synchronized (x8r.class) {
                }
            } else {
                float f = fArr[i4];
                float f2 = fArr[b];
                if (Math.abs(f) + 1.0E-9f < 1.0f) {
                    float fCopySign = Math.copySign(Q(Math.abs(f), i2), f);
                    float fE = l1d.e(f, fCopySign, 0.5f, f2);
                    LinkedHashMap linkedHashMap2 = x8r.a;
                    synchronized (x8r.class) {
                    }
                    fArr[i4] = fCopySign;
                    fArr[b] = fE;
                }
                float f3 = fArr[b3];
                float f4 = fArr[b2];
                if (Math.abs(f3) + 1.0E-9f < 1.0f) {
                    float fCopySign2 = Math.copySign(Q(Math.abs(f3), i3), f3);
                    float fE2 = l1d.e(f3, fCopySign2, 0.5f, f4);
                    LinkedHashMap linkedHashMap3 = x8r.a;
                    synchronized (x8r.class) {
                    }
                    fArr[b3] = fCopySign2;
                    fArr[b2] = fE2;
                }
            }
        }
        dos dosVar = this.f;
        dosVar.getClass();
        dosVar.h.f("uTexTransformationMatrix", this.t);
        dos dosVar2 = this.f;
        dosVar2.getClass();
        ks40 ks40Var = this.e;
        int i8 = this.g;
        ie30 ie30Var2 = xj30Var.a;
        dosVar2.g(ks40Var, new ss40(i8, -1, ie30Var2.w, ie30Var2.x), timestamp);
        ((xj30) this.X.remove()).getClass();
        x8r.a();
    }

    public final void S() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        while (true) {
            int i = this.O0;
            concurrentLinkedQueue = this.X;
            if (i <= 0) {
                break;
            }
            this.O0 = i - 1;
            this.i.updateTexImage();
            concurrentLinkedQueue.remove();
        }
        if (this.U0 == null || !concurrentLinkedQueue.isEmpty()) {
            return;
        }
        this.U0.countDown();
    }

    public final void j(ss40 ss40Var) {
        ((roj1) this.c).f(new qa10(this, (byte) 3), true);
    }

    public final void k() {
        ((roj1) this.c).f(new ace(this, this.f, (byte) 2), true);
    }

    @Override // p.o5
    public final void o() {
        this.V0 = true;
    }

    @Override // p.o5
    public final void q() {
        this.N0 = 0;
        this.Q0 = null;
        this.X.clear();
        this.R0 = null;
        super.q();
    }

    @Override // p.o5
    public final Surface r() {
        return this.h;
    }

    @Override // p.o5
    public final int t() {
        return this.X.size();
    }
}
