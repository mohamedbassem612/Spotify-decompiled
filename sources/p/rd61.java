package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rd61 implements pf40 {
    public static final rd61 a;
    private static final h661 descriptor;

    static {
        rd61 rd61Var = new rd61();
        a = rd61Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.SessionDeviceInfo", rd61Var, 5);
        m0v0Var.j("device_id", true);
        m0v0Var.j("output_device_info", true);
        m0v0Var.j("device_name", true);
        m0v0Var.j("device_type", true);
        m0v0Var.j("is_group", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(cuq0.a), m5n1.z(chc1Var), m5n1.z(chc1Var), gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        String str = null;
        euq0 euq0Var = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                euq0Var = (euq0) x1kVarB.B(h661Var, 1, cuq0.a, euq0Var);
                i |= 2;
            } else if (iP == 2) {
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            } else if (iP == 3) {
                str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                i |= 8;
            } else {
                if (iP != 4) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 4);
                i |= 16;
            }
        }
        x1kVarB.a(h661Var);
        return new td61(i, str, euq0Var, str2, str3, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        td61 td61Var = (td61) obj;
        boolean z = td61Var.e;
        String str = td61Var.d;
        String str2 = td61Var.c;
        euq0 euq0Var = td61Var.b;
        String str3 = td61Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str3);
        }
        if (z1kVarB.d0() || euq0Var != null) {
            z1kVarB.s(h661Var, 1, cuq0.a, euq0Var);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 4, z);
        }
        z1kVarB.a(h661Var);
    }
}
