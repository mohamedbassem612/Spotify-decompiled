package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aq50 extends ayq0 {
    public final String b;
    public final String c;
    public final ave0 d;
    public final List e;

    public aq50(String str, String str2, ave0 ave0Var, List list) {
        super(8);
        this.b = str;
        this.c = str2;
        this.d = ave0Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq50)) {
            return false;
        }
        aq50 aq50Var = (aq50) obj;
        return this.b.equals(aq50Var.b) && this.c.equals(aq50Var.c) && u890.j(this.d, aq50Var.d) && this.e.equals(aq50Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.b.hashCode() * 31, 31, this.c);
        ave0 ave0Var = this.d;
        return this.e.hashCode() + ((iD + (ave0Var == null ? 0 : ave0Var.hashCode())) * 31);
    }
}
