package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ny71 implements l771, mtd {
    public final Object a;
    public final int b;

    public ny71(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    @Override // p.mtd
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny71)) {
            return false;
        }
        ny71 ny71Var = (ny71) obj;
        return u890.j(this.a, ny71Var.a) && this.b == ny71Var.b;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Integer.hashCode(this.b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
