package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0o {
    public final String a;
    public final int b;

    public p0o(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0o)) {
            return false;
        }
        p0o p0oVar = (p0o) obj;
        return this.a.equals(p0oVar.a) && this.b == p0oVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }
}
