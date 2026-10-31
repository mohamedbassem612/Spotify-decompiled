package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t0m implements v0m {
    public final String a;

    public t0m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t0m) && this.a.equals(((t0m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
