package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class alm1 implements glm1 {
    public final String a;
    public final a9h b;

    public alm1(String str, a9h a9hVar) {
        this.a = str;
        this.b = a9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alm1)) {
            return false;
        }
        alm1 alm1Var = (alm1) obj;
        return this.a.equals(alm1Var.a) && this.b.equals(alm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
