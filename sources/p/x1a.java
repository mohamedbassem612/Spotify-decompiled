package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x1a extends z1a {
    public final boolean a;

    public x1a(boolean z) {
        this.a = z;
    }

    public final int a() {
        return 8;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1a) && this.a == ((x1a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
