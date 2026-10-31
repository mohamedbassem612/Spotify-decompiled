package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p3x extends s3x {
    public long c;
    public x291 d;

    public p3x() {
        super(3);
        this.c = 9205357640488583168L;
        this.d = w291.a;
    }

    @Override // p.i3x
    public final i3x a() {
        p3x p3xVar = new p3x();
        p3xVar.c = this.c;
        p3xVar.d = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((i3x) it.next()).a());
        }
        p3xVar.b.addAll(arrayList2);
        return p3xVar;
    }

    @Override // p.i3x
    public final gt40 b() {
        gt40 gt40VarB;
        i3x i3xVar = (i3x) o7h.X0(this.b);
        return (i3xVar == null || (gt40VarB = i3xVar.b()) == null) ? dm5.I(et40.a) : gt40VarB;
    }

    @Override // p.i3x
    public final void c(gt40 gt40Var) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) s3v.c(this.c)) + ", sizeMode=" + this.d + ", children=[\n" + d() + "\n])";
    }
}
