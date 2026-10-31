package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jcc {
    public final gcc a;
    public final int b;
    public final int c;

    public jcc(gcc gccVar, int i, int i2) {
        this.a = gccVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcc)) {
            return false;
        }
        jcc jccVar = (jcc) obj;
        return u890.j(this.a, jccVar.a) && this.b == jccVar.b && this.c == jccVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.a);
        sb.append(", indentationLevel=");
        sb.append(this.b);
        sb.append(", start=");
        return gvg.j(sb, this.c, ")");
    }
}
