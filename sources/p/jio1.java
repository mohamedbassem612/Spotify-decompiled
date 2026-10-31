package p;

import android.os.RemoteException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jio1 extends b2o1 {
    public final /* synthetic */ byte b = 0;
    public final /* synthetic */ Object c;

    public jio1(hzo1 hzo1Var) {
        Objects.requireNonNull(hzo1Var);
        this.c = hzo1Var;
    }

    @Override // p.b2o1
    public final void b() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hzo1 hzo1Var = (hzo1) this.c;
                synchronized (hzo1Var.f) {
                    try {
                        if (hzo1Var.k.get() > 0 && hzo1Var.k.decrementAndGet() > 0) {
                            hzo1Var.b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (hzo1Var.m != null) {
                            hzo1Var.b.g("Unbind from service.", new Object[0]);
                            hzo1Var.a.unbindService(hzo1Var.l);
                            hzo1Var.g = false;
                            hzo1Var.m = null;
                            hzo1Var.l = null;
                        }
                        HashSet hashSet = hzo1Var.e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((bsd1) it.next()).c(new RemoteException(String.valueOf(hzo1Var.c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                hzo1 hzo1Var2 = (hzo1) ((v7y) this.c).b;
                hzo1Var2.b.g("unlinkToDeath", new Object[0]);
                hzo1Var2.m.asBinder().unlinkToDeath(hzo1Var2.j, 0);
                hzo1Var2.m = null;
                hzo1Var2.g = false;
                return;
        }
    }

    public jio1(v7y v7yVar) {
        this.c = v7yVar;
    }
}
