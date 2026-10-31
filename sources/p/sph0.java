package p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sph0 {
    public final ixh0 a;
    public final MediaSessionManager.RemoteUserInfo b;
    public final String c;
    public final Bundle d;
    public final MediaBrowserServiceCompat.Result e;

    public sph0(ixh0 ixh0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, String str, Bundle bundle, MediaBrowserServiceCompat.Result result) {
        this.a = ixh0Var;
        this.b = remoteUserInfo;
        this.c = str;
        this.d = bundle;
        this.e = result;
    }
}
