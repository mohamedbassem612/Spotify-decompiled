package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fd6 {
    public final jo70 a;
    public final jo70 b;
    public final List c;

    public fd6(jo70 jo70Var, jo70 jo70Var2, List list) {
        this.a = jo70Var;
        this.b = jo70Var2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd6)) {
            return false;
        }
        fd6 fd6Var = (fd6) obj;
        return u890.j(this.a, fd6Var.a) && u890.j(this.b, fd6Var.b) && u890.j(this.c, fd6Var.c);
    }

    public final int hashCode() {
        jo70 jo70Var = this.a;
        int iHashCode = (jo70Var == null ? 0 : jo70Var.hashCode()) * 31;
        jo70 jo70Var2 = this.b;
        int iHashCode2 = (iHashCode + (jo70Var2 == null ? 0 : jo70Var2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
