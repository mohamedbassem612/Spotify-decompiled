package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class raw extends b0o1 {
    public final String c;
    public final tv80 d;

    public raw(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raw)) {
            return false;
        }
        raw rawVar = (raw) obj;
        return u890.j(this.c, rawVar.c) && u890.j(this.d, rawVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
