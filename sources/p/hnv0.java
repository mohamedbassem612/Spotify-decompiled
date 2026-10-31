package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hnv0 {
    public final String a;
    public final Long b;

    public hnv0(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnv0)) {
            return false;
        }
        hnv0 hnv0Var = (hnv0) obj;
        return this.a.equals(hnv0Var.a) && this.b.equals(hnv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
