package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vrk {
    public final String a;
    public final vqk b;

    public vrk(String str, vqk vqkVar) {
        this.a = str;
        this.b = vqkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrk)) {
            return false;
        }
        vrk vrkVar = (vrk) obj;
        return u890.j(this.a, vrkVar.a) && this.b.equals(vrkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
