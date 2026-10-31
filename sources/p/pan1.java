package p;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pan1 extends px40 {
    public final Bundle B;

    public pan1(Context context, Looper looper, d520 d520Var, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 223, d520Var, h8n1Var, h8n1Var2);
        this.B = new Bundle();
    }

    public final boolean E() {
        return true;
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        y9n1 y9n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return y9n1VarQueryLocalInterface instanceof qan1 ? (qan1) y9n1VarQueryLocalInterface : new qan1(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService", (byte) 0);
    }

    public final pl10[] e() {
        return eth.h;
    }

    public final Bundle j() {
        return this.B;
    }

    public final int l() {
        return 17895000;
    }

    public final String o() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    public final String p() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    public final boolean s() {
        return true;
    }
}
