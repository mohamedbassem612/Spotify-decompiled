package p;

import android.hardware.camera2.CameraManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j1d extends CameraManager.AvailabilityCallback {
    public final String a;
    public boolean b = true;
    public final /* synthetic */ p1d c;

    public j1d(p1d p1dVar, String str) {
        this.c = p1dVar;
        this.a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (this.a.equals(str)) {
            this.b = true;
            if (this.c.h1 == 4) {
                this.c.J(false);
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (this.a.equals(str)) {
            this.b = false;
        }
    }
}
