package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class ids0 implements pf40 {
    public static final ids0 a;
    private static final h661 descriptor;

    static {
        ids0 ids0Var = new ids0();
        a = ids0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.payment.paymentimpl.view.field.PciBridgeErrorMessages", ids0Var, 7);
        m0v0Var.j("invalidCardNumber", false);
        m0v0Var.j("invalidCvc", false);
        m0v0Var.j("invalidExpiryDate", false);
        m0v0Var.j("expiredExpiryDate", false);
        m0v0Var.j("invalidBirthDate", false);
        m0v0Var.j("invalidCorporateRegistrationNumber", false);
        m0v0Var.j("invalidTwoDigitPin", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strF4 = x1kVarB.f(h661Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strF5 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    strF6 = x1kVarB.f(h661Var, 5);
                    i |= 32;
                    break;
                case 6:
                    strF7 = x1kVarB.f(h661Var, 6);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new kds0(i, strF, strF2, strF3, strF4, strF5, strF6, strF7);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        kds0 kds0Var = (kds0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.G(h661Var, 0, kds0Var.a);
        z1kVarB.G(h661Var, 1, kds0Var.b);
        z1kVarB.G(h661Var, 2, kds0Var.c);
        z1kVarB.G(h661Var, 3, kds0Var.d);
        z1kVarB.G(h661Var, 4, kds0Var.e);
        z1kVarB.G(h661Var, 5, kds0Var.f);
        z1kVarB.G(h661Var, 6, kds0Var.g);
        z1kVarB.a(h661Var);
    }
}
