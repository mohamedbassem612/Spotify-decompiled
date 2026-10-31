package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t3v0 {
    public final Boolean a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final List e;
    public final List f;

    public t3v0(Map map, Map map2, Map map3, List list, List list2, int i) {
        Boolean bool = Boolean.TRUE;
        int i2 = i & 8;
        b7x b7xVar = b7x.a;
        map = i2 != 0 ? b7xVar : map;
        map2 = (i & 16) != 0 ? b7xVar : map2;
        map3 = (i & 32) != 0 ? b7xVar : map3;
        int i3 = i & 64;
        z6x z6xVar = z6x.a;
        list = i3 != 0 ? z6xVar : list;
        list2 = (i & 128) != 0 ? z6xVar : list2;
        this.a = bool;
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3v0)) {
            return false;
        }
        t3v0 t3v0Var = (t3v0) obj;
        return u890.j(this.a, t3v0Var.a) && this.b.equals(t3v0Var.b) && this.c.equals(t3v0Var.c) && this.d.equals(t3v0Var.d) && this.e.equals(t3v0Var.e) && this.f.equals(t3v0Var.f);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return this.f.hashCode() + f4i1.b(cy30.e(cy30.e(cy30.e((bool == null ? 0 : bool.hashCode()) * 961, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
