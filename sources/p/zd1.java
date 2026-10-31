package p;

import android.content.Context;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zd1 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public Object d;

    public zd1(rkd0 rkd0Var, t2j0 t2j0Var) {
        this.a = (byte) 6;
        this.b = rkd0Var;
        this.c = t2j0Var;
        this.d = new PublishSubject();
    }

    public gbl a() {
        return (gbl) this.d;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        byte b2 = 12;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return observable.flatMap(new fl1((Object) this, (byte) 7));
            case 1:
                return observable.flatMap(new cab(obj, obj2, this.d, (byte) 26));
            case 2:
                return observable.switchMapSingle(new rjn(this, (byte) 0));
            case 3:
                return observable.flatMap(new nt60((n381) obj, (k9r) obj2, (nfa0) this.d, (byte) 2));
            case 4:
                return observable.switchMap(new st60((Flowable) obj, (v5n) obj2, (sjq0) this.d, (byte) 1));
            case 5:
                return observable.switchMap(new zc80(this, (byte) 0));
            case 6:
                return observable.switchMap(new eb80(this, (byte) 3));
            case 7:
                return observable.switchMapSingle(new dg90(this, (byte) 14));
            case 8:
                return observable.switchMapSingle(new zc80(this, (byte) 15));
            case 9:
                return observable.switchMap(new eea0(this, (byte) 13));
            case 10:
                return observable.switchMap(new qkn0(this, (byte) 1));
            case 11:
                return observable.map(new z8c0(this, (byte) 24));
            case 12:
                return observable.flatMap(new kqi0((Context) obj2, (kt91) obj, (Scheduler) this.d, (byte) 28));
            case 13:
                return observable.switchMap(new e5l0(this, (byte) 12)).takeUntil(cj20.S0).throttleLatest(((kiu0) obj2).b.g(), TimeUnit.MILLISECONDS, (Scheduler) this.d, true).filter(xj20.S0).map(yj20.Q0).onErrorReturnItem(x23.a);
            case 14:
                return observable.switchMap(new jxp0(this, b2));
            case 15:
                return observable.flatMapSingle(new aru0((mzr0) obj, (aru0) obj2, (nfa0) this.d, (byte) 15));
            case 16:
                return observable.switchMap(new l0x0((do70) obj, (Scheduler) obj2, (gdx0) this.d, (byte) 1));
            case 17:
                return observable.flatMap(new l0x0((q8n) obj, (bfd) obj2, (mwv0) this.d, (byte) 2));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return observable.switchMap(new t421((q8n) obj, (byp0) obj2, (xrc0) this.d, (byte) 1));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return observable.flatMap(new x2a1((g0l) obj, (Scheduler) obj2, (n381) this.d, (byte) 0));
            case 20:
                return observable.observeOn((Scheduler) obj).flatMap(new hp91((l5b1) obj2, (String) this.d, (byte) 21));
            default:
                return observable.flatMap(new i1l1((j1l1) obj, (Scheduler) obj2, (n7m0) this.d));
        }
    }

    public Object b(cnh cnhVar, wt wtVar) {
        uwe1 uwe1VarU = z47.u((cwe1) this.c, Boolean.valueOf(cnhVar.c));
        if (uwe1VarU.equals(rwe1.a) || uwe1VarU.equals(twe1.a)) {
            return z6x.a;
        }
        if (!(uwe1VarU instanceof swe1)) {
            eg.o();
            return null;
        }
        myq0 myq0Var = (myq0) this.d;
        ArrayList arrayListB = hwe1.b(cnhVar.d, cnhVar.b);
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
        return smo1.s(new ofk0(arrayList2, myq0Var, cnhVar.a, (lnm) null, (byte) 20), wtVar);
    }

    public /* synthetic */ zd1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ zd1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj4;
    }

    public zd1(Context context, rcl rclVar) {
        this.a = (byte) 11;
        this.c = context;
        this.b = rclVar;
        this.d = gbl.f;
    }

    public zd1(Context context, kt91 kt91Var, Scheduler scheduler) {
        this.a = (byte) 12;
        this.c = context;
        this.b = kt91Var;
        this.d = scheduler;
    }
}
