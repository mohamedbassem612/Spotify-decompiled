package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iok1 extends hab0 implements vu30 {
    public final /* synthetic */ hnk1 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iok1(hnk1 hnk1Var, boolean z, boolean z2, float f, Function0 function0, Function0 function1, Function0 function2, int i) {
        super(2);
        this.a = hnk1Var;
        this.b = z;
        this.c = z2;
        this.d = f;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pok1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1));
        return rih1.a;
    }
}
