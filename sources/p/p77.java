package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p77 implements t77 {
    public final j2i a;
    public final String b;

    public p77(String str, j2i j2iVar) {
        this.a = j2iVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p77) {
            p77 p77Var = (p77) obj;
            if (this.a == p77Var.a && this.b.equals(p77Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.t77
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
