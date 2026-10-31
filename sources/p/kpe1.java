package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class kpe1 implements pf40 {
    public static final kpe1 a;
    private static final h661 descriptor;

    static {
        kpe1 kpe1Var = new kpe1();
        a = kpe1Var;
        m0v0 m0v0Var = new m0v0("com.spotify.watchfeed.transcript.datasource.TimeSyncedApiRequestResponse.TimeSyncedTextMetadata", kpe1Var, 7);
        m0v0Var.j("uri", false);
        m0v0Var.j("entityUri", false);
        m0v0Var.j("mediaUri", false);
        m0v0Var.j("language", false);
        m0v0Var.j("type", false);
        m0v0Var.j("generationType", false);
        m0v0Var.j("wordTimestampAccuracy", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = mpe1.h;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, chc1Var, znb0VarArr[6].getValue()};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = mpe1.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        ope1 ope1Var = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    continue;
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
                    ope1Var = (ope1) x1kVarB.A(h661Var, 6, (nma0) znb0VarArr[6].getValue(), ope1Var);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new mpe1(i, strF, strF2, strF3, strF4, strF5, strF6, ope1Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        mpe1 mpe1Var = (mpe1) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = mpe1.h;
        String str = mpe1Var.a;
        ope1 ope1Var = mpe1Var.g;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, mpe1Var.b);
        z1kVarB.G(h661Var, 2, mpe1Var.c);
        z1kVarB.G(h661Var, 3, mpe1Var.d);
        z1kVarB.G(h661Var, 4, mpe1Var.e);
        z1kVarB.G(h661Var, 5, mpe1Var.f);
        if (z1kVarB.d0() || ope1Var != ope1.b) {
            z1kVarB.k(h661Var, 6, (nma0) znb0VarArr[6].getValue(), ope1Var);
        }
        z1kVarB.a(h661Var);
    }
}
