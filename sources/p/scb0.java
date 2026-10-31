package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class scb0 implements wcb0 {
    public final String a;
    public final String b;

    public scb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scb0)) {
            return false;
        }
        scb0 scb0Var = (scb0) obj;
        return this.a.equals(scb0Var.a) && u890.j(this.b, scb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
