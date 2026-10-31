package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class msh extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public msh(String str, String str2, String str3, Function0 function0, qim0 qim0Var, float f, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = function0;
        this.e = qim0Var;
        this.f = f;
        this.g = j2iVar;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        d9p1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1), this.i);
        return rih1.a;
    }
}
