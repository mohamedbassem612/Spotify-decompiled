package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ot70 implements z0i {
    public final String a;
    public final String b;
    public final String c;

    public ot70(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot70)) {
            return false;
        }
        ot70 ot70Var = (ot70) obj;
        return this.a.equals(ot70Var.a) && this.b.equals(ot70Var.b) && this.c.equals(ot70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
