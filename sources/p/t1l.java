package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t1l extends hab0 implements vu30 {
    public final /* synthetic */ c2l a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1l(c2l c2lVar, Function0 function0, int i, qim0 qim0Var, float f, float f2, boolean z, boolean z2, boolean z3, String str, int i2) {
        super(2);
        this.a = c2lVar;
        this.b = function0;
        this.c = i;
        this.d = qim0Var;
        this.e = f;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        rqt0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP);
        return rih1.a;
    }
}
