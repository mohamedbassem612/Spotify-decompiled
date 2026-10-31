package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class irj1 implements nma0 {
    public static final irj1 a = new irj1();
    public static final j661 b = omo1.i("VideoPlayerCommand.Marker", new h661[0], jmj1.a1);

    public final Object deserialize(dar darVar) {
        j661 j661Var = b;
        x1k x1kVarB = darVar.b(j661Var);
        Object objB = null;
        Object objB2 = null;
        Object objB3 = null;
        Object objB4 = null;
        while (true) {
            int iP = x1kVarB.p(j661Var);
            if (iP == -1) {
                x1kVarB.a(j661Var);
                return new grj1((String) objB, (Integer) objB2, (Integer) objB3, (Integer) objB4);
            }
            if (iP == 0) {
                objB = x1kVarB.B(j661Var, iP, m5n1.z(pma.a), (Object) null);
            } else if (iP == 1) {
                objB2 = x1kVarB.B(j661Var, iP, m5n1.z(nma.a), (Object) null);
            } else if (iP == 2) {
                objB3 = x1kVarB.B(j661Var, iP, m5n1.z(nma.a), (Object) null);
            } else {
                if (iP != 3) {
                    uh61.j(f4i1.c(iP, "Unexpected Marker field index "));
                    return null;
                }
                objB4 = x1kVarB.B(j661Var, iP, m5n1.z(nma.a), (Object) null);
            }
        }
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        grj1 grj1Var = (grj1) obj;
        jga0 jga0Var = (jga0) uaxVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = grj1Var.a;
        if (str != null) {
        }
        Integer num = grj1Var.b;
        if (num != null) {
        }
        Integer num2 = grj1Var.c;
        if (num2 != null) {
        }
        Integer num3 = grj1Var.d;
        if (num3 != null) {
        }
        jga0Var.R(new uga0(linkedHashMap));
    }
}
