package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sfa0 implements nma0 {
    public static final sfa0 a = new sfa0();
    public static final rfa0 b = rfa0.b;

    public final Object deserialize(dar darVar) {
        dem1.t(darVar);
        return new pfa0((List) new r36(hga0.a, (byte) 0).e(darVar, (Object) null));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        pfa0 pfa0Var = (pfa0) obj;
        dem1.u(uaxVar);
        hga0 hga0Var = hga0.a;
        p36 p36Var = new p36(hga0Var.getDescriptor(), (byte) 0);
        int size = pfa0Var.size();
        z1k z1kVarG0 = uaxVar.g0(p36Var, size);
        Iterator it = pfa0Var.iterator();
        for (int i = 0; i < size; i++) {
            z1kVarG0.k(p36Var, i, hga0Var, it.next());
        }
        z1kVarG0.a(p36Var);
    }
}
