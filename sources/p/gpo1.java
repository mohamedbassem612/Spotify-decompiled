package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gpo1 extends b2o1 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ v7y c;

    public gpo1(v7y v7yVar, IBinder iBinder) {
        this.b = iBinder;
        this.c = v7yVar;
    }

    @Override // p.b2o1
    public final void b() {
        cg70 ag70Var;
        int i = bg70.l;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            ag70Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            ag70Var = iInterfaceQueryLocalInterface instanceof cg70 ? (cg70) iInterfaceQueryLocalInterface : new ag70(iBinder);
        }
        hzo1 hzo1Var = (hzo1) this.c.b;
        hzo1Var.m = ag70Var;
        ArrayList arrayList = hzo1Var.d;
        hdn1 hdn1Var = hzo1Var.b;
        hdn1Var.g("linkToDeath", new Object[0]);
        try {
            hzo1Var.m.asBinder().linkToDeath(hzo1Var.j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                hdn1.i(hdn1Var.b, "linkToDeath failed", objArr);
            }
        }
        hzo1Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
