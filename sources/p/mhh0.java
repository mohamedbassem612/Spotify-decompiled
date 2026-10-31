package p;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import androidx.media3.session.legacy.MediaBrowserProtocol;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class mhh0 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final lhh0 d = new lhh0(this);
    public final y36 e = new y36(0);
    public fad0 f;
    public Messenger g;

    public mhh0(Context context, ComponentName componentName, yu3 yu3Var) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 1);
        bundle.putInt(MediaBrowserProtocol.EXTRA_CALLING_PID, Process.myPid());
        yu3Var.c = this;
        this.b = new MediaBrowser(context, componentName, (qr4) yu3Var.b, bundle);
    }
}
