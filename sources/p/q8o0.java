package p;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q8o0 extends til {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final lu4 i;

    public q8o0(Context context, dwl1 dwl1Var) {
        super(context, dwl1Var);
        this.f = (ConnectivityManager) ((til) this).b.getSystemService("connectivity");
        this.g = new Object();
        this.i = new lu4((Object) this, (byte) 3);
    }

    public final Object a() {
        return p8o0.a(this.f, this.h);
    }

    public final void c() {
        try {
            qs10 qs10VarA = qs10.a();
            int i = p8o0.a;
            qs10VarA.getClass();
            this.f.registerDefaultNetworkCallback(this.i);
        } catch (IllegalArgumentException unused) {
            qs10 qs10VarA2 = qs10.a();
            int i2 = p8o0.a;
            qs10VarA2.getClass();
        } catch (SecurityException unused2) {
            qs10 qs10VarA3 = qs10.a();
            int i3 = p8o0.a;
            qs10VarA3.getClass();
        }
    }

    public final void d() {
        try {
            qs10 qs10VarA = qs10.a();
            int i = p8o0.a;
            qs10VarA.getClass();
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException unused) {
            qs10 qs10VarA2 = qs10.a();
            int i2 = p8o0.a;
            qs10VarA2.getClass();
        } catch (SecurityException unused2) {
            qs10 qs10VarA3 = qs10.a();
            int i3 = p8o0.a;
            qs10VarA3.getClass();
        }
    }
}
