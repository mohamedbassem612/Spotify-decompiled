package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k0m {
    public final String a;
    public final int b;

    public k0m(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0m)) {
            return false;
        }
        k0m k0mVar = (k0m) obj;
        return this.a.equals(k0mVar.a) && this.b == k0mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
