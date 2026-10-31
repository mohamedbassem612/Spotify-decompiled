package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qen implements ugn {
    public final boolean a;

    public qen(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qen) && this.a == ((qen) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
