package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class j0d implements pf40 {
    public static final j0d a;
    private static final h661 descriptor;

    static {
        j0d j0dVar = new j0d();
        a = j0dVar;
        m0v0 m0v0Var = new m0v0("com.spotify.login.phonenumbersignup.callingcode.json.CallingCode", j0dVar, 3);
        m0v0Var.j("countryCode", false);
        m0v0Var.j("callingCode", false);
        m0v0Var.j("countryName", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
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
                strF3 = x1kVarB.f(h661Var, 2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new m0d(strF, strF2, i, strF3);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    public final void serialize(uax uaxVar, Object obj) {
        m0d m0dVar = (m0d) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = m0dVar.a;
        String str2 = m0dVar.c;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, m0dVar.b);
        if (z1kVarB.d0()) {
            z1kVarB.G(h661Var, 2, str2);
        } else {
            m0d.Companion.getClass();
            if (!u890.j(str2, new Locale("", str).getDisplayCountry())) {
                z1kVarB.G(h661Var, 2, str2);
            }
        }
        z1kVarB.a(h661Var);
    }
}
