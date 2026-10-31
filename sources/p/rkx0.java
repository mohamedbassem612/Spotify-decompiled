package p;

import android.companion.virtual.VirtualDevice;
import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class rkx0 {
    public static final Context a(Context context) {
        Object next;
        boolean zY;
        Iterator<T> it = qpp0.e(context.getSystemService(qpp0.m())).getVirtualDevices().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String name = nkx0.d(next).getName();
            zY = false;
            if (name != null) {
                zY = nhc1.Y(name, "ProjectionDevice", false);
            }
        } while (!zY);
        VirtualDevice virtualDeviceD = nkx0.d(next);
        Integer numValueOf = virtualDeviceD != null ? Integer.valueOf(virtualDeviceD.getDeviceId()) : null;
        if (numValueOf != null) {
            return context.createDeviceContext(numValueOf.intValue());
        }
        eg.m("Projected device not found.");
        return null;
    }

    public static final String b(Context context) {
        if (!d(context)) {
            hhg1.n("Provided context is not the Projected device context. Can't get the device name.");
            return null;
        }
        VirtualDevice virtualDeviceC = c(context);
        if (virtualDeviceC != null) {
            return virtualDeviceC.getName();
        }
        return null;
    }

    public static VirtualDevice c(Context context) {
        Object next;
        Iterator<T> it = ((VirtualDeviceManager) context.getSystemService(VirtualDeviceManager.class)).getVirtualDevices().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((VirtualDevice) next).getDeviceId() == context.getDeviceId()) {
                return (VirtualDevice) next;
            }
        }
        next = null;
        return (VirtualDevice) next;
    }

    public static final boolean d(Context context) {
        String name;
        VirtualDevice virtualDeviceC = c(context);
        return (virtualDeviceC == null || (name = virtualDeviceC.getName()) == null || !nhc1.Y(name, "ProjectionDevice", false)) ? false : true;
    }

    public static boolean e(Context context) {
        int[] displayIds;
        try {
            VirtualDevice virtualDeviceC = c(a(context));
            if (virtualDeviceC == null || (displayIds = virtualDeviceC.getDisplayIds()) == null) {
                displayIds = new int[0];
            }
            if (displayIds.length != 0) {
                for (Display display : ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplays()) {
                    if (u890.j(display.getName(), "ProjectionDisplay") && f46.L(displayIds, display.getDisplayId())) {
                        return true;
                    }
                }
            }
        } catch (IllegalStateException unused) {
        }
        return false;
    }
}
