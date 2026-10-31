package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qbf0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ Map O0;
    public final /* synthetic */ jj7 P0;
    public final /* synthetic */ boolean Q0;
    public final /* synthetic */ int R0;
    public final /* synthetic */ int S0;
    public final /* synthetic */ char T0;
    public final /* synthetic */ tl3 X;
    public final /* synthetic */ j6m Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ fcf0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ xc21 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ddf0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qbf0(fcf0 fcf0Var, Function0 function0, qim0 qim0Var, boolean z, boolean z2, boolean z3, xc21 xc21Var, boolean z4, ddf0 ddf0Var, tl3 tl3Var, j6m j6mVar, boolean z5, boolean z6, Map map, jj7 jj7Var, boolean z7, int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = fcf0Var;
        this.c = function0;
        this.d = qim0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = xc21Var;
        this.i = z4;
        this.t = ddf0Var;
        this.X = tl3Var;
        this.Y = j6mVar;
        this.Z = z5;
        this.N0 = z6;
        this.O0 = map;
        this.P0 = jj7Var;
        this.Q0 = z7;
        this.R0 = i;
        this.S0 = i2;
        this.T0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.S0;
        int i2 = this.R0;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i2 | 1);
                int iP2 = czo1.p(i);
                char c = this.T0;
                mp10.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, (b0k) obj, iP, iP2, c);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i2 | 1);
                int iP4 = czo1.p(i);
                char c2 = this.T0;
                mp10.e(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, (b0k) obj, iP3, iP4, c2);
                break;
        }
        return rih1Var;
    }
}
