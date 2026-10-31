package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oea1 implements qea1 {
    public final String a;
    public final String b;

    public oea1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oea1)) {
            return false;
        }
        oea1 oea1Var = (oea1) obj;
        return u890.j(this.a, oea1Var.a) && u890.j(this.b, oea1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
