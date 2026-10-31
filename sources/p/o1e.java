package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o1e extends q1e {
    public final String a;
    public final p791 b;

    public o1e(String str, p791 p791Var) {
        this.a = str;
        this.b = p791Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1e)) {
            return false;
        }
        o1e o1eVar = (o1e) obj;
        return u890.j(this.a, o1eVar.a) && this.b == o1eVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
