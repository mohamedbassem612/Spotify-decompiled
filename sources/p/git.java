package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class git extends fit {
    public final dzq0 g;
    public final cgy0 h;
    public final String i;
    public final kf30 j;

    public git(dzq0 dzq0Var, cgy0 cgy0Var, zjn0 zjn0Var, ava avaVar, lja0 lja0Var, ks6 ks6Var, String str, Function0 function0) {
        l141 l141Var = new l141(cgy0Var.g);
        y3j1 y3j1Var = y3j1.b;
        super(new byp(ks6Var, zjn0Var, dzq0Var, l141Var, l0p1.h(cgy0Var.h), avaVar, lja0Var, (mxa1) null, z6x.a), cgy0Var.d, cgy0Var.e, cgy0Var.f, function0);
        this.g = dzq0Var;
        this.h = cgy0Var;
        this.i = str;
        this.j = ((ezq0) dzq0Var).f;
    }

    @Override // p.aqi0, p.zpi0
    public final Collection d(wgt wgtVar, iu30 iu30Var) {
        Collection collectionI = i(wgtVar, iu30Var);
        Iterable iterable = (Iterable) ((ks6) this.b.b).t;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            r7h.W(((deg) it.next()).a(this.j), arrayList);
        }
        return o7h.N0(arrayList, collectionI);
    }

    @Override // p.fit, p.aqi0, p.zpi0
    public final jfg g(ajn0 ajn0Var, int i) {
        Object obj = this.b.b;
        lf30 lf30Var = ((ezq0) this.g).f.a;
        ajn0Var.b();
        return super.g(ajn0Var, i);
    }

    @Override // p.fit
    public final heg l(ajn0 ajn0Var) {
        return new heg(this.j, ajn0Var);
    }

    @Override // p.fit
    public final boolean q(ajn0 ajn0Var) {
        if (super.q(ajn0Var)) {
            return true;
        }
        Iterable iterable = (Iterable) ((ks6) this.b.b).t;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((deg) it.next()).b(this.j, ajn0Var)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.i;
    }
}
