package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j2j1 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2j1(String str, String str2, qim0 qim0Var, lee1 lee1Var, long j, int i, Function0 function0, int i2) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = qim0Var;
        this.d = lee1Var;
        this.e = j;
        this.f = i;
        this.g = function0;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        c0p1.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1));
        return rih1.a;
    }
}
