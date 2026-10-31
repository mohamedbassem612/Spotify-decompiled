package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ubk1 {
    public final boolean a;
    public final j1c b;

    public ubk1(boolean z, j1c j1cVar) {
        this.a = z;
        this.b = j1cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubk1)) {
            return false;
        }
        ubk1 ubk1Var = (ubk1) obj;
        return this.a == ubk1Var.a && this.b.equals(ubk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
