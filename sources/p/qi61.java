package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class qi61 implements pf40 {
    public static final qi61 a;
    private static final h661 descriptor;

    static {
        qi61 qi61Var = new qi61();
        a = qi61Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.SessionUpdate", qi61Var, 3);
        m0v0Var.j("session", true);
        m0v0Var.j("reason", true);
        m0v0Var.j("update_session_members", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(y961.a), m5n1.z(chc1.a), m5n1.z((nma0) si61.e[2].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = si61.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        ga61 ga61Var = null;
        String str = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                ga61Var = (ga61) x1kVarB.B(h661Var, 0, y961.a, ga61Var);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new si61(i, ga61Var, str, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        si61 si61Var = (si61) obj;
        List list = si61Var.c;
        String str = si61Var.b;
        ga61 ga61Var = si61Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = si61.e;
        if (z1kVarB.d0() || ga61Var != null) {
            z1kVarB.s(h661Var, 0, y961.a, ga61Var);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
