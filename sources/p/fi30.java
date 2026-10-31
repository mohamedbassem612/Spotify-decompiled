package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fi30 implements Cancellable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public fi30(String str, t2g1 t2g1Var, loc1 loc1Var, Disposable disposable) {
        this.a = (byte) 2;
        this.b = t2g1Var;
        this.c = loc1Var;
        this.d = disposable;
    }

    public final void cancel() {
        switch (this.a) {
            case 0:
                yun0 yun0Var = (yun0) this.b;
                gi30 gi30Var = (gi30) this.c;
                yun0Var.d(gi30Var);
                ((th30) this.d).q.remove(gi30Var);
                gi30Var.e.clear();
                gi30Var.a.clear();
                gi30Var.b.clear();
                gi30Var.c.clear();
                WeakReference weakReference = gi30Var.d;
                if (weakReference != null) {
                    weakReference.clear();
                    return;
                }
                return;
            case 1:
                ((xpi0) this.b).c.g((String) this.c, (wpi0) this.d);
                return;
            default:
                ((loc1) this.c).a.size();
                ((Disposable) this.d).dispose();
                loc1 loc1Var = (loc1) this.c;
                t2g1 t2g1Var = (t2g1) this.b;
                synchronized (loc1Var) {
                    loc1Var.a.remove(t2g1Var);
                    loc1Var.a.size();
                }
                return;
        }
    }

    public /* synthetic */ fi30(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
