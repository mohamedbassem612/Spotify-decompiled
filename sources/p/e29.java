package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e29 {
    public final f29 a;
    public final h29 b;
    public final g29 c;

    public e29(f29 f29Var, h29 h29Var, g29 g29Var) {
        this.a = f29Var;
        this.b = h29Var;
        this.c = g29Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e29)) {
            return false;
        }
        e29 e29Var = (e29) obj;
        return this.a.equals(e29Var.a) && this.b.equals(e29Var.b) && this.c.equals(e29Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
