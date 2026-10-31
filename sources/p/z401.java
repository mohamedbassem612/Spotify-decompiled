package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z401 implements f501 {
    public final int a;

    public z401(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z401) && this.a == ((z401) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
