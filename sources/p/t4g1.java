package p;

import java.util.function.BiFunction;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t4g1 implements BiFunction {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ v4g1 b;
    public final /* synthetic */ p811 c;
    public final /* synthetic */ p811 d;

    public t4g1(iu30 iu30Var, v4g1 v4g1Var, p811 p811Var, p811 p811Var2) {
        this.a = iu30Var;
        this.b = v4g1Var;
        this.c = p811Var;
        this.d = p811Var2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        gxc gxcVar = (gxc) obj2;
        r4g1 r4g1Var = (r4g1) this.a.invoke(gxcVar);
        if (r4g1Var instanceof n4g1) {
            mxc mxcVar = gxcVar.b;
            if (!mxcVar.h) {
                mxcVar.i = (n4g1) r4g1Var;
                return gxcVar;
            }
        }
        if (r4g1Var != null) {
            v4g1 v4g1Var = this.b;
            v4g1Var.getClass();
            boolean z = r4g1Var instanceof q4g1;
            if (z) {
                eg.m("For Started event use dispatchInitialTrafficEvent");
                return null;
            }
            if (!gxcVar.c) {
                v4g1Var.g.a(r4g1Var);
            }
            if (!z && !(r4g1Var instanceof k4g1) && !(r4g1Var instanceof l4g1) && !(r4g1Var instanceof o4g1) && !(r4g1Var instanceof p4g1)) {
                if (!(r4g1Var instanceof m4g1) && !(r4g1Var instanceof n4g1)) {
                    eg.o();
                    return null;
                }
                this.c.a = r4g1Var;
                this.d.a = gxcVar;
                return null;
            }
        }
        return gxcVar;
    }
}
