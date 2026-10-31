package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ltk1 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltk1(float f, String str, long j, iu30 iu30Var, Function0 function0, Function0 function1, qim0 qim0Var, boolean z, boolean z2, int i) {
        super(2);
        this.a = f;
        this.b = str;
        this.c = j;
        this.d = iu30Var;
        this.e = function0;
        this.f = function1;
        this.g = qim0Var;
        this.h = z;
        this.i = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        foo1.n(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP);
        return rih1.a;
    }
}
