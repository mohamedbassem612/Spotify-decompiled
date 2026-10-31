package p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fpo1 extends a2o1 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ v7y c;

    public fpo1(v7y v7yVar, IBinder iBinder) {
        this.b = iBinder;
        this.c = v7yVar;
    }

    @Override // p.a2o1
    public final void a() {
        mg70 kg70Var;
        int i = lg70.l;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            kg70Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.crossdeviceprompt.protocol.ICrossDevicePromptService");
            kg70Var = iInterfaceQueryLocalInterface instanceof mg70 ? (mg70) iInterfaceQueryLocalInterface : new kg70(iBinder);
        }
        gzo1 gzo1Var = (gzo1) this.c.b;
        gzo1Var.m = kg70Var;
        ArrayList arrayList = gzo1Var.d;
        mcn1 mcn1Var = gzo1Var.b;
        mcn1Var.b("linkToDeath", new Object[0]);
        try {
            gzo1Var.m.asBinder().linkToDeath(gzo1Var.j, 0);
        } catch (RemoteException unused) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                mcn1.d(mcn1Var.b, "linkToDeath failed", objArr);
            }
        }
        gzo1Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
