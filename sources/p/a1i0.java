package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a1i0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d1i0 b;
    public final /* synthetic */ kph0 c;

    public /* synthetic */ a1i0(d1i0 d1i0Var, kph0 kph0Var, byte b) {
        this.a = b;
        this.b = d1i0Var;
        this.c = kph0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d1i0 d1i0Var = this.b;
        switch (b) {
            case 0:
                kph0 kph0Var = this.c;
                iqh0 iqh0Var = kph0Var.a;
                yqh0 yqh0VarK = d1i0Var.k();
                d1i0 d1i0Var2 = yqh0VarK.a;
                HashMap map = yqh0VarK.f;
                if (!map.containsKey(kph0Var)) {
                    xqh0 xqh0Var = new xqh0(yqh0VarK, d1i0Var2, kph0Var);
                    Bundle bundleG = pzm.g("androidx.media3.session.MediaNotificationManager", true);
                    hi61 hi61Var = iqh0Var.j;
                    hi61Var.getClass();
                    Bundle bundle = Bundle.EMPTY;
                    zoi1.D();
                    Bundle bundle2 = new Bundle(bundleG);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    xkh0 xkh0Var = new xkh0(mainLooper);
                    zoi1.c0(new Handler(mainLooper), new rkh0(xkh0Var, new tkh0(d1i0Var2, hi61Var, bundle2, xqh0Var, mainLooper, xkh0Var), (byte) 0));
                    map.put(kph0Var, new wqh0(xkh0Var));
                    xkh0Var.b(new m2d(yqh0VarK, xkh0Var, xqh0Var, kph0Var, (byte) 14), yqh0VarK.d);
                }
                iqh0Var.w = new upa0(d1i0Var, (byte) 21);
                break;
            default:
                HashMap map2 = d1i0Var.k().f;
                kph0 kph0Var2 = this.c;
                wqh0 wqh0Var = (wqh0) map2.remove(kph0Var2);
                if (wqh0Var != null) {
                    v6 v6Var = wqh0Var.a;
                    if (!v6Var.cancel(false)) {
                        try {
                            ((tkh0) fc11.C(v6Var)).f1();
                        } catch (CancellationException | ExecutionException e) {
                            oon1.I("MediaController future failed (so we couldn't release it)", e);
                        }
                    }
                }
                kph0Var2.a.w = null;
                break;
        }
    }
}
