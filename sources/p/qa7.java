package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qa7 implements za7 {
    public final i a;
    public final tv80 b;

    public qa7(i iVar, tv80 tv80Var) {
        this.a = iVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa7)) {
            return false;
        }
        qa7 qa7Var = (qa7) obj;
        return this.a.equals(qa7Var.a) && this.b.equals(qa7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
