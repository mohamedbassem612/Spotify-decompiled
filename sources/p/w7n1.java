package p;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class w7n1 implements IBinder.DeathRecipient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w7n1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                c5n1 c5n1Var = (c5n1) obj;
                c5n1Var.b.b("reportBinderDeath", new Object[0]);
                if (c5n1Var.j.get() != null) {
                    bhn0.d();
                    return;
                }
                c5n1Var.b.b("%s : Binder has died.", new Object[]{c5n1Var.c});
                Iterator it = c5n1Var.d.iterator();
                while (it.hasNext()) {
                    ((v7n1) it.next()).a(new RemoteException(String.valueOf(c5n1Var.c).concat(" : Binder has died.")));
                }
                c5n1Var.d.clear();
                synchronized (c5n1Var.f) {
                    c5n1Var.d();
                    break;
                }
                return;
            case 1:
                gzo1 gzo1Var = (gzo1) obj;
                mcn1 mcn1Var = gzo1Var.b;
                mcn1Var.b("reportBinderDeath", new Object[0]);
                if (gzo1Var.i.get() != null) {
                    bhn0.d();
                    return;
                }
                mcn1Var.b("%s : Binder has died.", gzo1Var.c);
                ArrayList<a2o1> arrayList = gzo1Var.d;
                for (a2o1 a2o1Var : arrayList) {
                    RemoteException remoteException = new RemoteException(String.valueOf(gzo1Var.c).concat(" : Binder has died."));
                    bsd1 bsd1Var = a2o1Var.a;
                    if (bsd1Var != null) {
                        bsd1Var.c(remoteException);
                    }
                }
                arrayList.clear();
                synchronized (gzo1Var.f) {
                    HashSet hashSet = gzo1Var.e;
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        ((bsd1) it2.next()).c(new RemoteException(String.valueOf(gzo1Var.c).concat(" : Binder has died.")));
                    }
                    hashSet.clear();
                    break;
                }
                return;
            default:
                hzo1 hzo1Var = (hzo1) obj;
                hdn1 hdn1Var = hzo1Var.b;
                hdn1Var.g("reportBinderDeath", new Object[0]);
                if (hzo1Var.i.get() != null) {
                    bhn0.d();
                    return;
                }
                hdn1Var.g("%s : Binder has died.", hzo1Var.c);
                ArrayList arrayList2 = hzo1Var.d;
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    ((b2o1) it3.next()).a(new RemoteException(String.valueOf(hzo1Var.c).concat(" : Binder has died.")));
                }
                arrayList2.clear();
                synchronized (hzo1Var.f) {
                    HashSet hashSet2 = hzo1Var.e;
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        ((bsd1) it4.next()).c(new RemoteException(String.valueOf(hzo1Var.c).concat(" : Binder has died.")));
                    }
                    hashSet2.clear();
                    break;
                }
                return;
        }
    }
}
