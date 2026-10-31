package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oxj extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ txj b;
    public final /* synthetic */ List c;
    public final /* synthetic */ xtb0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ tr80 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxj(txj txjVar, List list, xtb0 xtb0Var, int i, ven0 ven0Var, tr80 tr80Var, float f, ven0 ven0Var2, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = txjVar;
        this.c = list;
        this.d = xtb0Var;
        this.e = i;
        this.f = ven0Var;
        this.g = tr80Var;
        this.h = f;
        this.i = ven0Var2;
        this.t = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new oxj(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Integer num = (Integer) this.b.n.getValue();
            if (num != null && !((Boolean) this.f.getValue()).booleanValue()) {
                List list = this.c;
                int i = 0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((rrj0) it.next()).a <= num.intValue() && (i = i + 1) < 0) {
                            p7h.S();
                            throw null;
                        }
                    }
                }
                xtb0 xtb0Var = this.d;
                List list2 = xtb0Var.h().l;
                int iIntValue = num.intValue() + this.e + i;
                int i2 = -rxj.a(this.g, this.h, this.i, this.t, list2);
                this.a = true;
                Object objK = xtb0Var.k(iIntValue, i2, this);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
