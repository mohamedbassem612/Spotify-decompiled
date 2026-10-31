package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class cih0 extends MediaBrowserService {
    public final /* synthetic */ ur00 a;

    public cih0(ur00 ur00Var, Context context) {
        this.a = ur00Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        yge0 yge0Var;
        eyh0.b(bundle);
        ur00 ur00Var = this.a;
        SpotifyMediaBrowserService spotifyMediaBrowserService = (jih0) ur00Var.e;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        int i2 = -1;
        if (bundle3 == null || bundle3.getInt(MediaBrowserProtocol.EXTRA_CLIENT_VERSION, 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove(MediaBrowserProtocol.EXTRA_CLIENT_VERSION);
            ur00Var.d = new Messenger(((jih0) spotifyMediaBrowserService).e);
            Bundle bundle4 = new Bundle();
            bundle4.putInt(MediaBrowserProtocol.EXTRA_SERVICE_VERSION, 2);
            bundle4.putBinder(MediaBrowserProtocol.EXTRA_MESSENGER_BINDER, ((Messenger) ur00Var.d).getBinder());
            MediaSessionCompat.Token token = ((jih0) spotifyMediaBrowserService).f;
            if (token != null) {
                lh70 lh70VarA = token.a();
                bundle4.putBinder(MediaBrowserProtocol.EXTRA_SESSION_BINDER, lh70VarA == null ? null : lh70VarA.asBinder());
            } else {
                ((ArrayList) ur00Var.b).add(bundle4);
            }
            i2 = bundle3.getInt(MediaBrowserProtocol.EXTRA_CALLING_PID, -1);
            bundle3.remove(MediaBrowserProtocol.EXTRA_CALLING_PID);
            bundle2 = bundle4;
        }
        zhh0 zhh0Var = new zhh0(spotifyMediaBrowserService, str, i2, i, null);
        whh0 whh0VarB = spotifyMediaBrowserService.d().b(str, i, v8r.k(bundle3));
        yge0 yge0Var2 = whh0VarB != null ? new yge0(whh0VarB.b().a(), whh0VarB.a()) : null;
        if (yge0Var2 == null) {
            yge0Var = null;
        } else {
            if (((Messenger) ur00Var.d) != null) {
                ((jih0) spotifyMediaBrowserService).c.add(zhh0Var);
            }
            Bundle bundle5 = (Bundle) yge0Var2.c;
            if (bundle2 == null) {
                bundle2 = bundle5;
            } else if (bundle5 != null) {
                bundle2.putAll(bundle5);
            }
            yge0Var = new yge0((String) yge0Var2.b, bundle2);
        }
        if (yge0Var == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) yge0Var.b, (Bundle) yge0Var.c);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        ((jih0) this.a.e).a(str, new bih0(str, new ruc0(result, (byte) 13)), Bundle.EMPTY);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        new ruc0(result, (byte) 13).f((Object) null);
    }
}
