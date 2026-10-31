package p;

import android.content.Context;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o8o0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uo5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8o0(uo5 uo5Var, byte b) {
        super(0);
        this.a = b;
        this.b = uo5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uo5 uo5Var = this.b;
        switch (b) {
            case 0:
                return (ConnectivityManager) ((Context) uo5Var.d).getApplicationContext().getSystemService(ConnectivityManager.class);
            default:
                Object systemService = ((Context) uo5Var.d).getApplicationContext().getSystemService("phone");
                if (systemService instanceof TelephonyManager) {
                    return (TelephonyManager) systemService;
                }
                return null;
        }
    }
}
