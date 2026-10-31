package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lq60 implements nq60 {
    public final boolean a;

    public lq60(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lq60) && this.a == ((lq60) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
