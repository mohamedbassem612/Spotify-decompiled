package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class f411 implements pf40 {
    public static final f411 a;
    private static final h661 descriptor;

    static {
        f411 f411Var = new f411();
        a = f411Var;
        m0v0 m0v0Var = new m0v0("com.spotify.assistedcuration.content.model.RecsContentRating", f411Var, 2);
        m0v0Var.j("country", false);
        m0v0Var.j("tag", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, h411.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = h411.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        List list = null;
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
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new h411(strF, list, i);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h411 h411Var = (h411) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = h411.c;
        z1kVarB.G(h661Var, 0, h411Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), h411Var.b);
        z1kVarB.a(h661Var);
    }
}
