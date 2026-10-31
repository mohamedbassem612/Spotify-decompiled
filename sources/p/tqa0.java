package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tqa0 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ mqa0 b;
    public final /* synthetic */ tui1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ pxg1 f;
    public final /* synthetic */ n8b1 g;
    public final /* synthetic */ ven0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqa0(mqa0 mqa0Var, tui1 tui1Var, float f, float f2, pxg1 pxg1Var, n8b1 n8b1Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = mqa0Var;
        this.c = tui1Var;
        this.d = f;
        this.e = f2;
        this.f = pxg1Var;
        this.g = n8b1Var;
        this.h = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new tqa0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            float fE = qui1.e(this.c.b());
            Function0 function0 = (Function0) this.h.getValue();
            this.a = true;
            Object objC = this.b.c(fE, this.d, this.e, this.f, this.g, function0, this);
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
