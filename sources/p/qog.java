package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qog extends tog {
    public final int a;

    public qog(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qog) && this.a == ((qog) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
