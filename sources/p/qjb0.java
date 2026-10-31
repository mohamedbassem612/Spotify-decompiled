package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qjb0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ tl7 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ xtb0 f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjb0(tl7 tl7Var, Function0 function0, Function0 function1, float f, xtb0 xtb0Var, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.b = tl7Var;
        this.c = function0;
        this.d = function1;
        this.e = f;
        this.f = xtb0Var;
        this.g = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new qjb0(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            this.b.g(0, (Float) this.c.invoke(), (Float) this.d.invoke(), this.e);
            n811 n811Var = new n811();
            xtb0 xtb0Var = this.f;
            n811Var.a = ((err0) xtb0Var.e.b).s();
            n811 n811Var2 = new n811();
            n811Var2.a = ((err0) xtb0Var.e.c).s();
            m441 m441VarQ = rwq.q(new ih1(xtb0Var, (byte) 29));
            pjb0 pjb0Var = new pjb0(n811Var, n811Var2, this.b, this.g, this.c, this.d, this.e);
            this.a = true;
            Object objCollect = m441VarQ.collect(pjb0Var, this);
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
