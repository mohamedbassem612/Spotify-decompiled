package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y7c0 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Serializable h;
    public final Serializable i;

    public y7c0(dxz0 dxz0Var, m4e0 m4e0Var, jj4 jj4Var, Observable observable, Scheduler scheduler) {
        this.a = dxz0Var;
        this.b = m4e0Var;
        this.c = jj4Var;
        this.d = observable;
        this.e = scheduler;
        this.f = new idd1(new u6j0(this, (byte) 16));
        this.g = new idd1(new stp0(this, (byte) 1));
        this.h = new idd1(new stp0(this, (byte) 0));
        this.i = new idd1(new stp0(this, (byte) 2));
    }

    public Observable a(iu30 iu30Var) {
        return Observable.merge(o7h.l1((ArrayList) this.h)).scan(sqg0.U((LinkedHashMap) this.i), o810.t).distinctUntilChanged().map(yb10.t).map(new rrr(iu30Var, (byte) 1));
    }

    public void b() {
        ArrayList arrayList = (ArrayList) this.h;
        arrayList.add(((Observable) ((ofd) this.d).invoke()).map(eh10.t));
        arrayList.add(((Observable) ((qvo) this.b).invoke()).map(mi10.t));
        arrayList.add(((Observable) ((idd1) ((y7c0) this.a).f).getValue()).map(xi10.t));
        arrayList.add(((Observable) ((jqb0) this.e).invoke()).map(fj10.t));
        arrayList.add(((Observable) ((ofd) this.f).invoke()).map(ok10.i));
        arrayList.add(((Observable) ((ofd) this.c).invoke()).map(si10.t));
        arrayList.add(((Observable) ((x5u) this.g).invoke()).map(dj10.t));
    }

    public y7c0(y7c0 y7c0Var, qvo qvoVar, ofd ofdVar, ofd ofdVar2, jqb0 jqb0Var, ofd ofdVar3, x5u x5uVar) {
        this.a = y7c0Var;
        this.b = qvoVar;
        this.c = ofdVar;
        this.d = ofdVar2;
        this.e = jqb0Var;
        this.f = ofdVar3;
        this.g = x5uVar;
        this.h = new ArrayList();
        this.i = new LinkedHashMap();
    }
}
