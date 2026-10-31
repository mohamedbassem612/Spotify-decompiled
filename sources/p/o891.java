package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o891 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ r891 e;
    public final /* synthetic */ bke1 f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o891(Function0 function0, qim0 qim0Var, vu30 vu30Var, vu30 vu30Var2, r891 r891Var, bke1 bke1Var, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = function0;
        this.b = qim0Var;
        this.c = vu30Var;
        this.d = vu30Var2;
        this.e = r891Var;
        this.f = bke1Var;
        this.g = j2iVar;
        this.h = i;
        this.i = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        j82.s(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}
