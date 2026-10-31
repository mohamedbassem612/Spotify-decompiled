package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ywq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zwq0 b;
    public final /* synthetic */ i2c c;
    public final /* synthetic */ int d;
    public final /* synthetic */ rk41 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywq0(zwq0 zwq0Var, i2c i2cVar, int i, rk41 rk41Var, Function0 function0, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = zwq0Var;
        this.c = i2cVar;
        this.d = i;
        this.e = rk41Var;
        this.f = function0;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.d(this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.a(this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
