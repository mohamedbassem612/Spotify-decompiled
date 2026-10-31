package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class mc90 implements pf40 {
    public static final mc90 a;
    private static final h661 descriptor;

    static {
        mc90 mc90Var = new mc90();
        a = mc90Var;
        m0v0 m0v0Var = new m0v0("com.spotify.blend.tastematch.api.group.InvitationResponse", mc90Var, 9);
        m0v0Var.j("page_type", false);
        m0v0Var.j("members", true);
        m0v0Var.j("recipient", true);
        m0v0Var.j("playlist_uri", true);
        m0v0Var.j("title", true);
        m0v0Var.j("subtitle", true);
        m0v0Var.j("members_title", true);
        m0v0Var.j("button_text", true);
        m0v0Var.j("footnote", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = pc90.j;
        chc1 chc1Var = chc1.a;
        return new nma0[]{znb0VarArr[0].getValue(), m5n1.z((nma0) znb0VarArr[1].getValue()), m5n1.z(n2b.a), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = pc90.j;
        x1kVarB.getClass();
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        dhr0 dhr0Var = null;
        List list = null;
        r2b r2bVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    dhr0Var = (dhr0) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), dhr0Var);
                    i |= 1;
                    break;
                case 1:
                    list = (List) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    r2bVar = (r2b) x1kVarB.B(h661Var, 2, n2b.a, r2bVar);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) x1kVarB.B(h661Var, 4, chc1.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) x1kVarB.B(h661Var, 5, chc1.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) x1kVarB.B(h661Var, 6, chc1.a, str6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) x1kVarB.B(h661Var, 7, chc1.a, str2);
                    i |= 128;
                    break;
                case 8:
                    str = (String) x1kVarB.B(h661Var, 8, chc1.a, str);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new pc90(i, dhr0Var, list, r2bVar, str3, str4, str5, str6, str2, str);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pc90 pc90Var = (pc90) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = pc90.j;
        z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), pc90Var.a);
        List list = pc90Var.b;
        if (list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        r2b r2bVar = pc90Var.c;
        if (r2bVar != null) {
            z1kVarB.s(h661Var, 2, n2b.a, r2bVar);
        }
        String str = pc90Var.d;
        if (str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        String str2 = pc90Var.e;
        if (str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        String str3 = pc90Var.f;
        if (str3 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str3);
        }
        String str4 = pc90Var.g;
        if (str4 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str4);
        }
        String str5 = pc90Var.h;
        if (str5 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str5);
        }
        String str6 = pc90Var.i;
        if (str6 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str6);
        }
        z1kVarB.a(h661Var);
    }
}
