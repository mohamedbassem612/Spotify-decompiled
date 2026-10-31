package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gx01 {
    public final yqg a;
    public final lik1 b;
    public final ccc0 c;
    public final xrc0 d;
    public final iyc0 e;
    public final Scheduler f;
    public final ip91 g;
    public final q7j0 h;
    public final g7h i;
    public final q8n j;
    public final q8n k;
    public final PublishSubject l = new PublishSubject();
    public final PublishSubject m = new PublishSubject();
    public final qzq n = new qzq((byte) 6);
    public final idd1 o = new idd1(new vwz0(this, (byte) 11));

    public gx01(yqg yqgVar, lik1 lik1Var, ccc0 ccc0Var, xrc0 xrc0Var, iyc0 iyc0Var, Scheduler scheduler, ip91 ip91Var, q7j0 q7j0Var, g7h g7hVar, q8n q8nVar, q8n q8nVar2) {
        this.a = yqgVar;
        this.b = lik1Var;
        this.c = ccc0Var;
        this.d = xrc0Var;
        this.e = iyc0Var;
        this.f = scheduler;
        this.g = ip91Var;
        this.h = q7j0Var;
        this.i = g7hVar;
        this.j = q8nVar;
        this.k = q8nVar2;
    }

    public final Single a(String str) {
        qzq qzqVar = this.n;
        Single single = (Single) qzqVar.get(str);
        if (single != null) {
            return single;
        }
        Single singleCache = rqt0.F(this.j, new b201(this, str, (lnm) null, (byte) 18)).map(pdx0.e).cache();
        qzqVar.put(str, singleCache);
        return singleCache;
    }

    public final Observable b(Set set) {
        List listL1 = o7h.l1(set);
        this.h.a();
        return Observable.combineLatest(this.i.c("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", listL1, false), (Observable) this.o.getValue(), new jpr0(set));
    }
}
