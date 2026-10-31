package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gz80 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ hux c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz80(String str, long j, hux huxVar, long j2, Function0 function0, qim0 qim0Var, boolean z, float f, float f2, int i) {
        super(2);
        this.a = str;
        this.b = j;
        this.c = huxVar;
        this.d = j2;
        this.e = function0;
        this.f = qim0Var;
        this.g = z;
        this.h = f;
        this.i = f2;
        this.t = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nz80.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(this.t | 1));
        return rih1.a;
    }
}
