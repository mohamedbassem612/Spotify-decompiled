package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q5o0 {
    public final String a;
    public final sm81 b;
    public final f7h c;

    public q5o0(String str, sm81 sm81Var, f7h f7hVar) {
        this.a = str;
        this.b = sm81Var;
        this.c = f7hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5o0)) {
            return false;
        }
        q5o0 q5o0Var = (q5o0) obj;
        return this.a.equals(q5o0Var.a) && this.b.equals(q5o0Var.b) && this.c.equals(q5o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
