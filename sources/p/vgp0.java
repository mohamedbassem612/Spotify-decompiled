package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vgp0 {
    public final String a;
    public final String b;
    public final v641 c;
    public final Map d;
    public final List e;
    public final Long f;

    public vgp0(String str, String str2, v641 v641Var, Map map, Long l, int i) {
        v641Var = (i & 4) != 0 ? s641.a : v641Var;
        l = (i & 32) != 0 ? null : l;
        this.a = str;
        this.b = str2;
        this.c = v641Var;
        this.d = map;
        this.e = z6x.a;
        this.f = l;
        if (l != null) {
            long jLongValue = l.longValue();
            if (1 > jLongValue || jLongValue >= 3601) {
                n57.e("maxDurationSeconds must be between 1 and 3600 seconds");
            }
        }
    }

    public final String a() {
        return f4i1.f(this.a, ":", this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgp0)) {
            return false;
        }
        vgp0 vgp0Var = (vgp0) obj;
        return this.a.equals(vgp0Var.a) && this.b.equals(vgp0Var.b) && this.c.equals(vgp0Var.c) && this.d.equals(vgp0Var.d) && this.e.equals(vgp0Var.e) && u890.j(this.f, vgp0Var.f);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.e((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        Long l = this.f;
        return iB + (l == null ? 0 : l.hashCode());
    }
}
