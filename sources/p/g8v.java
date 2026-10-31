package p;

import app.p000rive.semantics.SemanticState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class g8v {
    public static final pxg1 a = new pxg1(SemanticState.Hidden, (dlv) null, 6);

    public static final n8v a(b0k b0kVar) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        byte b = 23;
        if (objT == obj) {
            objT = new u1c((byte) 23);
            x340Var.s0(objT);
        }
        final iu30 iu30Var = (iu30) objT;
        final byte b2 = 0;
        Object[] objArr = new Object[0];
        df41 df41Var = new df41(new dqc(iu30Var, (byte) 1), new n75(b));
        boolean zG = ((x340) b0kVar).g(iu30Var);
        x340 x340Var2 = (x340) b0kVar;
        Object objT2 = x340Var2.T();
        if (zG || objT2 == obj) {
            objT2 = new Function0() { // from class: p.f8v
                public final Object invoke() {
                    byte b3 = b2;
                    iu30 iu30Var2 = iu30Var;
                    switch (b3) {
                        case 0:
                            return new n8v(o8v.a, iu30Var2);
                        default:
                            iu30Var2.invoke(Boolean.FALSE);
                            return rih1.a;
                    }
                }
            };
            x340Var2.s0(objT2);
        }
        return (n8v) k5p1.u(objArr, df41Var, (Function0) objT2, x340Var2, 0);
    }
}
