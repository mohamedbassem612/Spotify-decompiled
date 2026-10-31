package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oeu {
    public final boolean a;
    public final String b;
    public final c2b0 c;

    public oeu(String str, c2b0 c2b0Var, boolean z) {
        this.a = z;
        this.b = str;
        this.c = c2b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeu)) {
            return false;
        }
        oeu oeuVar = (oeu) obj;
        return this.a == oeuVar.a && u890.j(this.b, oeuVar.b) && this.c == oeuVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
