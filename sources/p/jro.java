package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class jro implements ServiceConnection {
    public Context a;

    public void a(asn asnVar) {
        asn asnVar2;
        try {
            ((og70) ((qg70) asnVar.b)).Z0();
        } catch (RemoteException unused) {
        }
        cro.b = asnVar;
        ReentrantLock reentrantLock = cro.d;
        reentrantLock.lock();
        if (cro.c == null && (asnVar2 = cro.b) != null) {
            cro.c = asnVar2.l(null, null);
        }
        reentrantLock.unlock();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        qg70 qg70Var;
        if (this.a == null) {
            eg.m("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = pg70.a;
        if (iBinder == null) {
            qg70Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(qg70.c);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qg70)) {
                og70 og70Var = new og70();
                og70Var.a = iBinder;
                qg70Var = og70Var;
            } else {
                qg70Var = (qg70) iInterfaceQueryLocalInterface;
            }
        }
        Context context = this.a;
        asn asnVar = new asn();
        asnVar.b = qg70Var;
        asnVar.c = componentName;
        asnVar.a = context;
        a(asnVar);
    }
}
