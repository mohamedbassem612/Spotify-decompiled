package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class efl1 extends hab0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ tob1 d;
    public final /* synthetic */ tob1 e;
    public final /* synthetic */ tob1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efl1(int i, float f, float f2, tob1 tob1Var, tob1 tob1Var2, tob1 tob1Var3) {
        super(0);
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = tob1Var;
        this.e = tob1Var2;
        this.f = tob1Var3;
    }

    public final Object invoke() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        return new pmg1(f * f2, f3 * f2, f3, ((Number) this.d.getValue()).floatValue(), ((Number) this.e.getValue()).floatValue(), ((Number) this.f.getValue()).floatValue());
    }
}
