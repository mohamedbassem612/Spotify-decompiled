package p;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f8n1 extends px40 {
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        z7n1 z7n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return z7n1VarQueryLocalInterface instanceof h9n1 ? (h9n1) z7n1VarQueryLocalInterface : new h9n1(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    public final pl10[] e() {
        return rpo1.c;
    }

    public final int l() {
        return 253600000;
    }

    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    public final String p() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    public final boolean s() {
        return true;
    }
}
