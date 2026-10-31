package p;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f0i0 {
    public final i0i0 a;

    public f0i0(String str, int i, int i2) {
        if (str == null) {
            bhn0.i("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            hhg1.n("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new i0i0(str, i, i2);
            return;
        }
        h0i0 h0i0Var = new h0i0(str, i, i2);
        g0i0.a(i, i2, str);
        this.a = h0i0Var;
    }

    public final String a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0i0)) {
            return false;
        }
        return this.a.equals(((f0i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public f0i0(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strA = h0i0.a(remoteUserInfo);
        if (strA != null) {
            if (!TextUtils.isEmpty(strA)) {
                this.a = new h0i0(remoteUserInfo);
                return;
            } else {
                hhg1.n("packageName should be nonempty");
                throw null;
            }
        }
        bhn0.i("package shouldn't be null");
        throw null;
    }
}
