package p;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.car.app.CarAppMetadataHolderService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fqd implements xhg0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ fqd(androidx.car.app.k kVar) {
        this.b = kVar;
    }

    @Override // p.xhg0
    public final whg0 create() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                androidx.car.app.k kVar = (androidx.car.app.k) obj;
                try {
                    int i = CarAppMetadataHolderService.a;
                    Bundle bundle = kVar.getPackageManager().getServiceInfo(new ComponentName(kVar, (Class<?>) CarAppMetadataHolderService.class), 640).metaData;
                    String string = bundle != null ? bundle.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
                    if (string == null) {
                        throw new ClassNotFoundException("ResultManager metadata could not be found");
                    }
                    if (Class.forName(string).getConstructor(null).newInstance(null) == null) {
                        return null;
                    }
                    throw new ClassCastException();
                } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
                    eg.m("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
                }
                break;
            default:
                tac0 tac0Var = (tac0) obj;
                xvc1 xvc1Var = new xvc1();
                tac0Var.a(new vth0(tac0Var, (byte) 2));
                return xvc1Var;
        }
    }

    public /* synthetic */ fqd(androidx.car.app.k kVar, androidx.car.app.l lVar, tac0 tac0Var) {
        this.b = tac0Var;
    }
}
