package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rkd1 extends hab0 implements vu30 {
    public final /* synthetic */ hdk a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkd1(hdk hdkVar, iu30 iu30Var, long j, long j2, float f, boolean z, float f2, Function0 function0, int i) {
        super(2);
        this.a = hdkVar;
        this.b = iu30Var;
        this.c = j;
        this.d = j2;
        this.e = f;
        this.f = z;
        this.g = f2;
        this.h = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        vyo1.o(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
        return rih1.a;
    }
}
