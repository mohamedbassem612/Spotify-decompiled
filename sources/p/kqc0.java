package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kqc0 implements mqc0 {
    public final nsn a;

    public kqc0(nsn nsnVar) {
        this.a = nsnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqc0) && this.a.equals(((kqc0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
