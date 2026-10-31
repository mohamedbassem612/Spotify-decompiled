package p;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tph0 extends f1i0 {
    public final iqh0 d;

    public tph0(iqh0 iqh0Var) {
        super(iqh0Var);
        this.d = iqh0Var;
    }

    public final void a(Runnable runnable) {
        zoi1.c0(this.d.l, runnable);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onCustomAction(String str, Bundle bundle, MediaBrowserServiceCompat.Result result) {
        result.detach();
        a(new qph0(this, getCurrentBrowserInfo(), result, str, bundle, (byte) 0));
    }

    @Override // p.f1i0, androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final MediaBrowserServiceCompat.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        if (super.onGetRoot(str, i, bundle) == null) {
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        hsk hskVar = new hsk();
        a(new lph0(this, getCurrentBrowserInfo(), bundle, atomicReference, hskVar, (byte) 0));
        try {
            hskVar.a();
            return (MediaBrowserServiceCompat.BrowserRoot) atomicReference.get();
        } catch (InterruptedException e) {
            oon1.w("Couldn't get a result from onGetRoot", e);
            return null;
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onLoadChildren(String str, MediaBrowserServiceCompat.Result result, Bundle bundle) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            a(new qph0(this, currentBrowserInfo, result, bundle, str));
        } else {
            oon1.H("onLoadChildren(): Ignoring empty parentId from " + currentBrowserInfo.getPackageName());
            result.sendResult(null);
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onLoadItem(String str, MediaBrowserServiceCompat.Result result) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            a(new c45(this, currentBrowserInfo, result, str));
        } else {
            oon1.H("Ignoring empty itemId from " + currentBrowserInfo.getPackageName());
            result.sendResult(null);
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onSearch(String str, Bundle bundle, MediaBrowserServiceCompat.Result result) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            a(new qph0(this, currentBrowserInfo, result, str, bundle, (byte) 2));
        } else {
            oon1.H("Ignoring empty query from " + currentBrowserInfo.getPackageName());
            result.sendResult(null);
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onSubscribe(String str, Bundle bundle) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            a(new m2d((Object) this, (Object) currentBrowserInfo, (Object) bundle, (Object) str, (byte) 10));
            return;
        }
        oon1.H("onSubscribe(): Ignoring empty id from " + currentBrowserInfo.getPackageName());
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onUnsubscribe(String str) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            a(new c45((Object) this, (Object) currentBrowserInfo, (Object) str, (byte) 28));
            return;
        }
        oon1.H("onUnsubscribe(): Ignoring empty id from " + currentBrowserInfo.getPackageName());
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onLoadChildren(String str, MediaBrowserServiceCompat.Result result) {
        onLoadChildren(str, result, null);
    }
}
