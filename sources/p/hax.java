package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hax implements max {
    public final String a;

    public hax(String str) {
        this.a = str;
        if (ihc1.y0(str)) {
            hhg1.n("Please consider providing a non-empty disabled reason to provide a more accessible experience for everyone.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hax) && u890.j(this.a, ((hax) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
