package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class zoe1 implements pf40 {
    public static final zoe1 a;
    private static final h661 descriptor;

    static {
        zoe1 zoe1Var = new zoe1();
        a = zoe1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse", zoe1Var, 4);
        m0v0Var.j("entityStatus", false);
        m0v0Var.j("cacheControl", false);
        m0v0Var.j("timeSyncedText", false);
        m0v0Var.j("timeSyncedTextMetadata", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{epe1.a, ape1.a, ppe1.e[2].getValue(), kpe1.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ppe1.e;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        gpe1 gpe1Var = null;
        cpe1 cpe1Var = null;
        List list = null;
        mpe1 mpe1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                gpe1Var = (gpe1) x1kVarB.A(h661Var, 0, epe1.a, gpe1Var);
                i |= 1;
            } else if (iP == 1) {
                cpe1Var = (cpe1) x1kVarB.A(h661Var, 1, ape1.a, cpe1Var);
                i |= 2;
            } else if (iP == 2) {
                list = (List) x1kVarB.A(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                mpe1Var = (mpe1) x1kVarB.A(h661Var, 3, kpe1.a, mpe1Var);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new ppe1(i, gpe1Var, cpe1Var, list, mpe1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ppe1 ppe1Var = (ppe1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = ppe1.e;
        z1kVarB.k(h661Var, 0, epe1.a, ppe1Var.a);
        z1kVarB.k(h661Var, 1, ape1.a, ppe1Var.b);
        z1kVarB.k(h661Var, 2, (nma0) znb0VarArr[2].getValue(), ppe1Var.c);
        z1kVarB.k(h661Var, 3, kpe1.a, ppe1Var.d);
        z1kVarB.a(h661Var);
    }
}
