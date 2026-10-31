package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bfw {
    public final String a;
    public final tv80 b;

    public bfw(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfw)) {
            return false;
        }
        bfw bfwVar = (bfw) obj;
        return u890.j(this.a, bfwVar.a) && this.b.equals(bfwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
