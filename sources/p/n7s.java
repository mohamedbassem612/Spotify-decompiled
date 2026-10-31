package p;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n7s implements mwh0 {
    public final kly0 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public n7s(caq caqVar) {
        this.a = caqVar;
    }

    @Override // p.mwh0
    public final void a(btc1 btc1Var) {
        if (Build.VERSION.SDK_INT < 36 || ibc.a() < 3600001) {
            return;
        }
        MediaRouter2 mediaRouter2G = ofr.g(this.a.get());
        List<vqt> listA = btc1Var.a();
        ArrayList arrayList = new ArrayList(q7h.U(listA, 10));
        for (vqt vqtVar : listA) {
            g010.b();
            arrayList.add(g010.a(vqtVar.c(), vqtVar.a(), vqtVar.b()).setExtras(Bundle.EMPTY).build());
        }
        mediaRouter2G.setDeviceSuggestions(arrayList);
    }

    @Override // p.mwh0
    public final List b() {
        List<MediaRouter2.RoutingController> controllers = ofr.g(this.a.get()).getControllers();
        ArrayList arrayList = new ArrayList(q7h.U(controllers, 10));
        Iterator<T> it = controllers.iterator();
        while (it.hasNext()) {
            MediaRouter2.RoutingController routingControllerF = ofr.f(it.next());
            routingControllerF.getClass();
            arrayList.add(new nks(routingControllerF));
        }
        return arrayList;
    }

    @Override // p.mwh0
    public final List c() {
        List<MediaRoute2Info> routes = ofr.g(this.a.get()).getRoutes();
        ArrayList arrayList = new ArrayList(q7h.U(routes, 10));
        Iterator<T> it = routes.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoF = swg0.f(it.next());
            mediaRoute2InfoF.getClass();
            arrayList.add(zh5.e(mediaRoute2InfoF));
        }
        return arrayList;
    }

    @Override // p.mwh0
    public final void d(sun sunVar) {
        MediaRouter2.RouteCallback routeCallback = (MediaRouter2.RouteCallback) this.b.get(sunVar);
        if (routeCallback != null) {
            ((MediaRouter2) this.a.get()).unregisterRouteCallback(routeCallback);
        } else {
            Logger.d("Callback not found", new Object[0]);
        }
    }

    @Override // p.mwh0
    public final void e(RouteListingPreference routeListingPreference) {
        ofr.g(this.a.get()).setRouteListingPreference(routeListingPreference);
    }

    @Override // p.mwh0
    public final void f(ExecutorService executorService, sun sunVar, wr31 wr31Var) {
        MediaRouter2.RouteCallback o110Var = new o110(sunVar, (byte) 0);
        this.b.put(sunVar, o110Var);
        MediaRouter2 mediaRouter2 = (MediaRouter2) this.a.get();
        kts.a();
        mediaRouter2.registerRouteCallback(executorService, o110Var, k34.a(wr31Var.a).build());
    }

    @Override // p.mwh0
    public final ss31 g() {
        return new nks(ofr.g(this.a.get()).getSystemController());
    }

    @Override // p.mwh0
    public final void h(vuh0 vuh0Var) {
        Object next;
        MediaRouter2 mediaRouter2G = ofr.g(this.a.get());
        mediaRouter2G.getClass();
        String str = vuh0Var.a;
        Iterator<T> it = mediaRouter2G.getRoutes().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(swg0.f(next).getId(), str));
        MediaRoute2Info mediaRoute2InfoF = swg0.f(next);
        if (mediaRoute2InfoF != null) {
            mediaRouter2G.transferTo(mediaRoute2InfoF);
        }
    }
}
