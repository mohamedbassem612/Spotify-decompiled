package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class il10 implements Map.Entry, ola0 {
    public final hac0 a;
    public final sac0 b;
    public il10 c;
    public il10 d;
    public boolean e;

    public il10(hac0 hac0Var, sac0 sac0Var) {
        this.a = hac0Var;
        this.b = sac0Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof il10) {
            il10 il10Var = (il10) obj;
            return this.a.equals(il10Var.a) && this.b == il10Var.b;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.a + ", value=" + this.b + ")";
    }
}
