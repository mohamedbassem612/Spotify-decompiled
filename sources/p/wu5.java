package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class wu5 implements pf40 {
    public static final wu5 a;
    private static final h661 descriptor;

    static {
        wu5 wu5Var = new wu5();
        a = wu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Uris", wu5Var, 1);
        m0v0Var.j("uris", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z((nma0) yu5.c[0].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = yu5.c;
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
        return new yu5(i, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = yu5.c;
        List list = ((yu5) obj).b;
        if (list != null) {
            z1kVarB.s(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
