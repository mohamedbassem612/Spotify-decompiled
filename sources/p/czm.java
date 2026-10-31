package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class czm extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czm(long j, float f, iu30 iu30Var, qim0 qim0Var, float f2, boolean z, Function0 function0, Function0 function1, Function0 function2, int i) {
        super(2);
        this.a = j;
        this.b = f;
        this.c = iu30Var;
        this.d = qim0Var;
        this.e = f2;
        this.f = z;
        this.g = function0;
        this.h = function1;
        this.i = function2;
        this.t = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        who1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(this.t | 1));
        return rih1.a;
    }
}
