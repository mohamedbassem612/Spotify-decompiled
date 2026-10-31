package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vy41 {
    public final String a;
    public final List b;

    public vy41(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy41)) {
            return false;
        }
        vy41 vy41Var = (vy41) obj;
        return this.a.equals(vy41Var.a) && this.b.equals(vy41Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
