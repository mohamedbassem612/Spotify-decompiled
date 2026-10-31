package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tv0 implements pf40 {
    public static final tv0 a;
    private static final h661 descriptor;

    static {
        tv0 tv0Var = new tv0();
        a = tv0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.preview.model.AdPreview.Video", tv0Var, 6);
        m0v0Var.j("bitrate", false);
        m0v0Var.j("duration_sec", false);
        m0v0Var.j("height", false);
        m0v0Var.j("width", false);
        m0v0Var.j("media_file", false);
        m0v0Var.j("mimetype", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        nma0 nma0VarZ = m5n1.z(wr80Var);
        nma0 nma0VarZ2 = m5n1.z(o5f0.a);
        nma0 nma0VarZ3 = m5n1.z(wr80Var);
        nma0 nma0VarZ4 = m5n1.z(wr80Var);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        Integer num3 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                    i |= 1;
                    break;
                case 1:
                    l = (Long) x1kVarB.B(h661Var, 1, o5f0.a, l);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) x1kVarB.B(h661Var, 3, wr80.a, num3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) x1kVarB.B(h661Var, 4, chc1.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) x1kVarB.B(h661Var, 5, chc1.a, str2);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new vv0(i, num, l, num2, num3, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        vv0 vv0Var = (vv0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        wr80 wr80Var = wr80.a;
        z1kVarB.s(h661Var, 0, wr80Var, vv0Var.a);
        z1kVarB.s(h661Var, 1, o5f0.a, vv0Var.b);
        z1kVarB.s(h661Var, 2, wr80Var, vv0Var.c);
        z1kVarB.s(h661Var, 3, wr80Var, vv0Var.d);
        chc1 chc1Var = chc1.a;
        z1kVarB.s(h661Var, 4, chc1Var, vv0Var.e);
        z1kVarB.s(h661Var, 5, chc1Var, vv0Var.f);
        z1kVarB.a(h661Var);
    }
}
