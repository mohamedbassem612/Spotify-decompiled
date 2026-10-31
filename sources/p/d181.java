package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d181 {
    public final String a;
    public final h290 b;

    public d181(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d181)) {
            return false;
        }
        d181 d181Var = (d181) obj;
        return this.a.equals(d181Var.a) && this.b.equals(d181Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
