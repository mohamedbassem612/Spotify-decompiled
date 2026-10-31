package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class dn01 implements pf40 {
    public static final dn01 a;
    private static final h661 descriptor;

    static {
        dn01 dn01Var = new dn01();
        a = dn01Var;
        m0v0 m0v0Var = new m0v0("com.spotify.campfire.chatcontentpickerpage.search.data.RecentSearch", dn01Var, 2);
        m0v0Var.j("uri", false);
        m0v0Var.j("type", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{chc1.a, fn01.c[1].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = fn01.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        EntityType entityType = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strF = x1kVarB.f(h661Var, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                entityType = (EntityType) x1kVarB.A(h661Var, 1, (nma0) znb0VarArr[1].getValue(), entityType);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new fn01(i, strF, entityType);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        fn01 fn01Var = (fn01) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = fn01.c;
        z1kVarB.G(h661Var, 0, fn01Var.a);
        z1kVarB.k(h661Var, 1, (nma0) znb0VarArr[1].getValue(), fn01Var.b);
        z1kVarB.a(h661Var);
    }
}
