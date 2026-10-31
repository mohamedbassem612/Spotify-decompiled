package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w0e1 extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0e1(int i, boolean z, float f, Function0 function0, Function0 function1, qim0 qim0Var, int i2) {
        super(2);
        this.a = i;
        this.b = z;
        this.c = f;
        this.d = function0;
        this.e = function1;
        this.f = qim0Var;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        i2p1.b(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1));
        return rih1.a;
    }
}
