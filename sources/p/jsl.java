package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jsl implements ksl {
    public final String a;

    public jsl(String str) {
        this.a = str;
        if (ihc1.y0(str)) {
            hhg1.n("Please consider providing a non-empty content description to provide a more accessible experience for everyone.");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsl) && u890.j(this.a, ((jsl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
