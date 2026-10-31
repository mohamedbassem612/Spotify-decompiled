package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ha60 implements la60 {
    public final String a;
    public final String b;
    public final va60 c;
    public final va60 d;

    public ha60(String str, String str2, va60 va60Var, va60 va60Var2) {
        this.a = str;
        this.b = str2;
        this.c = va60Var;
        this.d = va60Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha60)) {
            return false;
        }
        ha60 ha60Var = (ha60) obj;
        return this.a.equals(ha60Var.a) && this.b.equals(ha60Var.b) && this.c.equals(ha60Var.c) && this.d.equals(ha60Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
