package p;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x2c extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public boolean e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2c(float f, int i, int i2, WindowInsetsAnimationController windowInsetsAnimationController, lnm lnmVar, vsl1 vsl1Var, boolean z) {
        super(2, lnmVar);
        this.g = vsl1Var;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.h = windowInsetsAnimationController;
        this.e = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                return new x2c(this.d, (drr0) this.f, (iu30) obj3, this.b, this.c, (ven0) obj2, lnmVar);
            default:
                boolean z = this.e;
                float f = this.d;
                int i = this.b;
                int i2 = this.c;
                x2c x2cVar = new x2c(f, i, i2, (WindowInsetsAnimationController) obj2, lnmVar, (vsl1) obj3, z);
                x2cVar.f = obj;
                return x2cVar;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                boolean z = this.e;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ = rwq.q(new v2c(this.d, (drr0) this.f));
                w2c w2cVar = new w2c((iu30) obj3, this.b, this.c, (ven0) obj2, null);
                this.e = true;
                Object objQ = l4p1.q(m441VarQ, w2cVar, this);
                d9n d9nVar = d9n.a;
                return objQ == d9nVar ? d9nVar : rih1Var;
            default:
                hm5.M(obj);
                vsl1 vsl1Var = (vsl1) obj3;
                vsl1Var.i = fn31.T((c9n) this.f, (o8n) null, 0, new usl1(this.d, this.b, this.c, (WindowInsetsAnimationController) obj2, (lnm) null, vsl1Var, this.e), 3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2c(float f, drr0 drr0Var, iu30 iu30Var, int i, int i2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = f;
        this.f = drr0Var;
        this.g = iu30Var;
        this.b = i;
        this.c = i2;
        this.h = ven0Var;
    }
}
