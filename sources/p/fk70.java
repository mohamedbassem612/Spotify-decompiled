package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fk70 extends Binder implements gk70 {
    public static gk70 s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.waze.sdk.ISdkService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof gk70)) {
            return (gk70) iInterfaceQueryLocalInterface;
        }
        ek70 ek70Var = new ek70();
        ek70Var.a = iBinder;
        return ek70Var;
    }
}
