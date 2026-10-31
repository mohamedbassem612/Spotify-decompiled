package p;

import android.os.IInterface;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.ICarHost;
import androidx.car.app.hardware.ICarHardwareHost;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class frd {
    public final androidx.car.app.l a;
    public ICarHardwareHost b;

    public frd(androidx.car.app.l lVar) {
        Objects.requireNonNull(lVar);
        this.a = lVar;
    }

    public final ICarHardwareHost a() {
        ICarHardwareHost iCarHardwareHost = this.b;
        if (iCarHardwareHost != null) {
            return iCarHardwareHost;
        }
        androidx.car.app.l lVar = this.a;
        lVar.getClass();
        try {
            Log.isLoggable("CarApp", 3);
            IInterface iInterfaceB = lVar.b("car");
            ICarHardwareHost iCarHardwareHostAsInterface = iInterfaceB == null ? null : ICarHardwareHost.Stub.asInterface(((ICarHost) iInterfaceB).getHost("hardware"));
            Objects.requireNonNull(iCarHardwareHostAsInterface);
            this.b = iCarHardwareHostAsInterface;
            return iCarHardwareHostAsInterface;
        } catch (SecurityException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new HostException("Remote getHost(CarHardware) call failed", e2);
        }
    }
}
