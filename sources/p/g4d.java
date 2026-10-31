package p;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g4d extends f4d {
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    @Override // p.ic9
    public final Set g() throws CameraAccessExceptionCompat {
        try {
            return ((CameraManager) this.b).getConcurrentCameraIds();
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }
}
