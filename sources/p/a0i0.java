package p;

import androidx.media3.session.legacy.MediaSessionManager;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a0i0 implements hxh0 {
    public final MediaSessionManager.RemoteUserInfo a;

    public a0i0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.a = remoteUserInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != a0i0.class) {
            return false;
        }
        return Objects.equals(this.a, ((a0i0) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
