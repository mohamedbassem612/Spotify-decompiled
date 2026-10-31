package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ny61 {
    public final String a;
    public final List b;

    public ny61(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny61)) {
            return false;
        }
        ny61 ny61Var = (ny61) obj;
        return this.a.equals(ny61Var.a) && this.b.equals(ny61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
