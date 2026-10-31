package p;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yie0 implements LocationListener {
    public final /* synthetic */ aje0 a;
    public final /* synthetic */ ohd b;

    public yie0(ohd ohdVar, aje0 aje0Var) {
        this.a = aje0Var;
        this.b = ohdVar;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        this.a.e().removeUpdates(this);
        ohd ohdVar = this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith(new irt(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime()));
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        this.a.e().removeUpdates(this);
        ohd ohdVar = this.b;
        if (ohdVar.s() instanceof ago0) {
            ohdVar.resumeWith((Object) null);
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
