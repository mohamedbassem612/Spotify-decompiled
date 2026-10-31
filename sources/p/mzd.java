package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mzd extends hab0 implements vu30 {
    public final /* synthetic */ j2i a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ xu30 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mzd(j2i j2iVar, Function0 function0, String str, qim0 qim0Var, int i, xu30 xu30Var, int i2, int i3) {
        super(2);
        this.a = j2iVar;
        this.b = function0;
        this.c = str;
        this.d = qim0Var;
        this.e = i;
        this.f = xu30Var;
        this.g = i2;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        lgo1.c(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
