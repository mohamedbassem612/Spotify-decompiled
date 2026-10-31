package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hu60 extends ru60 {
    public final e5a0 a;

    public hu60(e5a0 e5a0Var) {
        this.a = e5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu60) && u890.j(this.a, ((hu60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
