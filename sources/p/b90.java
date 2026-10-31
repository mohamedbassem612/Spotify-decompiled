package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b90 implements c90 {
    public final String a;
    public final j2i b;

    public b90(String str, j2i j2iVar) {
        this.a = str;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b90) {
            b90 b90Var = (b90) obj;
            return this.a.equals(b90Var.a) && this.b == b90Var.b;
        }
        return false;
    }

    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
