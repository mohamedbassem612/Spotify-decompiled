package p;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bvh0 extends rvh0 {
    public final wuh0 N0;
    public final zrk O0;
    public boolean P0;
    public ArrayList Q0;
    public final ArrayMap R0;
    public String S0;
    public final ArrayMap X;
    public final MediaRouter2.RouteCallback Y;
    public final avh0 Z;
    public final MediaRouter2 i;
    public final hl00 t;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public bvh0(Context context, hl00 hl00Var) {
        super(context, null);
        this.X = new ArrayMap();
        this.Z = new avh0(this);
        this.N0 = new wuh0(this);
        this.Q0 = new ArrayList();
        this.R0 = new ArrayMap();
        this.i = MediaRouter2.getInstance(context);
        this.t = hl00Var;
        this.O0 = new zrk(new Handler(Looper.getMainLooper()), (byte) 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.Y = new o110(this, (byte) 1);
        } else {
            this.Y = new zuh0(this);
        }
    }

    public static Messenger i(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String k(nvh0 nvh0Var) {
        MediaRouter2.RoutingController routingController;
        if ((nvh0Var instanceof xuh0) && (routingController = ((xuh0) nvh0Var).g) != null) {
            return routingController.getId();
        }
        return null;
    }

    @Override // p.rvh0
    public final mvh0 b(String str, ovh0 ovh0Var) {
        Iterator it = this.X.entrySet().iterator();
        while (it.hasNext()) {
            xuh0 xuh0Var = (xuh0) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, xuh0Var.f)) {
                return xuh0Var;
            }
        }
        return null;
    }

    @Override // p.rvh0
    public final nvh0 c(String str) {
        return new yuh0((String) this.R0.get(str), (xuh0) null);
    }

    @Override // p.rvh0
    public final nvh0 d(String str, String str2) {
        String str3 = (String) this.R0.get(str);
        for (xuh0 xuh0Var : this.X.values()) {
            if (TextUtils.equals(str2, xuh0Var.p())) {
                return new yuh0(str3, xuh0Var);
            }
        }
        return new yuh0(str3, (xuh0) null);
    }

    @Override // p.rvh0
    public final void f(hvh0 hvh0Var) {
        dwh0 dwh0Var;
        int i = owh0.c == null ? 0 : owh0.c().C;
        MediaRouter2.RouteCallback routeCallback = this.Y;
        wuh0 wuh0Var = this.N0;
        avh0 avh0Var = this.Z;
        if (i <= 0) {
            this.i.unregisterRouteCallback(routeCallback);
            this.i.unregisterTransferCallback(avh0Var);
            this.i.unregisterControllerCallback(wuh0Var);
            return;
        }
        swh0 swh0Var = owh0.c().u;
        boolean z = swh0Var == null ? false : swh0Var.d;
        if (hvh0Var == null) {
            hvh0Var = new hvh0(dwh0.c, false, false);
        }
        hvh0Var.a();
        ArrayList<String> arrayListB = hvh0Var.c.b();
        if (!z) {
            arrayListB.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListB.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListB.add("android.media.intent.category.LIVE_AUDIO");
        }
        ArrayList<String> arrayList = null;
        if (!arrayListB.isEmpty()) {
            for (String str : arrayListB) {
                if (str == null) {
                    hhg1.n("category must not be null");
                    return;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList<String> arrayList2 = arrayList;
                if (!arrayList.contains(str)) {
                    arrayList2.add(str);
                }
                arrayList = arrayList2;
            }
        }
        if (arrayList == null) {
            dwh0Var = dwh0.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            dwh0Var = new dwh0(bundle, arrayList);
        }
        hvh0 hvh0Var2 = new hvh0(dwh0Var, hvh0Var.b(), false);
        MediaRouter2 mediaRouter2 = this.i;
        RouteDiscoveryPreference routeDiscoveryPreferenceE = w081.E(hvh0Var2);
        Executor executor = this.O0;
        mediaRouter2.registerRouteCallback(executor, routeCallback, routeDiscoveryPreferenceE);
        this.i.registerTransferCallback(executor, avh0Var);
        this.i.registerControllerCallback(executor, wuh0Var);
    }

    public final MediaRoute2Info j(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.Q0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoF = swg0.f(it.next());
            if (TextUtils.equals(mediaRoute2InfoF.getId(), str)) {
                return mediaRoute2InfoF;
            }
        }
        return null;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator<MediaRoute2Info> it = this.i.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoF = swg0.f(it.next());
            if (mediaRoute2InfoF != null && !arraySet.contains(mediaRoute2InfoF) && !mediaRoute2InfoF.isSystemRoute()) {
                if (this.P0) {
                    if (!mediaRoute2InfoF.getId().startsWith(this.a.getPackageName() + "/")) {
                    }
                }
                arraySet.add(mediaRoute2InfoF);
                arrayList.add(mediaRoute2InfoF);
            }
        }
        if (arrayList.equals(this.Q0)) {
            return;
        }
        this.Q0 = arrayList;
        ArrayMap arrayMap = this.R0;
        arrayMap.clear();
        Iterator it2 = this.Q0.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoF2 = swg0.f(it2.next());
            Bundle extras = mediaRoute2InfoF2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                mediaRoute2InfoF2.toString();
            } else {
                arrayMap.put(mediaRoute2InfoF2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.Q0.iterator();
        while (it3.hasNext()) {
            gvh0 gvh0VarF = w081.F(swg0.f(it3.next()));
            if (gvh0VarF != null) {
                arrayList2.add(gvh0VarF);
            }
        }
        svh0 svh0Var = new svh0((byte) 0);
        svh0Var.v(true);
        svh0Var.e(arrayList2);
        g(svh0Var.f());
    }

    public final void m(MediaRouter2.RoutingController routingController) {
        wmy wmyVar;
        xuh0 xuh0Var = (xuh0) this.X.get(routingController);
        if (xuh0Var == null) {
            Objects.toString(routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList arrayListH = w081.h(selectedRoutes);
        gvh0 gvh0VarF = w081.F(swg0.f(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(2131958933);
        gvh0 gvh0Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    gvh0Var = new gvh0(null, bundle, Collections.EMPTY_LIST);
                }
            } catch (Exception unused) {
            }
        }
        if (gvh0Var == null) {
            wmyVar = new wmy(routingController.getId(), string);
            wmyVar.v(2);
            wmyVar.C(1);
        } else {
            wmyVar = new wmy(gvh0Var);
        }
        wmyVar.E(routingController.getId());
        wmyVar.F(routingController.getVolume());
        wmyVar.H(routingController.getVolumeMax());
        wmyVar.G(routingController.getVolumeHandling());
        wmyVar.i();
        wmyVar.d(gvh0VarF.b());
        wmyVar.j();
        wmyVar.e(arrayListH);
        gvh0 gvh0VarH = wmyVar.h();
        ArrayList arrayListH2 = w081.h(routingController.getSelectableRoutes());
        ArrayList arrayListH3 = w081.h(routingController.getDeselectableRoutes());
        jqd0 jqd0Var = this.g;
        if (jqd0Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<gvh0> listV = jqd0Var.v();
        if (!listV.isEmpty()) {
            for (gvh0 gvh0Var2 : listV) {
                String strG = gvh0Var2.g();
                jvh0 jvh0Var = new jvh0(gvh0Var2);
                jvh0Var.e(arrayListH.contains(strG) ? 3 : 1);
                jvh0Var.b(arrayListH2.contains(strG));
                jvh0Var.d(arrayListH3.contains(strG));
                jvh0Var.c();
                arrayList.add(jvh0Var.a());
            }
        }
        xuh0Var.o = gvh0VarH;
        xuh0Var.k(gvh0VarH, arrayList);
    }

    public final void n(String str) {
        MediaRoute2Info mediaRoute2InfoJ = j(str);
        if (mediaRoute2InfoJ == null) {
            return;
        }
        if (TextUtils.equals(this.S0, str)) {
            mediaRoute2InfoJ.toString();
        } else {
            this.S0 = str;
            this.i.transferTo(mediaRoute2InfoJ);
        }
    }
}
