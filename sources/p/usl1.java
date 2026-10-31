package p;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class usl1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ WindowInsetsAnimationController e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vsl1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usl1(float f, int i, int i2, WindowInsetsAnimationController windowInsetsAnimationController, lnm lnmVar, vsl1 vsl1Var, boolean z) {
        super(2, lnmVar);
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = windowInsetsAnimationController;
        this.f = z;
        this.g = vsl1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.e;
        boolean z = this.f;
        return new usl1(this.d, this.b, this.c, windowInsetsAnimationController, lnmVar, this.g, z);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        usl1 usl1Var;
        boolean z = this.a;
        vsl1 vsl1Var = this.g;
        if (!z) {
            hm5.M(obj);
            o95 o95VarB = c97.b(this.b);
            Float f = new Float(this.c);
            Float f2 = new Float(this.d);
            isl1 isl1Var = new isl1(vsl1Var, (byte) 1);
            this.a = true;
            usl1Var = this;
            Object objB = o95.b(o95VarB, f, (fe5) null, f2, isl1Var, usl1Var, 2);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            usl1Var = this;
        }
        usl1Var.e.finish(usl1Var.f);
        vsl1Var.e = null;
        return rih1.a;
    }
}
