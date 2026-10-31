package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rg71 extends tg71 {
    public final boolean a;

    public rg71(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rg71) && this.a == ((rg71) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
