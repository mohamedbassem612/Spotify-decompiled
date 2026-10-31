package p;

import android.os.Bundle;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaConstants;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class f1i0 extends MediaBrowserServiceCompat {
    public final MediaSessionManager a;
    public final fzh0 b;
    public final v1k c;

    public f1i0(iqh0 iqh0Var) {
        this.a = MediaSessionManager.getSessionManager(iqh0Var.f);
        this.b = iqh0Var;
        this.c = new v1k(iqh0Var);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public MediaBrowserServiceCompat.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        Bundle bundle2 = bundle;
        tph0 tph0Var = (tph0) this;
        boolean zIsTrustedForMediaControl = tph0Var.a.isTrustedForMediaControl(currentBrowserInfo);
        rph0 rph0Var = new rph0(tph0Var, currentBrowserInfo);
        int i2 = yzb0.a;
        bundle2.getInt(MediaConstants.BROWSER_ROOT_HINTS_KEY_CUSTOM_BROWSER_ACTION_LIMIT, 0);
        ixh0 ixh0Var = new ixh0(currentBrowserInfo, 0, 0, zIsTrustedForMediaControl, rph0Var, bundle2);
        AtomicReference atomicReference = new AtomicReference();
        hsk hskVar = new hsk();
        zoi1.c0(this.b.l, new lph0(currentBrowserInfo, atomicReference, hskVar, ixh0Var, this));
        try {
            hskVar.a();
            if (((gxh0) atomicReference.get()).a) {
                return bai0.a;
            }
            return null;
        } catch (InterruptedException e) {
            oon1.w("Couldn't get a result from onConnect", e);
            return null;
        }
    }
}
