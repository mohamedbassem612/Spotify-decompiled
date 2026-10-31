package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zh20 extends ci20 {
    public final boolean a;

    public zh20(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zh20) && this.a == ((zh20) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
