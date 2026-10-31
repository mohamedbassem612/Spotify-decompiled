package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c740 implements d740 {
    public final boolean a;

    public c740(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c740) && this.a == ((c740) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
