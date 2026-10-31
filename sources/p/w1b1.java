package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class w1b1 implements pf40 {
    public static final w1b1 a;
    private static final h661 descriptor;

    static {
        w1b1 w1b1Var = new w1b1();
        a = w1b1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.sponsorshipimpl.model.Sponsorships", w1b1Var, 1);
        m0v0Var.j("sponsorships", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z((nma0) y1b1.c[0].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = y1b1.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new y1b1(i, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.s(h661Var, 0, (nma0) y1b1.c[0].getValue(), ((y1b1) obj).a);
        z1kVarB.a(h661Var);
    }
}
