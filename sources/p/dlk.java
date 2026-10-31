package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dlk extends vlk {
    public final String a;
    public final tv80 b;

    public dlk(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlk)) {
            return false;
        }
        dlk dlkVar = (dlk) obj;
        return this.a.equals(dlkVar.a) && u890.j(this.b, dlkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
