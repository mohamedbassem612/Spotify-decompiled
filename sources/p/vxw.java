package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class vxw implements pf40 {
    public static final vxw a;
    private static final h661 descriptor;

    static {
        vxw vxwVar = new vxw();
        a = vxwVar;
        m0v0 m0v0Var = new m0v0("com.spotify.email.models.EmailProfileResponseOptions", vxwVar, 2);
        m0v0Var.j("editable_fields", false);
        m0v0Var.j("is_password_required_on_email_change", false);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{xxw.c[0].getValue(), gpb.a};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = xxw.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        boolean zM = false;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                zM = x1kVarB.M(h661Var, 1);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new xxw(i, list, zM);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        xxw xxwVar = (xxw) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) xxw.c[0].getValue(), xxwVar.a);
        z1kVarB.E(h661Var, 1, xxwVar.b);
        z1kVarB.a(h661Var);
    }
}
