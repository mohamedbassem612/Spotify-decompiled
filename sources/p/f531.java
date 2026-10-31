package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f531 {
    public final String a;
    public final String b;

    public f531(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f531)) {
            return false;
        }
        f531 f531Var = (f531) obj;
        return this.a.equals(f531Var.a) && this.b.equals(f531Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
