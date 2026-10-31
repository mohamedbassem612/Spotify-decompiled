package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mdl1 extends a8d1 implements vu30 {
    public final /* synthetic */ jti0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ lel1 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ drr0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mdl1(jti0 jti0Var, int i, lel1 lel1Var, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = jti0Var;
        this.b = i;
        this.c = lel1Var;
        this.d = c9nVar;
        this.e = ven0Var;
        this.f = ven0Var2;
        this.g = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new mdl1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        mdl1 mdl1VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        mdl1VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        float fB;
        hm5.M(obj);
        if (!((Boolean) this.e.getValue()).booleanValue()) {
            float fFloatValue = this.b;
            lel1 lel1Var = this.c;
            float f = lel1Var.h;
            jti0 jti0Var = this.a;
            if (jti0Var.b) {
                int iOrdinal = ((ijf1) jti0Var.e).ordinal();
                if (iOrdinal == 0) {
                    fB = lel1Var.b(f / 2.0f) + lel1Var.b(lel1Var.f) + lel1Var.b(lel1Var.j);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    fB = 0.0f - lel1Var.b(f / 2.0f);
                }
            } else {
                fB = fFloatValue;
            }
            Float f2 = new Float(fB);
            if (Math.abs(f2.floatValue()) > Float.MAX_VALUE) {
                f2 = null;
            }
            if (f2 != null) {
                fFloatValue = f2.floatValue();
            }
            float f3 = fFloatValue;
            ven0 ven0Var = this.f;
            faa0 faa0Var = (faa0) ven0Var.getValue();
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            ven0Var.setValue(fn31.T(this.d, (o8n) null, 0, new wj40(c97.b(this.g.s()), f3, jti0Var, this.g, (lnm) null, (byte) 4), 3));
        }
        return rih1.a;
    }
}
