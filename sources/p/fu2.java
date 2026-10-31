package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fu2 {
    public final int a;
    public final eu2 b;

    public fu2(int i, eu2 eu2Var) {
        this.a = i;
        this.b = eu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2)) {
            return false;
        }
        fu2 fu2Var = (fu2) obj;
        return this.a == fu2Var.a && this.b.equals(fu2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
