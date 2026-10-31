package p;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v2k1 {
    public final SurfaceHolder a;
    public final bug b;
    public volatile boolean c;

    public v2k1(SurfaceHolder surfaceHolder, bug bugVar, boolean z) {
        this.a = surfaceHolder;
        this.b = bugVar;
        this.c = z;
    }

    public final SurfaceHolder.Callback a() {
        return this.b;
    }

    public final SurfaceHolder b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final void d(boolean z) {
        this.c = z;
    }
}
