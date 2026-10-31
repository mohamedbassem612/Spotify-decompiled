package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nrn0 extends x2i1 {
    public final String a;

    public nrn0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nrn0) && u890.j(this.a, ((nrn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
