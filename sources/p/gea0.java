package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gea0 {
    public final String a;
    public final String b;

    public gea0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gea0)) {
            return false;
        }
        gea0 gea0Var = (gea0) obj;
        return u890.j(this.a, gea0Var.a) && u890.j(this.b, gea0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
