package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cy6 {
    public final String a;
    public final String b;

    public cy6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy6)) {
            return false;
        }
        cy6 cy6Var = (cy6) obj;
        return u890.j(this.a, cy6Var.a) && u890.j(this.b, cy6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
