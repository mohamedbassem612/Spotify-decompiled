package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qvj0 implements uvj0 {
    public final int a;

    public qvj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvj0) && this.a == ((qvj0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
