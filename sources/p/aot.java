package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class aot implements pf40 {
    public static final aot a;
    private static final h661 descriptor;

    static {
        aot aotVar = new aot();
        a = aotVar;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.DetectedToken", aotVar, 3);
        m0v0Var.j("token", false);
        m0v0Var.j("discovery_method", false);
        m0v0Var.j("tags", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = cot.d;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, znb0VarArr[2].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = cot.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new cot(strF, i, map, strF2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        cot cotVar = (cot) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = cot.d;
        String str = cotVar.a;
        Map map = cotVar.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, cotVar.b);
        if (z1kVarB.d0() || !u890.j(map, b7x.a)) {
            z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
