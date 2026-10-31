package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tsi0 extends fuo1 {
    public final String b;
    public final String c;

    public tsi0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsi0)) {
            return false;
        }
        tsi0 tsi0Var = (tsi0) obj;
        return u890.j(this.b, tsi0Var.b) && u890.j(this.c, tsi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
