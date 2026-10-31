package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class up8 {
    public final nhz a;
    public final String b;

    public up8(nhz nhzVar, String str) {
        this.a = nhzVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up8)) {
            return false;
        }
        up8 up8Var = (up8) obj;
        return this.a == up8Var.a && u890.j(this.b, up8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
