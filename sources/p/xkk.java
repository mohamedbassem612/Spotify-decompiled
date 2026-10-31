package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xkk extends vlk {
    public final String a;
    public final tv80 b;

    public xkk(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkk)) {
            return false;
        }
        xkk xkkVar = (xkk) obj;
        return this.a.equals(xkkVar.a) && u890.j(this.b, xkkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
