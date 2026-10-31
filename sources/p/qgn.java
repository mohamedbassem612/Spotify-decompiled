package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qgn implements ugn {
    public final boolean a;

    public qgn(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qgn) && this.a == ((qgn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
