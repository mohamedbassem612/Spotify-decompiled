package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class de60 {
    public final int a;

    public de60(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de60) && this.a == ((de60) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
