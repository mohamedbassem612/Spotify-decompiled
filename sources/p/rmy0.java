package p;

import com.comscore.streaming.State;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class rmy0 implements pf40 {
    public static final rmy0 a;
    private static final h661 descriptor;

    static {
        rmy0 rmy0Var = new rmy0();
        a = rmy0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.login.credentialmanager.passkeys.PublicKeyCredentialCreationOptions", rmy0Var, 8);
        m0v0Var.j("rp", false);
        m0v0Var.j("user", false);
        m0v0Var.j("challenge", false);
        m0v0Var.j("pubKeyCredParams", false);
        m0v0Var.j("excludeCredentials", true);
        m0v0Var.j("authenticatorSelection", true);
        m0v0Var.j("attestation", true);
        m0v0Var.j("timeout", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = tmy0.i;
        chc1 chc1Var = chc1.a;
        return new nma0[]{dny0.a, hny0.a, chc1Var, znb0VarArr[3].getValue(), m5n1.z((nma0) znb0VarArr[4].getValue()), m5n1.z(em8.a), m5n1.z(chc1Var), o5f0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = tmy0.i;
        x1kVarB.getClass();
        Object obj = null;
        int i = 0;
        fny0 fny0Var = null;
        jny0 jny0Var = null;
        String strF = null;
        List list = null;
        List list2 = null;
        gm8 gm8Var = null;
        long jI0 = 0;
        boolean z = true;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    fny0Var = (fny0) x1kVarB.A(h661Var, 0, dny0.a, fny0Var);
                    i |= 1;
                    break;
                case 1:
                    jny0Var = (jny0) x1kVarB.A(h661Var, 1, hny0.a, jny0Var);
                    i |= 2;
                    break;
                case 2:
                    strF = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) x1kVarB.B(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    gm8Var = (gm8) x1kVarB.B(h661Var, 5, em8.a, gm8Var);
                    i |= 32;
                    break;
                case 6:
                    str = (String) x1kVarB.B(h661Var, 6, chc1.a, str);
                    i |= 64;
                    break;
                case 7:
                    jI0 = x1kVarB.i0(h661Var, 7);
                    i |= 128;
                    continue;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new tmy0(i, fny0Var, jny0Var, strF, list, list2, gm8Var, str, jI0);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        tmy0 tmy0Var = (tmy0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = tmy0.i;
        dny0 dny0Var = dny0.a;
        fny0 fny0Var = tmy0Var.a;
        String str = tmy0Var.g;
        gm8 gm8Var = tmy0Var.f;
        List list = tmy0Var.e;
        z1kVarB.k(h661Var, 0, dny0Var, fny0Var);
        z1kVarB.k(h661Var, 1, hny0.a, tmy0Var.b);
        z1kVarB.G(h661Var, 2, tmy0Var.c);
        z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), tmy0Var.d);
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 4, (nma0) znb0VarArr[4].getValue(), list);
        }
        if (z1kVarB.d0() || gm8Var != null) {
            z1kVarB.s(h661Var, 5, em8.a, gm8Var);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str);
        }
        z1kVarB.l(h661Var, 7, tmy0Var.h);
        z1kVarB.a(h661Var);
    }
}
