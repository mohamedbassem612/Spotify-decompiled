package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nxj extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 N0;
    public final /* synthetic */ drr0 X;
    public final /* synthetic */ txj Y;
    public final /* synthetic */ List Z;
    public boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;
    public final /* synthetic */ List e;
    public final /* synthetic */ List f;
    public final /* synthetic */ xtb0 g;
    public final /* synthetic */ tr80 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxj(List list, List list2, int i, List list3, List list4, xtb0 xtb0Var, tr80 tr80Var, float f, ven0 ven0Var, drr0 drr0Var, txj txjVar, List list5, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = list3;
        this.f = list4;
        this.g = xtb0Var;
        this.h = tr80Var;
        this.i = f;
        this.t = ven0Var;
        this.X = drr0Var;
        this.Y = txjVar;
        this.Z = list5;
        this.N0 = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new nxj(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            int size = this.c.size() + this.b.size();
            int i = this.d;
            tr80 tr80VarQ = yoi1.Q(i, size + i);
            ArrayList arrayListN0 = o7h.N0(this.f, this.e);
            m441 m441VarQ = rwq.q(new lxj(this.g, this.h, this.i, this.t, this.X, tr80VarQ));
            mxj mxjVar = new mxj(this.d, this.b, this.Y, this.c, arrayListN0, this.Z, this.N0);
            this.a = true;
            Object objCollect = m441VarQ.collect(mxjVar, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
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
