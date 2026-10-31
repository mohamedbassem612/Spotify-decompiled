package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ef50 {
    public final String a;
    public final List b;

    public ef50(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef50)) {
            return false;
        }
        ef50 ef50Var = (ef50) obj;
        return this.a.equals(ef50Var.a) && this.b.equals(ef50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
