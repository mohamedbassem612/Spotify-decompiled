package p;

import android.app.Application;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a8u0 extends t0u0 {
    public static final /* synthetic */ mma0[] B1 = {new een0(a8u0.class, "latestState", "getLatestState()Lcom/spotify/adsinternal/playback/video/observer/PlaybackVolumeObserver$AudioState;", 0), new een0(a8u0.class, "currentVolume", "getCurrentVolume()I", 0)};
    public final z7u0 A1;
    public final xu0 u1;
    public final ao0 v1;
    public final mw7 w1;
    public final Application x1;
    public final p2a y1;
    public final z7u0 z1;

    public a8u0(xu0 xu0Var, yu0 yu0Var, ao0 ao0Var, mw7 mw7Var, Application application, Handler handler) {
        super(yu0Var);
        this.u1 = xu0Var;
        this.v1 = ao0Var;
        this.w1 = mw7Var;
        this.x1 = application;
        this.y1 = new p2a(this, handler, (byte) 2);
        this.z1 = new z7u0(new y7u0(((uw7) mw7Var).d(), false), this, (byte) 0);
        this.A1 = new z7u0(Integer.valueOf(((uw7) mw7Var).d()), this, (byte) 1);
    }

    public final void Q(long j, long j2, boolean z) {
        mma0[] mma0VarArr = B1;
        mma0 mma0Var = mma0VarArr[0];
        z7u0 z7u0Var = this.z1;
        y7u0 y7u0Var = (y7u0) ((sgp0) z7u0Var).a;
        int i = y7u0Var.b;
        y7u0Var.getClass();
        z7u0Var.c(mma0VarArr[0], this, new y7u0(i, z));
    }

    @Override // p.t0u0
    public final void R(r4t r4tVar, int i, long j, long j2) {
        super.R(r4tVar, i, j, j2);
        this.x1.getContentResolver().unregisterContentObserver(this.y1);
    }

    @Override // p.t0u0
    public final void V(long j) {
        this.x1.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.y1);
    }

    public final void Y(String str, co0 co0Var) {
        xu0 xu0Var = this.u1;
        t0u0.X(this, this.v1, co0Var, xu0Var.a, null, str, xu0Var.c, 4);
    }
}
