package p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mu4 implements p090 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public mu4(Context context) {
        this.a = (byte) 0;
        this.b = context;
        this.c = new AtomicInteger(0);
        this.d = mgo1.e(0, 0, 0, 6);
        this.e = new idd1(new st4(this, (byte) 15));
    }

    public final ry21 a(uf01 uf01Var) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                rih1 rih1Var = rih1.a;
                dt71 dt71Var = (dt71) obj;
                AtomicInteger atomicInteger = (AtomicInteger) obj2;
                try {
                    ry21 ry21VarB = uf01Var.b(uf01Var.e);
                    if (ry21VarB.i != null) {
                        if (ry21VarB.Q0) {
                            atomicInteger.set(0);
                        } else if (atomicInteger.get() < 3 && atomicInteger.incrementAndGet() >= 3) {
                            dt71Var.a(rih1Var);
                        }
                    }
                    return ry21VarB;
                } catch (Throwable th) {
                    if (atomicInteger.get() < 3 && atomicInteger.incrementAndGet() >= 3) {
                        dt71Var.a(rih1Var);
                    }
                    throw th;
                }
            default:
                ln21 ln21Var = uf01Var.e;
                ne neVarB = ln21Var.b();
                hm5.i(uf01Var, neVarB, "Accept-Language", (kly0) obj2);
                hm5.i(uf01Var, neVarB, "User-Agent", (kly0) this.b);
                hm5.i(uf01Var, neVarB, "Spotify-App-Version", (djg) obj);
                hm5.i(uf01Var, neVarB, "X-Client-Id", (cjg) this.e);
                if (ln21Var.c.c("App-Platform") == null) {
                    neVarB.d("App-Platform", "Android");
                }
                return uf01Var.b(new ln21(neVarB));
        }
    }

    public boolean b() {
        idd1 idd1Var = (idd1) this.e;
        Network activeNetwork = ((ConnectivityManager) idd1Var.getValue()).getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = ((ConnectivityManager) idd1Var.getValue()).getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        } catch (SecurityException e) {
            Logger.k("Exception caught in NetworkReporter %s", e);
            return true;
        }
    }

    public mu4(kly0 kly0Var, caq caqVar, caq caqVar2, caq caqVar3) {
        this.a = (byte) 1;
        this.b = kly0Var;
        this.c = caqVar;
        this.d = new djg(caqVar2, (byte) 0);
        this.e = new cjg(caqVar3, (byte) 0);
    }
}
