package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rvo {
    public final String a;

    public rvo(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvo) && u890.j(this.a, ((rvo) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) - 2050691869;
    }
}
