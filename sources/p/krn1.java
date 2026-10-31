package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class krn1 extends fwh0 {
    public static final pue0 f = new pue0("MRDiscoveryCallback", null);
    public final frl1 e;
    public final Map c = Collections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = Collections.synchronizedSet(new LinkedHashSet());
    public final frn1 a = new frn1(this);

    public krn1(Context context) {
        this.e = new frl1(context, (byte) 16);
    }

    @Override // p.fwh0
    public final void d(owh0 owh0Var, lwh0 lwh0Var) {
        f.a("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        l(lwh0Var, true);
    }

    @Override // p.fwh0
    public final void e(owh0 owh0Var, lwh0 lwh0Var) {
        f.a("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        l(lwh0Var, true);
    }

    @Override // p.fwh0
    public final void h(owh0 owh0Var, lwh0 lwh0Var) {
        f.a("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        l(lwh0Var, false);
    }

    public final void l(lwh0 lwh0Var, boolean z) {
        boolean z2;
        boolean zRemove;
        pue0 pue0Var = f;
        pue0Var.a("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), lwh0Var);
        Map map = this.c;
        synchronized (map) {
            try {
                String strValueOf = String.valueOf(map.keySet());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 45);
                sb.append("appIdToRouteInfo has these appId route keys: ");
                sb.append(strValueOf);
                pue0Var.a(sb.toString(), new Object[0]);
                z2 = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    brn1 brn1Var = (brn1) entry.getValue();
                    if (lwh0Var.g(brn1Var.b)) {
                        if (z) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32);
                            sb2.append("Adding/updating route for appId ");
                            sb2.append(str);
                            pue0Var.a(sb2.toString(), new Object[0]);
                            zRemove = brn1Var.a.add(lwh0Var);
                            if (!zRemove) {
                                String strValueOf2 = String.valueOf(lwh0Var);
                                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 32 + String.valueOf(str).length());
                                sb3.append("Route ");
                                sb3.append(strValueOf2);
                                sb3.append(" already exists for appId ");
                                sb3.append(str);
                                pue0Var.c(sb3.toString(), new Object[0]);
                            }
                        } else {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 25);
                            sb4.append("Removing route for appId ");
                            sb4.append(str);
                            pue0Var.a(sb4.toString(), new Object[0]);
                            zRemove = brn1Var.a.remove(lwh0Var);
                            if (!zRemove) {
                                String strValueOf3 = String.valueOf(lwh0Var);
                                StringBuilder sb5 = new StringBuilder(strValueOf3.length() + 34 + String.valueOf(str).length());
                                sb5.append("Route ");
                                sb5.append(strValueOf3);
                                sb5.append(" already removed from appId ");
                                sb5.append(str);
                                pue0Var.c(sb5.toString(), new Object[0]);
                            }
                        }
                        z2 = zRemove;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            f.a("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                try {
                    HashMap map2 = new HashMap();
                    Map map3 = this.c;
                    synchronized (map3) {
                        try {
                            for (String str2 : map3.keySet()) {
                                brn1 brn1Var2 = (brn1) map3.get(dio1.G(str2));
                                ako1 ako1VarP = brn1Var2 == null ? iio1.p() : iio1.r(brn1Var2.a);
                                if (!ako1VarP.isEmpty()) {
                                    map2.put(str2, ako1VarP);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    mmn1.a(map2.entrySet());
                    Iterator it = this.b.iterator();
                    if (it.hasNext()) {
                        pze0.m(it.next());
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void m() {
        int size = this.d.size();
        pue0 pue0Var = f;
        pue0Var.a(fd21.h(new StringBuilder(String.valueOf(size).length() + 33), "Starting RouteDiscovery with ", size, " IDs"), new Object[0]);
        pue0Var.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new jim0(Looper.getMainLooper(), (byte) 5).post(new hrn1(this, (byte) 0));
        }
    }

    public final void n() {
        frl1 frl1Var = this.e;
        frl1Var.p(this);
        LinkedHashSet<String> linkedHashSet = this.d;
        synchronized (linkedHashSet) {
            try {
                for (String str : linkedHashSet) {
                    String strP = nho1.p(str);
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(strP)) {
                        arrayList.add(strP);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    dwh0 dwh0Var = new dwh0(bundle, arrayList);
                    Map map = this.c;
                    if (((brn1) map.get(str)) == null) {
                        map.put(str, new brn1(dwh0Var));
                    }
                    pue0 pue0Var = f;
                    String strP2 = nho1.p(str);
                    StringBuilder sb = new StringBuilder(strP2.length() + 49);
                    sb.append("Adding mediaRouter callback for control category ");
                    sb.append(strP2);
                    pue0Var.a(sb.toString(), new Object[0]);
                    frl1Var.o(dwh0Var, this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Map map2 = this.c;
        f.a("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map2.keySet())), new Object[0]);
    }
}
