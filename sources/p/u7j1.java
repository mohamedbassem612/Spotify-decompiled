package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u7j1 implements z7j1 {
    public final boolean a;

    public u7j1(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7j1) && this.a == ((u7j1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
