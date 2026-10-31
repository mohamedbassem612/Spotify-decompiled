package p;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qio1 extends a2o1 {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;

    public qio1(gzo1 gzo1Var) {
        Objects.requireNonNull(gzo1Var);
        this.c = gzo1Var;
    }

    @Override // p.a2o1
    public final void a() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                gzo1 gzo1Var = (gzo1) this.c;
                synchronized (gzo1Var.f) {
                    try {
                        if (gzo1Var.k.get() > 0 && gzo1Var.k.decrementAndGet() > 0) {
                            gzo1Var.b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (gzo1Var.m != null) {
                            gzo1Var.b.b("Unbind from service.", new Object[0]);
                            gzo1Var.a.unbindService(gzo1Var.l);
                            gzo1Var.g = false;
                            gzo1Var.m = null;
                            gzo1Var.l = null;
                        }
                        HashSet hashSet = gzo1Var.e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((bsd1) it.next()).c(new RemoteException(String.valueOf(gzo1Var.c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                gzo1 gzo1Var2 = (gzo1) ((v7y) this.c).b;
                gzo1Var2.b.b("unlinkToDeath", new Object[0]);
                gzo1Var2.m.asBinder().unlinkToDeath(gzo1Var2.j, 0);
                gzo1Var2.m = null;
                gzo1Var2.g = false;
                return;
        }
    }

    public qio1(v7y v7yVar) {
        this.c = v7yVar;
    }
}
