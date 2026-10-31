package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vwo0 implements eyo0 {
    public final String a;
    public final h290 b;

    public vwo0(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwo0)) {
            return false;
        }
        vwo0 vwo0Var = (vwo0) obj;
        return this.a.equals(vwo0Var.a) && this.b.equals(vwo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
