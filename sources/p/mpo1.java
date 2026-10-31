package p;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mpo1 extends w1o1 {
    public final /* synthetic */ IBinder b;
    public final /* synthetic */ v7y c;

    public mpo1(v7y v7yVar, IBinder iBinder) {
        this.b = iBinder;
        this.c = v7yVar;
    }

    @Override // p.w1o1
    public final void a() {
        hg70 fg70Var;
        rzo1 rzo1Var = (rzo1) this.c.b;
        int i = gg70.l;
        IBinder iBinder = this.b;
        if (iBinder == null) {
            fg70Var = null;
        } else {
            hg70 hg70VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.engage.protocol.IAppEngageService");
            fg70Var = hg70VarQueryLocalInterface instanceof hg70 ? hg70VarQueryLocalInterface : new fg70(iBinder);
        }
        rzo1Var.m = fg70Var;
        jm jmVar = rzo1Var.b;
        jmVar.d("linkToDeath", new Object[0]);
        try {
            rzo1Var.m.asBinder().linkToDeath(rzo1Var.j, 0);
        } catch (RemoteException e) {
            jmVar.b(e, "linkToDeath failed", new Object[0]);
        }
        rzo1Var.g = false;
        Iterator it = rzo1Var.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        rzo1Var.d.clear();
    }
}
