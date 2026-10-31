package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iih0 implements Runnable {
    public final /* synthetic */ d4e0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ hod0 e;

    public iih0(int i, int i2, Bundle bundle, String str, hod0 hod0Var, d4e0 d4e0Var) {
        this.e = hod0Var;
        this.a = d4e0Var;
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zhh0 zhh0Var;
        d4e0 d4e0Var = this.a;
        IBinder binder = ((Messenger) d4e0Var.b).getBinder();
        jih0 jih0Var = (jih0) this.e.b;
        jih0Var.d.remove(binder);
        Iterator it = jih0Var.c.iterator();
        while (true) {
            zhh0Var = null;
            if (!it.hasNext()) {
                break;
            }
            zhh0 zhh0Var2 = (zhh0) it.next();
            if (zhh0Var2.c == this.b) {
                zhh0Var = (TextUtils.isEmpty(this.c) || this.d <= 0) ? new zhh0(jih0Var, zhh0Var2.a, zhh0Var2.b, zhh0Var2.c, d4e0Var) : null;
                it.remove();
                break;
            }
        }
        if (zhh0Var == null) {
            zhh0Var = new zhh0(jih0Var, this.c, this.d, this.b, d4e0Var);
        }
        jih0Var.d.put(binder, zhh0Var);
        try {
            binder.linkToDeath(zhh0Var, 0);
        } catch (RemoteException unused) {
        }
    }
}
