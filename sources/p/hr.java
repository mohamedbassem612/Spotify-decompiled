package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hr {
    public final List a;
    public final boolean b;
    public final pc81 c;

    public hr(List list, boolean z, pc81 pc81Var) {
        this.a = list;
        this.b = z;
        this.c = pc81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hr) {
            hr hrVar = (hr) obj;
            return this.a.equals(hrVar.a) && this.b == hrVar.b && this.c == hrVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
