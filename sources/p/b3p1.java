package p;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b3p1 {
    public static final Object g = new Object();
    public static b3p1 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile jim0 c;
    public final dbl d;
    public final short e;
    public final int f;

    public b3p1(Context context, Looper looper) {
        h7o1 h7o1Var = new h7o1(this, (byte) 1);
        this.b = context.getApplicationContext();
        this.c = new jim0(looper, h7o1Var, (byte) 0);
        this.d = dbl.a();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public final lal a(rxo1 rxo1Var, n2o1 n2o1Var, String str) {
        lal lalVarA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                pzo1 pzo1Var = (pzo1) map.get(rxo1Var);
                if (pzo1Var == null) {
                    pzo1Var = new pzo1(this, rxo1Var);
                    pzo1Var.a.put(n2o1Var, n2o1Var);
                    lalVarA = pzo1Var.a(str, null);
                    map.put(rxo1Var, pzo1Var);
                } else {
                    this.c.removeMessages(0, rxo1Var);
                    if (pzo1Var.a.containsKey(n2o1Var)) {
                        String string = rxo1Var.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    pzo1Var.a.put(n2o1Var, n2o1Var);
                    byte b = pzo1Var.b;
                    if (b == 1) {
                        n2o1Var.onServiceConnected(pzo1Var.f, pzo1Var.d);
                    } else if (b == 2) {
                        lalVarA = pzo1Var.a(str, null);
                    }
                    lalVarA = null;
                }
                if (pzo1Var.c) {
                    return lal.f;
                }
                if (lalVarA == null) {
                    lalVarA = new lal(-1, null, null);
                }
                return lalVarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, String str2, ServiceConnection serviceConnection, boolean z) {
        rxo1 rxo1Var = new rxo1(str, str2, z);
        zod.t(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                pzo1 pzo1Var = (pzo1) map.get(rxo1Var);
                if (pzo1Var == null) {
                    String string = rxo1Var.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!pzo1Var.a.containsKey(serviceConnection)) {
                    String string2 = rxo1Var.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                pzo1Var.a.remove(serviceConnection);
                if (pzo1Var.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, rxo1Var), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
