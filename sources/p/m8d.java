package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m8d implements o8d {
    public final tom a;

    public m8d(tom tomVar) {
        this.a = tomVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8d) && u890.j(this.a, ((m8d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
