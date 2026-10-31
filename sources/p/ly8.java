package p;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ly8 {
    public final Executor a;
    public final Handler b;

    public ly8(Executor executor, Handler handler) {
        if (executor == null) {
            bhn0.i("Null cameraExecutor");
            throw null;
        }
        this.a = executor;
        if (handler != null) {
            this.b = handler;
        } else {
            bhn0.i("Null schedulerHandler");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ly8) {
            ly8 ly8Var = (ly8) obj;
            if (this.a.equals(ly8Var.a) && this.b.equals(ly8Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.a + ", schedulerHandler=" + this.b + "}";
    }
}
