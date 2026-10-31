package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class xoz0 implements pf40 {
    public static final xoz0 a;
    private static final h661 descriptor;

    static {
        xoz0 xoz0Var = new xoz0();
        a = xoz0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.radio.radio.formatlist.RadioFormatListSourceModel", xoz0Var, 2);
        m0v0Var.j("total", true);
        m0v0Var.j("mediaItems", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        return new nma0[]{m5n1.z(wr80.a), m5n1.z((nma0) zoz0.c[1].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = zoz0.c;
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                i |= 1;
            } else {
                if (iP != 1) {
                    n9v.a(iP);
                    return null;
                }
                list = (List) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        x1kVarB.a(h661Var);
        return new zoz0(i, num, list);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        zoz0 zoz0Var = (zoz0) obj;
        List list = zoz0Var.b;
        Integer num = zoz0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = zoz0.c;
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
