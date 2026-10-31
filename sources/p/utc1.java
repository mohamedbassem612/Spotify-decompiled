package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class utc1 {
    public final String a;
    public final fjc1 b;

    public utc1(String str, fjc1 fjc1Var) {
        this.a = str;
        this.b = fjc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof utc1) {
            utc1 utc1Var = (utc1) obj;
            return this.a.equals(utc1Var.a) && this.b == utc1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + cy30.d(-902678464, 31, this.a);
    }
}
