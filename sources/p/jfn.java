package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jfn implements ugn {
    public final boolean a;

    public jfn(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfn) && this.a == ((jfn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
