package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tvg0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ djc0 g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tvg0(String str, String str2, boolean z, long j, Function0 function0, qim0 qim0Var, djc0 djc0Var, int i, int i2) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = j;
        this.e = function0;
        this.f = qim0Var;
        this.g = djc0Var;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.h;
        uvg0.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, b);
        return rih1.a;
    }
}
