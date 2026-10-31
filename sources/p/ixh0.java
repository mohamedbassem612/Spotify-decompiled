package p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ixh0 {
    public final MediaSessionManager.RemoteUserInfo a;
    public final int b;
    public final int c;
    public final boolean d;
    public final hxh0 e;
    public final Bundle f;

    public ixh0(MediaSessionManager.RemoteUserInfo remoteUserInfo, int i, int i2, boolean z, hxh0 hxh0Var, Bundle bundle) {
        this.a = remoteUserInfo;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = hxh0Var;
        this.f = bundle;
    }

    public static ixh0 a() {
        return new ixh0(new MediaSessionManager.RemoteUserInfo(MediaSessionManager.RemoteUserInfo.LEGACY_CONTROLLER, -1, -1), 0, 0, false, null, Bundle.EMPTY);
    }

    public final Bundle b() {
        return new Bundle(this.f);
    }

    public final String c() {
        return this.a.getPackageName();
    }

    public final int d() {
        return this.a.getUid();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ixh0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ixh0 ixh0Var = (ixh0) obj;
        hxh0 hxh0Var = ixh0Var.e;
        hxh0 hxh0Var2 = this.e;
        return (hxh0Var2 == null && hxh0Var == null) ? this.a.equals(ixh0Var.a) : Objects.equals(hxh0Var2, hxh0Var);
    }

    public final int hashCode() {
        return Objects.hash(this.e, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        MediaSessionManager.RemoteUserInfo remoteUserInfo = this.a;
        sb.append(remoteUserInfo.getPackageName());
        sb.append(", uid=");
        sb.append(remoteUserInfo.getUid());
        sb.append("}");
        return sb.toString();
    }
}
