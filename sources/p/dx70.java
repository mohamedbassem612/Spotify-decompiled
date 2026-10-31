package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dx70 {
    public final String a;
    public final Long b;

    public dx70(Long l, String str) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx70)) {
            return false;
        }
        dx70 dx70Var = (dx70) obj;
        return this.a.equals(dx70Var.a) && this.b.equals(dx70Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
