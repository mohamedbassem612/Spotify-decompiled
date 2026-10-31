package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l3i0 {
    public final e4w a;
    public final e4w b;

    public l3i0(e4w e4wVar, e4w e4wVar2) {
        this.a = e4wVar;
        this.b = e4wVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3i0)) {
            return false;
        }
        l3i0 l3i0Var = (l3i0) obj;
        return this.a == l3i0Var.a && this.b == l3i0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
