package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zkk extends vlk {
    public final p5k a;
    public final tv80 b;

    public zkk(p5k p5kVar, tv80 tv80Var) {
        this.a = p5kVar;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkk)) {
            return false;
        }
        zkk zkkVar = (zkk) obj;
        return this.a.equals(zkkVar.a) && u890.j(this.b, zkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
