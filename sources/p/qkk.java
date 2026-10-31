package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qkk extends vlk {
    public final String a;
    public final tv80 b;

    public qkk(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkk)) {
            return false;
        }
        qkk qkkVar = (qkk) obj;
        return u890.j(this.a, qkkVar.a) && u890.j(this.b, qkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
