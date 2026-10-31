package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rrb {
    public final boolean a;
    public final c380 b;
    public final int c;

    public rrb(int i, c380 c380Var, boolean z) {
        this.a = z;
        this.b = c380Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrb)) {
            return false;
        }
        rrb rrbVar = (rrb) obj;
        return this.a == rrbVar.a && u890.j(this.b, rrbVar.b) && this.c == rrbVar.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + kk0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public /* synthetic */ rrb(int i, c380 c380Var) {
        this(2, c380Var, false);
    }
}
