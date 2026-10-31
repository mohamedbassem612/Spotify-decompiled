package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rr00 {
    public final boolean a;

    public rr00(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rr00) && this.a == ((rr00) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
