package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u2g implements v2g {
    public final boolean a;

    public u2g(int i, boolean z) {
        this.a = (i & 2) != 0 ? false : z;
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2g) && this.a == ((u2g) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + (Boolean.hashCode(false) * 31);
    }
}
