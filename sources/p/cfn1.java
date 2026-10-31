package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cfn1 extends px40 {
    public final boolean E() {
        return true;
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService");
        return iInterfaceQueryLocalInterface instanceof ngn1 ? (ngn1) iInterfaceQueryLocalInterface : new ngn1(iBinder, "com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService", (byte) 1);
    }

    public final pl10[] e() {
        return hm5.j;
    }

    public final int l() {
        return 19390000;
    }

    public final String o() {
        return "com.google.android.gms.cast.framework.devicesuggestions.internal.IDeviceSuggestionsService";
    }

    public final String p() {
        return "com.google.android.gms.cast.devicesuggestions.api.DeviceSuggestionsApiService.START";
    }

    public final boolean s() {
        return true;
    }
}
