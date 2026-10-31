package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class umk0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;
    public final /* synthetic */ c9n c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ iu30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ umk0(res resVar, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = resVar;
        this.c = c9nVar;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = ven0Var3;
        this.g = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hmk0.a(this.b, this.c, this.d, this.e, this.f, this.g, qmk0.a);
                break;
            case 1:
                hmk0.a(this.b, this.c, this.d, this.e, this.f, this.g, pmk0.a);
                break;
            default:
                hmk0.a(this.b, this.c, this.d, this.e, this.f, this.g, lmk0.a);
                break;
        }
        return rih1Var;
    }
}
