package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e87 {
    public final String a;
    public final String b;
    public final boolean c;

    public e87(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e87)) {
            return false;
        }
        e87 e87Var = (e87) obj;
        return u890.j(this.a, e87Var.a) && u890.j(this.b, e87Var.b) && this.c == e87Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
