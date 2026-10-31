package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c9m implements e9m {
    public final String a;

    public c9m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9m) && this.a.equals(((c9m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
