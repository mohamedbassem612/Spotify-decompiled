package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vb9 extends hab0 implements vu30 {
    public final /* synthetic */ phx a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ hcx d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb9(phx phxVar, Function0 function0, boolean z, hcx hcxVar, float f, float f2, float f3, int i) {
        super(2);
        this.a = phxVar;
        this.b = function0;
        this.c = z;
        this.d = hcxVar;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        n1p1.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1));
        return rih1.a;
    }
}
