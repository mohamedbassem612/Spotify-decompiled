package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hih0 implements Runnable {
    public final /* synthetic */ d4e0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ hod0 f;

    public hih0(int i, int i2, Bundle bundle, String str, hod0 hod0Var, d4e0 d4e0Var) {
        this.f = hod0Var;
        this.a = d4e0Var;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d4e0 d4e0Var = this.a;
        IBinder binder = ((Messenger) d4e0Var.b).getBinder();
        SpotifyMediaBrowserService spotifyMediaBrowserService = (jih0) this.f.b;
        ((jih0) spotifyMediaBrowserService).d.remove(binder);
        zhh0 zhh0Var = new zhh0(spotifyMediaBrowserService, this.b, this.c, this.d, d4e0Var);
        whh0 whh0VarB = spotifyMediaBrowserService.d().b(this.b, this.d, v8r.k(this.e));
        yge0 yge0Var = whh0VarB != null ? new yge0(whh0VarB.b().a(), whh0VarB.a()) : null;
        zhh0Var.f = yge0Var;
        if (yge0Var == null) {
            try {
                d4e0Var.o(2, (Bundle) null);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        try {
            ((jih0) spotifyMediaBrowserService).d.put(binder, zhh0Var);
            binder.linkToDeath(zhh0Var, 0);
            Parcelable parcelable = ((jih0) spotifyMediaBrowserService).f;
            if (parcelable != null) {
                yge0 yge0Var2 = zhh0Var.f;
                String str = (String) yge0Var2.b;
                Bundle bundle = (Bundle) yge0Var2.c;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
                bundle2.putParcelable("data_media_session_token", parcelable);
                bundle2.putBundle(MediaBrowserProtocol.DATA_ROOT_HINTS, bundle);
                d4e0Var.o(1, bundle2);
            }
        } catch (RemoteException unused2) {
            ((jih0) spotifyMediaBrowserService).d.remove(binder);
        }
    }
}
