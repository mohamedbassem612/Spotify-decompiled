package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gzg0 {
    public final String a;
    public final String b;

    public gzg0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzg0)) {
            return false;
        }
        gzg0 gzg0Var = (gzg0) obj;
        return this.a.equals(gzg0Var.a) && this.b.equals(gzg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((rq2.i.hashCode() + (this.a.hashCode() * 31)) * 31) + 937185458) * 31);
    }
}
