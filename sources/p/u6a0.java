package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u6a0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6a0 b;
    public final /* synthetic */ djq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6a0(z6a0 z6a0Var, djq0 djq0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z6a0Var;
        this.c = djq0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        djq0 djq0Var = this.c;
        z6a0 z6a0Var = this.b;
        switch (b) {
            case 0:
                s6a0 s6a0VarB = z6a0Var.b(z6a0Var.c());
                z6a0Var.g.add(djq0Var);
                return s6a0VarB;
            default:
                s6a0 s6a0VarB2 = z6a0Var.b(z6a0Var.c());
                r7h.Z(z6a0Var.g, new hu90(djq0Var, (byte) 11), true);
                return s6a0VarB2;
        }
    }
}
