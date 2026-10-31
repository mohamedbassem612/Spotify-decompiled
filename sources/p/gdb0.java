package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gdb0 extends xbk1 {
    public final kp00 b;
    public final n801 c;
    public final dxz0 d;
    public final Scheduler e;
    public final Scheduler f;
    public final Scheduler g;
    public final kdn0 h = new kdn0();
    public final kdn0 i = new kdn0();
    public List t = z6x.a;
    public final rku X = new rku();

    public gdb0(kp00 kp00Var, n801 n801Var, dxz0 dxz0Var, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3) {
        this.b = kp00Var;
        this.c = n801Var;
        this.d = dxz0Var;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = scheduler3;
        V();
    }

    public final void S() {
        this.X.a();
    }

    public final kdn0 T() {
        return this.i;
    }

    public final ymd0 U() {
        return this.h;
    }

    public final void V() {
        this.X.b(this.d.e().subscribeOn(this.f).switchMap(new jpa0(this, (byte) 2)).observeOn(this.g).subscribe(new fdb0(this, (byte) 0), new fdb0(this, (byte) 1)));
    }

    public final void W() {
        mdb0 mdb0Var = (mdb0) this.h.e();
        if (mdb0Var instanceof idb0) {
            List list = ((idb0) mdb0Var).a;
            o2b1 o2b1Var = (o2b1) this.c.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((kcb0) obj).b) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new zab0(((kcb0) it.next()).a.b));
            }
            odi1 odi1Var = (odi1) o2b1Var.b;
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((zab0) it2.next()).a);
            }
            odi1Var.a(arrayList3).s(this.e).subscribe(ps4.O0, k530.S0).getClass();
        }
    }
}
