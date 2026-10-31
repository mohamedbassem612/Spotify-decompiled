package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xxo0 implements eyo0 {
    public final String a;
    public final List b;

    public xxo0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxo0)) {
            return false;
        }
        xxo0 xxo0Var = (xxo0) obj;
        return this.a.equals(xxo0Var.a) && this.b.equals(xxo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
