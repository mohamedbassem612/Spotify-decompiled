package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bia0 implements wha0, f961 {
    public final aia0 a;
    public final List b;
    public final xqd c;

    public bia0(aia0 aia0Var, m980 m980Var, List list, xqd xqdVar) {
        AtomicBoolean atomicBoolean = aia0Var.f;
        this.a = aia0Var;
        this.b = list;
        this.c = xqdVar;
        if (!m980Var.j() || atomicBoolean.get()) {
            return;
        }
        aia0Var.d.isEmpty();
        atomicBoolean.set(true);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xjs xjsVar = (xjs) it.next();
            xjsVar.c();
            aia0Var.e.add(xjsVar);
        }
        xqd xqdVar2 = this.c;
        xqdVar2.e.f(new Disposable[]{xqdVar2.d.subscribe(new xu(xqdVar2, (byte) 16)), Observable.combineLatest(xqdVar2.c, ((drd) xqdVar2.b).b, fkj0.i).subscribe(new mba(xqdVar2, (byte) 16))});
    }

    public final Object getApi() {
        return this.a;
    }

    public final void shutdown() {
        aia0 aia0Var = this.a;
        AtomicBoolean atomicBoolean = aia0Var.f;
        if (atomicBoolean.get()) {
            this.c.e.g();
            for (xjs xjsVar : this.b) {
                aia0Var.e.remove(xjsVar);
                xjsVar.a();
            }
            if (atomicBoolean.getAndSet(false)) {
                aia0Var.a("Jumpstart API is stopped");
            }
        }
    }
}
