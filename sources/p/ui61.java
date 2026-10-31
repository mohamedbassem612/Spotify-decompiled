package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ui61 implements pf40 {
    public static final ui61 a;
    private static final h661 descriptor;

    static {
        ui61 ui61Var = new ui61();
        a = ui61Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.SessionUserCapabilities", ui61Var, 4);
        m0v0Var.j("invite", true);
        m0v0Var.j("remove_participants", true);
        m0v0Var.j("manage_participant_settings", true);
        m0v0Var.j("ask_to_upgrade", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        gpb gpbVar = gpb.a;
        return new nma0[]{gpbVar, gpbVar, gpbVar, gpbVar};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                zM = x1kVarB.M(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                zM2 = x1kVarB.M(h661Var, 1);
                i |= 2;
            } else if (iP == 2) {
                zM3 = x1kVarB.M(h661Var, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                zM4 = x1kVarB.M(h661Var, 3);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new wi61(i, zM, zM2, zM3, zM4);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        wi61 wi61Var = (wi61) obj;
        boolean z = wi61Var.d;
        boolean z2 = wi61Var.c;
        boolean z3 = wi61Var.b;
        boolean z4 = wi61Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || z4) {
            z1kVarB.E(h661Var, 0, z4);
        }
        if (z1kVarB.d0() || z3) {
            z1kVarB.E(h661Var, 1, z3);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 2, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 3, z);
        }
        z1kVarB.a(h661Var);
    }
}
