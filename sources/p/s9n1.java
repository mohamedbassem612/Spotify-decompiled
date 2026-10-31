package p;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s9n1 extends px40 {
    public final ixd1 B;

    public s9n1(Context context, Looper looper, d520 d520Var, ixd1 ixd1Var, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 270, d520Var, h8n1Var, h8n1Var2);
        this.B = ixd1Var;
    }

    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        i9n1 i9n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return i9n1VarQueryLocalInterface instanceof i9n1 ? i9n1VarQueryLocalInterface : new i9n1(iBinder);
    }

    public final pl10[] e() {
        return rpo1.c;
    }

    public final Bundle j() {
        return this.B.a();
    }

    public final int l() {
        return 203400000;
    }

    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String p() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean s() {
        return true;
    }
}
