package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ba51 {
    public final String a;
    public final List b;

    public ba51(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba51)) {
            return false;
        }
        ba51 ba51Var = (ba51) obj;
        return u890.j(this.a, ba51Var.a) && this.b.equals(ba51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
