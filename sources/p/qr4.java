package p;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qr4 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qr4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        lh70 ih70Var;
        MediaSession.Token sessionToken;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d520 d520Var = (d520) obj;
                d520Var.z().subscribe(d520Var.z().getRoot(), (rr4) d520Var.f);
                break;
            default:
                yu3 yu3Var = (yu3) obj;
                mhh0 mhh0Var = (mhh0) yu3Var.c;
                if (mhh0Var != null) {
                    lhh0 lhh0Var = mhh0Var.d;
                    MediaBrowser mediaBrowser = mhh0Var.b;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            extras.getInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 0);
                            IBinder binder = extras.getBinder(MediaBrowserProtocol.EXTRA_MESSENGER_BINDER);
                            if (binder != null) {
                                Bundle bundle = mhh0Var.c;
                                fad0 fad0Var = new fad0();
                                fad0Var.b = new Messenger(binder);
                                fad0Var.c = bundle;
                                mhh0Var.f = fad0Var;
                                Messenger messenger = new Messenger(lhh0Var);
                                mhh0Var.g = messenger;
                                lhh0Var.getClass();
                                lhh0Var.c = new WeakReference(messenger);
                                try {
                                    fad0 fad0Var2 = mhh0Var.f;
                                    Context context = mhh0Var.a;
                                    Messenger messenger2 = mhh0Var.g;
                                    fad0Var2.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString(MediaBrowserProtocol.DATA_PACKAGE_NAME, context.getPackageName());
                                    bundle2.putInt(MediaBrowserProtocol.DATA_CALLING_PID, Process.myPid());
                                    bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, (Bundle) fad0Var2.c);
                                    Message messageObtain = Message.obtain();
                                    messageObtain.what = 6;
                                    messageObtain.arg1 = 1;
                                    messageObtain.setData(bundle2);
                                    messageObtain.replyTo = messenger2;
                                    ((Messenger) fad0Var2.b).send(messageObtain);
                                    break;
                                } catch (RemoteException unused) {
                                }
                            }
                            IBinder binder2 = extras.getBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER);
                            int i = b.l;
                            if (binder2 == null) {
                                ih70Var = null;
                            } else {
                                lh70 lh70VarQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                ih70Var = (lh70VarQueryLocalInterface == null || !(lh70VarQueryLocalInterface instanceof lh70)) ? new ih70(binder2) : lh70VarQueryLocalInterface;
                            }
                            if (ih70Var != null && (sessionToken = mediaBrowser.getSessionToken()) != null) {
                                new MediaSessionCompat.Token(sessionToken, ih70Var, 0);
                            }
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                ((hh) yu3Var.d).invoke();
                yu3Var.j();
                break;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Logger.d("onConnectionFailed: Recommendations widget can't connect to Media Browser Service", new Object[0]);
                d520 d520Var = (d520) obj;
                ohd ohdVar = (ohd) d520Var.e;
                if (ohdVar != null) {
                    d520Var.e = null;
                    ohdVar.resumeWith(new m231(new RuntimeException("Can't connect to Media Browser Service")));
                }
                break;
            default:
                yu3 yu3Var = (yu3) obj;
                ((hh) yu3Var.d).invoke();
                yu3Var.j();
                break;
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        switch (this.a) {
            case 0:
                break;
            default:
                yu3 yu3Var = (yu3) this.b;
                mhh0 mhh0Var = (mhh0) yu3Var.c;
                if (mhh0Var != null) {
                    mhh0Var.f = null;
                    mhh0Var.g = null;
                    lhh0 lhh0Var = mhh0Var.d;
                    lhh0Var.getClass();
                    lhh0Var.c = new WeakReference(null);
                }
                yu3Var.j();
                break;
        }
    }

    private final void a() {
    }
}
