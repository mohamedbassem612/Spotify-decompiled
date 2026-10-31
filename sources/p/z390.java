package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z390 extends am70 {
    public final String b;
    public final String c;
    public final String d;

    public z390(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z390.class != obj.getClass()) {
            return false;
        }
        z390 z390Var = (z390) obj;
        return this.c.equals(z390Var.c) && this.b.equals(z390Var.b) && this.d.equals(z390Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(527, 31, this.b), 31, this.c);
    }

    @Override // p.am70
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
