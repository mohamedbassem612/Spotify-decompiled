package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class yzt implements pf40 {
    public static final yzt a;
    private static final h661 descriptor;

    static {
        yzt yztVar = new yzt();
        a = yztVar;
        m0v0 m0v0Var = new m0v0("com.spotify.devicepredictability.internal.devicesuggestionproviderimpl.sources.wheretoplay.impl.endpoint.DeviceSuggestionResponse", yztVar, 3);
        m0v0Var.j("recommendation", true);
        m0v0Var.j("bottomSheetNudgePropensityLevel", true);
        m0v0Var.j("smartControlNudgePropensityLevel", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(nuc1.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        puc1 puc1Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                puc1Var = (puc1) x1kVarB.B(h661Var, 0, nuc1.a, puc1Var);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else {
                if (iP != 2) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 2, chc1.a, str2);
                i |= 4;
            }
        }
        x1kVarB.a(h661Var);
        return new a0u(i, puc1Var, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        a0u a0uVar = (a0u) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        puc1 puc1Var = a0uVar.a;
        if (puc1Var != null) {
            z1kVarB.s(h661Var, 0, nuc1.a, puc1Var);
        }
        String str = a0uVar.b;
        if (str != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str);
        }
        String str2 = a0uVar.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str2);
        }
        z1kVarB.a(h661Var);
    }
}
