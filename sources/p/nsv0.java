package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nsv0 {
    public final int a;

    public nsv0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsv0) && this.a == ((nsv0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
