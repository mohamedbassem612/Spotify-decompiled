package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class evg0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ evg0(ivg0 ivg0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ivg0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ivg0 ivg0Var = this.b;
        switch (b) {
            case 0:
                mwg0 mwg0Var = ivg0Var.n;
                if (mwg0Var == null) {
                    u890.C("viewBinder");
                    throw null;
                }
                dg30 dg30VarF0 = mwg0Var.f0();
                if (dg30VarF0 != null) {
                    dg30VarF0.finish();
                }
                return rih1Var;
            case 1:
                mwg0 mwg0Var2 = ivg0Var.n;
                if (mwg0Var2 == null) {
                    u890.C("viewBinder");
                    throw null;
                }
                dg30 dg30VarF1 = mwg0Var2.f0();
                if (dg30VarF1 != null) {
                    dg30VarF1.finish();
                }
                return rih1Var;
            default:
                mwg0 mwg0Var3 = ivg0Var.n;
                if (mwg0Var3 == null) {
                    u890.C("viewBinder");
                    throw null;
                }
                dg30 dg30VarF2 = mwg0Var3.f0();
                if (dg30VarF2 != null) {
                    dg30VarF2.finish();
                }
                return rih1Var;
        }
    }
}
