package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jdm extends hab0 implements vu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ max d;
    public final /* synthetic */ String e;
    public final /* synthetic */ gdx f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jdm(Function0 function0, qim0 qim0Var, long j, max maxVar, String str, gdx gdxVar, int i, int i2) {
        super(2);
        this.a = function0;
        this.b = qim0Var;
        this.c = j;
        this.d = maxVar;
        this.e = str;
        this.f = gdxVar;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.g;
        xyn1.c(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP, b);
        return rih1.a;
    }
}
