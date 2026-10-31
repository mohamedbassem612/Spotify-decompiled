package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s901 implements u901 {
    public final String a;
    public final String b;
    public final String c;

    public s901(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s901)) {
            return false;
        }
        s901 s901Var = (s901) obj;
        return this.a.equals(s901Var.a) && this.b.equals(s901Var.b) && this.c.equals(s901Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
