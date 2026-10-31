package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mcw implements liw {
    public final boolean a;

    public mcw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mcw) && this.a == ((mcw) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
