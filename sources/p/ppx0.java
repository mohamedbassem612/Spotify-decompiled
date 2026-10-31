package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ppx0 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppx0(Function0 function0, boolean z, qim0 qim0Var, int i, int i2, int i3) {
        super(2);
        this.a = function0;
        this.b = z;
        this.c = qim0Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bqn1.j(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1));
        return rih1.a;
    }
}
