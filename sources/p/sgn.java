package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sgn implements ugn {
    public final boolean a;

    public sgn(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgn) && this.a == ((sgn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
