package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class lqn implements pf40 {
    public static final lqn a;
    private static final h661 descriptor;

    static {
        lqn lqnVar = new lqn();
        a = lqnVar;
        m0v0 m0v0Var = new m0v0("com.spotify.radio.radio.model.CreateRadioStationModel", lqnVar, 3);
        m0v0Var.j("seeds", false);
        m0v0Var.j("title", true);
        m0v0Var.j("imageUri", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{nqn.d[0].getValue(), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = nqn.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new nqn(i, str, str2, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        nqn nqnVar = (nqn) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) nqn.d[0].getValue(), nqnVar.a);
        String str = nqnVar.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str2 = nqnVar.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
