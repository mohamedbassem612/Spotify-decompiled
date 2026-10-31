package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ia7 {
    public final ja7 a;

    public ia7(ja7 ja7Var) {
        this.a = ja7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia7) && this.a == ((ia7) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
