package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h4y0 extends n4y0 implements g4y0 {
    public final String a;
    public final String b;

    public h4y0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4y0)) {
            return false;
        }
        h4y0 h4y0Var = (h4y0) obj;
        return this.a.equals(h4y0Var.a) && this.b.equals(h4y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
