package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class kh90 implements pf40 {
    public static final kh90 a;
    private static final h661 descriptor;

    static {
        kh90 kh90Var = new kh90();
        a = kh90Var;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.preferences.Item.Group", kh90Var, 6);
        m0v0Var.j("type", false);
        m0v0Var.j("key", false);
        m0v0Var.j("name", false);
        m0v0Var.j("description", false);
        m0v0Var.j("showExpanded", false);
        m0v0Var.j("items", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = mh90.g;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, gpb.a, znb0VarArr[5].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = mh90.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    zM = x1kVarB.M(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) x1kVarB.A(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new mh90(i, strF, strF2, strF3, strF4, list, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mh90 mh90Var = (mh90) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = mh90.g;
        z1kVarB.G(h661Var, 0, mh90Var.a);
        z1kVarB.G(h661Var, 1, mh90Var.b);
        z1kVarB.G(h661Var, 2, mh90Var.c);
        z1kVarB.G(h661Var, 3, mh90Var.d);
        z1kVarB.E(h661Var, 4, mh90Var.e);
        z1kVarB.k(h661Var, 5, (nma0) znb0VarArr[5].getValue(), mh90Var.f);
        z1kVarB.a(h661Var);
    }
}
