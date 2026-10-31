package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aca1 implements dca1 {
    public final String a;
    public final rca1 b;

    public aca1(String str, rca1 rca1Var) {
        this.a = str;
        this.b = rca1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca1)) {
            return false;
        }
        aca1 aca1Var = (aca1) obj;
        return this.a.equals(aca1Var.a) && this.b.equals(aca1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
