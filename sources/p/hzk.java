package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hzk extends hab0 implements vu30 {
    public final /* synthetic */ j2i a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ u7h f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ short h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hzk(j2i j2iVar, String str, String str2, Function0 function0, qim0 qim0Var, u7h u7hVar, boolean z, int i, int i2) {
        super(2);
        this.a = j2iVar;
        this.b = str;
        this.c = str2;
        this.d = function0;
        this.e = qim0Var;
        this.f = u7hVar;
        this.g = z;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(3079);
        short s = this.h;
        x2g0.r(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, s);
        return rih1.a;
    }
}
