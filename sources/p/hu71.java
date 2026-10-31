package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class hu71 implements pf40 {
    public static final hu71 a;
    private static final h661 descriptor;

    static {
        hu71 hu71Var = new hu71();
        a = hu71Var;
        m0v0 m0v0Var = new m0v0("com.spotify.previewcard.localstorage.impl.SharedPreferencesLocalProgressStorage.ProgressMapDTO", hu71Var, 1);
        m0v0Var.j("progressMap", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{ju71.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ju71.b;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    n9v.a(iP);
                    return null;
                }
                map = (Map) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), map);
                i = 1;
            }
        }
        x1kVarB.a(h661Var);
        return new ju71(i, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) ju71.b[0].getValue(), ((ju71) obj).a);
        z1kVarB.a(h661Var);
    }
}
