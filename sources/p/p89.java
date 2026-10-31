package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class p89 implements pf40 {
    public static final p89 a;
    private static final h661 descriptor;

    static {
        p89 p89Var = new p89();
        a = p89Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.AvailableJam", p89Var, 4);
        m0v0Var.j("join_token", false);
        m0v0Var.j("available_members", true);
        m0v0Var.j("playback_device_info", true);
        m0v0Var.j("capabilities", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{tea0.a, r89.e[1].getValue(), m5n1.z(rd61.a), s89.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = r89.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        vea0 vea0Var = null;
        List list = null;
        td61 td61Var = null;
        u89 u89Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                vea0Var = (vea0) x1kVarB.A(h661Var, 0, tea0.a, vea0Var);
                i |= 1;
            } else if (iP == 1) {
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            } else if (iP == 2) {
                td61Var = (td61) x1kVarB.B(h661Var, 2, rd61.a, td61Var);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                u89Var = (u89) x1kVarB.A(h661Var, 3, s89.a, u89Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new r89(i, vea0Var, list, td61Var, u89Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        r89 r89Var = (r89) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = r89.e;
        tea0 tea0Var = tea0.a;
        vea0 vea0Var = r89Var.a;
        u89 u89Var = r89Var.d;
        td61 td61Var = r89Var.c;
        List list = r89Var.b;
        z1kVarB.k(h661Var, 0, tea0Var, vea0Var);
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        if (z1kVarB.d0() || td61Var != null) {
            z1kVarB.s(h661Var, 2, rd61.a, td61Var);
        }
        if (z1kVarB.d0() || !u890.j(u89Var, new u89())) {
            z1kVarB.k(h661Var, 3, s89.a, u89Var);
        }
        z1kVarB.a(h661Var);
    }
}
