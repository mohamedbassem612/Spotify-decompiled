package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.LocationManager;
import java.util.Objects;
import p.g21;
import p.hp41;
import p.tac0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class AppManager$1 extends IAppManager.Stub {
    final /* synthetic */ b this$0;
    final /* synthetic */ k val$carContext;

    public AppManager$1(b bVar, k kVar) {
        this.this$0 = bVar;
        this.val$carContext = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$onBackPressed$0(k kVar) {
        kVar.a.d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$startLocationUpdates$1(k kVar) {
        b bVar = (b) kVar.e(b.class);
        ((LocationManager) bVar.a.getSystemService("location")).removeUpdates(bVar.e);
        ((LocationManager) bVar.a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, bVar.e, bVar.f.getLooper());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object lambda$stopLocationUpdates$2(k kVar) {
        b bVar = (b) kVar.e(b.class);
        ((LocationManager) bVar.a.getSystemService("location")).removeUpdates(bVar.e);
        return null;
    }

    @Override // androidx.car.app.IAppManager
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IAppManager
    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        tac0 tac0Var = this.this$0.d;
        hp41 hp41Var = (hp41) this.val$carContext.e(hp41.class);
        Objects.requireNonNull(hp41Var);
        androidx.car.app.utils.f.c(tac0Var, iOnDoneCallback, "getTemplate", new g21(hp41Var, (byte) 26));
    }

    @Override // androidx.car.app.IAppManager
    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.f.c(this.this$0.d, iOnDoneCallback, "onBackPressed", new a(this.val$carContext, (byte) 0));
    }

    @Override // androidx.car.app.IAppManager
    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        PackageManager packageManager = this.val$carContext.getPackageManager();
        boolean z = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", this.val$carContext.getPackageName()) == -1;
        boolean z2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName()) == -1;
        if (z && z2) {
            androidx.car.app.utils.f.e(iOnDoneCallback, new SecurityException("Location permission(s) not granted."), "startLocationUpdates");
        }
        androidx.car.app.utils.f.c(this.this$0.d, iOnDoneCallback, "startLocationUpdates", new a(this.val$carContext, (byte) 2));
    }

    @Override // androidx.car.app.IAppManager
    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        androidx.car.app.utils.f.c(this.this$0.d, iOnDoneCallback, "stopLocationUpdates", new a(this.val$carContext, (byte) 1));
    }
}
