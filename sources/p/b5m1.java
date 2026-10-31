package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b5m1 {
    public final Integer a;
    public final String b;
    public final j3c c;
    public final List d;

    public /* synthetic */ b5m1(int i, Integer num, String str, List list) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (j3c) i3c.a, (i & 8) != 0 ? z6x.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5m1)) {
            return false;
        }
        b5m1 b5m1Var = (b5m1) obj;
        return u890.j(this.a, b5m1Var.a) && u890.j(this.b, b5m1Var.b) && u890.j(this.c, b5m1Var.c) && u890.j(this.d, b5m1Var.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public b5m1(Integer num, String str, j3c j3cVar, List list) {
        this.a = num;
        this.b = str;
        this.c = j3cVar;
        this.d = list;
    }
}
