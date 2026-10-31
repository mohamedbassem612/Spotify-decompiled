package p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class f4d extends e4d {
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    @Override // p.e4d, p.ic9
    public final CameraCharacteristics f(String str) throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    @Override // p.e4d, p.ic9
    public final void l(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            ((CameraManager) this.b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
