package p;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gt71 extends ConnectivityManager.NetworkCallback {
    public static final gt71 a = new gt71();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;
    public static Boolean f;

    public static boolean a(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = f;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static void b() {
        ArrayList<mmr0> arrayList = new ArrayList();
        synchronized (b) {
            try {
                if (e && f != null) {
                    for (Map.Entry entry : c.entrySet()) {
                        iu30 iu30Var = (iu30) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        gt71 gt71Var = a;
                        NetworkCapabilities networkCapabilities = d;
                        gt71Var.getClass();
                        arrayList.add(oqn1.n(iu30Var, a(networkRequest, networkCapabilities) ? mjl.a : new njl(7)));
                    }
                    for (mmr0 mmr0Var : arrayList) {
                        ((iu30) mmr0Var.a).invoke((ojl) mmr0Var.b);
                    }
                    return;
                }
                qs10 qs10VarA = qs10.a();
                int i = mvl1.a;
                qs10VarA.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        qs10 qs10VarA = qs10.a();
        int i = mvl1.a;
        qs10VarA.getClass();
        synchronized (b) {
            if (u890.j(f, Boolean.valueOf(z))) {
                return;
            }
            f = Boolean.valueOf(z);
            b();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        qs10 qs10VarA = qs10.a();
        int i = mvl1.a;
        qs10VarA.getClass();
        synchronized (b) {
            d = networkCapabilities;
            e = true;
        }
        b();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        qs10 qs10VarA = qs10.a();
        int i = mvl1.a;
        qs10VarA.getClass();
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((iu30) it.next()).invoke(new njl(7));
            }
        }
    }
}
