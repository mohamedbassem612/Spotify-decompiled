package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hbf0 extends a8d1 implements iu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ int Y;
    public boolean a;
    public final /* synthetic */ kbf0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ bcf0 g;
    public final /* synthetic */ fcf0 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbf0(kbf0 kbf0Var, int i, int i2, boolean z, float f, bcf0 bcf0Var, fcf0 fcf0Var, float f2, boolean z2, boolean z3, int i3, lnm lnmVar) {
        super(1, lnmVar);
        this.b = kbf0Var;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = f;
        this.g = bcf0Var;
        this.h = fcf0Var;
        this.i = f2;
        this.t = z2;
        this.X = z3;
        this.Y = i3;
    }

    public final lnm create(lnm lnmVar) {
        return new hbf0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        geo0 geo0Var;
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        kbf0 kbf0Var = this.b;
        try {
            if (!z) {
                hm5.M(obj);
                kbf0Var.l(this.c);
                hrr0 hrr0Var = kbf0Var.c;
                int i = this.d;
                hrr0Var.setValue(Integer.valueOf(i));
                kbf0Var.d.setValue(Boolean.valueOf(this.e));
                hrr0 hrr0Var2 = kbf0Var.f;
                float f = this.f;
                hrr0Var2.setValue(Float.valueOf(f));
                kbf0Var.e.setValue(this.g);
                hrr0 hrr0Var3 = kbf0Var.i;
                fcf0 fcf0Var = this.h;
                hrr0Var3.setValue(fcf0Var);
                kbf0Var.n(this.i);
                kbf0Var.g.setValue(Boolean.valueOf(this.t));
                if (!this.X) {
                    kbf0Var.Y.setValue(Long.MIN_VALUE);
                }
                if (fcf0Var == null) {
                    kbf0Var.m(false);
                    return rih1Var;
                }
                if (Float.isInfinite(f)) {
                    kbf0Var.n(((Number) kbf0Var.Z.getValue()).floatValue());
                    kbf0Var.m(false);
                    kbf0Var.l(i);
                    return rih1Var;
                }
                kbf0Var.m(true);
                int iC = l1d.C(this.Y);
                if (iC == 0) {
                    geo0Var = o6x.a;
                } else {
                    if (iC != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    geo0Var = geo0.b;
                }
                gbf0 gbf0Var = new gbf0(this.Y, op71.z(getContext()), this.d, this.c, this.b, null);
                this.a = true;
                Object objY = fn31.Y(geo0Var, gbf0Var, this);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            op71.x(getContext());
            kbf0Var.m(false);
            return rih1Var;
        } catch (Throwable th) {
            kbf0Var.m(false);
            throw th;
        }
    }
}
