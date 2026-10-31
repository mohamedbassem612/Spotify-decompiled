package p;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class j4h extends l6 {
    public final nma0 a;

    public j4h(nma0 nma0Var) {
        this.a = nma0Var;
    }

    @Override // p.l6
    public void f(x1k x1kVar, int i, Object obj) {
        i(i, obj, x1kVar.A(getDescriptor(), i, this.a, null));
    }

    public void i(int i, Object obj, Object obj2) {
        ((HashSet) obj).add(obj2);
    }

    @Override // p.nma0
    public void serialize(uax uaxVar, Object obj) {
        int iD = d(obj);
        h661 descriptor = getDescriptor();
        z1k z1kVarG0 = uaxVar.g0(descriptor, iD);
        Iterator itC = c(obj);
        for (int i = 0; i < iD; i++) {
            z1kVarG0.k(getDescriptor(), i, this.a, itC.next());
        }
        z1kVarG0.a(descriptor);
    }
}
