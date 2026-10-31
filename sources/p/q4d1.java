package p;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q4d1 extends hmw0 {
    public SurfaceView e;
    public final p4d1 f;

    public q4d1(FrameLayout frameLayout, ylw0 ylw0Var) {
        super(frameLayout, ylw0Var);
        this.f = new p4d1(this);
    }

    @Override // p.hmw0
    public final View a() {
        return this.e;
    }

    @Override // p.hmw0
    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: p.o4d1
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    j2h1.o("SurfaceViewImpl");
                } else {
                    j2h1.p("SurfaceViewImpl");
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                j2h1.p("SurfaceViewImpl");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException unused) {
            j2h1.q("SurfaceViewImpl");
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // p.hmw0
    public final void e(j4d1 j4d1Var, k65 k65Var) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals(this.a, j4d1Var.b);
        if (surfaceView == null || !zEquals) {
            Size size = j4d1Var.b;
            this.a = size;
            size.getClass();
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorN = x74.N(this.e.getContext());
        j4d1Var.j.a(new v241(k65Var, (byte) 12), executorN);
        this.e.post(new vqh0((Object) this, (Object) j4d1Var, (Object) k65Var, (byte) 14));
    }
}
