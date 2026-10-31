package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xj70 extends Binder implements yj70 {
    public static yj70 s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof yj70)) {
            return (yj70) iInterfaceQueryLocalInterface;
        }
        wj70 wj70Var = new wj70();
        wj70Var.a = iBinder;
        return wj70Var;
    }
}
