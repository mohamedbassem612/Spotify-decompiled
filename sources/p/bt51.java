package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bt51 extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ps51 e;
    public final /* synthetic */ agv f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt51(long j, long j2, long j3, long j4, ps51 ps51Var, agv agvVar, Function0 function0, int i) {
        super(2);
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = ps51Var;
        this.f = agvVar;
        this.g = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ft51.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
        return rih1.a;
    }
}
