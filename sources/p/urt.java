package p;

import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class urt implements qrt {
    public static final bma1 g = bma1.b.q("device_location_permission_requested");
    public final dg30 a;
    public final dma1 b;
    public final prt c;
    public iu30 d;
    public int e;
    public final rh0 f;

    public urt(dg30 dg30Var, dma1 dma1Var, prt prtVar) {
        this.a = dg30Var;
        this.b = dma1Var;
        this.c = prtVar;
        this.f = ((g0i) dg30Var).i.h("location_permission_request", new e1r0((byte) 3, false), new cj8(this, (byte) 2));
    }

    public final boolean a() {
        LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    public final int c() {
        dg30 dg30Var = this.a;
        if (x74.j(dg30Var, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return 1;
        }
        if (x74.j(dg30Var, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return 2;
        }
        if (ag0.C0(dg30Var, "android.permission.ACCESS_FINE_LOCATION") || ag0.C0(dg30Var, "android.permission.ACCESS_COARSE_LOCATION")) {
            return 4;
        }
        return this.b.h(g, false) ? 5 : 3;
    }

    public final void d(wrt wrtVar) {
        ((g0i) this.a).i.h("location_services_settings_request", new e1r0((byte) 5, false), new srt(wrtVar, this, (byte) 0)).a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public final void e(wrt wrtVar) {
        int iC = c();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        dg30 dg30Var = this.a;
        intent.setData(Uri.fromParts("package", dg30Var.getPackageName(), null));
        ((g0i) dg30Var).i.h("location_settings_request", new e1r0((byte) 5, false), new trt(this, iC, wrtVar)).a(intent);
    }

    public final void f(iu30 iu30Var) {
        this.e = c();
        this.d = iu30Var;
        hma1 hma1VarEdit = this.b.edit();
        hma1VarEdit.a(g, true);
        hma1VarEdit.g();
        this.f.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
