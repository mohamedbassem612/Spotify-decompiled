package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ith implements pf40 {
    public static final ith a;
    private static final h661 descriptor;

    static {
        ith ithVar = new ith();
        a = ithVar;
        m0v0 m0v0Var = new m0v0("com.spotify.notifications.models.message.CommunicationNotificationGroup", ithVar, 3);
        m0v0Var.j("name", true);
        m0v0Var.j("avatar", true);
        m0v0Var.j("recipients", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(chc1.a), m5n1.z(eb9.a), m5n1.z((nma0) kth.d[2].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = kth.d;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        ib9 ib9Var = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                i |= 1;
            } else if (iP == 1) {
                ib9Var = (ib9) x1kVarB.B(h661Var, 1, eb9.a, ib9Var);
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
        return new kth(i, str, ib9Var, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kth kthVar = (kth) obj;
        List list = kthVar.c;
        ib9 ib9Var = kthVar.b;
        String str = kthVar.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = kth.d;
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        if (z1kVarB.d0() || ib9Var != null) {
            z1kVarB.s(h661Var, 1, eb9.a, ib9Var);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 2, (nma0) znb0VarArr[2].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
