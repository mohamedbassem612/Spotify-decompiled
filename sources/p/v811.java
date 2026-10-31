package p;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v811 extends j4h {
    public final tka0 b;
    public final k36 c;

    public v811(tka0 tka0Var, nma0 nma0Var) {
        super(nma0Var);
        this.b = tka0Var;
        this.c = new k36(nma0Var.getDescriptor());
    }

    public final Object a() {
        return new ArrayList();
    }

    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    public final Iterator c(Object obj) {
        return new d7((Object[]) obj, (byte) 1);
    }

    public final int d(Object obj) {
        return ((Object[]) obj).length;
    }

    public final Object g(Object obj) {
        return new ArrayList(Arrays.asList((Object[]) obj));
    }

    public final h661 getDescriptor() {
        return this.c;
    }

    public final Object h(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.b.n(), arrayList.size()));
    }

    public final void i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
