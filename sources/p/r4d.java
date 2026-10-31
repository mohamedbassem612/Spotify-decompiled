package p;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r4d {
    public final byte a;
    public final long b;
    public final Throwable c;

    public r4d(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator.CameraIdListIncorrectException) {
            this.a = (byte) 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.a = (byte) 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.a = (byte) 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = (byte) 1;
        } else {
            this.a = (byte) 0;
        }
    }
}
