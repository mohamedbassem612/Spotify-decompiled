package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jv0 implements pf40 {
    public static final jv0 a;
    private static final h661 descriptor;

    static {
        jv0 jv0Var = new jv0();
        a = jv0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adsdisplay.preview.model.AdPreview.Audio", jv0Var, 4);
        m0v0Var.j("bitrate", false);
        m0v0Var.j("mimetype", false);
        m0v0Var.j("duration_sec", false);
        m0v0Var.j("media_file", false);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(wr80.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, m5n1.z(chc1Var), m5n1.z(o5f0.a), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Long l = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                i |= 1;
            } else if (iP == 1) {
                str = (String) x1kVarB.B(h661Var, 1, chc1.a, str);
                i |= 2;
            } else if (iP == 2) {
                l = (Long) x1kVarB.B(h661Var, 2, o5f0.a, l);
                i |= 4;
            } else {
                if (iP != 3) {
                    n9v.a(iP);
                    return null;
                }
                str2 = (String) x1kVarB.B(h661Var, 3, chc1.a, str2);
                i |= 8;
            }
        }
        x1kVarB.a(h661Var);
        return new lv0(i, num, str, l, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        lv0 lv0Var = (lv0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.s(h661Var, 0, wr80.a, lv0Var.a);
        chc1 chc1Var = chc1.a;
        z1kVarB.s(h661Var, 1, chc1Var, lv0Var.b);
        z1kVarB.s(h661Var, 2, o5f0.a, lv0Var.c);
        z1kVarB.s(h661Var, 3, chc1Var, lv0Var.d);
        z1kVarB.a(h661Var);
    }
}
