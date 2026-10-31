package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class snt0 implements pf40 {
    public static final snt0 a;
    private static final h661 descriptor;

    static {
        snt0 snt0Var = new snt0();
        a = snt0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.PlayMessage", snt0Var, 3);
        m0v0Var.j("mediaUri", true);
        m0v0Var.j("seekTime", true);
        m0v0Var.j("mediaQueue", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = vnt0.d;
        chc1 chc1Var = chc1.a;
        return new nma0[]{m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[2].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = vnt0.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
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
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new vnt0(i, str, str2, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vnt0 vnt0Var = (vnt0) obj;
        List list = vnt0Var.c;
        String str = vnt0Var.b;
        String str2 = vnt0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = vnt0.d;
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
