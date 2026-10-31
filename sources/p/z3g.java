package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z3g {
    public final String a;
    public final String b;

    public z3g(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3g)) {
            return false;
        }
        z3g z3gVar = (z3g) obj;
        return this.a.equals(z3gVar.a) && this.b.equals(z3gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
