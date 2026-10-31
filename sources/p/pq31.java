package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pq31 implements qq31 {
    public final String a;

    public pq31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pq31) && u890.j(this.a, ((pq31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
