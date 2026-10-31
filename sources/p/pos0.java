package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class pos0 implements pf40 {
    public static final pos0 a;
    private static final h661 descriptor;

    static {
        pos0 pos0Var = new pos0();
        a = pos0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.devicepredictability.internal.coordinator.impl.PersistedLog", pos0Var, 1);
        m0v0Var.j("presentedAtMsByCategoryId", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{ros0.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ros0.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), map);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new ros0(i, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        Map map = ((ros0) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = ros0.b;
        if (z1kVarB.d0() || !u890.j(map, b7x.a)) {
            z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), map);
        }
        z1kVarB.a(h661Var);
    }
}
