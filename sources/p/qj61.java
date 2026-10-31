package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qj61 {
    public final oqo1 a;
    public final String b;

    public qj61(oqo1 oqo1Var, String str) {
        this.a = oqo1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj61)) {
            return false;
        }
        qj61 qj61Var = (qj61) obj;
        return this.a.equals(qj61Var.a) && this.b.equals(qj61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
