package p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f3d extends it8 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    @Override // p.it8
    public final void i(jb61 jb61Var) throws CameraAccessExceptionCompat {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) jb61Var.a.c();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.b).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
