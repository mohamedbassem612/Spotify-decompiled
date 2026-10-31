package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hbh0 {
    public final String a;
    public final Long b;
    public final String c;

    public hbh0(Long l, String str, String str2) {
        this.a = str;
        this.b = l;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbh0)) {
            return false;
        }
        hbh0 hbh0Var = (hbh0) obj;
        return u890.j(this.a, hbh0Var.a) && this.b.equals(hbh0Var.b) && this.c.equals(hbh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
