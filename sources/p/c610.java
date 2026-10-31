package p;

import android.os.Bundle;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c610 {
    public final Scheduler a;
    public final Scheduler b;
    public final Set c;
    public final Set d;
    public final bnj0 e;
    public final q610 f;
    public final oyr g;
    public final Observable h;
    public final Observable i;
    public final nkv j;

    public c610(Scheduler scheduler, Scheduler scheduler2, Set set, Set set2, bnj0 bnj0Var, q610 q610Var, oyr oyrVar, Observable observable, Observable observable2, nkv nkvVar) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = set;
        this.d = set2;
        this.e = bnj0Var;
        this.f = q610Var;
        this.g = oyrVar;
        this.h = observable;
        this.i = observable2;
        this.j = nkvVar;
    }

    public final r9c a(r9c r9cVar) {
        m210 m210VarB;
        return (r9cVar.j() && (m210VarB = r9cVar.b()) != null) ? r9c.a(r9cVar, (String) null, (String) null, false, false, this.f.a(m210VarB).p(), false, 245759) : r9cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(r9c r9cVar, onm onmVar) {
        x510 x510Var;
        if (onmVar instanceof x510) {
            x510Var = (x510) onmVar;
            int i = x510Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x510Var.c = i - Integer.MIN_VALUE;
            } else {
                x510Var = new x510(this, onmVar);
            }
        } else {
            x510Var = new x510(this, onmVar);
        }
        Object objJ = x510Var.a;
        int i2 = x510Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleC = c(r9cVar, null);
            x510Var.c = 1;
            objJ = fc11.j(singleC, x510Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public final Single c(r9c r9cVar, Bundle bundle) {
        return this.h.filter(wcp1.c1).switchMap(new kp00(this, r9cVar, (byte) 5)).subscribeOn(this.b).take(1L).flatMap(new y510(this, r9cVar, bundle, (byte) 0)).map(new dqu(this, (byte) 15)).flatMapSingle(new fey(this, (byte) 5)).switchMap(new lmw(this, (byte) 11)).singleOrError().observeOn(this.a).doOnError(new z510(r9cVar, (byte) 0));
    }

    public final void d(r9c r9cVar) {
        UbiSpecificationId ubiSpecificationIdH = r9cVar.h();
        if (ubiSpecificationIdH == UbiSpecificationId.UNKNOWN) {
            return;
        }
        r710 r710Var = new r710(ubiSpecificationIdH, r9cVar.e(), (Integer) null, 12);
        oyr oyrVar = this.g;
        if (((r64) oyrVar.b.get(r710Var.c())) != null) {
            oyrVar.a.f(x4p1.m(r710Var.d()).e(), null);
        }
    }

    public final Observable e(r9c r9cVar, Bundle bundle) {
        return this.h.filter(wcp1.c1).switchMap(new kp00(this, r9cVar, (byte) 5)).subscribeOn(this.b).switchMap(new y510(this, r9cVar, bundle, (byte) 1)).map(new mjv(this, (byte) 11)).distinctUntilChanged().switchMap(new j3v(this, (byte) 16)).observeOn(this.a).doOnError(new z510(r9cVar, (byte) 1));
    }

    public final w310 f(r9c r9cVar) {
        Object next;
        Set set = this.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((x310) obj).a(r9cVar)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            n57.e("Multiple external content providers for the same input: " + r9cVar);
        }
        x310 x310Var = (x310) o7h.s0(arrayList);
        if (x310Var != null) {
            return x310Var.b(r9cVar);
        }
        Iterator it = this.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((shh0) next).a(r9cVar));
        shh0 shh0Var = (shh0) next;
        if (shh0Var != null) {
            return shh0Var.b();
        }
        return null;
    }

    public final void g(List list, UbiSpecificationId ubiSpecificationId) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(new q710(((u310) it.next()).a(), i));
            i++;
        }
        oyr oyrVar = this.g;
        if (oyrVar.b.containsKey(ubiSpecificationId)) {
            oyrVar.c.put(ubiSpecificationId, arrayList);
        }
    }
}
