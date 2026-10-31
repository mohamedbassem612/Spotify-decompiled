package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ovj0 implements uvj0 {
    public final int a;

    public ovj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ovj0) && this.a == ((ovj0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
