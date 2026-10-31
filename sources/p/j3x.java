package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j3x extends s3x {
    public gt40 c;
    public ql3 d;

    public j3x() {
        super(3);
        this.c = et40.a;
        this.d = ql3.c;
    }

    @Override // p.i3x
    public final i3x a() {
        j3x j3xVar = new j3x();
        j3xVar.c = this.c;
        j3xVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i3x) it.next()).a());
        }
        j3xVar.b.addAll(arrayList2);
        return j3xVar;
    }

    @Override // p.i3x
    public final gt40 b() {
        return this.c;
    }

    @Override // p.i3x
    public final void c(gt40 gt40Var) {
        this.c = gt40Var;
    }

    public final ql3 f() {
        return this.d;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.c + ", contentAlignment=" + this.d + "children=[\n" + d() + "\n])";
    }
}
