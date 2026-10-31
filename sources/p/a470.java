package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a470 {
    public final s370 a;
    public final c380 b;

    public a470(s370 s370Var, c380 c380Var) {
        this.a = s370Var;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a470)) {
            return false;
        }
        a470 a470Var = (a470) obj;
        return this.a.equals(a470Var.a) && u890.j(this.b, a470Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
