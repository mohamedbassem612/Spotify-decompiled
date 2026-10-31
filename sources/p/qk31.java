package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qk31 {
    public final String a;
    public final dzo1 b;

    public qk31(String str, dzo1 dzo1Var) {
        this.a = str;
        this.b = dzo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk31)) {
            return false;
        }
        qk31 qk31Var = (qk31) obj;
        return u890.j(this.a, qk31Var.a) && this.b.equals(qk31Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
