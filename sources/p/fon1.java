package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class fon1 extends mh70 implements ion1 {
    public static ion1 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
        return iInterfaceQueryLocalInterface instanceof ion1 ? (ion1) iInterfaceQueryLocalInterface : new con1(iBinder, "com.google.android.gms.cast.framework.ISession", (byte) 1);
    }
}
