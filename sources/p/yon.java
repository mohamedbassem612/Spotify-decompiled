package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yon implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public yon(jjz jjzVar, Context context, m021 m021Var) {
        this.a = (byte) 11;
        this.b = jjzVar;
        this.c = context;
        this.d = m021Var;
        this.e = new Handler(Looper.getMainLooper());
    }

    public Object a(dnh dnhVar, wt wtVar) {
        uwe1 uwe1VarU = z47.u((cwe1) this.d, Boolean.valueOf(dnhVar.d));
        if (uwe1VarU.equals(rwe1.a) || uwe1VarU.equals(twe1.a)) {
            return z6x.a;
        }
        if (!(uwe1VarU instanceof swe1)) {
            eg.o();
            return null;
        }
        myq0 myq0Var = (myq0) this.e;
        ArrayList arrayListB = hwe1.b(dnhVar.e, dnhVar.b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListB) {
            if (obj instanceof ewe1) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((ewe1) it.next()).c));
        }
        return smo1.s(new ofk0(arrayList2, myq0Var, dnhVar.c, (lnm) null, (byte) 20), wtVar);
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 22;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return observable.flatMap(new uq8(this, b2));
            case 1:
                return observable.switchMapSingle(new i3b(this, (byte) 22));
            case 2:
                return observable.concatMap(new yfc0(this, (byte) 8));
            case 3:
                return observable.flatMap(new m4e0(this, (byte) 29));
            case 4:
                return observable.flatMap(new jxp0((Object) this, (byte) 6));
            case 5:
                return observable.switchMap(new uip0(this, (byte) 9));
            case 6:
                return observable.switchMap(new tym0(this, (byte) 19));
            case 7:
                return observable.flatMap(new cmt0(this));
            case 8:
                return observable.flatMapSingle(new tzr0((mzr0) obj3, (gal) obj2, (rrv0) obj, (zhq0) this.e, (byte) 17));
            case 9:
                return observable.switchMap(new y441((nn61) obj3, (Scheduler) obj2, (r961) obj, (qp91) this.e));
            case 10:
                return observable.flatMap(new ep31(this, (byte) 13));
            case 11:
                return observable.flatMap(new ij01(this, (byte) 29));
            case 12:
                return observable.flatMap(new ua91((g0l) obj3, (Scheduler) obj2, (n381) obj, (r1a1) this.e, (byte) 8));
            case 13:
                Scheduler scheduler = (Scheduler) obj3;
                return observable.observeOn(scheduler).switchMap(new ua91((Single) obj2, scheduler, (ptj) obj, (String) this.e, (byte) 18));
            default:
                return Observable.merge(observable.groupBy(y6x0.U0).map(new c681(this, (byte) 29)));
        }
    }

    public /* synthetic */ yon(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public yon(c23 c23Var, Scheduler scheduler, ykq ykqVar, PublishSubject publishSubject) {
        this.a = (byte) 14;
        this.b = c23Var;
        this.c = scheduler;
        this.e = ykqVar;
        this.d = publishSubject;
    }

    public yon(tjh tjhVar, yqg yqgVar, cwe1 cwe1Var, hwe1 hwe1Var, myq0 myq0Var) {
        this.a = (byte) 1;
        this.b = tjhVar;
        this.c = yqgVar;
        this.d = cwe1Var;
        this.e = myq0Var;
    }

    public yon(t2j0 t2j0Var, krh krhVar, ov20 ov20Var) {
        this.a = (byte) 2;
        this.b = t2j0Var;
        this.c = krhVar;
        this.d = ov20Var;
    }
}
