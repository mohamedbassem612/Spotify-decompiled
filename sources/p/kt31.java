package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kt31 implements mt31 {
    public final boolean a;

    public kt31(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kt31) && this.a == ((kt31) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
