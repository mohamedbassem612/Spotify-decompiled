package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yhx extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ xtb0 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ short f;
    public final /* synthetic */ long g;
    public final /* synthetic */ byte h;
    public final /* synthetic */ j2i i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yhx(xtb0 xtb0Var, qim0 qim0Var, boolean z, float f, float f2, int i, long j, int i2, j2i j2iVar, Function0 function0, int i3) {
        super(2);
        this.a = xtb0Var;
        this.b = qim0Var;
        this.c = z;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = j;
        this.h = i2;
        this.i = j2iVar;
        this.t = function0;
        this.X = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        iro1.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1));
        return rih1.a;
    }
}
