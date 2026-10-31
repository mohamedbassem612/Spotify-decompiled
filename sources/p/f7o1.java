package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class f7o1 extends mh70 implements obo1 {
    public static obo1 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
        return iInterfaceQueryLocalInterface instanceof obo1 ? (obo1) iInterfaceQueryLocalInterface : new j2o1(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", (byte) 1);
    }
}
