package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kvm0 {
    public final String a;
    public final String b;
    public final c10 c;
    public final boolean d;
    public final Long e;
    public final List f;

    public kvm0(String str, String str2, c10 c10Var, boolean z, Long l, List list) {
        this.a = str;
        this.b = str2;
        this.c = c10Var;
        this.d = z;
        this.e = l;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvm0)) {
            return false;
        }
        kvm0 kvm0Var = (kvm0) obj;
        return this.a.equals(kvm0Var.a) && this.b.equals(kvm0Var.b) && this.c.equals(kvm0Var.c) && this.d == kvm0Var.d && u890.j(this.e, kvm0Var.e) && u890.j(this.f, kvm0Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Long l = this.e;
        int iHashCode = (iG + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
