package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h2g1 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2g1(Function0 function0, c380 c380Var, float f, float f2, float f3, int i) {
        super(2);
        this.a = function0;
        this.b = c380Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        k2g1.c(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP);
        return rih1.a;
    }
}
