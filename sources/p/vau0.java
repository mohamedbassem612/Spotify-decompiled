package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class vau0 implements pf40 {
    public static final vau0 a;
    private static final h661 descriptor;

    static {
        vau0 vau0Var = new vau0();
        a = vau0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.contextplayercoordinatorimpl.model.PlayerError", vau0Var, 2);
        m0v0Var.j("type", false);
        m0v0Var.j("data", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, xau0.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xau0.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), map);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new xau0(strF, i, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xau0 xau0Var = (xau0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = xau0.c;
        z1kVarB.G(h661Var, 0, xau0Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), xau0Var.b);
        z1kVarB.a(h661Var);
    }
}
