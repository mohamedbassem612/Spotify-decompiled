package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m77 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b87 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ xtb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m77(b87 b87Var, int i, boolean z, Function0 function0, xtb0 xtb0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = b87Var;
        this.c = i;
        this.d = z;
        this.e = function0;
        this.f = xtb0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                xtb0 xtb0Var = this.f;
                int iP = czo1.p(1);
                this.b.g(this.c, this.d, this.e, xtb0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                xtb0 xtb0Var2 = this.f;
                int iP2 = czo1.p(1);
                this.b.g(this.c, this.d, this.e, xtb0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
