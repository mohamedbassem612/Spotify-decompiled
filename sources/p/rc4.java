package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class rc4 implements pf40 {
    public static final rc4 a;
    private static final h661 descriptor;

    static {
        rc4 rc4Var = new rc4();
        a = rc4Var;
        m0v0 m0v0Var = new m0v0("com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.data.AndroidDenylist", rc4Var, 2);
        m0v0Var.j("package_names", false);
        m0v0Var.j("app_signatures", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = tc4.c;
        return new nma0[]{znb0VarArr[0].getValue(), znb0VarArr[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = tc4.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Set set = null;
        Set set2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                set = (Set) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), set);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                set2 = (Set) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), set2);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new tc4(i, set, set2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        tc4 tc4Var = (tc4) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = tc4.c;
        z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), tc4Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), tc4Var.b);
        z1kVarB.a(h661Var);
    }
}
