package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k3w implements l3w {
    public final asi1 a;
    public final String b;

    public k3w(asi1 asi1Var, String str) {
        this.a = asi1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3w)) {
            return false;
        }
        k3w k3wVar = (k3w) obj;
        return this.a.equals(k3wVar.a) && u890.j(this.b, k3wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
