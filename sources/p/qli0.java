package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qli0 {
    public final String a;
    public final String b;

    public qli0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qli0)) {
            return false;
        }
        qli0 qli0Var = (qli0) obj;
        return u890.j(this.a, qli0Var.a) && u890.j(this.b, qli0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
