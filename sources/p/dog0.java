package p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class dog0 extends l6 {
    public final nma0 a;
    public final nma0 b;

    public dog0(nma0 nma0Var, nma0 nma0Var2) {
        this.a = nma0Var;
        this.b = nma0Var2;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        Map map = (Map) obj;
        Object objA = x1kVar.A(getDescriptor(), i, this.a, (Object) null);
        int iP = x1kVar.p(getDescriptor());
        if (iP != i + 1) {
            hhg1.f(cy30.i(i, "Value must follow key in a map, index for key: ", iP, ", returned index for value: "));
            return;
        }
        boolean zContainsKey = map.containsKey(objA);
        nma0 nma0Var = this.b;
        map.put(objA, (!zContainsKey || (nma0Var.getDescriptor().getKind() instanceof mnw0)) ? x1kVar.A(getDescriptor(), iP, nma0Var, (Object) null) : x1kVar.A(getDescriptor(), iP, nma0Var, sqg0.G(objA, map)));
    }

    public final nma0 i() {
        return this.a;
    }

    public final nma0 j() {
        return this.b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        int iD = d(obj);
        h661 descriptor = getDescriptor();
        z1k z1kVarG0 = uaxVar.g0(descriptor, iD);
        Iterator itC = c(obj);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            z1kVarG0.k(getDescriptor(), i, this.a, key);
            i += 2;
            z1kVarG0.k(getDescriptor(), i2, this.b, value);
        }
        z1kVarG0.a(descriptor);
    }

    public /* synthetic */ dog0(nma0 nma0Var, nma0 nma0Var2, int i) {
        this(nma0Var, nma0Var2);
    }
}
