package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class egg1 {
    public final i4e1 a;
    public final h4u b;

    public egg1(i4e1 i4e1Var, h4u h4uVar) {
        this.a = i4e1Var;
        this.b = h4uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof egg1) {
            egg1 egg1Var = (egg1) obj;
            return this.a.equals(egg1Var.a) && this.b == egg1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + this.a + ", offsetMapping=" + this.b + ")";
    }
}
