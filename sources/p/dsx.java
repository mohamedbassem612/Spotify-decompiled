package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dsx {
    public final b180 a;
    public final b180 b;

    public dsx(b180 b180Var, b180 b180Var2) {
        this.a = b180Var;
        this.b = b180Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsx)) {
            return false;
        }
        dsx dsxVar = (dsx) obj;
        return this.a.equals(dsxVar.a) && this.b.equals(dsxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
