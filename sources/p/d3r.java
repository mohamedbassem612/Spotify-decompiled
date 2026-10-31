package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d3r implements e3r {
    public final String a;

    public d3r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3r) && u890.j(this.a, ((d3r) obj).a);
    }

    @Override // p.e3r
    public final String getMessage() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
