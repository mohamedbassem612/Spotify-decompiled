package p;

import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class i0b0 implements pf40 {
    public static final i0b0 a;
    private static final h661 descriptor;

    static {
        i0b0 i0b0Var = new i0b0();
        a = i0b0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.genalphagraduation.graduationimpl.KidsGraduationInfoJsonAdapter.AccessTokenJson", i0b0Var, 3);
        m0v0Var.j("type", false);
        m0v0Var.j("token", false);
        m0v0Var.j("expiresAt", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, ee31.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        Date date = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else if (iP == 1) {
                strF2 = x1kVarB.f(h661Var, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                date = (Date) x1kVarB.A(h661Var, 2, ee31.a, date);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new k0b0(i, strF, strF2, date);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        k0b0 k0b0Var = (k0b0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, k0b0Var.a);
        z1kVarB.G(h661Var, 1, k0b0Var.b);
        z1kVarB.k(h661Var, 2, ee31.a, k0b0Var.c);
        z1kVarB.a(h661Var);
    }
}
