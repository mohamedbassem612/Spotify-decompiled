package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nz0 extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz0(long j, long j2, iu30 iu30Var, Function0 function0, boolean z, int i) {
        super(2);
        this.a = j;
        this.b = j2;
        this.c = iu30Var;
        this.d = function0;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        q3p1.i(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP);
        return rih1.a;
    }
}
