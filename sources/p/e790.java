package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e790 implements h790 {
    public final b7l a;
    public final long b;

    public e790(b7l b7lVar, long j) {
        this.a = b7lVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e790)) {
            return false;
        }
        e790 e790Var = (e790) obj;
        return u890.j(this.a, e790Var.a) && this.b == e790Var.b;
    }

    @Override // p.h790
    public final String getName() {
        return "connect_state_changed";
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
