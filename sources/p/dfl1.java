package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dfl1 extends hab0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tob1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfl1(int i, float f, float f2, boolean z, boolean z2, tob1 tob1Var) {
        super(0);
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = z2;
        this.f = tob1Var;
    }

    public final Object invoke() {
        float f = this.a;
        float f2 = this.b;
        float f3 = f * f2;
        float f4 = this.c * f2;
        float f5 = f2 * 60.0f;
        return Boolean.valueOf(((((Number) this.f.getValue()).floatValue() * f4) + f5) + f5 > f3 && this.d && this.e);
    }
}
