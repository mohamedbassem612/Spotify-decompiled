package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ct51 extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ Function0 O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ byte Q0;
    public final /* synthetic */ short R0;
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ qim0 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ c380 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ agv t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ct51(long j, long j2, long j3, long j4, iu30 iu30Var, c380 c380Var, boolean z, boolean z2, boolean z3, agv agvVar, Function0 function0, qim0 qim0Var, boolean z4, Function0 function1, Function0 function2, int i, int i2, int i3) {
        super(2);
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = iu30Var;
        this.f = c380Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.t = agvVar;
        this.X = function0;
        this.Y = qim0Var;
        this.Z = z4;
        this.N0 = function1;
        this.O0 = function2;
        this.P0 = i;
        this.Q0 = i2;
        this.R0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.P0 | 1);
        int iP2 = czo1.p(this.Q0);
        short s = this.R0;
        ft51.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
