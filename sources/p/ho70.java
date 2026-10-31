package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ho70 {
    public final String a;
    public final String b;

    public ho70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho70)) {
            return false;
        }
        ho70 ho70Var = (ho70) obj;
        return u890.j(this.a, ho70Var.a) && u890.j(this.b, ho70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
