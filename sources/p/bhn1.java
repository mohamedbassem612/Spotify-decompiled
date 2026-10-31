package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bhn1 extends mh70 implements zhn1 {
    public static zhn1 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
        return iInterfaceQueryLocalInterface instanceof zhn1 ? (zhn1) iInterfaceQueryLocalInterface : new rgn1(iBinder, "com.google.android.gms.cast.framework.ICastSession", (byte) 1);
    }
}
