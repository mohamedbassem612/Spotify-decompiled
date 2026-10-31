package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qe61 implements cf61 {
    public final String a;
    public final String b;

    public qe61(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe61)) {
            return false;
        }
        qe61 qe61Var = (qe61) obj;
        return u890.j(this.a, qe61Var.a) && u890.j(this.b, qe61Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
