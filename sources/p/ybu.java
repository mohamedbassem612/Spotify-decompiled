package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ybu implements dcu {
    public final boolean a;

    public ybu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ybu) && this.a == ((ybu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
