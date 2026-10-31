package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k2n0 {
    public final String a;

    public k2n0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2n0) && u890.j(this.a, ((k2n0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
