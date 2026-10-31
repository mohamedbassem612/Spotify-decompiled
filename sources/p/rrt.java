package p;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rrt implements qrt {
    public final Context a;

    public rrt(Context context) {
        this.a = context;
    }

    @Override // p.qrt
    public final boolean a() {
        LocationManager locationManager = (LocationManager) this.a.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    @Override // p.qrt
    public final int c() {
        Context context = this.a;
        boolean z = x74.j(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        boolean z2 = x74.j(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        if (z) {
            return 1;
        }
        return z2 ? 2 : 3;
    }
}
