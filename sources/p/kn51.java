package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class kn51 implements pf40 {
    public static final kn51 a;
    private static final h661 descriptor;

    static {
        kn51 kn51Var = new kn51();
        a = kn51Var;
        m0v0 m0v0Var = new m0v0("com.spotify.betamax.playerimpl.exo.model.SeekPanels", kn51Var, 3);
        m0v0Var.j("base_urls", false);
        m0v0Var.j("templates", false);
        m0v0Var.j("variants", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = mn51.d;
        return new nma0[]{znb0VarArr[0].getValue(), znb0VarArr[1].getValue(), znb0VarArr[2].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = mn51.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else if (iP == 1) {
                list2 = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list2);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list3 = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list3);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new mn51(i, list, list2, list3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mn51 mn51Var = (mn51) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = mn51.d;
        z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), mn51Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), mn51Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), mn51Var.c);
        z1kVarB.a(h661Var);
    }
}
