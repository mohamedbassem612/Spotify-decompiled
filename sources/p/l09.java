package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l09 extends sin {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public l09(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sin) {
            l09 l09Var = (l09) ((sin) obj);
            if (this.a == l09Var.a && this.b.equals(l09Var.b) && this.c.equals(l09Var.c) && this.d == l09Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        return l1d.r(sb, this.d, "}");
    }
}
