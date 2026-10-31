package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dtn implements ftn {
    public final boolean a;

    public dtn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtn) && this.a == ((dtn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
