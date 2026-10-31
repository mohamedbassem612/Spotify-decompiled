package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b3r implements e3r {
    public final Object a;

    public b3r(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        return obj instanceof b3r;
    }

    @Override // p.e3r
    public final String getMessage() {
        return cy30.m("Value for key ", this.a, " is missing, there is probably no active request for it");
    }

    public final int hashCode() {
        return b3r.class.hashCode();
    }

    public final String toString() {
        return cy30.m("MissingValue(key=", this.a, ")");
    }
}
