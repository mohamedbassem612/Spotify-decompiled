package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qn50 {
    public final String a;
    public final gb9 b;
    public final List c;

    public qn50(String str, gb9 gb9Var, List list) {
        this.a = str;
        this.b = gb9Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn50)) {
            return false;
        }
        qn50 qn50Var = (qn50) obj;
        return u890.j(this.a, qn50Var.a) && this.b.equals(qn50Var.b) && u890.j(this.c, qn50Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        List list = this.c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
