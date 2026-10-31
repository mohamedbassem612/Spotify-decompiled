package p;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o1o1 extends px40 {
    public final jv81 B;
    public final jv81 C;
    public final jv81 D;

    public o1o1(Context context, Looper looper, d520 d520Var, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 23, d520Var, h8n1Var, h8n1Var2);
        this.B = new jv81(0);
        this.C = new jv81(0);
        this.D = new jv81(0);
    }

    public final boolean E() {
        return true;
    }

    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof ybp1 ? (ybp1) iInterfaceQueryLocalInterface : new ybp1(iBinder);
    }

    public final pl10[] e() {
        return rqo1.a;
    }

    public final int l() {
        return 11717000;
    }

    public final String o() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String p() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void x() {
        System.currentTimeMillis();
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
        synchronized (this.D) {
            this.D.clear();
        }
    }
}
