package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tyb0 {
    public final String a;
    public final List b;

    public tyb0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyb0)) {
            return false;
        }
        tyb0 tyb0Var = (tyb0) obj;
        return u890.j(this.a, tyb0Var.a) && this.b.equals(tyb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
