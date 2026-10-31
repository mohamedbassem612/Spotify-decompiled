package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yoq0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yoq0(String str, String str2, long j, Function0 function0, qim0 qim0Var, boolean z, boolean z2, boolean z3, int i) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = function0;
        this.e = qim0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fn31.g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1));
        return rih1.a;
    }
}
