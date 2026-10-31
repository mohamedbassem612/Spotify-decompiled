package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uju0 {
    public final String a;
    public final String b;

    public uju0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uju0)) {
            return false;
        }
        uju0 uju0Var = (uju0) obj;
        return u890.j(this.a, uju0Var.a) && u890.j(this.b, uju0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
