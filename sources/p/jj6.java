package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jj6 extends hab0 implements Function0 {
    public final /* synthetic */ b4g1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qq20 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj6(b4g1 b4g1Var, boolean z, float f, float f2, qq20 qq20Var, float f3, float f4, float f5) {
        super(0);
        this.a = b4g1Var;
        this.b = z;
        this.c = f;
        this.d = f2;
        this.e = qq20Var;
        this.f = f3;
        this.g = f4;
        this.h = f5;
    }

    public final Object invoke() {
        b4g1 b4g1Var = this.a;
        hrr0 hrr0Var = b4g1Var.a;
        boolean z = this.b;
        hrr0Var.setValue(Boolean.valueOf(z));
        float f = this.c;
        b4g1Var.b.setValue(Boolean.valueOf(f <= 90.0f));
        b4g1Var.c.t(f);
        if (z) {
            b4g1Var.d.t(this.d);
            qq20 qq20Var = this.e;
            float f2 = qq20Var.d;
            float f3 = this.f;
            b4g1Var.e.t(dm5.T(f2, 0.0f, f3));
            b4g1Var.f.t(dm5.T(qq20Var.e, 0.0f, f3));
            b4g1Var.g.t(this.g);
            b4g1Var.h.t(this.h);
        }
        return rih1.a;
    }
}
