package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rxu extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ zeu b;
    public final /* synthetic */ lik1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ h2v e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ tv80 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxu(zeu zeuVar, lik1 lik1Var, boolean z, h2v h2vVar, String str, boolean z2, boolean z3, tv80 tv80Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = zeuVar;
        this.c = lik1Var;
        this.d = z;
        this.e = h2vVar;
        this.f = str;
        this.g = z2;
        this.h = z3;
        this.i = tv80Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new rxu(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            q5q q5qVar = (q5q) this.b.b;
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            uw0 uw0VarA = q5qVar.a(yon1.a1(), this.c);
            boolean z2 = !this.d;
            boolean z3 = this.e instanceof c2v;
            this.a = true;
            Object objC = uw0VarA.C(qtu.b, this.f, z2, this.g, this.h, z3, this.i, (g3d0) null, this);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
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
