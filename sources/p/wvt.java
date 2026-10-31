package p;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wvt {
    public static final wvt a = new wvt();
    public static final HashMap b = new HashMap();

    public static final void a(String str) {
        Set set = dhn.a;
        if (set.contains(wvt.class)) {
            return;
        }
        try {
            wvt wvtVar = a;
            HashMap map = b;
            if (set.contains(wvtVar)) {
                return;
            }
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    try {
                        ((NsdManager) wf10.a().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        wf10 wf10Var = wf10.a;
                    }
                    map.remove(str);
                }
            } catch (Throwable th) {
                dhn.a(wvtVar, th);
            }
        } catch (Throwable th2) {
            dhn.a(wvt.class, th2);
        }
    }

    public static final boolean b() {
        if (!dhn.a.contains(wvt.class)) {
            try {
                c120 c120VarB = g120.b(wf10.b());
                if (c120VarB != null && c120VarB.c.contains(ai91.c)) {
                    return true;
                }
            } catch (Throwable th) {
                dhn.a(wvt.class, th);
                return false;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        if (dhn.a.contains(this)) {
            return false;
        }
        try {
            HashMap map = b;
            if (map.containsKey(str)) {
                return true;
            }
            wf10 wf10Var = wf10.a;
            String str2 = "fbsdk_" + "android-".concat("18.2.3".replace('.', '|')) + '_' + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            NsdManager nsdManager = (NsdManager) wf10.a().getSystemService("servicediscovery");
            vv4 vv4Var = new vv4(str2, str, (byte) 1);
            map.put(str, vv4Var);
            nsdManager.registerService(nsdServiceInfo, 1, vv4Var);
            return true;
        } catch (Throwable th) {
            dhn.a(this, th);
            return false;
        }
    }
}
