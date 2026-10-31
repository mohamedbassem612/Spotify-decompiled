package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rf70 implements nma0 {
    public static final rf70 a = new rf70();
    public static final qnw0 b = omo1.c("HydrogenRendering", knw0.o);

    public final Object deserialize(dar darVar) {
        Object next;
        String strV = darVar.V();
        Iterator it = qf70.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((qf70) next).name(), strV));
        qf70 qf70Var = (qf70) next;
        return qf70Var == null ? qf70.b : qf70Var;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0(((qf70) obj).name());
    }
}
