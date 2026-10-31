package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pp61 implements bq61 {
    public final String a;
    public final boolean b;

    public pp61(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp61)) {
            return false;
        }
        pp61 pp61Var = (pp61) obj;
        return this.a.equals(pp61Var.a) && this.b == pp61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
