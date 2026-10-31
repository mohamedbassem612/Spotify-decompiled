package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t5h0 implements z5h0 {
    public final String a;
    public final c380 b;

    public t5h0(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5h0)) {
            return false;
        }
        t5h0 t5h0Var = (t5h0) obj;
        return this.a.equals(t5h0Var.a) && u890.j(this.b, t5h0Var.b);
    }

    @Override // p.z5h0
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 961);
    }
}
