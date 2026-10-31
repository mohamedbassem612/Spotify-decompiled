package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m120 {
    public final String a;
    public final String b;
    public final z2a c;
    public final qn30 d;
    public final List e;

    public m120(String str, String str2, z2a z2aVar, qn30 qn30Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = z2aVar;
        this.d = qn30Var;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m120)) {
            return false;
        }
        m120 m120Var = (m120) obj;
        return u890.j(this.a, m120Var.a) && this.b.equals(m120Var.b) && this.c.equals(m120Var.c) && u890.j(this.d, m120Var.d) && this.e.equals(m120Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        qn30 qn30Var = this.d;
        return this.e.hashCode() + ((iHashCode + (qn30Var == null ? 0 : qn30Var.a.hashCode())) * 31);
    }
}
