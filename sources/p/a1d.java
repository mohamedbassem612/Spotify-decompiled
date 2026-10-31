package p;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a1d extends d2d {
    public final /* synthetic */ byte a = 0;
    public Object b;
    public Object c;

    public a1d(mzc mzcVar, l3d l3dVar) {
        this.b = mzcVar;
        this.c = l3dVar;
    }

    @Override // p.d2d
    public void a(int i) {
        switch (this.a) {
            case 0:
                for (d2d d2dVar : (HashSet) this.b) {
                    try {
                        ((Executor) ((ArrayMap) this.c).get(d2dVar)).execute(new xu7((Object) d2dVar, i, (byte) 2));
                    } catch (RejectedExecutionException unused) {
                        j2h1.q("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    @Override // p.d2d
    public final void b(int i, j2d j2dVar) {
        switch (this.a) {
            case 0:
                for (d2d d2dVar : (HashSet) this.b) {
                    try {
                        ((Executor) ((ArrayMap) this.c).get(d2dVar)).execute(new z0d((Object) d2dVar, i, (Object) j2dVar, (byte) 1));
                    } catch (RejectedExecutionException unused) {
                        j2h1.q("Camera2CameraControlImp");
                    }
                }
                break;
            default:
                ((mzc) this.b).b((Object) null);
                ((l3d) this.c).c(this);
                break;
        }
    }

    @Override // p.d2d
    public void c(int i, sua suaVar) {
        switch (this.a) {
            case 0:
                for (d2d d2dVar : (HashSet) this.b) {
                    try {
                        ((Executor) ((ArrayMap) this.c).get(d2dVar)).execute(new z0d((Object) d2dVar, i, (Object) suaVar, (byte) 0));
                    } catch (RejectedExecutionException unused) {
                        j2h1.q("Camera2CameraControlImp");
                    }
                }
                break;
        }
    }

    public /* synthetic */ a1d() {
    }
}
