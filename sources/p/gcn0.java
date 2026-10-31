package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gcn0 {
    public final boolean a;

    public gcn0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcn0) && this.a == ((gcn0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
