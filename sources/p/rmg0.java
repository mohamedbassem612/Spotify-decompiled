package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rmg0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yae1 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rmg0(String str, int i, int i2, yae1 yae1Var, Function0 function0, boolean z, int i3, int i4) {
        super(2);
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = yae1Var;
        this.e = function0;
        this.f = z;
        this.g = i3;
        this.h = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        rrn1.u(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
