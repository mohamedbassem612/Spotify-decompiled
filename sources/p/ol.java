package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ol extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ max e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ short g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ol(String str, String str2, qim0 qim0Var, String str3, max maxVar, Function0 function0, int i, int i2) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = qim0Var;
        this.d = str3;
        this.e = maxVar;
        this.f = function0;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        gxo1.a(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
