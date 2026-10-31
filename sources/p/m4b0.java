package p;

import com.spotify.accessory.categorizer.CategorizerResponse;
import com.spotify.accessory.categorizer.CategorizerResponse$$serializer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class m4b0 implements pf40 {
    public static final m4b0 a;
    private static final h661 descriptor;

    static {
        m4b0 m4b0Var = new m4b0();
        a = m4b0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.accessory.categorizerimpl.KnownBluetoothDevice", m4b0Var, 2);
        m0v0Var.j("categorizer_response", false);
        m0v0Var.j("last_updated_at", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{CategorizerResponse$$serializer.INSTANCE, o5f0.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        long jI0 = 0;
        boolean z = true;
        int i = 0;
        CategorizerResponse categorizerResponse = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                categorizerResponse = (CategorizerResponse) x1kVarB.A(h661Var, 0, CategorizerResponse$$serializer.INSTANCE, categorizerResponse);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                jI0 = x1kVarB.i0(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new o4b0(i, categorizerResponse, jI0);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        o4b0 o4b0Var = (o4b0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, CategorizerResponse$$serializer.INSTANCE, o4b0Var.a);
        z1kVarB.l(h661Var, 1, o4b0Var.b);
        z1kVarB.a(h661Var);
    }
}
