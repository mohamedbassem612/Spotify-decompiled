package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kph0 {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final iqh0 a;

    public kph0(Context context, String str, r8u0 r8u0Var, b380 b380Var, b380 b380Var2, b380 b380Var3, uph0 uph0Var, Bundle bundle, Bundle bundle2, nxa nxaVar) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=".concat(str));
            }
            map.put(str, this);
        }
        this.a = new iqh0(this, context, str, r8u0Var, b380Var, b380Var2, b380Var3, uph0Var, bundle, bundle2, nxaVar);
    }

    public final bg11 a() {
        return this.a.f();
    }

    public final String b() {
        return this.a.i;
    }

    public final iqh0 c() {
        return this.a;
    }

    public final IBinder d() {
        tph0 tph0Var;
        iqh0 iqh0Var = this.a;
        synchronized (iqh0Var.a) {
            try {
                tph0Var = iqh0Var.y;
                if (tph0Var == null) {
                    MediaSessionCompat.Token sessionToken = iqh0Var.h.j.getSessionToken();
                    tph0 tph0Var2 = new tph0(iqh0Var);
                    tph0Var2.attachToBaseContext(tph0Var2.b.f);
                    tph0Var2.onCreate();
                    tph0Var2.setSessionToken(sessionToken);
                    iqh0Var.y = tph0Var2;
                    tph0Var = tph0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tph0Var.onBind(new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE));
    }

    public final b380 e() {
        iqh0 iqh0Var = this.a;
        iqh0Var.C();
        return iqh0Var.D;
    }

    public final r8u0 f() {
        iqh0 iqh0Var = this.a;
        iqh0Var.C();
        return iqh0Var.t.a;
    }

    public final boolean g() {
        return this.a.p();
    }

    public final void h(String str) {
        dm5.m(!TextUtils.isEmpty(str));
        iqh0 iqh0Var = this.a;
        iqh0Var.getClass();
        iqh0Var.M(new ag20(iqh0Var, str, (byte) 21));
    }

    public final void i(ixh0 ixh0Var, qa61 qa61Var, m8u0 m8u0Var) {
        dm5.s(ixh0Var, "controller must not be null");
        iqh0 iqh0Var = this.a;
        iqh0Var.getClass();
        iqh0Var.y(new m2d((Object) iqh0Var, (Object) ixh0Var, (Object) qa61Var, (Object) m8u0Var, (byte) 15));
    }

    public final void j(ArrayList arrayList) {
        b380 b380VarP = b380.p(arrayList);
        iqh0 iqh0Var = this.a;
        iqh0Var.getClass();
        iqh0Var.y(new zyh0((Object) iqh0Var, (Object) b380VarP, (byte) 2));
    }

    public final void k(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        iqh0 iqh0Var = this.a;
        iqh0Var.getClass();
        iqh0Var.y(new zyh0((Object) iqh0Var, (Object) bundle2, (byte) 3));
    }
}
