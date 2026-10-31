package p;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tsl1 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean X;
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vsl1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ ir20 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ m811 i;
    public final /* synthetic */ WindowInsetsAnimationController t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsl1(float f, int i, int i2, int i3, WindowInsetsAnimationController windowInsetsAnimationController, lnm lnmVar, ir20 ir20Var, m811 m811Var, vsl1 vsl1Var, boolean z) {
        super(2, lnmVar);
        this.c = vsl1Var;
        this.d = i;
        this.e = f;
        this.f = ir20Var;
        this.g = i2;
        this.h = i3;
        this.i = m811Var;
        this.t = windowInsetsAnimationController;
        this.X = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        tsl1 tsl1Var = new tsl1(this.e, this.d, this.g, this.h, this.t, lnmVar, this.f, this.i, this.c, this.X);
        tsl1Var.b = obj;
        return tsl1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        vsl1 vsl1Var = this.c;
        if (!z) {
            hm5.M(obj);
            vsl1Var.i = fn31.T((c9n) this.b, null, 0, new ssl1(this.e, this.d, this.g, this.h, this.t, null, this.f, this.i, vsl1Var, this.X), 3);
            xab1 xab1Var = vsl1Var.i;
            if (xab1Var != null) {
                this.a = true;
                Object objJ = xab1Var.j(this);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
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
        vsl1Var.i = null;
        return rih1.a;
    }
}
