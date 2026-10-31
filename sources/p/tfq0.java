package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tfq0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tfq0(String str, Function0 function0, long j, lee1 lee1Var, boolean z, int i, int i2) {
        super(2);
        this.a = str;
        this.b = function0;
        this.c = j;
        this.d = lee1Var;
        this.e = z;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.f;
        crm0.q(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP, b);
        return rih1.a;
    }
}
