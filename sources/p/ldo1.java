package p;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ldo1 extends px40 {
    public final AtomicReference B;

    public ldo1(Context context, Looper looper, d520 d520Var, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 41, d520Var, h8n1Var, h8n1Var2);
        this.B = new AtomicReference();
    }

    public final boolean E() {
        return true;
    }

    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof vco1 ? (vco1) iInterfaceQueryLocalInterface : new vco1(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        try {
            if (this.B.getAndSet(null) != null) {
                throw new ClassCastException();
            }
        } catch (RemoteException unused) {
        }
        super/*p.xaa*/.c();
    }

    public final pl10[] e() {
        return o0c.a;
    }

    public final int l() {
        return 12600000;
    }

    public final String o() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    public final String p() {
        return "com.google.android.gms.usagereporting.service.START";
    }
}
