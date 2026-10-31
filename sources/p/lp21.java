package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class lp21 implements pf40 {
    public static final lp21 a;
    private static final h661 descriptor;

    static {
        lp21 lp21Var = new lp21();
        a = lp21Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.RequestQueue", lp21Var, 1);
        m0v0Var.j("pending_requests", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z((nma0) np21.b[0].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = np21.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new np21(i, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        List list = ((np21) obj).a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = np21.b;
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
