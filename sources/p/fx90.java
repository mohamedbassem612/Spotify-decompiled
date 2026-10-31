package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fx90 extends jx90 {
    public final String a;
    public final pp90 b;
    public final ArrayList c;
    public final boolean d;

    public fx90(String str, pp90 pp90Var, ArrayList arrayList, boolean z) {
        this.a = str;
        this.b = pp90Var;
        this.c = arrayList;
        this.d = z;
    }

    @Override // p.jx90
    public final boolean a() {
        return this.d;
    }

    @Override // p.jx90
    public final pp90 b() {
        return this.b;
    }

    @Override // p.jx90
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx90)) {
            return false;
        }
        fx90 fx90Var = (fx90) obj;
        return this.a.equals(fx90Var.a) && u890.j(this.b, fx90Var.b) && this.c.equals(fx90Var.c) && this.d == fx90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p3d1.f(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }
}
