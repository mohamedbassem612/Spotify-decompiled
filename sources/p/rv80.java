package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class rv80 implements pf40 {
    public static final rv80 a;
    private static final h661 descriptor;

    static {
        rv80 rv80Var = new rv80();
        a = rv80Var;
        m0v0 m0v0Var = new m0v0("com.spotify.ubi.logger.InteractionLoggingResult", rv80Var, 12);
        m0v0Var.j("interactionId", false);
        m0v0Var.j("pageInstanceId", false);
        m0v0Var.j("authenticated", true);
        m0v0Var.j("eventCreationTimestamp", true);
        m0v0Var.j("eventLoggedTimestamp", true);
        m0v0Var.j("pagePresentationId", true);
        m0v0Var.j("contextualSources", true);
        m0v0Var.j("pageId", true);
        m0v0Var.j("rootSpecificationId", true);
        m0v0Var.j("leafSpecificationId", true);
        m0v0Var.j("interactionType", true);
        m0v0Var.j("interactionTypeVersion", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(w6r0.a);
        nma0 nma0Var = wr80.a;
        nma0 nma0VarZ2 = m5n1.z(nma0Var);
        nma0 nma0Var2 = chc1.a;
        nma0 nma0VarZ3 = m5n1.z(nma0Var2);
        nma0 nma0VarZ4 = m5n1.z(nma0Var2);
        nma0 nma0VarZ5 = m5n1.z(nma0Var2);
        o5f0 o5f0Var = o5f0.a;
        return new nma0[]{mu80.a, nma0VarZ, gpb.a, o5f0Var, o5f0Var, nma0VarZ2, e6h1.a, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0Var2, nma0Var};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        long jI0 = 0;
        long jI1 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        Integer num = null;
        g6h1 g6h1Var = null;
        int i = 0;
        ou80 ou80Var = null;
        y6r0 y6r0Var = null;
        boolean zM = false;
        String strF = null;
        int iO = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    zM = zM;
                    z = false;
                    zM = zM;
                    break;
                case 0:
                    ou80Var = (ou80) x1kVarB.A(h661Var, 0, mu80.a, ou80Var);
                    i |= 1;
                    z = z;
                    zM = zM;
                    break;
                case 1:
                    y6r0Var = (y6r0) x1kVarB.B(h661Var, 1, w6r0.a, y6r0Var);
                    i |= 2;
                    z = z;
                    zM = zM;
                    break;
                case 2:
                    zM = x1kVarB.M(h661Var, 2);
                    i |= 4;
                    z = z;
                    break;
                case 3:
                    jI0 = x1kVarB.i0(h661Var, 3);
                    i |= 8;
                    z = z;
                    break;
                case 4:
                    jI1 = x1kVarB.i0(h661Var, 4);
                    i |= 16;
                    z = z;
                    break;
                case 5:
                    num = (Integer) x1kVarB.B(h661Var, 5, wr80.a, num);
                    i |= 32;
                    z = z;
                    zM = zM;
                    break;
                case 6:
                    g6h1Var = (g6h1) x1kVarB.A(h661Var, 6, e6h1.a, g6h1Var);
                    i |= 64;
                    z = z;
                    zM = zM;
                    break;
                case 7:
                    str3 = (String) x1kVarB.B(h661Var, 7, chc1.a, str3);
                    i |= 128;
                    z = z;
                    zM = zM;
                    break;
                case 8:
                    str2 = (String) x1kVarB.B(h661Var, 8, chc1.a, str2);
                    i |= 256;
                    z = z;
                    zM = zM;
                    break;
                case 9:
                    str = (String) x1kVarB.B(h661Var, 9, chc1.a, str);
                    i |= 512;
                    z = z;
                    zM = zM;
                    break;
                case 10:
                    strF = x1kVarB.f(h661Var, 10);
                    i |= 1024;
                    z = z;
                    break;
                case 11:
                    iO = x1kVarB.o(h661Var, 11);
                    i |= 2048;
                    z = z;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new tv80(i, ou80Var, y6r0Var, zM, jI0, jI1, num, g6h1Var, str3, str2, str, strF, iO);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    public final void serialize(uax uaxVar, Object obj) {
        String str;
        tv80 tv80Var = (tv80) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        mu80 mu80Var = mu80.a;
        ou80 ou80Var = tv80Var.a;
        int i = tv80Var.Y;
        String str2 = tv80Var.X;
        String str3 = tv80Var.t;
        String str4 = tv80Var.i;
        String str5 = tv80Var.h;
        g6h1 g6h1Var = tv80Var.g;
        Integer num = tv80Var.f;
        long j = tv80Var.e;
        long j2 = tv80Var.d;
        boolean z = tv80Var.c;
        z1kVarB.k(h661Var, 0, mu80Var, ou80Var);
        z1kVarB.s(h661Var, 1, w6r0.a, tv80Var.b);
        if (z1kVarB.d0() || !z) {
            z1kVarB.E(h661Var, 2, z);
        }
        if (z1kVarB.d0() || j2 != 0) {
            z1kVarB.l(h661Var, 3, j2);
        }
        if (z1kVarB.d0() || j != 0) {
            z1kVarB.l(h661Var, 4, j);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 5, wr80.a, num);
        }
        if (z1kVarB.d0()) {
            z1kVarB.k(h661Var, 6, e6h1.a, g6h1Var);
        } else {
            g6h1.Companion.getClass();
            if (!u890.j(g6h1Var, g6h1.e)) {
                z1kVarB.k(h661Var, 6, e6h1.a, g6h1Var);
            }
        }
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str4);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str3);
        }
        if (!z1kVarB.d0()) {
            str = str2;
            if (!u890.j(str, "")) {
            }
            if (z1kVarB.d0() || i != 0) {
                z1kVarB.e(11, i, h661Var);
            }
            z1kVarB.a(h661Var);
        }
        str = str2;
        z1kVarB.G(h661Var, 10, str);
        if (z1kVarB.d0()) {
            z1kVarB.e(11, i, h661Var);
        } else {
            z1kVarB.e(11, i, h661Var);
        }
        z1kVarB.a(h661Var);
    }
}
