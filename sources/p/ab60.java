package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ab60 {
    public final srt0 a;
    public final sa60 b;

    public ab60(srt0 srt0Var, sa60 sa60Var) {
        this.a = srt0Var;
        this.b = sa60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab60)) {
            return false;
        }
        ab60 ab60Var = (ab60) obj;
        return this.a.equals(ab60Var.a) && this.b.equals(ab60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
