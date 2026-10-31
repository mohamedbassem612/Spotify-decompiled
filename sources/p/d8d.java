package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d8d implements f8d {
    public final tom a;

    public d8d(tom tomVar) {
        this.a = tomVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8d) && this.a.equals(((d8d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
