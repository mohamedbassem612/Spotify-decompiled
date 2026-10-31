package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qh60 implements vh60 {
    public final c380 a;

    public qh60(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qh60) && u890.j(this.a, ((qh60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
