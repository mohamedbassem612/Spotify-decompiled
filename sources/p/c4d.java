package p;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c4d extends CameraManager.AvailabilityCallback {
    public final g661 a;
    public final j1d b;
    public final Object c = new Object();
    public boolean d = false;

    public c4d(g661 g661Var, j1d j1dVar) {
        this.a = g661Var;
        this.b = j1dVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new fe(this, (byte) 15));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new b4d(this, str, (byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.c) {
            try {
                if (!this.d) {
                    this.a.execute(new b4d(this, str, (byte) 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
