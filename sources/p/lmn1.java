package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lmn1 extends mh70 implements jnn1 {
    public static jnn1 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        return iInterfaceQueryLocalInterface instanceof jnn1 ? (jnn1) iInterfaceQueryLocalInterface : new iln1(iBinder, "com.google.android.gms.cast.framework.IReconnectionService", (byte) 1);
    }
}
