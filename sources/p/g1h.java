package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g1h implements v1h {
    public final b1h a;
    public final tv80 b;

    public g1h(b1h b1hVar, tv80 tv80Var) {
        this.a = b1hVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1h)) {
            return false;
        }
        g1h g1hVar = (g1h) obj;
        return this.a.equals(g1hVar.a) && u890.j(this.b, g1hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
