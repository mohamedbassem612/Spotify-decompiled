package p;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j4o1 {
    public static final pue0 l = new pue0("ConnectivityMonitor", null);
    public final fgp1 a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final boolean i;
    public final b4o1 j;
    public final HashSet k;
    public final w3o1 b = new w3o1(this);
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final Object h = new Object();

    public j4o1(Context context, fgp1 fgp1Var) {
        this.i = Build.VERSION.SDK_INT >= 31;
        this.j = new b4o1(this);
        this.k = new HashSet();
        this.a = fgp1Var;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a() {
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        l.a("Start monitoring connectivity changes", new Object[0]);
        if (this.f || (connectivityManager = this.c) == null) {
            return;
        }
        Context context = this.g;
        if (x74.j(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                b(activeNetwork, linkProperties);
            }
            NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(1);
            if (this.i) {
                builderAddTransportType.setIncludeOtherUidNetworks(true);
            } else {
                context.registerReceiver(this.j, new IntentFilter("android.net.wifi.STATE_CHANGE"));
            }
            connectivityManager.registerNetworkCallback(builderAddTransportType.build(), this.b);
            this.f = true;
        }
    }

    public final void b(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            try {
                l.a("a new network is available", new Object[0]);
                HashMap map = this.d;
                if (map.containsKey(network)) {
                    this.e.remove(network);
                }
                map.put(network, linkProperties);
                this.e.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        c();
    }

    public final void c() {
        fgp1 fgp1Var = this.a;
        if (fgp1Var == null) {
            return;
        }
        HashSet hashSet = this.k;
        synchronized (hashSet) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    pze0.m(it.next());
                    if (!fgp1Var.a.isShutdown()) {
                        fgp1Var.execute(new seg1(this, (byte) 20));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
