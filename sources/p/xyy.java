package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xyy extends dem1 {
    public final String b;
    public final boolean c;
    public final boolean d;

    public xyy(String str, boolean z, boolean z2) {
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyy)) {
            return false;
        }
        xyy xyyVar = (xyy) obj;
        return this.b.equals(xyyVar.b) && this.c == xyyVar.c && this.d == xyyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(this.b.hashCode() * 31, 31, this.c);
    }
}
