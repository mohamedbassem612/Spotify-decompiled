package p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class e4d extends ic9 {
    public static boolean s(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    @Override // p.ic9
    public CameraCharacteristics f(String str) throws CameraAccessExceptionCompat {
        try {
            return super.f(str);
        } catch (RuntimeException e) {
            if (s(e)) {
                throw new CameraAccessExceptionCompat(e);
            }
            throw e;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    @Override // p.ic9
    public void l(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            try {
                ((CameraManager) this.b).openCamera(str, executor, stateCallback);
            } catch (SecurityException e) {
                throw e;
            }
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        } catch (IllegalArgumentException | SecurityException e3) {
        } catch (RuntimeException e4) {
            if (!s(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(e4);
        }
    }

    @Override // p.ic9
    public final void p(g661 g661Var, j1d j1dVar) {
        ((CameraManager) this.b).registerAvailabilityCallback((Executor) g661Var, (CameraManager.AvailabilityCallback) j1dVar);
    }

    @Override // p.ic9
    public final void r(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.b).unregisterAvailabilityCallback(availabilityCallback);
    }
}
