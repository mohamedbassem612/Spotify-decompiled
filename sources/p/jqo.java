package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jqo extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ rb71 b;
    public final /* synthetic */ yb71 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ ib71 f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqo(String str, rb71 rb71Var, yb71 yb71Var, long j, qim0 qim0Var, ib71 ib71Var, boolean z, int i) {
        super(2);
        this.a = str;
        this.b = rb71Var;
        this.c = yb71Var;
        this.d = j;
        this.e = qim0Var;
        this.f = ib71Var;
        this.g = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        eyo1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
        return rih1.a;
    }
}
