package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sev0 implements uev0 {
    public final String a;
    public final List b;

    public sev0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sev0)) {
            return false;
        }
        sev0 sev0Var = (sev0) obj;
        return u890.j(this.a, sev0Var.a) && u890.j(this.b, sev0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
