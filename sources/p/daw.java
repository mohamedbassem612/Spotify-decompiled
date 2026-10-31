package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class daw {
    public final String a;
    public final tv80 b;

    public daw(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daw)) {
            return false;
        }
        daw dawVar = (daw) obj;
        return u890.j(this.a, dawVar.a) && u890.j(this.b, dawVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
