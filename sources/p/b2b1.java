package p;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b2b1 {
    public final boolean a;
    public final d18 b;
    public final boolean c;

    public b2b1(Context context, boolean z) {
        this.a = z;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(ConnectivityManager.class);
        this.b = new d18((byte) 6);
        lu4 lu4Var = new lu4(this, (byte) 4);
        if (!z || connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(lu4Var);
        } catch (RuntimeException unused) {
            synchronized (this) {
                this.c = true;
                this.b.j();
            }
        }
    }
}
