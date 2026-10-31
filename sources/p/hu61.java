package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hu61 {
    public final jx21 a;
    public final List b;

    public hu61(jx21 jx21Var, List list) {
        this.a = jx21Var;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final ryn1 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu61)) {
            return false;
        }
        hu61 hu61Var = (hu61) obj;
        return this.a.equals(hu61Var.a) && u890.j(this.b, hu61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }
}
