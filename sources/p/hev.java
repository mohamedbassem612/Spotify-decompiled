package p;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hev implements e4d1, SurfaceTexture.OnFrameAvailableListener {
    public final fev a;
    public final HandlerThread b;
    public final js50 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture t;

    public hev(liv livVar, xi20 xi20Var, xi20 xi20Var2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new js50(handler);
        this.a = new fev(xi20Var, xi20Var2);
        try {
            e(livVar);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    @Override // p.e4d1
    public final void a(d4d1 d4d1Var) {
        if (this.g.get()) {
            d4d1Var.close();
        } else {
            d(new e0i((Object) this, (Object) d4d1Var, (byte) 24), new fss(d4d1Var, (byte) 3));
        }
    }

    @Override // p.e4d1
    public final void b(j4d1 j4d1Var) {
        if (this.g.get()) {
            j4d1Var.c();
        } else {
            d(new e0i((Object) this, (Object) j4d1Var, (byte) 23), new qts(j4d1Var, (byte) 0));
        }
    }

    public final void c() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((d4d1) it.next()).close();
            }
            linkedHashMap.clear();
            fev fevVar = this.a;
            if (((AtomicBoolean) fevVar.c).getAndSet(false)) {
                hy30.c((Thread) fevVar.e);
                fevVar.m();
            }
            fevVar.n = -1;
            fevVar.o = -1;
            this.b.quit();
        }
    }

    public final void d(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new c45((Object) this, (Object) runnable2, (Object) runnable, (byte) 15));
        } catch (RejectedExecutionException unused) {
            j2h1.N("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void e(liv livVar) {
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

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.t == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.t.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            d4d1 d4d1Var = (d4d1) entry.getKey();
            if (d4d1Var.c == 34) {
                try {
                    this.a.q(surfaceTexture.getTimestamp(), surface, d4d1Var, this.i, this.t);
                } catch (RuntimeException unused) {
                    j2h1.q("DualSurfaceProcessor");
                }
            }
        }
    }

    @Override // p.e4d1
    public final void release() {
        if (this.g.getAndSet(true)) {
            return;
        }
        d(new fss(this, (byte) 13), new k((byte) 8));
    }
}
