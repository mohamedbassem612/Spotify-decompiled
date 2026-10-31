package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e421 extends s3x {
    public gt40 c;

    public e421() {
        super(2);
        this.c = et40.a;
    }

    @Override // p.i3x
    public final i3x a() {
        e421 e421Var = new e421();
        e421Var.c = this.c;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i3x) it.next()).a());
        }
        e421Var.b.addAll(arrayList2);
        return e421Var;
    }

    @Override // p.i3x
    public final gt40 b() {
        return this.c;
    }

    @Override // p.i3x
    public final void c(gt40 gt40Var) {
        this.c = gt40Var;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.c + ", children=[\n" + d() + "\n])";
    }
}
