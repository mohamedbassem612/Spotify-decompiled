package p;

import android.content.res.Resources;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.constraints.IConstraintHost;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bil implements whg0 {
    public final androidx.car.app.k a;
    public final androidx.car.app.l b;

    public bil(androidx.car.app.k kVar, androidx.car.app.l lVar) {
        this.a = kVar;
        this.b = lVar;
    }

    public final int a(int i) {
        int i2;
        Integer numValueOf = null;
        try {
            androidx.car.app.l lVar = this.b;
            try {
                Log.isLoggable("CarApp", 3);
                IInterface iInterfaceB = lVar.b("constraints");
                if (iInterfaceB != null) {
                    numValueOf = Integer.valueOf(((IConstraintHost) iInterfaceB).getContentLimit(i));
                }
            } catch (SecurityException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw new HostException("Remote getContentLimit call failed", e2);
            }
        } catch (RemoteException unused) {
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        Resources resources = this.a.getResources();
        if (i == 1) {
            i2 = 2131492877;
        } else if (i == 2) {
            i2 = 2131492880;
        } else if (i != 3) {
            i2 = i != 4 ? 2131492878 : 2131492879;
        } else {
            i2 = 2131492881;
        }
        return resources.getInteger(i2);
    }
}
