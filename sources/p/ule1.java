package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ule1 implements yle1 {
    public final String a;
    public final aan b;

    public ule1(String str, aan aanVar) {
        this.a = str;
        this.b = aanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ule1)) {
            return false;
        }
        ule1 ule1Var = (ule1) obj;
        return this.a.equals(ule1Var.a) && this.b.equals(ule1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
