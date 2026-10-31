package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k330 {
    public final yf a;
    public final yf b;

    public k330() {
        jdx jdxVar = jdx.c;
        ldx ldxVar = ldx.c;
        this.a = jdxVar;
        this.b = ldxVar;
    }

    public final yf a() {
        return this.b;
    }

    public final yf b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k330)) {
            return false;
        }
        k330 k330Var = (k330) obj;
        return this.a.equals(k330Var.a) && this.b.equals(k330Var.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
    }
}
