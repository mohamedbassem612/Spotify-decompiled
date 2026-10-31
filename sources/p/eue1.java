package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eue1 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eue1(float f, float f2, Function0 function0, iu30 iu30Var, Function0 function1, float f3, qim0 qim0Var, int i) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = function0;
        this.d = iu30Var;
        this.e = function1;
        this.f = f3;
        this.g = qim0Var;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dro.k(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1));
        return rih1.a;
    }
}
