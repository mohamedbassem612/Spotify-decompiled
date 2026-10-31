package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pwo0 implements eyo0 {
    public final String a;
    public final List b = z6x.a;

    public pwo0(String str) {
        this.a = str;
    }

    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwo0)) {
            return false;
        }
        pwo0 pwo0Var = (pwo0) obj;
        return this.a.equals(pwo0Var.a) && this.b.equals(pwo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
