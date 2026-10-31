package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nnf {
    public final String a;

    public nnf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnf) && u890.j(this.a, ((nnf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
