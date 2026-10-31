package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class xv0 implements pf40 {
    public static final xv0 a;
    private static final h661 descriptor;

    static {
        xv0 xv0Var = new xv0();
        a = xv0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.preview.model.AdPreviewResponse", xv0Var, 1);
        m0v0Var.j("pod", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{zv0.b[0].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = zv0.b;
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
        return new zv0(i, map);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) zv0.b[0].getValue(), ((zv0) obj).a);
        z1kVarB.a(h661Var);
    }
}
