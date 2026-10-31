package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g790 implements h790 {
    public final boolean a;
    public final boolean b;
    public final long c;

    public g790(long j, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g790)) {
            return false;
        }
        g790 g790Var = (g790) obj;
        return this.a == g790Var.a && this.b == g790Var.b && this.c == g790Var.c;
    }

    @Override // p.h790
    public final String getName() {
        return "playing_state_changed";
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
