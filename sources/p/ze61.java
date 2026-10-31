package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ze61 implements cf61 {
    public final j4e a;
    public final int b;

    public ze61(j4e j4eVar, int i) {
        this.a = j4eVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze61)) {
            return false;
        }
        ze61 ze61Var = (ze61) obj;
        return this.a.equals(ze61Var.a) && this.b == ze61Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
