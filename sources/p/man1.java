package p;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class man1 extends px40 {
    public final mf8 B;

    public man1(Context context, Looper looper, d520 d520Var, mf8 mf8Var, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 68, d520Var, h8n1Var, h8n1Var2);
        mf8Var = mf8Var == null ? mf8.c : mf8Var;
        lf8 lf8Var = new lf8();
        lf8Var.b = Boolean.FALSE;
        mf8 mf8Var2 = mf8.c;
        mf8Var.getClass();
        lf8Var.b = Boolean.valueOf(mf8Var.a);
        lf8Var.a = mf8Var.b;
        byte[] bArr = new byte[16];
        ban1.a.nextBytes(bArr);
        lf8Var.a = Base64.encodeToString(bArr, 11);
        this.B = new mf8(lf8Var);
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof oan1 ? (oan1) iInterfaceQueryLocalInterface : new oan1(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", (byte) 0);
    }

    public final Bundle j() {
        mf8 mf8Var = this.B;
        mf8Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", mf8Var.a);
        bundle.putString("log_session_id", mf8Var.b);
        return bundle;
    }

    public final int l() {
        return 12800000;
    }

    public final String o() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String p() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
