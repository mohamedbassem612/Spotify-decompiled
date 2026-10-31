package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mzo1 extends px40 {
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        y9n1 y9n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return y9n1VarQueryLocalInterface instanceof whn1 ? (whn1) y9n1VarQueryLocalInterface : new whn1(iBinder, "com.google.android.gms.cast.internal.ICastService", (byte) 1);
    }

    public final pl10[] e() {
        return hm5.j;
    }

    public final int l() {
        return 12451000;
    }

    public final String o() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
