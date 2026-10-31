package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pkk extends vlk {
    public final String a;
    public final tv80 b;

    public pkk(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkk)) {
            return false;
        }
        pkk pkkVar = (pkk) obj;
        return u890.j(this.a, pkkVar.a) && u890.j(this.b, pkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
