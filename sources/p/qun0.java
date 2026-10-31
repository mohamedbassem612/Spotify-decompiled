package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qun0 {
    public final hwn0 a;
    public final hwn0 b;
    public final nsn0 c;
    public final List d;
    public final List e;
    public final String f;
    public final Long g;

    public qun0(hwn0 hwn0Var, hwn0 hwn0Var2, nsn0 nsn0Var, List list, List list2, String str, Long l) {
        this.a = hwn0Var;
        this.b = hwn0Var2;
        this.c = nsn0Var;
        this.d = list;
        this.e = list2;
        this.f = str;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qun0)) {
            return false;
        }
        qun0 qun0Var = (qun0) obj;
        return u890.j(this.a, qun0Var.a) && u890.j(this.b, qun0Var.b) && u890.j(this.c, qun0Var.c) && u890.j(this.d, qun0Var.d) && u890.j(this.e, qun0Var.e) && u890.j(this.f, qun0Var.f) && u890.j(this.g, qun0Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hwn0 hwn0Var = this.b;
        int iB = f4i1.b(f4i1.b((this.c.hashCode() + ((iHashCode + (hwn0Var == null ? 0 : hwn0Var.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.g;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }
}
