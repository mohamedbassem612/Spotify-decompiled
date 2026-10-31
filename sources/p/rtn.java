package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rtn implements aun {
    public final boolean a;

    public rtn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtn) && this.a == ((rtn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
