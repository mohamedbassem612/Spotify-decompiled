package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tor0 {
    public final rw4 a;
    public final int b;
    public final int c;

    public tor0(rw4 rw4Var, int i, int i2) {
        this.a = rw4Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tor0) {
            tor0 tor0Var = (tor0) obj;
            if (this.a == tor0Var.a && this.b == tor0Var.b && this.c == tor0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return gvg.j(sb, this.c, ")");
    }
}
