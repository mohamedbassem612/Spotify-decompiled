package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ouo0 extends puo0 {
    public final String a;
    public final String b;

    public ouo0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouo0)) {
            return false;
        }
        ouo0 ouo0Var = (ouo0) obj;
        return u890.j(this.a, ouo0Var.a) && this.b.equals(ouo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
