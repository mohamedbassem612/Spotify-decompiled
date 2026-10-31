package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class maf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ naf1 b;
    public final /* synthetic */ i2c c;
    public final /* synthetic */ rk41 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ maf1(naf1 naf1Var, i2c i2cVar, rk41 rk41Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = naf1Var;
        this.c = i2cVar;
        this.d = rk41Var;
        this.e = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.d(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.d(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
