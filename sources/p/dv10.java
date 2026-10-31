package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dv10 implements rv10 {
    public final boolean a;

    public dv10(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dv10) && this.a == ((dv10) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
