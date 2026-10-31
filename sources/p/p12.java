package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p12 extends ti {
    public final String b;
    public final String c;

    public p12(String str, String str2) {
        super(str);
        this.b = str;
        this.c = str2;
    }

    @Override // p.ti
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p12)) {
            return false;
        }
        p12 p12Var = (p12) obj;
        return this.b.equals(p12Var.b) && u890.j(this.c, p12Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
