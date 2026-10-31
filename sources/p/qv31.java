package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qv31 implements bw31 {
    public final wd7 a;
    public final String b;

    public qv31(wd7 wd7Var, String str) {
        this.a = wd7Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv31)) {
            return false;
        }
        qv31 qv31Var = (qv31) obj;
        return this.a.equals(qv31Var.a) && this.b.equals(qv31Var.b);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
