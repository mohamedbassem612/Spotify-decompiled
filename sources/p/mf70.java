package p;

import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class mf70 implements pf40 {
    public static final mf70 a;
    private static final h661 descriptor;

    static {
        mf70 mf70Var = new mf70();
        a = mf70Var;
        m0v0 m0v0Var = new m0v0("com.spotify.externalintegration.http.HydrogenItem", mf70Var, 6);
        m0v0Var.j("spotify_uri", false);
        m0v0Var.j("title", false);
        m0v0Var.j("subtitle", false);
        m0v0Var.j("image", false);
        m0v0Var.j("enhancing_attributes", true);
        m0v0Var.j("context_uri", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = of70.h;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, znb0VarArr[2].getValue(), jf70.a, m5n1.z(df70.a), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = of70.h;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        List list = null;
        lf70 lf70Var = null;
        ff70 ff70Var = null;
        String str = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
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
                    list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    lf70Var = (lf70) x1kVarB.A(h661Var, 3, jf70.a, lf70Var);
                    i |= 8;
                    break;
                case 4:
                    ff70Var = (ff70) x1kVarB.B(h661Var, 4, df70.a, ff70Var);
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
        return new of70(i, strF, strF2, list, lf70Var, ff70Var, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        of70 of70Var = (of70) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = of70.h;
        String str = of70Var.a;
        String str2 = of70Var.f;
        ff70 ff70Var = of70Var.e;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, of70Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), of70Var.c);
        z1kVarB.k(h661Var, 3, jf70.a, of70Var.d);
        if (z1kVarB.d0() || ff70Var != null) {
            z1kVarB.s(h661Var, 4, df70.a, ff70Var);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
