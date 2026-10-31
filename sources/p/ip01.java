package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ip01 {
    public final Set a;
    public final Set b;

    public ip01(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final jp01 a() {
        return new jp01(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip01)) {
            return false;
        }
        ip01 ip01Var = (ip01) obj;
        return this.a.equals(ip01Var.a) && this.b.equals(ip01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
