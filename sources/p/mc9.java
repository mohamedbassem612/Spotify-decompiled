package p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mc9 extends iaa0 {
    public static final /* synthetic */ long t = avg.a.objectFieldOffset(mc9.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final ohd g;
    public qku h;
    public final /* synthetic */ oc9 i;

    public mc9(oc9 oc9Var, ohd ohdVar) {
        this.i = oc9Var;
        this.g = ohdVar;
    }

    @Override // p.iaa0
    public final void l(Throwable th) {
        ohd ohdVar = this.g;
        if (th != null) {
            jm jmVarE = ohdVar.E(new nyh(th, false), null);
            if (jmVarE != null) {
                ohdVar.O(jmVarE);
                nc9 nc9Var = (nc9) avg.a.getObjectVolatile(this, t);
                if (nc9Var != null) {
                    nc9Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = oc9.b;
        oc9 oc9Var = this.i;
        if (atomicIntegerFieldUpdater.decrementAndGet(oc9Var) == 0) {
            l2t[] l2tVarArr = oc9Var.a;
            ArrayList arrayList = new ArrayList(l2tVarArr.length);
            for (l2t l2tVar : l2tVarArr) {
                arrayList.add(l2tVar.e());
            }
            ohdVar.resumeWith(arrayList);
        }
    }
}
