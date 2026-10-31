package p;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jih0 extends Service {
    public static final /* synthetic */ int g = 0;
    public ur00 a;
    public final hod0 b = new hod0(this, (byte) 12);
    public final ArrayList c;
    public final y36 d;
    public final nj7 e;
    public MediaSessionCompat$Token f;

    static {
        Log.isLoggable("MBServiceCompat", 3);
    }

    public jih0() {
        new zhh0(this, "android.media.session.MediaController", -1, -1, (d4e0) null);
        this.c = new ArrayList();
        this.d = new y36(0);
        this.e = new nj7(this);
    }

    public abstract void a(String str, gih0 gih0Var, Bundle bundle);

    public final void b(String str, zhh0 zhh0Var, Bundle bundle) {
        xhh0 xhh0Var = new xhh0(this, str, zhh0Var, str, bundle);
        if (bundle == null) {
            ((SpotifyMediaBrowserService) this).a(str, xhh0Var, Bundle.EMPTY);
        } else {
            a(str, xhh0Var, bundle);
        }
        if (xhh0Var.b()) {
            return;
        }
        eg.m(l1d.q(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), zhh0Var.a, " id=", str));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.a.t(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        fih0 ur00Var;
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            ur00Var = new fih0(this);
            this.a = ur00Var;
        } else if (i >= 26) {
            ur00Var = new eih0(this);
            this.a = ur00Var;
        } else {
            ur00Var = new ur00(this);
            this.a = ur00Var;
        }
        ur00Var.u();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.e.d();
    }
}
