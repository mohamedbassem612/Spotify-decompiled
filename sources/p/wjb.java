package p;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wjb extends AdvertiseCallback {
    public final /* synthetic */ kd8 a;

    public wjb(kd8 kd8Var) {
        this.a = kd8Var;
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int i) {
        Object vhbVar;
        super.onStartFailure(i);
        if (i == 1) {
            vhbVar = new vhb("dataTooLarge");
        } else if (i == 2) {
            vhbVar = new vhb("tooManyAdvertisers");
        } else if (i == 3) {
            vhbVar = shb.a;
        } else if (i != 4) {
            vhbVar = i != 5 ? new vhb(f4i1.c(i, "oemAdvertiseError: ")) : new vhb("featureUnsupported");
        } else {
            vhbVar = new vhb("internalError");
        }
        this.a.invoke(vhbVar);
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
        super.onStartSuccess(advertiseSettings);
        this.a.invoke(yhb.a);
    }
}
