package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s01 {
    public byte a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof s01)) {
                return false;
            }
            s01 s01Var = (s01) obj;
            byte b = this.a;
            if (b != s01Var.a) {
                return false;
            }
            if (b != 8 || Math.abs(this.d - this.b) != 1 || this.d != s01Var.b || this.b != s01Var.d) {
                if (this.d != s01Var.d || this.b != s01Var.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = s01Var.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        byte b = this.a;
        if (b == 1) {
            str = "add";
        } else if (b == 2) {
            str = "rm";
        } else if (b != 4) {
            str = b != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        return td6.l(sb, this.c, "]");
    }
}
