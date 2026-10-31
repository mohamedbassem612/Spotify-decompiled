package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class xvt implements pf40 {
    public static final xvt a;
    private static final h661 descriptor;

    static {
        xvt xvtVar = new xvt();
        a = xvtVar;
        m0v0 m0v0Var = new m0v0("com.spotify.puffin.core.data.DeviceResponse", xvtVar, 6);
        m0v0Var.j("id", false);
        m0v0Var.j("brand", false);
        m0v0Var.j("model", false);
        m0v0Var.j("deviceName", false);
        m0v0Var.j("modelNumbers", true);
        m0v0Var.j("releaseYear", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = zvt.g;
        nma0 nma0Var = chc1.a;
        return new nma0[]{nma0Var, nma0Var, nma0Var, nma0Var, m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z(nma0Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = zvt.g;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String str = null;
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
                    list = (List) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str = (String) x1kVarB.B(h661Var, 5, chc1.a, str);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new zvt(i, strF, strF2, strF3, strF4, str, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zvt zvtVar = (zvt) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = zvt.g;
        z1kVarB.G(h661Var, 0, zvtVar.a);
        z1kVarB.G(h661Var, 1, zvtVar.b);
        z1kVarB.G(h661Var, 2, zvtVar.c);
        z1kVarB.G(h661Var, 3, zvtVar.d);
        List list = zvtVar.e;
        if (list != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
        }
        String str = zvtVar.f;
        if (str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
