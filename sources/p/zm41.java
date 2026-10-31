package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zm41 implements xbm {
    public final iu30 a;
    public final vu30 b;
    public final Function0 c;
    public final Function0 d;
    public final klm e;
    public final wn41 f;
    public final Object g;

    public zm41(dn41 dn41Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, Function0 function0, Function0 function1, Map map) {
        this.a = iu30Var2;
        this.b = vu30Var;
        this.c = function0;
        this.d = function1;
        klm klmVar = new klm(dn41Var.a, map, dn41Var.c);
        this.e = klmVar;
        wn41 wn41Var = new wn41(klmVar);
        this.f = wn41Var;
        this.g = iu30Var.invoke(wn41Var);
    }

    @Override // p.xbm
    public final klm L() {
        return this.e;
    }

    @Override // p.xbm
    public final klm W() {
        return this.e;
    }

    @Override // p.xbm
    public final LinkedHashSet g0() {
        iu30 iu30Var = this.a;
        Object obj = this.g;
        Set set = (Set) iu30Var.invoke(obj);
        Iterable iterable = (Iterable) this.b.invoke(this.f, obj);
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add((dwo) ((go80) it.next()).b.getValue());
        }
        return dm61.y0(set, arrayList);
    }

    @Override // p.xbm
    public final List i() {
        return (List) this.d.invoke();
    }

    @Override // p.xbm
    public final ro8 n() {
        return new ro8(this, (lnm) null, (byte) 22);
    }

    @Override // p.xbm
    public final List q() {
        return (List) this.c.invoke();
    }

    public /* synthetic */ zm41(dn41 dn41Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, Function0 function0, Function0 function1, int i) {
        this(dn41Var, iu30Var, (i & 4) != 0 ? fft0.W0 : iu30Var2, vu30Var, (i & 16) != 0 ? w0n0.Q0 : function0, (i & 32) != 0 ? oa41.f : function1, b7x.a);
    }
}
