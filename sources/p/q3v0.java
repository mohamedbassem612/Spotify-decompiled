package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class q3v0 implements pf40 {
    public static final q3v0 a;
    private static final h661 descriptor;

    static {
        q3v0 q3v0Var = new q3v0();
        a = q3v0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.podcast.endpoints.decorate.body.PodcastDecorateBody", q3v0Var, 2);
        m0v0Var.j("items", false);
        m0v0Var.j("policy", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        return new nma0[]{s3v0.c[0].getValue(), m5n1.z(sar.a)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = s3v0.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        abr abrVar = null;
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
                abrVar = (abr) x1kVarB.B(h661Var, 1, sar.a, abrVar);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new s3v0(i, list, abrVar);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        s3v0 s3v0Var = (s3v0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        z1kVarB.k(h661Var, 0, (nma0) s3v0.c[0].getValue(), s3v0Var.a);
        abr abrVar = s3v0Var.b;
        if (abrVar != null) {
            z1kVarB.s(h661Var, 1, sar.a, abrVar);
        }
        z1kVarB.a(h661Var);
    }
}
