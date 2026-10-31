package androidx.car.app;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.List;
import p.lp5;
import p.tac0;
import p.whg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b implements whg0 {
    public final k a;
    public final IAppManager.Stub b;
    public final l c;
    public final tac0 d;
    public final HandlerThread f = new HandlerThread("LocationUpdateThread");
    public final lp5 e = new LocationListener() { // from class: p.lp5
        @Override // android.location.LocationListener
        public final void onLocationChanged(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                onLocationChanged((Location) list.get(i));
            }
        }

        @Override // android.location.LocationListener
        public final void onLocationChanged(Location location) {
            this.a.c.a("app", "sendLocation", new g21(location, (byte) 27));
        }

        @Override // android.location.LocationListener
        public final void onFlushComplete(int i) {
        }

        @Override // android.location.LocationListener
        public final void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public final void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [p.lp5] */
    public b(k kVar, l lVar, tac0 tac0Var) {
        this.a = kVar;
        this.c = lVar;
        this.d = tac0Var;
        this.b = new AppManager$1(this, kVar);
    }
}
