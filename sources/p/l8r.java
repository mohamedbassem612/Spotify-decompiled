package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l8r implements pdy0 {
    public final k8r a;
    public final feh1 b;
    public final idd1 c = new idd1(new z5o(this, (byte) 15));

    public l8r(k8r k8rVar, xz11 xz11Var) {
        this.a = k8rVar;
        this.b = xz11Var;
    }

    public final k8r a() {
        k8r k8rVarA;
        l8r l8rVar = (l8r) this.c.getValue();
        return (l8rVar == null || (k8rVarA = l8rVar.a()) == null) ? this.a : k8rVarA;
    }

    @Override // p.pdy0
    public final List models() {
        String str = a().a;
        k8r[] k8rVarArrValues = k8r.values();
        ArrayList arrayList = new ArrayList(k8rVarArrValues.length);
        for (k8r k8rVar : k8rVarArrValues) {
            arrayList.add(k8rVar.a);
        }
        return k4p1.x(new fpb("unauth_color", "debug-feature", str, arrayList));
    }
}
