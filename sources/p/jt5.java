package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class jt5 implements pf40 {
    public static final jt5 a;
    private static final h661 descriptor;

    static {
        jt5 jt5Var = new jt5();
        a = jt5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.SessionState", jt5Var, 4);
        m0v0Var.j("is_offline", true);
        m0v0Var.j("is_in_forced_offline_mode", true);
        m0v0Var.j("is_logged_in", true);
        m0v0Var.j("connection_type", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(chc1.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                bool = (Boolean) x1kVarB.B(h661Var, 0, gpb.a, bool);
                i |= 1;
            } else if (iP == 1) {
                bool2 = (Boolean) x1kVarB.B(h661Var, 1, gpb.a, bool2);
                i |= 2;
            } else if (iP == 2) {
                bool3 = (Boolean) x1kVarB.B(h661Var, 2, gpb.a, bool3);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str = (String) x1kVarB.B(h661Var, 3, chc1.a, str);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        lt5 lt5Var = new lt5();
        if ((i & 1) == 0) {
            lt5Var.b = null;
        } else {
            lt5Var.b = bool;
        }
        if ((i & 2) == 0) {
            lt5Var.c = null;
        } else {
            lt5Var.c = bool2;
        }
        if ((i & 4) == 0) {
            lt5Var.d = null;
        } else {
            lt5Var.d = bool3;
        }
        if ((i & 8) == 0) {
            lt5Var.e = null;
            return lt5Var;
        }
        lt5Var.e = str;
        return lt5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lt5 lt5Var = (lt5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        Boolean bool = lt5Var.b;
        if (bool != null) {
            z1kVarB.s(h661Var, 0, gpb.a, bool);
        }
        Boolean bool2 = lt5Var.c;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 1, gpb.a, bool2);
        }
        Boolean bool3 = lt5Var.d;
        if (bool3 != null) {
            z1kVarB.s(h661Var, 2, gpb.a, bool3);
        }
        String str = lt5Var.e;
        if (str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
