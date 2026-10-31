package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class enl1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fnl1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enl1(fnl1 fnl1Var, byte b) {
        super(0);
        this.a = b;
        this.b = fnl1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fnl1 fnl1Var = this.b;
        switch (b) {
            case 0:
                inl1 inl1VarA = fnl1Var.a();
                if (inl1VarA.i != 0) {
                    inl1VarA.i = 0;
                    inl1VarA.h();
                }
                fnl1Var.b.u0(0);
                return rih1Var;
            case 1:
                int iE = fnl1Var.a().e() - 1;
                inl1 inl1VarA2 = fnl1Var.a();
                if (inl1VarA2.i != iE) {
                    inl1VarA2.i = iE;
                    inl1VarA2.h();
                }
                fnl1Var.b.u0(iE);
                return rih1Var;
            default:
                return fnl1Var.b.getAdapter();
        }
    }
}
