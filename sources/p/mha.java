package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class mha implements pf40 {
    public static final mha a;
    private static final h661 descriptor;

    static {
        mha mhaVar = new mha();
        a = mhaVar;
        m0v0 m0v0Var = new m0v0("com.spotify.liveroom.listeningpartymessagesourceapi.api.BatchedChatChannelEvent", mhaVar, 2);
        m0v0Var.j("common", false);
        m0v0Var.j("events", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{dsh.a, oha.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = oha.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        fsh fshVar = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                fshVar = (fsh) x1kVarB.A(h661Var, 0, dsh.a, fshVar);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new oha(i, fshVar, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        oha ohaVar = (oha) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = oha.c;
        z1kVarB.k(h661Var, 0, dsh.a, ohaVar.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), ohaVar.b);
        z1kVarB.a(h661Var);
    }
}
