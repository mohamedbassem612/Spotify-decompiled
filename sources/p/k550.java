package p;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k550 implements OutcomeReceiver {
    public final /* synthetic */ byte a;

    public final void onError(Throwable th) {
        m550 m550Var;
        m550 m550Var2;
        switch (this.a) {
            case 0:
                Exception exc = (Exception) th;
                Set set = dhn.a;
                set.contains(l550.class);
                if (!set.contains(l550.class)) {
                    try {
                        m550Var = l550.c;
                    } catch (Throwable th2) {
                        dhn.a(l550.class, th2);
                        m550Var = null;
                    }
                    break;
                } else {
                    m550Var = null;
                }
                if (m550Var == null) {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", exc.toString());
                m550Var.a(bundle, "gps_ara_failed");
                return;
            default:
                Exception exc2 = (Exception) th;
                Set set2 = dhn.a;
                set2.contains(vxq0.class);
                exc2.toString();
                if (!set2.contains(vxq0.class)) {
                    try {
                        m550Var2 = vxq0.e;
                    } catch (Throwable th3) {
                        dhn.a(vxq0.class, th3);
                        m550Var2 = null;
                    }
                    break;
                } else {
                    m550Var2 = null;
                }
                if (m550Var2 == null) {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", exc2.toString());
                m550Var2.a(bundle2, "gps_pa_failed");
                return;
        }
    }

    public final void onResult(Object obj) {
        m550 m550Var;
        m550 m550Var2;
        switch (this.a) {
            case 0:
                Set set = dhn.a;
                set.contains(l550.class);
                if (set.contains(l550.class)) {
                    m550Var = null;
                } else {
                    try {
                        m550Var = l550.c;
                    } catch (Throwable th) {
                        dhn.a(l550.class, th);
                        m550Var = null;
                    }
                }
                if (m550Var != null) {
                    m550Var.a((Bundle) null, "gps_ara_succeed");
                    return;
                } else {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
            default:
                Set set2 = dhn.a;
                set2.contains(vxq0.class);
                if (set2.contains(vxq0.class)) {
                    m550Var2 = null;
                } else {
                    try {
                        m550Var2 = vxq0.e;
                    } catch (Throwable th2) {
                        dhn.a(vxq0.class, th2);
                        m550Var2 = null;
                    }
                }
                if (m550Var2 != null) {
                    m550Var2.a((Bundle) null, "gps_pa_succeed");
                    return;
                } else {
                    u890.C("gpsDebugLogger");
                    throw null;
                }
        }
    }
}
