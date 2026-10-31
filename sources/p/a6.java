package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class a6 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ a6(i6 i6Var, byte b) {
        this.a = b;
        this.b = i6Var;
    }

    public final Object invoke() {
        x4t x4tVar;
        byte b = this.a;
        i6 i6Var = this.b;
        switch (b) {
            case 0:
                ga80 ga80Var = (ga80) lcc.z(i6Var, da80.a);
                if (ga80Var == null) {
                    tf80.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + ga80Var);
                }
                ga80 ga80Var2 = i6Var.Y0;
                i6Var.Y0 = ga80Var;
                if (ga80Var2 != null && !u890.j(ga80Var, ga80Var2) && ((x4tVar = i6Var.b1) != null || !i6Var.i1)) {
                    if (x4tVar != null) {
                        i6Var.I1(x4tVar);
                    }
                    i6Var.b1 = null;
                    i6Var.R1();
                }
                return rih1.a;
            default:
                i6Var.V1();
                return Boolean.TRUE;
        }
    }
}
