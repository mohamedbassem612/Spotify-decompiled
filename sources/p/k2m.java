package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k2m implements r2m {
    public final String a;

    public k2m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2m) && this.a.equals(((k2m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
