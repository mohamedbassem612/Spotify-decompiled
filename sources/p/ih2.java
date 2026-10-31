package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ih2 extends hab0 implements vu30 {
    public final /* synthetic */ zg2 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ih2(zg2 zg2Var, iu30 iu30Var, qim0 qim0Var, Function0 function0, Function0 function1, int i, int i2) {
        super(2);
        this.a = zg2Var;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = function0;
        this.e = function1;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j82.a(this.a, this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(this.f | 1), this.g);
        return rih1.a;
    }
}
