package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e4g extends hab0 implements zu30 {
    public final /* synthetic */ sju a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ xz7 e;
    public final /* synthetic */ g08 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ mt71 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4g(sju sjuVar, String str, boolean z, Function0 function0, xz7 xz7Var, g08 g08Var, float f, mt71 mt71Var, long j) {
        super(4);
        this.a = sjuVar;
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = xz7Var;
        this.f = g08Var;
        this.g = f;
        this.h = mt71Var;
        this.i = j;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        x340 x340Var = (b0k) obj3;
        ((Number) obj4).intValue();
        sju sjuVar = this.a;
        if (zBooleanValue) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(417006372);
            wz7.a(sjuVar, this.b, this.c, this.d, null, this.e, this.f, this.g, false, x340Var2, 100663296);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(417384479);
            h4g.b(sjuVar, this.h, this.i, uyn1.z(h4g.d, 0.0f, 2, nim0.a), x340Var3, 3072);
            x340Var3.r(false);
        }
        return rih1.a;
    }
}
