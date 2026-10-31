package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yt6 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ vy71 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yt6(c9n c9nVar, vy71 vy71Var, Function0 function0, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = c9nVar;
        this.c = vy71Var;
        this.d = function0;
        this.e = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.e;
        Function0 function0 = this.d;
        vy71 vy71Var = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case 0:
                fn31.T(c9nVar, (o8n) null, 0, new g(vy71Var, (lnm) null, (byte) 3), 3).L(new xt6(vy71Var, function0, ven0Var, (byte) 0));
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new g(vy71Var, (lnm) null, (byte) 20), 3).L(new xt6(vy71Var, function0, ven0Var, (byte) 1));
                break;
        }
        return rih1Var;
    }
}
