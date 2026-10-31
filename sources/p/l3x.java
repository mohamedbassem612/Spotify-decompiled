package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l3x extends s3x {
    public gt40 c;
    public int d;
    public int e;

    public l3x() {
        super(3);
        this.c = et40.a;
        this.d = 0;
        this.e = 0;
    }

    @Override // p.i3x
    public final i3x a() {
        l3x l3xVar = new l3x();
        l3xVar.c = this.c;
        l3xVar.d = this.d;
        l3xVar.e = this.e;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i3x) it.next()).a());
        }
        l3xVar.b.addAll(arrayList2);
        return l3xVar;
    }

    @Override // p.i3x
    public final gt40 b() {
        return this.c;
    }

    @Override // p.i3x
    public final void c(gt40 gt40Var) {
        this.c = gt40Var;
    }

    public final int f() {
        return this.e;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.c + ", verticalAlignment=" + ((Object) ol3.c(this.d)) + ", horizontalAlignment=" + ((Object) ml3.c(this.e)) + ", children=[\n" + d() + "\n])";
    }
}
