package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class dzk1 implements pf40 {
    public static final dzk1 a;
    private static final h661 descriptor;

    static {
        dzk1 dzk1Var = new dzk1();
        a = dzk1Var;
        m0v0 m0v0Var = new m0v0("didCompleteEditProfile", dzk1Var, 1);
        m0v0Var.j("updates", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{fzk1.c[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = fzk1.c;
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
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new fzk1(i, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        List list = ((fzk1) obj).b;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = fzk1.c;
        if (z1kVarB.d0() || !u890.j(list, z6x.a)) {
            z1kVarB.k(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
