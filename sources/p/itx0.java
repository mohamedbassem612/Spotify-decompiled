package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class itx0 extends ktx0 {
    public final boolean a;

    public itx0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itx0) && this.a == ((itx0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
