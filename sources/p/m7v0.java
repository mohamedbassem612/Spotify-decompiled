package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m7v0 extends h7p1 {
    public final String c;
    public final String d;

    public m7v0(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7v0)) {
            return false;
        }
        m7v0 m7v0Var = (m7v0) obj;
        return this.c.equals(m7v0Var.c) && u890.j(this.d, m7v0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
