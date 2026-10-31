package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class dt5 implements pf40 {
    public static final dt5 a;
    private static final h661 descriptor;

    static {
        dt5 dt5Var = new dt5();
        a = dt5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Saved", dt5Var, 4);
        m0v0Var.j("uri", true);
        m0v0Var.j("id", true);
        m0v0Var.j("saved", true);
        m0v0Var.j("can_save", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(chc1Var);
        nma0 nma0VarZ2 = m5n1.z(chc1Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, m5n1.z(gpbVar), m5n1.z(gpbVar)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                i |= 2;
            } else if (iP == 2) {
                bool = (Boolean) x1kVarB.B(h661Var, 2, gpb.a, bool);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                bool2 = (Boolean) x1kVarB.B(h661Var, 3, gpb.a, bool2);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        ft5 ft5Var = new ft5();
        if ((i & 1) == 0) {
            ft5Var.b = null;
        } else {
            ft5Var.b = str;
        }
        if ((i & 2) == 0) {
            ft5Var.c = null;
        } else {
            ft5Var.c = str2;
        }
        if ((i & 4) == 0) {
            ft5Var.d = null;
        } else {
            ft5Var.d = bool;
        }
        if ((i & 8) == 0) {
            ft5Var.e = null;
            return ft5Var;
        }
        ft5Var.e = bool2;
        return ft5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ft5 ft5Var = (ft5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = ft5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = ft5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        Boolean bool = ft5Var.d;
        if (bool != null) {
            z1kVarB.s(h661Var, 2, gpb.a, bool);
        }
        Boolean bool2 = ft5Var.e;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 3, gpb.a, bool2);
        }
        z1kVarB.a(h661Var);
    }
}
