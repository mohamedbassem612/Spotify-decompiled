package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class elt {
    public final String a;
    public final String b;

    public elt(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elt)) {
            return false;
        }
        elt eltVar = (elt) obj;
        return u890.j(this.a, eltVar.a) && u890.j(this.b, eltVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
