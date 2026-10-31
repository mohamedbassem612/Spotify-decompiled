package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class on60 {
    public final String a;
    public final String b;

    public on60(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on60)) {
            return false;
        }
        on60 on60Var = (on60) obj;
        return u890.j(this.a, on60Var.a) && u890.j(this.b, on60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
