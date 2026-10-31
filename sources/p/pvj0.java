package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pvj0 implements uvj0 {
    public final int a;

    public pvj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pvj0) && this.a == ((pvj0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
