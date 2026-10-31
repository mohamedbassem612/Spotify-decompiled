package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gph implements iph {
    public final int a;

    public gph(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gph) && this.a == ((gph) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
