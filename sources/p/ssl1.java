package p;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ssl1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ir20 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ vsl1 g;
    public final /* synthetic */ m811 h;
    public final /* synthetic */ WindowInsetsAnimationController i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssl1(float f, int i, int i2, int i3, WindowInsetsAnimationController windowInsetsAnimationController, lnm lnmVar, ir20 ir20Var, m811 m811Var, vsl1 vsl1Var, boolean z) {
        super(2, lnmVar);
        this.b = i;
        this.c = f;
        this.d = ir20Var;
        this.e = i2;
        this.f = i3;
        this.g = vsl1Var;
        this.h = m811Var;
        this.i = windowInsetsAnimationController;
        this.t = z;
    }

    public static final void e(int i, int i2, vsl1 vsl1Var, m811 m811Var, WindowInsetsAnimationController windowInsetsAnimationController, boolean z, float f, float f2) {
        float f3 = i;
        if (f <= i2 && f3 <= f) {
            vsl1Var.a(f);
            return;
        }
        m811Var.a = f2;
        windowInsetsAnimationController.finish(z);
        vsl1Var.e = null;
        xab1 xab1Var = vsl1Var.i;
        if (xab1Var != null) {
            xab1Var.S(new lk20());
        }
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ssl1(this.c, this.b, this.e, this.f, this.i, lnmVar, this.d, this.h, this.g, this.t);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        float f = this.b;
        rsl1 rsl1Var = new rsl1(this.e, this.f, this.g, this.h, this.i, this.t);
        this.a = true;
        e9r e9rVar = new e9r(this.d);
        Float fValueOf = Float.valueOf(f);
        float f2 = this.c;
        Object objS = wwo1.s(prn1.a(28, f, f2), new mv2(e9rVar, rno1.a, fValueOf, new ke5(f2)), Long.MIN_VALUE, new w7d1(rsl1Var, (byte) 0), this);
        d9n d9nVar = d9n.a;
        if (objS != d9nVar) {
            objS = rih1Var;
        }
        return objS == d9nVar ? d9nVar : rih1Var;
    }
}
