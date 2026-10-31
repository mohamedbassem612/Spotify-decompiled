package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vcx extends hab0 implements vu30 {
    public final /* synthetic */ vzq0 N0;
    public final /* synthetic */ tl3 O0;
    public final /* synthetic */ xu30 P0;
    public final /* synthetic */ ga80 Q0;
    public final /* synthetic */ afx X;
    public final /* synthetic */ idn0 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ long a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ max d;
    public final /* synthetic */ gbx e;
    public final /* synthetic */ gbx f;
    public final /* synthetic */ hb5 g;
    public final /* synthetic */ hw61 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ pgx t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcx(long j, qim0 qim0Var, boolean z, max maxVar, gbx gbxVar, gbx gbxVar2, hb5 hb5Var, hw61 hw61Var, long j2, pgx pgxVar, afx afxVar, idn0 idn0Var, boolean z2, vzq0 vzq0Var, tl3 tl3Var, xu30 xu30Var, ga80 ga80Var) {
        super(2);
        this.a = j;
        this.b = qim0Var;
        this.c = z;
        this.d = maxVar;
        this.e = gbxVar;
        this.f = gbxVar2;
        this.g = hb5Var;
        this.h = hw61Var;
        this.i = j2;
        this.t = pgxVar;
        this.X = afxVar;
        this.Y = idn0Var;
        this.Z = z2;
        this.N0 = vzq0Var;
        this.O0 = tl3Var;
        this.P0 = xu30Var;
        this.Q0 = ga80Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        b0k b0kVar = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var = (x340) b0kVar;
        if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            b3o1.e(this.a, apo.r(-426322901, new ucx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        return rih1.a;
    }
}
