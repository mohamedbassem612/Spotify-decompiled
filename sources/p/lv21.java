package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class lv21 {
    public static final kv21 Companion = new kv21();
    public static final znb0[] f = {null, null, dm5.S(2, n521.N0), dm5.S(2, n521.O0), null};
    public final r89 a;
    public final ujk1 b;
    public final List c;
    public final List d;
    public final String e;

    public /* synthetic */ lv21(int i, r89 r89Var, ujk1 ujk1Var, List list, List list2, String str) {
        if (19 != (i & 19)) {
            o6p1.t(i, 19, jv21.a.getDescriptor());
            throw null;
        }
        this.a = r89Var;
        this.b = ujk1Var;
        int i2 = i & 4;
        z6x z6xVar = z6x.a;
        if (i2 == 0) {
            this.c = z6xVar;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = z6xVar;
        } else {
            this.d = list2;
        }
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv21)) {
            return false;
        }
        lv21 lv21Var = (lv21) obj;
        return u890.j(this.a, lv21Var.a) && u890.j(this.b, lv21Var.b) && u890.j(this.c, lv21Var.c) && u890.j(this.d, lv21Var.d) && u890.j(this.e, lv21Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f4i1.b(f4i1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }
}
