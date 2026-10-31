package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g9p0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9p0(Function0 function0, qim0 qim0Var, boolean z, boolean z2) {
        super(2);
        this.b = qim0Var;
        this.c = z;
        this.d = function0;
        this.e = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                epo1.o(czo1.p(1), this.d, (b0k) obj, this.b, this.c, this.e);
                break;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    wro1.k(new gbx(z50.c, this.d), anm1.N("play_button", this.b), this.c ? jax.a : new hax("Disabled"), yla.s(x340Var2), (idn0) null, apo.r(1139927762, new k750((byte) 16, this.e), x340Var2), x340Var2, 196608, 16);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ixm1.b(czo1.p(385), this.d, (b0k) obj, this.b, this.c, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9p0(boolean z, qim0 qim0Var, boolean z2, Function0 function0, int i) {
        super(2);
        this.c = z;
        this.b = qim0Var;
        this.e = z2;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9p0(boolean z, boolean z2, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.c = z;
        this.e = z2;
        this.b = qim0Var;
        this.d = function0;
    }
}
